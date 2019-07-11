package com.forum.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.forum.bean.AD;
import com.forum.bean.Block;
import com.forum.bean.Post;
import com.forum.bean.Praise;
import com.forum.bean.Reply;
import com.forum.bean.User;
import com.forum.bean.UserBlock;
import com.forum.common.MyUtils;
import com.forum.service.ADService;
import com.forum.service.BlockSevice;
import com.forum.service.PostService;
import com.forum.service.PraiseService;
import com.forum.service.ReplyService;
import com.forum.service.UserBlockService;
import com.forum.service.UserService;

/**
 * 用户控制器
 * @author Coding
 * 
 *
 */
@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserBlockService userBlockService;
	@Autowired
	private PostService postService;
	@Autowired
	private ReplyService replyService;
	@Autowired
	private PraiseService praiseService;
	@Autowired
	private BlockSevice blockSevice;
	@Autowired
	private ADService adService;
	
	@RequestMapping("test")
	public void Test() {
		List<Block> num = blockSevice.selAllBlock();
		System.out.println(num.size());
	}
	
	//登录控制
	@RequestMapping(value="login",method=RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse response) throws NoSuchAlgorithmException, IOException {
		String name = request.getParameter("account");
		String password = request.getParameter("pwd");
		String key = MyUtils.sHAEncrypt(password);
		User user = userService.login(name, key);
		if (user!=null) {
//			List<UserBlock> userBlocks = userBlockService.followingBlock(user.getStuID());
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.getWriter().write("ok");
		} else {
			response.getWriter().write("error");
		}
	}
	
	@RequestMapping(value="toIndex")
	public ModelAndView index(HttpServletRequest request) throws NoSuchAlgorithmException, IOException {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			List<UserBlock> userBlocks = userBlockService.followingBlock(user.getStuID());
			List<AD> ads = adService.selAll();
			mv.addObject("userBlocks", userBlocks);
			mv.addObject("ads", ads);
			mv.setViewName("/jsp/index");
			return mv;
		} else {
			mv.setViewName("/index");
			return mv;
		}
	}
	
	//进入版块并展示帖子
	@RequestMapping(value="block")
	public ModelAndView blockJava(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		String block = request.getParameter("block");
		if (block==null) block = (String) request.getSession().getAttribute("block");
		List<Post> posts = postService.selAllByBlock(block);
		mv.addObject("block", block);
		if (user!=null) {
			List<UserBlock> userBlocks = userBlockService.followingBlock(user.getStuID());
			mv.addObject("user", user);
			mv.addObject("userBlocks", userBlocks);
		}else {
			user = new User("游客", " ", 0, " ", 0, " ", " ", " ", " ", 0, 0, 0);
			mv.addObject("user", user);
		}
		mv.addObject("posts", posts);
		mv.setViewName("/jsp/block");
		return mv;
	}
	
	//发表新帖
	@RequestMapping(value="newPost",method=RequestMethod.POST)
	public ModelAndView newPost(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			String block = request.getParameter("sel");
			String title = request.getParameter("title");
			String context = request.getParameter("context");
//			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//	        String date1 = df.format(new Date()).toString();//返回当前日期的字符串格式
	        Timestamp date = new Timestamp(System.currentTimeMillis());
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
	        postService.newPost(user.getName(), date, 0, 0, 0, title, block, "求助", "", context,uuid);
	        String blockUuid = blockSevice.selBlockByName(block).getUuid();
	        blockSevice.addNum(blockUuid);
	        HttpSession session = request.getSession();
	        session.setAttribute("block", block);
	        mv.setViewName("redirect:/user/block");
	        return mv;
		} else {
			mv.setViewName("/jsp/reLogin");
			return mv;
		}
	}
	
	//查看帖子详情
	@RequestMapping(value="readPost")
	public ModelAndView readPost(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		String uuid = request.getParameter("key");
		Post post = postService.selPostByUUID(uuid);
		List<Reply> replies = replyService.selReplyByUuid(uuid);
		postService.updateWatched(uuid);
		if(user!=null) mv.addObject("user", user);
		mv.addObject("post", post);
		mv.addObject("replies", replies);
		mv.setViewName("/jsp/readPost");
		return mv;
	}
	
	//回复帖子
	@RequestMapping(value="reply",method=RequestMethod.POST)
	public ModelAndView reply(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			String uuid = request.getParameter("key");
			String context = request.getParameter("myreply");
			Timestamp date = new Timestamp(System.currentTimeMillis());
			String myUuid = UUID.randomUUID().toString().replaceAll("-", "");
			replyService.newReply(user.getName(), date, context, uuid, 0, 0, 0, myUuid);
			postService.updateReply(uuid);
			Post post = postService.selPostByUUID(uuid);
			List<Reply> replies = replyService.selReplyByUuid(uuid);
			mv.addObject("user", user);
			mv.addObject("post", post);
			mv.addObject("replies", replies);
			mv.setViewName("/jsp/readPost");
			return mv;
		} else {
			mv.setViewName("/jsp/reLogin");
			return mv;
		}
	}
	
	//给帖子点赞
	@RequestMapping(value="praisePost",method=RequestMethod.POST)
	public void praisePost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//获取用户登录信息
		User user = (User) request.getSession().getAttribute("user");
		String isPraise = null;
		//判断用户是否登录
		//如果用户已经登陆,进行下一步判断
		if (user!=null) {
			//获取帖子的UUID
			String uuid = request.getParameter("uuid");
			//查找是否该用户曾经对该帖子进行过点赞或取消点赞的操作
			Praise praise = praiseService.selByPostUuid(user.getName(), uuid);
			if(praise!=null) {
				//如果目前状态为已点赞,提示用户已经点过赞
//				praiseService.updatePostPraise(user.getName(), uuid);
				response.getWriter().write("p");
//				return;
			} else {
				//如果该用户未对该帖子进行过点赞或取消点赞的操作，记录用户的操作
//				praise = new Praise(user.getName(), null, null, false, false);
				praiseService.praisePost(user.getName(), uuid, null, true, false);
				Post post = postService.selPostByUUID(uuid);
				//用户点赞，帖子获赞量增1
				isPraise = String.valueOf(post.getPraise()+1);
				postService.updatePraise(uuid);
				//更新前端试图显示
				response.getWriter().write(isPraise);
			}
		} else {
			//如果用户未登陆,则提醒用户登陆
			response.getWriter().write("o");
		}
	}
	
	//关注版块
	@RequestMapping(value="followingBlock",method=RequestMethod.POST)
	public void followingBlock(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//获取用户信息
		User user = (User) request.getSession().getAttribute("user");
		//如果用户已经登录，则判断用户是否已经关注了该版块
		if(user!=null) {
			String uuid = request.getParameter("uuid");
			Block block = blockSevice.selBlockByUuid(uuid);
			String blockName = block.getName();
			int studeid = user.getStuID();
			UserBlock userBlock = userBlockService.selUserBlock(studeid, blockName);
			//如果用户关注了该版块，则取消关注
			if (userBlock!=null) {
				userBlockService.cutFollowingBlock(studeid, blockName);
				blockSevice.cutFocus(uuid);
				response.getWriter().write("cancle");
			} else {
				//如果用户没有关注该版块，则对该版块进行关注
				userBlockService.addFollowingBlock(studeid, blockName);
				blockSevice.addFocus(uuid);
				String focus = String.valueOf(block.getFocus()+1);
				response.getWriter().write("{status:'ok',focus:'"+focus+"'}");
			}
		}else {
			//如果用户没有登录，则提示用户需要先登录
			response.getWriter().write("login");
		}
	}
	
	//关注版块2，进入所有版块页面，页面加载完成后利用ajax对页面进行初始换
	@RequestMapping(value="followingBlock2",method=RequestMethod.POST)
	public void followingBlock2(HttpServletRequest request,HttpServletResponse response) throws IOException {
		User user = (User) request.getSession().getAttribute("user");
		//如果用户登录则进行操作，如果没有登录则不进行操作
		if(user!=null) {
			String uuid = request.getParameter("uuid");
			Block block = blockSevice.selBlockByUuid(uuid);
			String blockName = block.getName();
			int studeid = user.getStuID();
			UserBlock userBlock = userBlockService.selUserBlock(studeid, blockName);
			if (userBlock!=null) {
				response.getWriter().write("init");
			} 
		}
	}
}

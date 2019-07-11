package com.forum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.forum.bean.AD;
import com.forum.bean.Block;
import com.forum.bean.Post;
import com.forum.bean.User;
import com.forum.bean.UserBlock;
import com.forum.service.ADService;
import com.forum.service.BlockSevice;
import com.forum.service.PostService;
import com.forum.service.UserBlockService;

@Controller
@RequestMapping(value="common")
public class CommonController {

	@Autowired
	private BlockSevice blockSevice;
	@Autowired
	private UserBlockService userBlockService;
	@Autowired
	private PostService postService;
	@Autowired
	private ADService adService;
	
	@RequestMapping(value="index")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		List<AD> ads = adService.selAll();
		if (user!=null) {
			List<UserBlock> userBlocks = userBlockService.followingBlock(user.getStuID());
			mv.addObject("user", user);
			mv.addObject("userBlocks", userBlocks);
		}else {
			user = new User("游客", " ", 0, " ", 0, " ", " ", " ", " ", 0, 0, 0);
			mv.addObject("user", user);
		}
		mv.addObject("ads", ads);
		mv.setViewName("/jsp/index");
		return mv;
	}
	
	@RequestMapping(value="ad")
	public ModelAndView ad(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		List<AD> ads = adService.selAll();
		mv.addObject("user", user);
		mv.addObject("ads", ads);
		mv.setViewName("/jsp/AD");
		return mv;
	}
	
	@RequestMapping(value="allPost")
	public ModelAndView allPost() {
		ModelAndView mv = new ModelAndView();
		List<Post> posts = postService.selAllPost();
		mv.addObject("posts", posts);
		mv.setViewName("/jsp/allPost");
		return mv;
	}
	
	@RequestMapping(value="allBlock")
	public ModelAndView allBlock(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if (user!=null) {
			List<UserBlock> userBlocks = userBlockService.followingBlock(user.getStuID());
			mv.addObject("user", user);
			mv.addObject("userBlocks", userBlocks);
		}
		List<Block> blocks = blockSevice.selAllBlock();
		mv.addObject("blocks", blocks);
		mv.setViewName("/jsp/allBlock");
		return mv;
	}
	
	@RequestMapping(value="readAD")
	public ModelAndView readAD(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String uuid = request.getParameter("key");
		AD ad = adService.selByUuid(uuid);
		adService.addWatched(uuid);
		mv.addObject("ad", ad);
		mv.addObject("user", (User)request.getSession().getAttribute("user"));
		mv.setViewName("/jsp/readAD");
		return mv;
	}
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../css/readAD.css"/>
    <link rel="stylesheet" href="../css/font-awesome.min.css" type="text/css"/>
</head>
<body>
	<header>
		<div class="header_t">
			<div class="header_tl">
				<img src="../img/logo1.jpg" alt="">
			</div>
			<div class="header_tr">
				<div class="touxiang">
					<img src="../img/user/tou.jpg" alt=""/>
					<span>${user.stuID }</span>
				</div>
				<div class="search" >
					<div class="search_l">
						<input type="text" placeholder="搜索内容" style="width:100%;height: 24px;">
					</div>
					<div class="search_r">
						<input type="button" value="搜索" style="width:100%;height:28px;">
					</div>
				</div>
			</div>
		</div>
		<div class="header_b">
			<ul>
				<li><a href="/forum/user/toIndex">首页</a></li>
				<li><a href="/forum/common/allPost">新帖</a></li>
				<li><a href="/forum/common/allBlock">版块</a></li>
				<li><a href="">MOOC学习</a></li>
				<li><a href="">资源分享</a></li>
				<li><a href=""><span class="fa fa-server "></span></a></li>
			</ul>
		</div>
	</header>
<main>
    <div class="main_t">
        <a href="#"><div class="t-left1">发布新帖</div></a>
        <a href="#"><div class="t-left2">回复</div></a>
    </div>
    <div class="main_m">
    <div class="question">
        <div class="own">
            <img src="../img/user/tou.png" alt="" style="width:120px;height:120px;border-radius:50%;margin-top:10px;"/>
            <p>${ad.belong }</p>
            <p>大二&nbsp;&nbsp;&nbsp;学生</p>
            <p>经验：256</p>
            <p>签到：150</p>
        </div>
        <div class="ques">
            <div class="ques_t">
                <div class="help"><p>${ad.block }</p></div>
                <div class="wenti"><h2>${ad.title }</h2></div>
                <div class="biao"><p>楼主</p></div>
            </div>
            <div class="ques_m">
				<br>
                <p>&nbsp;&nbsp;&nbsp;浏览:&nbsp;${ad.watched }<!-- &nbsp;|&nbsp;回复:&nbsp;333 -->&nbsp;|&nbsp;${ad.sendTime }</p>
				<br>
				<div class="img">
					<img id="img" src="${pageContext.request.contextPath }/${ad.image }" >
				</div>
                <div class="context">
                    &nbsp;&nbsp; ${ad.context }
                </div>
				<!-- <div class="ques_b">
				    <div class="l1">
				        <p>回复</p>
				    </div>
				    <div class="l2">
				        <p>点赞</p>
				    </div>
				    <div class="r1">
				        <p>举报</p>
				    </div>
				</div> -->
            </div>
        </div>
    </div>
    </div>
   <!--  <div class="main_b">
        <div class="huifu1">
        <div class="huifu">
            <img src="../images/tou2.png" alt="" style="width:120px;height:120px;border-radius:50%;margin-top:10px;"/>
            <p>172055133</p>
            <p>大二&nbsp;&nbsp;&nbsp;学生</p>
            <p>经验：256</p>
            <p>签到：150</p>
        </div>
        <div class="hf">
            <div class="hf_t">
                <div class="biao"><p>沙发</p></div>
            </div>
            <div class="hf_m">
                <p>ajax怎么实现进度条？</p>
            </div>
            <div class="hf_b">
                <div class="l1">
                    <p>回复</p>
                </div>
                <div class="l2">
                    <p>点赞</p>
                </div>
                <div class="r1">
                    <p>举报</p>
                </div>
            </div>
        </div>
        </div>
        </div> -->
		<%-- <div class="gjhf">
			<br/>
			<div class="gjhf_1"><p>高级模式</p></div><br/>
				<div class="sr">
					<div class="img">
						<img src="../images/tou1.png" alt="" style="border-radius:50%;height: 90px"/>
					</div>
				<form action="/forum/user/reply?key=${post.uuid }" method="post">
					<textarea class="word" id="myreply" name="myreply"></textarea>
					<input style="border: none;" class="fh" type="submit" id="surereply" value="确认发表"/>
				</form>
			</div>
    </div> --%>
</main>
	<footer>
		<p>
			<a href="#">关于我们</a>|&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#">加入我们</a>|&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#">联系我们</a>|&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="#">帮助中心</a>&nbsp;&nbsp;&nbsp;&nbsp;
		</p>
	</footer>
</body>
</html>
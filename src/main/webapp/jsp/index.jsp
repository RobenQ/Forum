<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../css/indexof.css" type="text/css"/>
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
                <img src="../img/user/tou.png" alt=""/>
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
    <div class="main_l">
        <div class="main_l_t">
        <c:forEach items="${ads }" var="ad" varStatus="status">
        	<div class="div2_post">
				<p class="tittle"><b>[${ad.block }]&nbsp;&nbsp;<a href="/forum/common/readAD?key=${ad.uuid }" target="_blank">${ad.title }</a></b></p>
				<div class="img">
					<img id="img" src="${pageContext.request.contextPath }/${ad.image }" >
				</div>
				<div id="context" class="context">
					${ad.context }
				</div>
				<p class="msg">
					<span>${ad.belong }&nbsp;&nbsp;浏览：${ad.watched }&nbsp;&nbsp;&nbsp;<%-- 回复：53&nbsp;&nbsp;&nbsp;点赞：<span id="${ad.uuid }">45</span> --%>&nbsp;&nbsp;&nbsp;发帖时间：${ad.sendTime }
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<%-- <button class="btn" uuid="${ad.uuid }" onclick="praisePost(this)">点赞</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<button class="btn"><a href="/forum/user/readPost?key=${ad.uuid }#reply2">回复</a></button> --%>
					</span>
				</p>
			</div>
        </c:forEach>
			

            <div class="main_l_b">
                <ul>
                    <li><a href="" style="margin-left: 5px;">首页</a></li>
                    <li><a href="">上一页</a></li>
                    <li><a href="">1</a></li>
                    <li><a href="">2</a></li>
                    <li><a href="">3</a></li>
                    <li><a href="">...</a></li>
                    <li><a href="">下一页</a></li>
                    <li><a href="">尾页</a></li>
                </ul>
            </div>
		</div>
    </div>
    <div class="main_r">
        <ul>
                <li class="li1"><span class="fa fa-pencil-square-o"></span><a href="#">发布新帖</a></li>
                <li>
                    <h3>我的版块</h3>
                    <table cellspacing="0" cellpadding="0">
                        <c:forEach items="${userBlocks }" begin="0" var="userBlock" varStatus="status" step="2">
                    	<tr>
                            <td><a href="/forum/user/block?block=${userBlocks[(status.count-1)*2].blockName }">${userBlocks[(status.count-1)*2].blockName }</a></td>
                            <td><a href="/forum/user/block?block=${userBlocks[(status.count-1)*2+1].blockName }">${userBlocks[(status.count-1)*2+1].blockName }</a></td>
                        </tr>
                    </c:forEach>
                    </table>
                </li>
            <li class="li1"><span class="fa fa-calendar"></span>&nbsp;&nbsp;<a href="#">打卡</a></li>
            <li class="nav2">
                <h3>热帖排行榜</h3>
                <ul>
                    <li>求大神指导C++问题</li>
                    <li>求解JAVA问题</li>
                    <li>分享Python视频教程</li>
                </ul>
            </li>
            <li class="nav3">
                <h3>活跃会员</h3>
                <ul>
                    <li><img src="../ima/touxiang_1.png" alt=""/>  <span>172055233</span></li>
                    <li><img src="../ima/touxiang_2.png" alt=""/>  <span>172052133</span></li>
                    <li><img src="../ima/touxiang_3.png" alt=""/>  <span>172054133</span></li>
                </ul>
            </li>
        </ul>
    </div>
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

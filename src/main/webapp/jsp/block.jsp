<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../css/block.css" type="text/css"/>
    <link rel="stylesheet" href="../css/font-awesome.min.css" type="text/css"/>
    <script type="text/javascript" src="../js/praisePost.js"></script>
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
<div class="banner">
    <div class="name">${block }</div>
    <div class="banner_r">
        <div class="guanzhu"><span class="fa fa-plus" style="color: orange"></span>&nbsp;关注</div>
        <div class="banner_rb">
            <span>今日：120&nbsp;&nbsp;|&nbsp;&nbsp;帖子：1.2万&nbsp;&nbsp;|&nbsp;&nbsp;排名：4</span>
            <span class="ower">版主：172055133</span>
        </div>
    </div>
</div>
<main>
    <div class="main_l">
        <div class="main_l_t">
            <ul>
                <li>
                    <p>&nbsp;&nbsp;&nbsp;分类：<a href="">全部</a>|<a href="">置顶</a>|<a href="">求助</a>|<a href="">分享</a>|<a href="">讨论交流</a>|</p>
                    &nbsp;&nbsp;&nbsp;筛选：
                    <select name="">
                        <option value="" selected>全部时间</option>
                        <option value="">一天</option>
                        <option value="">两天</option>
                        <option value="">一周</option>
                        <option value="">一个月</option>
                    </select>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;排序：
                    <select name="">
                        <option value="" selected>回复时间</option>
                        <option value="">发帖时间</option>
                        <option value="">回复数量</option>
                        <option value="">查看数量</option>
                    </select>
                </li>
            </ul>
            <c:forEach items="${posts }" var="post" varStatus="status">
            <div class="help">
                <li>
                    <img src="../img/user/tou.png" alt=""/>
                    <div class="ask"><span>&nbsp;&nbsp;${post.type }&nbsp;&nbsp;</span> <a href="/forum/user/readPost?key=${post.uuid }"  target="_blank">${post.title }
                    </a></div>
                    <div class="text">
                        ${post.belong }&nbsp;&nbsp;|&nbsp;&nbsp;浏览：${post.watched }&nbsp;&nbsp;|&nbsp;&nbsp;回复：${post.reply }&nbsp;&nbsp;|&nbsp;&nbsp;点赞：${post.praise }&nbsp;&nbsp;|&nbsp;&nbsp;${post.sendTime }
                        <div class="text1"></div>
                        <a id="uuid" uuid="${post.uuid }" onclick="praisePost(this)">点赞</a><a>回复</a>
                        </div>
                </li>
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
                <li class="li1"><span class="fa fa-pencil-square-o"></span><a href="/forum/jsp/new_post.jsp">发布新帖</a></li>
                <li>
                    <h3>我的版块</h3>
                    <table cellspacing="0" cellpadding="0">
                    <c:forEach items="${userBlocks }" var="userBlock" begin="0" varStatus="status" step="2">
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
                    <li><img src="../img/user/tou.png" alt=""/>  <span>172055233</span></li>
                    <li><img src="../img/user/tou.png" alt=""/>  <span>172052133</span></li>
                    <li><img src="../img/user/tou.png" alt=""/>  <span>172054133</span></li>
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
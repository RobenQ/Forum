<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../css/allBlock.css"/>
    <link rel="stylesheet" href="../css/font-awesome.min.css"/>
</head>
<body>
<div class="all">
    <header>
        <div class="header_t">
            <div class="MO">
                <img src="../img/logo1.jpg" alt="">
            </div>
            <div class="h_t_r">
                <div class="t">
                    <div class="tou">
                        <img src="../img/user/tou.png" alt="" style="border-radius:50%;width:40px;height:40px;"/>
                    </div>
                    <div class="num">
                        ${user.stuID }
                    </div>
                </div>
                <div class="sou" >
                    <div class="sou_l">
                        <input type="text" placeholder="搜索内容" style="width:100%;height: 24px;">
                    </div>
                    <div class="sou_r">
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
                <!-- <li><a href=""><span class="fa fa-server "></span></a></li> -->
            </ul>
        </div>
    </header>
    <main>
        <div class="main_t">
            <div class="main_t_l">
                <div class="img">
                    <img src="../img/AD/a.jpg" alt="" style="width:250px;height:200px;"/>
                </div>
                <div class="word">
                <h2>&nbsp;&nbsp;链表：有序存储的特殊组合</h2><br/><hr/>
                    <br/>
                <p><i>&nbsp;&nbsp;1、C++基本数据类型</i></p>
                <p><i>&nbsp;&nbsp;2、C++数组详解</i></p>
                <p><i>&nbsp;&nbsp;3、JAVA设计模式之工厂模式</i></p>
                <p><i>&nbsp;&nbsp;4、软件杯优秀项目一览</i></p>
                </div>
            </div>
            <div class="main_t_r">
                <h3>我的版块</h3>
                <table cellspacing="0" cellpadding="0">
                   <c:forEach items="${userBlocks }" var="userBlock" begin="0" varStatus="status" step="2">
                    	<tr>
                            <td><a href="/forum/user/block?block=${userBlocks[(status.count-1)*2].blockName }">${userBlocks[(status.count-1)*2].blockName }</a></td>
                            <td><a href="/forum/user/block?block=${userBlocks[(status.count-1)*2+1].blockName }">${userBlocks[(status.count-1)*2+1].blockName }</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <div class="main_m">
        <div class="main_m_t">
            <div class="h">
                <h2>课程板块</h2>
            </div>
            <div class="r1">按年级</div>
            <div class="r2">按系别</div>
        </div>
        <table  cellspacing="0" cellpadding="0">
        <c:forEach items="${blocks }" var="block" begin="0" varStatus="status" step="4">
         	<tr>
                <td><img src="../img/block/${blocks[(status.count-1)*4].image }" alt=""/><p><a href="/forum/user/block?block=${blocks[(status.count-1)*4].name }"  target="_blank">${blocks[(status.count-1)*4].name }</a></p><p>关注：${blocks[(status.count-1)*4].focus }&nbsp;|&nbsp;帖数：${blocks[(status.count-1)*4].num }</p></td>
                <td><img src="../img/block/${blocks[(status.count-1)*4+1].image }" alt=""/><p><a href="/forum/user/block?block=${blocks[(status.count-1)*4+1].name }"  target="_blank">${blocks[(status.count-1)*4+1].name }</a></p><p>关注：${blocks[(status.count-1)*4+1].focus }&nbsp;|&nbsp;帖数：${blocks[(status.count-1)*4+1].num }</p></td>
                <td><img src="../img/block/${blocks[(status.count-1)*4+2].image }" alt=""/><p><a href="/forum/user/block?block=${blocks[(status.count-1)*4+2].name }"  target="_blank">${blocks[(status.count-1)*4+2].name }</a></p><p>关注：${blocks[(status.count-1)*4+2].focus }&nbsp;|&nbsp;帖数：${blocks[(status.count-1)*4+2].num }</p></td>
                <td><img src="../img/block/${blocks[(status.count-1)*4+3].image }" alt=""/><p><a href="/forum/user/block?block=${blocks[(status.count-1)*4+3].name }"  target="_blank">${blocks[(status.count-1)*4+3].name }</a></p><p>关注：${blocks[(status.count-1)*4+3].focus }&nbsp;|&nbsp;帖数：${blocks[(status.count-1)*4+3].num }</p></td>
            </tr>
        </c:forEach>
        </table>
        </div>
        <div class="main_b">
            <div class="main_b_t">
                <div class="h">
                    <h2>反馈专区</h2>
                </div>
            </div>
            <div class="main_b_b">
                <div class="main_b_l">
                <div class="img1">
                    <img src="../img/ju.png" alt="" style="width:150px;height:125px;"/>
                </div>
                <div class="word1">
                    <h4>帖子举报</h4>
                    <p>举报不良环境，维护论坛环境</p>
                    <p>今日：3 &nbsp;|&nbsp;帖数：22</p>
                </div>
                </div>
                <div class="main_b_r">
                    <div class="img1">
                        <img src="../img/jian.png" alt="" style="width:150px;height:125px;"/>
                    </div>
                    <div class="word1">
                        <h4>新功能建议</h4>
                        <p>举报不良环境，维护论坛环境</p>
                        <p>今日：80 &nbsp;|&nbsp;帖数：42</p>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <footer></footer>
    </div>
</body>
</html>
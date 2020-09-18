<%--
  Created by IntelliJ IDEA.
  User: 20835
  Date: 2020/9/13
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>员工管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/app.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menu.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/head.css"/>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="${pageContext.request.contextPath}/js/vue.js"></script>
</head>
<body>
<div id="app">
    <div id="menu">      <!-- 菜单栏 -->
        <div id="user">
            <div id="u_photo">
                <img src="${pageContext.request.contextPath}/img/photo.jpg" style="width: 100%;height: 100%; border-radius: 50%;">
            </div>
            <span class="span_user">夜使向黎明</span>
        </div>
        <div id="menu_ul">
            <div class="ul_style" @click="cur=0" :class="{ul_hover:cur==0}" >
                <a><span >课件管理</span></a>
            </div>
            <div class="ul_style" @click="cur=1" :class="{ul_hover:cur==1}">
                <a><span>学分管理</span></a>
            </div>
            <div class="ul_style" @click="cur=2" :class="{ul_hover:cur==2}">
                <a><span>证书管理</span></a>
            </div>
            <div class="ul_style" @click="cur=3" :class="{ul_hover:cur==3}">
                <a><span>用户管理</span></a>
            </div>
            <div class="ul_style" @click="cur=4" :class="{ul_hover:cur==4}">
                <a><span>系统设置</span></a>
            </div>
            <div class="ul_style" @click="cur=5" :class="{ul_hover:cur==5}">
                <a><span>作业与考试</span></a>
            </div>
        </div>
    </div>
    <div id="head">
        <div id="head_top">
            <span class="span_teste">在线教育平台</span>
            <div id="photo">
                <img src="${pageContext.request.contextPath}/img/photo.jpg" style="width: 100%;height: 100%; border-radius: 50%;">
            </div>
            <span class="span_testr">退出</span>
        </div>
    </div>
    <div id="content" v-show="cur==0">
        <div id="con_head">
            <ul>
                <li class="current" @click="te=0" ><span>基本信息</span></li>
                <li @click="te=1" ><span>添加员工</span></li>
                <li @click="te=2" ><span>权限管理</span></li>
                <li @click="te=3" ><span>操作记录</span></li>
                <li @click="te=4" ><span>密码管理</span></li>
            </ul>
        </div>
        <%--            style=”table-layout: fixed;width: XXX px"--%>
        <div id="con_body" v-show="te==0">
            <table border="1" class="table_select">
                <tr>
                    <td>员工编号</td>
                    <td>员工姓名</td>
                    <td>科目代码</td>
                    <td>校区代号</td>
                    <td>权限级别</td>
                    <td>管理员操作</td>
                </tr>
                <tr>
                    <td>${list.id}</td>
                    <td>${list.names}</td>
                    <td>${list.idCard}</td>
                    <td>${list.sex}</td>
                    <td>${list.subject}</td>
                    <td>${list.edu}</td>
                </tr>

<%--                <c:forEach items="${list}" var="o">--%>
<%--                    <td>${o.id}</td>--%>
<%--                    <td>${o.names}</td>--%>
<%--                </c:forEach>--%>
<%--                <c:forEach items="${list}" var="o">--%>
<%--                    <tr>--%>
<%--                        <td>${o.id}</td>--%>
<%--                        <td>${o.name}</td>--%>
<%--                        <td>${o.subject}</td>--%>
<%--                        <td>${o.part}</td>--%>
<%--                        <td>--%>
<%--                            <c:choose>--%>
<%--                                <c:when test="${o.level eq 1}"><span>普通员工</span></c:when>--%>
<%--                                <c:when test="${o.level eq 2}"><span style="color: #ff0000">高级员工</span></c:when>--%>
<%--                            </c:choose>--%>
<%--                        </td>--%>
<%--                        <td><a href="/user/delete/${o.id}">移除员工</a></td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
            </table>
        </div>
        <div id="con_bodye" v-show="te==1">
            <form id="addUser" action="/user/insert" method="post">
                <table>
                    <tr>
                        <%--                            <input type="hidden" name="id" id="id">--%>
                        <td>员工姓名：<input type="text" name="name" id="name" required="required"></td>
                    </tr>
                    <tr>
                        <td>科目代码：<input type="text" name="subject" id="subject" required="required"></td>
                    </tr>
                    <tr>
                        <td>校区代号：<input type="text" name="part" id="part" required="required"></td>
                    </tr>
                    <tr>
                        <td>权限级别：
                            <select name="level">
                                <option value="1">1</option>
                                <option value="2">2</option>
                            </select>
                    </tr>
                    <tr>
                        <td><button type="submit">添加员工</button></td>
                        <%--                            <td><a href="javascript:;" id="save" onclick="checkUser();return false;">保存</a></td>--%>
                    </tr>
                </table>
            </form>
        </div>
        <div id="con_bodyr" v-show="te==2">
            999999999999999996
        </div>
        <div id="con_bodys" v-show="te==3">
            888888888888666666
        </div>
        <div id="con_bodyd" v-show="te==4">
            4888888886666666666
        </div>
        <div id="con_bodyf" v-show="te==5">
            88888888888888888888
        </div>
    </div>
    <div id="contente" v-show="cur==1">
        999
    </div>
    <div id="contentr" v-show="cur==2">
        888
    </div>
    <div id="contents" v-show="cur==3">
        777
    </div>
    <div id="contentd" v-show="cur==4">
        666
    </div>
    <div id="contentf" v-show="cur==5">
        555
    </div>
</div>
<script type="text/javascript">
    new Vue({
        el:'#app',
        data:{
            cur:false,
            te:false
        }
    })
</script>
<script type="text/javascript">
    $(function(){
        $("#con_head li").click(function(){
            $(this).addClass("current").siblings("li").removeClass("current");
        });
    });
</script>
</body>
</html>

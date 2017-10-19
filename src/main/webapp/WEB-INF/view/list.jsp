<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="plugins/jquery-3.2.1.min.js"></script>
<script src="js/common.js"></script>
</head>
<body>



	<div class="main">
		<header>
			<img src="images/logo.png">
			<div class="head-left">用户管理系统</div>
			<div class="head-right">
				<a href="#">帮助</a><a href="index.jsp">退出</a>
			</div>
		</header>
		<div class="middle">
			<div class="middle-left">
				<li>用户查询</li>
				<hr>
				<li><a href="toAdd.action" id="lista">用户新增</a></li>
				<hr>
				<img src="images/logo.png">
				<div class="user">当前登录用户</div>
			</div>
			<div class="middle-right">
				<p>
					用户名称：<input type="text" name="username">&nbsp;&nbsp;&nbsp;
					<button>查询</button>
				<table cellspacing="0">
					<tr>
						<td>编号</td>
						<td>用户名称</td>
						<td>邮箱</td>
						<td>性别</td>
						<td>创建时间</td>
						<td>更新时间</td>
						<td>操作</td>
					</tr>
					<c:forEach items="${list }" var="obj">
						<tr>
							<td>${obj.id }</td>
							<td>${obj.name }</td>
							<td>${obj.email }</td>
							<td>${obj.sex }</td>
							<td>${obj.createDate }</td>
							<td>${obj.updateDate }</td>
							<td><a href="toUpdate.action?user.id=${obj.id }">修改</a><a
								href="delete.action?user.id=${obj.id }">删除</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</body>
</html>
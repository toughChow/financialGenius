<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>licaimanage</title>
<script type="text/javascript" src="admin/plugins/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="admin/js/main.js"></script>
<script type="text/javascript" src="admin/js/timer.js"></script>
<link rel="stylesheet" type="text/css" href="admin/css/font-awesome.css" />
<link rel="stylesheet" type="text/css"
	href="admin/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="admin/css/main.css">
<link rel="stylesheet" type="text/css" href="admin/css/usermanage.css">
</head>
<body>
	<div class="main">
		<div class="head">
			<div class="head1">ADMIN</div>
			<div class="head2">
				<input type="text" name="text" value="search..." id="input1"><a
					href=""><i class="fa fa fa-search fa fa-fw"></i></a>&nbsp;&nbsp;&nbsp;

				<a href="">设置</a>&nbsp;&nbsp;<a href="">帮助</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
					href=""><i class="fa fa fa-user fa-2x fa-fw"></i></a> <select
					class="section"
					style="width: 70px; border: 0px; background-color: #845636;color:white;">
					<option>${username}</option>
					<option><a href="login.jsp">修改密码</a></option>
					<option><a href="login.jsp">退出</a></option>
				</select>
			</div>
		</div>

		<div class="left">
			<a href="admin_view_main"><li id="li5"><i
					class="fa fa fa-envira fa-fw"></i>&nbsp;HOME</li></a>
			<li id="li1"><a href=""><i class="fa fa fa-user fa fa-fw"></i></a>&nbsp;user
				manage</li>
			<li class="li1-li"><a href="admin_view_addUser" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;添加用户</a></li>
			<li class="li1-li"><a href="userAction_findUsers" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;删除用户</a></li>
			<li class="li1-li"><a href="userAction_findUsers" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;更新用户</a></li>
			<!-- <li id="li5">用户添加</li> -->
			<li id="li2"><a href=""><i class="fa fa fa-money fa fa-fw"></i></a>&nbsp;project
				manage</li>
			<li class="li2-li"><a href="admin_view_addFinancing" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;添加投资项目</a></li>
			<li class="li2-li"><a href="investmentAction_findInvestments"
				id="a"><i class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;删除投资项目</a></li>
			<li class="li2-li"><a href="investmentAction_findInvestments"
				id="a"><i class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;更新投资项目</a></li>
			<li id="li3"><a href=""><i class="fa fa fa-vcard fa fa-fw"></i></a>&nbsp;role
				manage</li>
			<li class="li3-li"><a href="admin_view_addRole" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;添加角色</a></li>
			<li class="li3-li"><a href="roleAction_getRoles" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;删除角色</a></li>
			<li class="li3-li"><a href="roleAction_getRoles" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;更新角色</a></li>
			<li id="li4"><a href=""><i
					class="fa fa fa-bar-chart fa fa-fw"></i></a>&nbsp;message</li>
			<li class="li4-li"><a href="admin_view_onlineUser" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;在线人数统计</a></li>
			<li class="li4-li"><a href="userAction_showUsersStatus" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;用户状态统计</a></li>
		</div>
		<div class="right">
			<div class="right-head">
				<div class="head-left">当前位置：项目管理</div>
				<div class="head-right">
					<b id="mytimer"></b>
				</div>
			</div>
			<div class="head-bottom">
				<div class="query">
					<div class="head-left">
						<a href=""><i class="fa fa-list"></i></a>&nbsp;&nbsp;project table
					</div>

				</div>
			</div>
			<table>
				<thead>
					<tr>
						<td>编号</td>
						<td>项目名</td>
						<td>金额</td>
						<td>描述</td>
						<td colspan="2">操作</td>
					</tr>
				</thead>
				<c:forEach items="${list }" var="invest">
					<tr>
						<td>${invest.id }</td>
						<td>${invest.investName }</td>
						<td>${invest.investCount }</td>
						<td>${invest.description }</td>
						<td><button
								style="background-color: #628B4D; border: 0; border-radius: 10%;">
								<a
									href="investmentAction_updateInvestment?investment.id=${invest.id }"><i
									class="fa fa-pencil"></i></a>
							</button></td>
						<td><button
								style="background-color: #A65445; border: 0; border-radius: 10%;">
								<a href="investmentAction_deleteInvestment?investment.id=${invest.id }"><i
									class="fa fa-times"></i></a>
							</button></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>
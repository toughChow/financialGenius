<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="admin/plugins/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="admin/js/main.js"></script>
	<script type="text/javascript" src="admin/js/timer.js"></script>
	<link rel="stylesheet" type="text/css" href="admin/css/font-awesome.css"/>
	<link rel="stylesheet" type="text/css" href="admin/css/font-awesome.min.css"/>
	<link rel="stylesheet" type="text/css" href="admin/css/main.css">
	<link rel="stylesheet" type="text/css" href="admin/css/useradd.css">
</head>
<body>
	<div class="main">
		<div class="head">
			<div class="head1">ADMIN</div>
			<div class="head2">
				<input type="text" name="text" value="search..." id="input1"><a
					href=""><i class="fa fa fa-search fa fa-fw"></i></a>&nbsp;&nbsp;&nbsp;
				<a href="">设置</a>&nbsp;&nbsp;<a href="">退出</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
					href=""><i class="fa fa fa-user fa-2x fa-fw"></i>${username }</a>
			</div>
		</div>

		<div class="left">
			<li id="li5"><a href="admin_view_main"><i
					class="fa fa fa-envira fa-fw"></i></a>&nbsp;HOME</li>
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
			<li class="li4-li"><a href="" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;在线人数统计</a></li>
			<li class="li4-li"><a href="" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;用户状态统计</a></li>
		</div>
		<div class="right">
			<div class="right-head">
				<div class="head-left">当前位置：更新角色</div>
				<div class="head-right"><b id="mytimer"></b></div>
			</div>
			<div class="head-bottom">
				<div class="query">
					<div class="head-left">
						<a href=""><i class="fa fa-list"></i></a>&nbsp;&nbsp;role table
					</div>
				</div>
			</div>
			<br> <br> <br>
			<div class="form">
				<form action="roleAction_updateRole" method="post" name="form"
					onsubmit="return register()">
					<p>
						<a href=""><i class="fa fa-user fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
							type="text" name="roleName" id="name" placeholder="${role.roleName }"
							class="input">
					</p>
					<p>
						<a href=""><i class="fa fa-rmb fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
							type="text" name="permission" id="password"
							placeholder="${role.permission }" class="input">
					</p>
					<p>
						<a href=""><i class="fa fa-envelope-o fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
							type="text" name="description" id="againpass"
							placeholder="${role.description }" class="input">
					</p>
					<p>
						<input type="submit" name="submit" value="更新" id="submit"><input
							type="reset" name="reset" id="reset" value="重置">
					</p>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
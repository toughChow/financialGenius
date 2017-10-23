<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>useradd</title>
<script type="text/javascript" src="admin/plugins/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="admin/js/main.js"></script>
<script type="text/javascript" src="admin/js/timer.js"></script>
<link rel="stylesheet" type="text/css" href="admin/css/font-awesome.css" />
<link rel="stylesheet" type="text/css"
	href="admin/css/font-awesome.min.css" />
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
			<li id="li5"><a href="admin_view_main"><i class="fa fa fa-envira fa-fw"></i></a>&nbsp;HOME</li>
 			<li id="li1"><a href=""><i class="fa fa fa-user fa fa-fw"></i></a>&nbsp;user manage</li>
				<li class="li1-li"><a href="admin_view_addUser" id="a"><i class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;添加用户</a></li>
				<li class="li1-li"><a href="userAction_findUsers" id="a"><i class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;删除用户</a></li>
				<li class="li1-li"><a href="userAction_findUsers" id="a"><i class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;更新用户</a></li>
            <!-- <li id="li5">用户添加</li> -->
			<li id="li2"><a href=""><i class="fa fa fa-money fa fa-fw"></i></a>&nbsp;project
				manage</li>
			<li class="li2-li"><a href="" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;添加投资项目</a></li>
			<li class="li2-li"><a href="" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;删除投资项目</a></li>
			<li class="li2-li"><a href="" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;更新投资项目</a></li>
			<li id="li3"><a href=""><i class="fa fa fa-vcard fa fa-fw"></i></a>&nbsp;role
				manage</li>
			<li class="li3-li"><a href="" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;添加角色</a></li>
			<li class="li3-li"><a href="" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;删除角色</a></li>
			<li class="li3-li"><a href="" id="a"><i
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
				<div class="head-left">当前位置：添加用户</div>
				<div class="head-right">
				<!-- 時間 -->
					<b id="mytimer"></b>
				</div>
			</div>
			<div class="head-bottom">
				<div class="query">
					<div class="head-left">
						<a href=""><i class="fa fa-list"></i></a>&nbsp;&nbsp;user add
					</div>
				</div>
				<br>
				<div class="form">
					<form action="userAction_addUser" method="post" name="form"
						onsubmit="return register()">
						<p>
							<a href=""><i class="fa fa-user fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="text" name="user.userName" id="name"
								placeholder="请输入您的用户名！" class="input">
						</p>
						<p>
							<a href=""><i class="fa fa-lock fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="password" name="user.password" id="password"
								placeholder="请输入您的密码！" class="input">
						</p>
						<p>
							<a href=""><i class="fa fa-lock fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="password" name="againpass" id="againpass"
								placeholder="请输入您的确认密码！" class="input">
						</p>
						<p>
							<a href=""><i class="fa fa-at fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="email" name="user.email" id="email" placeholder="请输入您的邮箱！"
								class="input">
						</p>
						<p>
							<input type="radio" name="user.sex" value="男" id="rad"><a href=""><i
								class="fa fa-male fa-fw"></i></a>&nbsp;&nbsp; <input type="radio"
								name="user.sex" value="女" id="rad"><a href=""><i
								class="fa fa-female fa-fw" class="input"></i></a>
						</p>

						<p>
							<input type="submit" name="submit" value="确定" id="submit"><input
								type="reset" name="reset" id="reset" value="重置">
						</p>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
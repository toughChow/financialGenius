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
			<li class="li4-li"><a href="admin_view_onlineUser" id="a"><i
					class="fa fa-angle-right fa-fw"></i>&nbsp;&nbsp;&nbsp;&nbsp;在线人数统计</a></li>
			<li class="li4-li"><a href="userAction_showUsersStatus" id="a"><i
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
								placeholder="请输入您的用户名！" class="input"><b
								id="usernameMsg"></b>
						</p>
						<p>
							<a href=""><i class="fa fa-lock fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="password" name="user.password" id="password"
								placeholder="请输入您的密码！" class="input"><b id="passwordMsg"></b>
						</p>
						<p>
							<a href=""><i class="fa fa-lock fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="password" name="againpass" id="againpass"
								placeholder="请输入您的确认密码！" class="input"><b
								id="password2Msg"></b>
						</p>
						<p>
							<a href=""><i class="fa fa-at fa-fw"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="email" name="user.email" id="email" placeholder="请输入您的邮箱！"
								class="input"><b id="emailMsg"></b>
						</p>
						<p>
							<input type="radio" name="user.sex" value="男" checked="checked" id="rad"><a
								href=""><i class="fa fa-male fa-fw"></i></a>&nbsp;&nbsp; <input
								type="radio" name="user.sex" value="女" id="rad"><a
								href=""><i class="fa fa-female fa-fw" class="input"></i></a>
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
	<script type="text/javascript">
		$(function() {
			var flag = false;

			//用户名验证列
			$('#name').on("blur", function() {
				var usernameLen = $('#name').val().length;//用户名长度验证
				var username = $('#name').val();

				if (username != '') {
					var reg = /^[a-z0-9_-]{6,15}$/;
					if (!username.match(reg)) {
						$('#usernameMsg').html("用户名必须为6-15位的字母/数字/下划线").css({
							color : "red"
						});
						flag = false;
						return false;
					}

					$.post("AjaxAdminAction_validateUsername", {
						"username" : username
					}, function(data) {
						if (data.message) {
							$('#usernameMsg').html("该用户名可以使用").css({
								color : "green"
							});
							flag = true;
						} else {
							$('#usernameMsg').html("该用户名已被占用").css({
								color : "red"
							});
							flag = false;
						}
					}, "json");
				} else if (username == '') {
					$('#usernameMsg').html("用户名不能为空").css({
						color : "red"
					});
					flag = false;
				} else {
					flag = true;
				}
			});

			//密码验证
			$('#password').on("blur", function() {
				var password = $('#password').val();
				if (password != '') {
					var reg2 = /^[a-z0-9_-]{6,18}$/;
					if (!password.match(reg2)) {
						$('#passwordMsg').html("密码必须为6-18位的字母数字下划线等").css({
							color : "red"
						});
						flag = false;
						return false;
					} else {
						flag = true;
						$('#passwordMsg').html('');
					}
				} else {
					$('#passwordMsg').html("密码不能为空").css({
						color : "red"
					});
					flag = false;
				}
			});

			// 重复密码验证
			$('#againpass').on("blur", function() {
				var password = $('#password').val();
				var password2 = $('#againpass').val();
				if (password !== password2) {
					$('#password2Msg').html("用户名与重复密码不一致 请确认").css({
						color : "red"
					});
					flag = false;
					return false;
				} else if(password2 == ''){
					$('#password2Msg').html("请输入确认密码").css({
						color : "red"
					});
					return false;
				}else{
					$('#password2Msg').html('');
				}
				flag = true;
			});

			// 邮箱验证
			$('#email').on("blur",function() {
								var emailVal = $('#email').val();
								var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((.[a-zA-Z0-9_-]{2,3}){1,2})$/;
								if (emailVal != '') {
									if (!emailVal.match(reg)) {
										$('#emailMsg').html("邮箱格式有误").css({
											color : "red"
										});
										return false;
									} else {
										$('#password2Msg').html('');
									}
								} else {
									$('#emailMsg').html("邮箱不能为空").css({
										color : "red"
									});
								}
							});
			
			$(':submit').click(function(){
				if(!flag){
					alert("请校验信息后提交");
					return false;
				}
			});

		});
	</script>
</body>
</html>
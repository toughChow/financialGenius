<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="plugins/jquery-3.2.1.min.js"></script>
    <style type="text/css">
    li {
        list-style: none;
    }

    a {
        text-decoration: none;
        color: cyan;
    }

    .main {
        margin: 0 auto;
        width: 1100px;
        height: 600px;
        /*border:1px solid cyan;*/
    }

    .top {
        width: 100%;
        height: 80px;
        background-color: #006AB6;
        line-height: 80px;
        color: white;
    }

    .top img {
        float: left;
        margin-top: 15px;
        margin-left: 10px;
    }

    .top-middle {
        margin-left: 40%;
        display: inline;
        /*  float: left;*/
    }

    .top-right {
        margin-left: 150px;
        display: inline;
    }

    .left {
        width: 20%;
        height: 86%;
        background-color: #E9EDF0;
        float: left;
        /*border:1px solid red;*/
    }

    li {
        height: 50px;
        font-size: 20px;
        line-height: 50px;
        text-align: center;
    }

    #li1:hover {
        color: white;
        background-color: #006AB6;
    }

    #li2:hover {
        color: white;
        background-color: #006AB6;
    }

    #li3:hover {
        color: white;
        background-color: #006AB6;
    }

    #li4:hover {
        color: white;
        background-color: #006AB6;
    }

    #li5:hover {
        color: white;
        background-color: #006AB6;
    }

    .right {
        width: 100%;
        height: 100%;
    }

    .head {
        width: 100%;
        height: 50px;
        /*background-color: cyan;*/
        line-height: 50px;
        color: #6A99C7;
    }

    .head-left {
        margin-left: 20px;
        float: left;
    }

    .head-right {
        margin-left: 60%;
    }
    #center-main{
        margin-top: 35px;
        margin-left: 500px;
    }

    .li2-li{
        font-size: 0.8em;
        display: none;
    }
    .li3-li{
        font-size: 0.8em;
        display: none;
    }
    .li1-li{
        font-size: 0.8em;
        display: none;
    }
    .li4-li{
        font-size: 0.8em;
        display: none;
    }
    </style>
</head>

<body>
    <div class="main">
        <div class="top">
            <img src="images/logo.png">
            <div class="top-middle">
                欢迎您，admin
            </div>
            <div class="top-right">
                <a href="#">帮助</a>
                <a href="#">退出</a>
            </div>
        </div>
        <div class="left">
            <li id="li1">用户管理</li>
            <li class="li1-li">添加用户</li>
            <li class="li1-li">删除用户</li>
            <li class="li1-li">更新用户</li>
            <!-- <li id="li5">用户添加</li> -->
            <li id="li2">理财管理</li>
            <li class="li2-li">添加理财产品</li>
            <li class="li2-li">删除理财产品</li>
            <li class="li2-li">更新理财产品</li>
            <li id="li3">角色管理</li>
            <li class="li3-li">添加角色</li>
            <li class="li3-li">删除角色</li>
            <li class="li3-li">更新角色</li>
            <li id="li4">信息统计</li>
            <li class="li4-li">在线人数统计</li>
            <li class="li4-li">用户状态统计</li>
        </div>
        <div class="right">
            <div class="head">
                <div class="head-left">
                    当前位置：角色管理>添加角色
                </div>
                <div class="head-right">
                    今天是2017年10月17日 星期二
                </div>
                <!--  主体  -->
                <div id="center-main">
                <div class="form-title">新增角色</div>
                <form class="myForm" action="userList.html">
                    <div class="myForm-msg">
                        <label>角色名称：</label>
                        <input type="text" id="tough" name="username" placeholder="请输入要添加的角色名!" required="true">
                        <strong id="usernameMsg"></strong>
                    </div>
                    <div class="myForm-msg">
                        <label>角色状态：</label>
                        <input type="text" name="email" placeholder="请输入角色状态!" required="true">
                        <strong id="emailMsg"></strong>
                    </div>
                    <div class="myForm-msg">
                        <label>角色权限：</label>
                        <input type="text" name="email" placeholder="请输入角色权限!" required="true">
                        <strong id="emailMsg"></strong>
                    </div>
                    <div class="myForm-btn">
                        <input type="submit" name="" id="myForm-submit" value="保存">
                        <input type="reset" name="" value="重置">
                        <input type="button" name="" value="返回">
                    </div>
                </form>
                </div>

            </div>
        </div>
    </div>
</body>

<script type="text/javascript">
    $(function(){
        $("#li2").click(function(){
            $(".li2-li").toggle();
        });
        $("#li3").click(function(){
            $(".li3-li").toggle();
        });
        $("#li1").click(function(){
            $(".li1-li").toggle();
        });
        $("#li4").click(function(){
            $(".li4-li").toggle();
        });
    });

</script>
</html>
function register(){
	var name=document.getElementById('name').value;
	var password=document.getElementById("password").value;
	var againpass=document.getElementById("againpass").value;
	var email=document.getElementById("email").value;
	if(name==""){
		alert("用户名称不能为空！");
		return false;
	}else if(password==""){
		alert("登录密码不能为空！");
		return false;
	}else if(againpass==""){
		alert("重复密码不能为空！");
		return false;
	}else if(email==""){
		alert("email不能为空！");
		return false;
	}else if(name.length<6||name.length>20){
		alert("用户名长度必须在6-20个字符之间！");
		return false;
	}else if(password.length<6||password.length>20){
		alert("密码长度必须在6-20个字符之间！");
		return false;
	}else if(againpass.length<6||againpass.length>20){
		alert("重复密码长度必须在6-20个字符之间！");
		return false;
	}else if(password!=againpass){
		alert("密码和重复密码必须相等！");
		return false;
	}
}
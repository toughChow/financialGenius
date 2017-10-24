function register(){
	if(document.getElementById("name").value.length==0){
		alert("项目名不能为空!");
		document.getElementById("name").focus();
		return false;
	}else if(document.getElementById("password").value.length==0){
		alert("金额不能为空!");
		document.getElementById("password").focus();
		return false;
	}else if(document.getElementById("againpass").value.length==0){
		alert("描述不能为空!");
		document.getElementById("againpass").focus();
		return false;
	}else if(typeof (document.getElementById("password").value)!='number'){
		alert("金额必须输入数字");
		return false;
	}
	return true;
}
	    $(function(){
	        $("#li2").click(function(){
	            $(".li2-li").animate({
	            	height:'toggle'
	            },300);
	        });
	        $("#li3").click(function(){
	            $(".li3-li").animate({
	            	height:'toggle'
	            },300);
	        });
	        $("#li1").click(function(){
	            $(".li1-li").animate({
	            	height:'toggle'
	            },300);
	        });
	        $("#li4").click(function(){
	            $(".li4-li").animate({
	            	height:'toggle'
	            },300);
	        });
	        $('table tr:odd').css("background-color","#562E30");
	    });
	    function login(){
			if(document.getElementById("name").value.length==0){
				alert("用户名不能为空!");
				document.getElementById("name").focus();
				return false;
			}else if(document.getElementById("password").value.length==0){
				alert("密码不能为空!");
				document.getElementById("password").focus();
				return false;
			}
			return true;
		}
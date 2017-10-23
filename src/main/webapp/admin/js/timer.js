		$(function() {
			// 获取时间
			var mytime = new Date();
			var myYear = mytime.getFullYear();
			var myMonth = mytime.getMonth() + 1;
			var myDay = mytime.getDate();
			$("#mytimer").html(
					"今天是" + myYear + "年" + myMonth + "月" + myDay + "日");
		});

$(document).ready(function() {
	resizeWindow();
	$(window).resize(function() {
		resizeWindow();
	});
})
function resizeWindow() {
	var contentHeight=$(window).height()-60;
	$(".div_left").height(contentHeight);
	$("iframe").height(contentHeight);
	$(".div_bottom").css("margin-top",contentHeight-100);
}

function praisePost(btn){
	var ajax;
	var uuid = btn.getAttribute("uuid");
	if(window.XMLHttpRequest){
		ajax = new XMLHttpRequest();
	} else {
		ajax = new ActiveXObject("Microsoft.XMLHTTP");
	}
	ajax.onreadystatechange=function(){
		if(ajax.readyState==4&&ajax.status==200){
			var result = ajax.responseText;
			if(result=='o'){
				alert("请先登录！");
			} else if (result=='p'){
				alert("你已经点赞！");
			} else {
				var praise = document.getElementById(uuid);
				praise.innerHTML = result;
			}
		}
	}
	ajax.open("POST","/forum/user/praisePost",true);
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid+"&random="+Math.random());
}
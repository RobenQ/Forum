function btnClick(btn){
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
			if(result=="login"){
				alert("请先登录！");
			} else if (result=="cancle"){
				var focus = document.getElementById(uuid);
				alert("已取消关注！");
				btn.innerText = "关注";
				btn.style.background = "burlywood";
				focus.innerHTML = focus.innerHTML-1;
			} else {
				alert("关注成功！");
				eval("var json = "+result);
				var focus = document.getElementById(uuid);
				btn.innerText = "已关注";
				btn.style.background = "lightgray";
				focus.innerHTML = json.focus;
			}
		}
	}
	ajax.open("POST","/forum/user/followingBlock",true);
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid+"&random="+Math.random());
}

function oneload(){
	var btn = document.getElementsByClassName("btn");
	for (let i = 0; i < btn.length; i++) {
		var ajax;
		var uuid = btn[i].getAttribute("uuid");
		if(window.XMLHttpRequest){
			ajax = new XMLHttpRequest();
		} else {
			ajax = new ActiveXObject("Microsoft.XMLHTTP");
		}
		ajax.onreadystatechange=function(){
			if(ajax.readyState==4&&ajax.status==200){
				var result = ajax.responseText;
				if (result=="init"){
					btn[i].innerText = "已关注";
					btn[i].style.background = "lightgray";
				}
			}
		}
		ajax.open("POST","/forum/user/followingBlock2",false);
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("uuid="+uuid+"&random="+Math.random());
	}
}
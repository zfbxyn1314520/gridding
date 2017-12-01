$(function(){
	
	//这里用到了cookie.js
	var themeName = $.cookie("bjui_theme") || "blue";
	//这里用到了theme.css
	var color = themeColor(themeName);
	$(".am-fr>ul>li>a:first-child").css("color",color);
	//这里用到了loading.js
	$("body").loading({
		loadingWidth:300,
		title:'',
		name:'loading',
		titleColor:'#fff',
		discColor:color,
		discription:'请稍后，程序正在为您加载... ...',
		direction:'column',
		type:'origin',
		originBg:color,
		originDivWidth:40,
		originDivHeight:40,
		originWidth:6,
		originHeight:6,
		smallLoading:false,
		loadingBg:'rgba(0,0,0,0)',
		loadingMaskBg:'rgba(22,22,22,0.2)'
	});
	
	//这里document.onreadystatechange来判断页面是否加载完成
	document.onreadystatechange = function(){
			//若加载完成，就移除loading
		 if(document.readyState == "complete"){  
		        removeLoading('loading');
		    }
	}
	
	//生成主页面左边导航菜单栏的菜单
	$.ajax({
		url:'user/getUserPerMenu.do?'+(new Date()).getTime(),
		type:'get',
		dataType:'json',
		cache:false,
		success:function(data){
			var menu = "<ul class='sidebar-nav'>";
			var str = "";
			var num = 0;
			for(var i = 0; i < data.length; i++){
				if(data[i].parentMenuId == null){
					
					menu += "<li class='sidebar-nav-link sidebar-nav-link-"+themeName+"'><a href='javascript:void(0);' ";
					if(data[i].menuName == "我的主页")
						menu += "onclick='switchTab()'";
					menu += "class='sidebar-nav-sub-title";
					if(num == 0)
						menu += " active";
					menu += " '><i class='" +data[i].menuIcon+ " sidebar-nav-link-logo'></i>"+data[i].menuName;
				
					for(var j=0;j<data.length;j++){
						if(data[i].menuId == data[j].parentMenuId && data[j].menuUri !=null){
							str += "<li class='sidebar-nav-link sidebar-nav-link-"+themeName+"'><a href='"+data[j].menuUri+
							"' data-id='navTab"+data[j].menuId+"' data-title='"+data[j].menuName+"' data-toggle='navTab'" +
							"class='sidebar-nav-sub-title'><span style='margin-left:10px;' class='"+data[j].menuIcon+" sidebar-nav-link-logo'>" +
							"</span>&nbsp;"+data[j].menuName+"</a></li>";
						}
					}
					
					if(str != ""){
						menu += "<span class='am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico' stye='position:absolute;left:170px;'>" +
								"</span></a><ul class='sidebar-nav sidebar-nav-sub'>"+str+"</ul></li>";
					}else{
						menu += "</a></li>";
					}
					str = "";
					num++;
				}
			}
			menu+="</ul>";
			$("#navTab").html(menu);
		}
	});
	
	
	
});


function themeColor(theme){
	var color = "";
	switch (color){
		case "blue":
			color = "#0e90d2";
			break;
		case "purple":
			color = "#573e7e";
			break;
		case "green":
			color = "#008000";
			break;
	}
	return color;
};




<%@ page import="com.yanan.po.User , java.util.*" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>网格化信息管理系统</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="Keywords" content="B-JUI,Bootstrap,jquery,ui,框架,开源,OSC,开源框架,knaan"/>
<meta name="Description" content="网格化信息管理服务平台，人口数据库"/> 

<!-- bootstrap - css -->
<link href="B-JUI/themes/css/bootstrap.css" rel="stylesheet">
<!-- core - css -->
<link href="B-JUI/themes/css/style.css" rel="stylesheet">
<link href="B-JUI/themes/blue/core.css" id="bjui-link-theme" rel="stylesheet">
<link href="B-JUI/themes/css/fontsize.css" id="bjui-link-theme" rel="stylesheet">
<!-- plug - css -->
<link href="B-JUI/plugins/kindeditor_4.1.11/themes/default/default.css" rel="stylesheet">
<link href="B-JUI/plugins/colorpicker/css/bootstrap-colorpicker.min.css" rel="stylesheet">
<link href="B-JUI/plugins/nice-validator-1.0.7/jquery.validator.css" rel="stylesheet">
<link href="B-JUI/plugins/bootstrapSelect/bootstrap-select.css" rel="stylesheet">
<link href="B-JUI/plugins/webuploader/webuploader.css" rel="stylesheet">
<link href="B-JUI/themes/css/FA/css/font-awesome.min.css" rel="stylesheet">

<!-- Favicons -->
<link rel="icon" href="images/favicon.ico" type="iamge/x-icon">
<link href="B-JUI/assets/css/ZeroClipboard.css" rel="stylesheet">
<!-- 垂直水平导航条样式 -->
<link href="B-JUI/assets/css/amazeui.min.css" rel="stylesheet">
<link href="B-JUI/assets/css/app.css" rel="stylesheet">
<link href="B-JUI/assets/css/loading.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="B-JUI/plugins/wangEditor/css/wangEditor.min.css">


<!--[if lte IE 7]>
<link href="B-JUI/themes/css/ie7.css" rel="stylesheet">
<![endif]-->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lte IE 9]>
    <script src="B-JUI/other/html5shiv.min.js"></script>
    <script src="B-JUI/other/respond.min.js"></script>
<![endif]-->

<script src="B-JUI/assets/js/jquery.min.js"></script>
<script src="B-JUI/assets/js/amazeui.min.js"></script>


<!-- jquery -->
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<script src="B-JUI/js/jquery.cookie.js"></script>
<!--[if lte IE 9]>
<script src="B-JUI/other/jquery.iframe-transport.js"></script>
<![endif]-->
<!-- B-JUI -->
<script src="B-JUI/js/bjui-all.min.js"></script>
<!-- plugins -->
<!-- swfupload for kindeditor -->
<script src="B-JUI/plugins/swfupload/swfupload.js"></script>
<!-- Webuploader -->
<script src="B-JUI/plugins/webuploader/webuploader.js"></script>
<!-- kindeditor -->
<script src="B-JUI/plugins/kindeditor_4.1.11/kindeditor-all-min.js"></script>
<script src="B-JUI/plugins/kindeditor_4.1.11/lang/zh-CN.js"></script>
    <!-- wangEditor 在线html编辑器-->
    <script type="text/javascript" defer src="B-JUI/plugins/wangEditor/js/wangEditor.min.js"></script>
<!-- colorpicker -->
<script src="B-JUI/plugins/colorpicker/js/bootstrap-colorpicker.min.js"></script>
<!-- ztree -->
<script src="B-JUI/plugins/ztree/jquery.ztree.all-3.5.js"></script>
<!-- nice validate -->
<script src="B-JUI/plugins/nice-validator-1.0.7/jquery.validator.js"></script>
<script src="B-JUI/plugins/nice-validator-1.0.7/jquery.validator.themes.js"></script>
<!-- bootstrap plugins -->
<script src="B-JUI/plugins/bootstrap.min.js"></script>
<script src="B-JUI/plugins/bootstrapSelect/bootstrap-select.min.js"></script>
<script src="B-JUI/plugins/bootstrapSelect/defaults-zh_CN.min.js"></script>
<!-- icheck -->
<script src="B-JUI/plugins/icheck/icheck.min.js"></script>
<!-- HighCharts -->
<!-- <script src="B-JUI/plugins/highcharts/highcharts.js"></script>
<script src="B-JUI/plugins/highcharts/highcharts-3d.js"></script>
<script src="B-JUI/plugins/highcharts/themes/gray.js"></script> -->
    <!-- ECharts -->
    <script type="text/javascript" defer src="B-JUI/plugins/echarts/echarts.js"></script>
    <script type="text/javascript" defer src="B-JUI/plugins/echarts/chart/map.js"></script>
<!-- other plugins -->
<script src="B-JUI/plugins/other/jquery.autosize.js"></script>
<script src="B-JUI/plugins/download/jquery.fileDownload.js"></script>
    <!-- 提示插件 -->
    <script type="text/javascript" src="B-JUI/assets/js/loading.js"></script>


<style type="text/css">
	.tpl-header-navbar ul li{
		list-style-type: none;
	}
</style>

<!-- init -->
<script type="text/javascript">
$(function() {
    BJUI.init({
        JSPATH       : 'B-JUI/',         //[可选]框架路径
        PLUGINPATH   : 'B-JUI/plugins/', //[可选]插件路径
        loginInfo    : {url:'../index.html', title:'登录', width:440, height:240}, // 会话超时后弹出登录对话框
        statusCode   : {ok:200, error:300, timeout:301}, //[可选]
        ajaxTimeout  : 300000, //[可选]全局Ajax请求超时时间(毫秒)
        alertTimeout : 3000,  //[可选]信息提示[info/correct]自动关闭延时(毫秒)
        pageInfo     : {total:'totalRow', pageCurrent:'pageCurrent', pageSize:'pageSize', orderField:'orderField', orderDirection:'orderDirection'}, //[可选]分页参数
        keys         : {statusCode:'statusCode', message:'message'}, //[可选]
        ui           : {
                         sidenavWidth     : 220,
                         showSlidebar     : true, //[可选]左侧导航栏锁定/隐藏
                         overwriteHomeTab : false //[可选]当打开一个未定义id的navtab时，是否可以覆盖主navtab(我的主页)
                       },
        debug        : true,    // [可选]调试模式 [true|false，默认false]
        theme        : 'green' // 若有Cookie['bjui_theme'],优先选择Cookie['bjui_theme']。皮肤[五种皮肤:default, orange, purple, blue, red, green]
    })
    //时钟
    var today = new Date(), time = today.getTime()
    $('#bjui-date').html(today.formatDate('yyyy/MM/dd'))
    setInterval(function() {
        today = new Date(today.setSeconds(today.getSeconds() + 1))
        $('#bjui-clock').html(today.formatDate('HH:mm:ss'))
    }, 1000)
})

/*window.onbeforeunload = function(){
    return "确定要关闭本系统 ?";
}*/

//菜单-事件-zTree
function MainMenuClick(event, treeId, treeNode) {
    if (treeNode.target && treeNode.target == 'dialog' || treeNode.target == 'navtab')
        event.preventDefault()
    
    if (treeNode.isParent) {
        var zTree = $.fn.zTree.getZTreeObj(treeId)
        
        zTree.expandNode(treeNode)
        return
    }
    
    if (treeNode.target && treeNode.target == 'dialog')
        $(event.target).dialog({id:treeNode.targetid, url:treeNode.url, title:treeNode.name})
    else if (treeNode.target && treeNode.target == 'navtab')
        $(event.target).navtab({id:treeNode.targetid, url:treeNode.url, title:treeNode.name, fresh:treeNode.fresh, external:treeNode.external})
}

</script>

</head>
<body>
    <!--[if lte IE 7]>
        <div id="errorie"><div>您还在使用老掉牙的IE，正常使用系统前请升级您的浏览器到 IE8以上版本 <a target="_blank" href="http://windows.microsoft.com/zh-cn/internet-explorer/ie-8-worldwide-languages">点击升级</a>&nbsp;&nbsp;强烈建议您更改换浏览器：<a href="http://down.tech.sina.com.cn/content/40975.html" target="_blank">谷歌 Chrome</a></div></div>
    <![endif]-->
    
    <header class="navbar bjui-header" id="bjui-navbar" style="background:rgba(210,210,210,0.8);
    				border:1px solid #f1f1f1;box-shadow:0 1px 8px rgba(0,0,0,.1)">
    		 <div class="tpl-header-fluid">
    		 <span style="font-size:30px; vertical-align:middle;">
    		 	<%
    		 		User user = (User)session.getAttribute("user");
    		 		Integer areaLevel = user.getArea().getAreaLevel();	
    		 		String title="";
    		 		if(areaLevel>=3){
    		 			title=user.getArea().getAreaName()+"网格信息化运行中心";
    		 		}else{
    		 			title="网格信息化管理系统";
    		 		}
    		 	%>
    		 	<%=title %>
    		 </span>
                <!-- 其它功能-->
                <div class="am-fr tpl-header-navbar">
                    <ul>
                        <!-- 欢迎语 -->
                        <li class="am-text-sm tpl-header-navbar-welcome">
                            <a href="javascript:;">欢迎你, 
                            	<span id="save_username">${sessionScope.user.userName}</span>
                            	<input id="areaId" type="hidden" value="${sessionScope.user.areaId}"/>
                             </a>
                             <!-- 把这个用户名和区域ID存起来，在信息管理界面使用 -->
                             <script type="text/javascript">
                             	sessionStorage.userName = $("#save_username").text();
                             	sessionStorage.areaId = $("#areaId").val();
                             </script>
                        </li>
                        <!-- 新提示 -->
                        <li class="am-dropdown" data-am-dropdown>
                            <a href="javascript:;" class="am-dropdown-toggle" data-am-dropdown-toggle>
                                <i class="am-icon-bell"></i>
                                <span class="am-badge am-badge-warning am-round item-feed-badge">5</span>
                            </a>
                            <!-- 弹出列表 -->
                            <ul class="am-dropdown-content tpl-dropdown-content">
                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <span class="tpl-dropdown-menu-notifications-title">
                                            <i class="am-icon-line-chart"></i>
                                            <span> 有6笔新的销售订单</span>
                                        </span>
                                        <span class="tpl-dropdown-menu-notifications-time">
                                            12分钟前
                                        </span>
                                    </a>
                                </li>
                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <span class="tpl-dropdown-menu-notifications-title">
                                            <i class="am-icon-star"></i>
                                            <span> 有3个来自人事部的消息</span>
                                        </span>
                                        <span class="tpl-dropdown-menu-notifications-time">
                                            30分钟前
                                        </span>
                                    </a>
                                </li>
                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <span class="tpl-dropdown-menu-notifications-title">
                                            <i class="am-icon-folder-o"></i>
                                            <span> 上午开会记录存档</span>
                                        </span>
                                        <span class="tpl-dropdown-menu-notifications-time">
                                            1天前
                                        </span>
                                    </a>
                                </li>
                                <li class="tpl-dropdown-menu-notifications">
                                    <a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
                                        <i class="am-icon-bell"></i> 进入列表…
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <!-- 切换皮肤 -->
							<li class="dropdown active lnc">
								<a href="#" class="dropdown-toggle theme" data-toggle="dropdown" title="切换皮肤">
									<i class="fa fa-tree"></i>
								</a>
                        		<ul class="dropdown-menu"  id="bjui-themes">
                            		<li>
                            			<a href="javascript:;" class="theme_purple" data-toggle="theme" data-theme="purple"
                            				style="color:purple;">&nbsp;
                            				<i class="fa fa-tree"></i> 紫罗兰
                            			</a>
                            		</li>
                            		<li class="active">
                            			<a href="javascript:;" class="theme_blue" data-toggle="theme" data-theme="blue"
                            				style="color:#0e90d2">&nbsp;
                            				<i class="fa fa-tree"></i> 天空蓝
                            			</a>
                            		</li>
                            		<li>
                            			<a href="javascript:;" class="theme_green" data-toggle="theme" data-theme="green"
                            				style="color:green;">&nbsp;
                            				<i class="fa fa-tree"></i> 绿草如茵
                            			</a>
                            		</li>
                        		</ul>
                    		</li>
                        <!-- 退出 -->
                        <li class="am-text-sm">
                            <a href="javascript:;">
                                <span class="am-icon-sign-out"></span> 退出
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
    </header>
    
    
    <div id="bjui-body-box">
        <div class="container_fluid" id="bjui-body">
            <div id="bjui-sidenav-col">
                <div id="bjui-sidenav">
                    <div id="bjui-sidenav-arrow" data-toggle="tooltip" data-placement="left" data-title="隐藏左侧菜单"
                    	style="position:absolute; left:180px;" >
                        <i class="fa fa-long-arrow-left"></i>
                    </div>
                    <div id="bjui-sidenav-box">
                       <!-- 用户信息 -->
			            <div class="tpl-sidebar-user-panel" style="border-bottom: 1px #eee solid;height: 90px;">
			                <div class="tpl-user-panel-slide-toggleable">
			                    <div class="tpl-user-panel-profile-picture">
			                        <%
						            	String headIcon = ((User)session.getAttribute("user")).getHeadIcon();
						            	if(headIcon==null || headIcon.equals("")){
						            		headIcon = "images/user/default.png";
						            	}
						            %>
						            <img alt="头像" src="<%=headIcon%>">
			                    </div>
			                 	<div style="margin-top:-60px;margin-left:80px;">
			                 		 <span class="user-panel-logged-in-text">
			              				<i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>&nbsp;
			              				${sessionScope.user.role.roleName}</span>
			                    	<a href="javascript:;" class="tpl-user-panel-action-link"> 
			                    		<span class="am-icon-pencil"></span>&nbsp; &nbsp;账号设置
			                   		</a>
			                 	</div>
			                </div>
			            </div>
			            <div>
			            	<span id="navTab">此处放导航垂直菜单</span>
			            </div>
                    </div>
                </div>
            </div>
            <div id="bjui-navtab" class="tabsPage">
                <div id="bjui-sidenav-btn" data-toggle="tooltip" data-title="显示左侧菜单" data-placement="right">
                    <i class="fa fa-bars"></i>
                </div>
                <div class="tabsPageHeader">
                    <div class="tabsPageHeaderContent">
                        <ul class="navtab-tab nav nav-tabs">
                            <li><a href="javascript:;"><span><i class="fa fa-home"></i> #maintab#</span></a></li>
                        </ul>
                    </div>
                    <div class="tabsMore" style="border-left:0;border-right:0;border-top:0">
                    	<span id="bjui-date">0000/00/00</span> <span id="bjui-clock">00:00:00</span>
                    </div>
                </div>
                <ul class="tabsMoreList">
                    <li><a href="javascript:;">#maintab#</a></li>
                </ul>
                <div class="navtab-panel tabsPageContent">
                    <div class="navtabPage unitBox">
                        <div class="bjui-pageContent">
                           <div class="row">
							  <div class="col-md-6" style="">
									<div class="panel panel-default">
									  <div class="panel-heading">
									    <h3 class="panel-title">饼图</h3>
									  </div>
									  <div class="panel-body">
									    	<div id="pie_echart" style="mini-width:400px;height:350px;"></div>
									  </div>
									</div>
							  </div>
							  <div class="col-md-6">
							  		<div class="panel panel-default">
									  <div class="panel-heading">
									    <h3 class="panel-title">地图</h3>
									  </div>
									  <div class="panel-body">
									    <div id="map_echart" style="mini-width:400px;height:350px;"></div>
									  </div>
									</div>
							  </div>
							  <div class="col-md-12">
							  		<div class="panel panel-default">
									  <div class="panel-heading">
									    <h3 class="panel-title">柱状图</h3>
									  </div>
									  <div class="panel-body">
									    <div id="bar_echart" style="mini-width:400px;height:350px;"></div>
									  </div>
									</div>
							  </div>
							</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="B-JUI/other/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
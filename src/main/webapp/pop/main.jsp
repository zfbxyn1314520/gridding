<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.yanan.po.User,java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>

<base href="<%=basePath%>">
<title>网格信息化管理系统</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="Keywords" content="B-JUI,Bootstrap,jquery,ui,人口,网格信息化,群团活动中心" />
<meta name="Description" content="网格信息化服务群众平台--人口数据库" />
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
<!-- 图片上传css -->
<link href="B-JUI/plugins/webuploader/webuploader.css" rel="stylesheet">
<link href="B-JUI/themes/css/FA/css/font-awesome.min.css" rel="stylesheet">
<!-- Favicons -->
<link rel="icon" href="images/favicon.ico" type="image/x-icon">
<link href="B-JUI/assets/css/ZeroClipboard.css" rel="stylesheet">
<!-- 垂直、水平导航条样式 -->
<link rel="stylesheet" href="B-JUI/assets/css/amazeui.min.css">
<link rel="stylesheet" href="B-JUI/assets/css/app.css">
<link rel="stylsheet" href="B-JUI/assets/css/loading.css">
<!-- 王，文本编辑器 -->
<link rel="stylesheet" href="B-JUI/plugins/wangEditor/css/wangEditor.min.css">
<!--[if lte IE 7]>
<link href="B-JUI/themes/css/ie7.css" rel="stylesheet">
<![endif]-->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lte IE 9]>
    <script src="B-JUI/other/html5shiv.min.js"></script>
    <script src="B-JUI/other/respond.min.js"></script>
<![endif]-->

<!-- 垂直、水平导航的js -->
<script type="text/javascript" src="B-JUI/assets/js/jquery.min.js"></script>
<script type="text/javascript" src="B-JUI/assets/js/amazeui.min.js"></script>
<!-- jquery -->
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-2.1.4.min.js"></script>
<script src="B-JUI/js/jquery.cookie.js"></script>
<!--[if lte IE 9]>
<script src="B-JUI/other/jquery.iframe-transport.js"></script>
<![endif]-->
<!-- B-JUI -->
<script src="B-JUI/js/bjui-all.min.js"></script>

<!-- 提示插件，也穿插了自己写的main.js -->
<script type="text/javascript" src="B-JUI/assets/js/loading.js"></script>
<!-- <script type="text/javascript" src="js/main.js"></script> -->
<!-- plugins -->
<!-- swfupload for kindeditor -->
<script src="B-JUI/plugins/swfupload/swfupload.js"></script>
<!-- Webuploader图片上传js -->
<script src="B-JUI/plugins/webuploader/webuploader.js"></script>
<!-- kindeditor -->
<script src="B-JUI/plugins/kindeditor_4.1.11/kindeditor-all-min.js"></script>
<script src="B-JUI/plugins/kindeditor_4.1.11/lang/zh-CN.js"></script>
<!-- wangEditor在线html编辑器 -->
<script type="text/javascript" src="B-JUI/plugins/wangEditor/js/wangEditor.min.js"></script>
<!-- colorpicker -->
<script src="B-JUI/plugins/colorpicker/js/bootstrap-colorpicker.min.js"></script>
<!-- ztree树 -->
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
<!-- ECharts图表插件 -->
<script type="text/javascript" src="B-JUI/plugins/echarts/echarts.js"></script>
<script type="text/javascript" src="B-JUI/plugins/echarts/chart/map.js"></script>
<!-- other plugins -->
<script src="B-JUI/plugins/other/jquery.autosize.js"></script>
<!-- 图片下载 -->
<script src="B-JUI/plugins/download/jquery.fileDownload.js"></script>

<script type="text/javascript">
        $(function () {
            BJUI.init({
                JSPATH: 'B-JUI/',         //[可选]框架路径
                PLUGINPATH: 'B-JUI/plugins/', //[可选]插件路径
                loginInfo: {url: '../index.html', title: '登录', width: 440, height: 240}, // 会话超时后弹出登录对话框
                statusCode: {ok: 200, error: 400, timeout: 502}, //[可选]
                ajaxTimeout: 30000, //[可选]全局Ajax请求超时时间(毫秒)
                alertTimeout: 3000,  //[可选]信息提示[info/correct]自动关闭延时(毫秒)
                pageInfo: {
                    total: 'totalRow',
                    pageCurrent: 'pageCurrent',
                    pageSize: 'pageSize',
                    orderField: 'orderField',
                    orderDirection: 'orderDirection'
                }, //[可选]分页参数
                keys: {statusCode: 'statusCode', message: 'message'}, //[可选]
                ui: {
                    sidenavWidth: 220,
                    showSlidebar: false, //[可选]左侧导航栏锁定/隐藏
                    overwriteHomeTab: false //[可选]当打开一个未定义id的navtab时，是否可以覆盖主navtab(我的主页)
                },
                debug: true,    // [可选]调试模式 [true|false，默认false]
                theme: 'blue' // 若有Cookie['bjui_theme'],优先选择Cookie['bjui_theme']。皮肤[五种皮肤:default, orange, purple, blue, red, green]
            });
            //时钟
            var today = new Date();
            time = today.getTime();
            $('#bjui-date').html(today.formatDate('yyyy年MM月dd日'));
            setInterval(
                function () {
                    today = new Date(today.setSeconds(today.getSeconds() + 1));
                    $('#bjui-clock').html(today.formatDate('HH:mm:ss'));
                }, 1000
            );
        });

        /*window.onbeforeunload = function(){
         return "确定要关闭本系统 ?";
         }*/

        //菜单-事件-zTree
        function MainMenuClick(event, treeId, treeNode) {
            if (treeNode.target && treeNode.target == 'dialog' || treeNode.target == 'navtab')
                event.preventDefault();
            if (treeNode.isParent) {
                var zTree = $.fn.zTree.getZTreeObj(treeId);
                zTree.expandNode(treeNode);
                return
            }
            if (treeNode.target && treeNode.target == 'dialog')
                $(event.target).dialog({id: treeNode.targetid, url: treeNode.url, title: treeNode.name});
            else if (treeNode.target && treeNode.target == 'navtab')
                $(event.target).navtab({
                    id: treeNode.targetid,
                    url: treeNode.url,
                    title: treeNode.name,
                    fresh: treeNode.fresh,
                    external: treeNode.external
                });
        }
         
         
         
</script>
</head>
<body>
	<header class="navbar bjui-header" id="bjui-navbar" style="background:rgba(255,255,255,0.8);
		border:1px #f1f1f1 solid; box-shadow:0 1px 8px rgba(0,0,0,.1)">
		<div class="tpl-header-fluid">
			<span style="font-size:30px; vertical-align:middle;">
				<%User user = (User)session.getAttribute("user");
					Integer areaLevel = user.getArea().getAreaLevel();
					String title = "";
					if(areaLevel>=3){
					title = user.getArea().getAreaName()+"网格信息化运行中心";						
					}else{
						title="网格信息化管理系统";
					}
				%>
				<%=title %>
			</span>
			<!--  -->
			<div class="am-fr tpl-header-navbar">
				<ul>
					<li class="am-text-sm tpl-header-navbar-welcome">
						<a href="javascript:;">欢迎你,
							<span id="save_username">${sessionScope.user.userName }</span>
							<input type="hidden" id="user_areaId" value="${sessionScope.user.areaId }">
						</a>
						<!-- 将用户名和区域ID保存起来，在信息管理界面使用 -->
						<script type="text/javascript">
							sessionStorage.userName=$("#save_username").text();
							sessionStorage.userArea=$("#user_areaId").val();
						</script>
					</li>
					<li class="am-dropdown" data-am-dropdown title="新消息">
						<a href="javascript:;" class="am-dropdown-toggle" data-am-dropdown-toggle>
							<i class="am-icon-bell"></i>
							<span class="am-badge am-badge-warning am-round item-feed-badge">5</span>
						</a>
						<!-- 弹出列表 -->
						<ul class="am-dropdown-content tpl-dropdown-content">
							<li class="tpl-dropdown-menu-notifications">
								<a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
									<span class="tpl-dropdown-menu-notifications-title">
										<i class="am-icon-line-chart"></i>&nbsp;有8笔新的销售信息
									</span>
									<span class="tpl-dropdown-menu-notifications-time">
										10分钟前
									</span>
								</a>
							</li>
							<li class="tpl-dropdown-menu-notifications">
								<a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
									<span class="tpl-dropdown-menu-notifications-title">
										<i class="am-icon-star"></i>&nbsp;有3个来自人事部的消息
									</span>
									<span class="tpl-dropdown-menu-notifications-time">
										30分钟前
									</span>
								</a>
							</li>
							<li class="tpl-dropdown-menu-notifications">
								<a href="javascript:;" class="tpl-dropdown-menu-notifications-item am-cf">
									<span class="tpl-dropdown-menu-notifications-title">
										<i class="am-icon-folder-o"></i>&nbsp;上午开会记录存档
									</span>
									<span class="tpl-dropdown-menu-notifications-time">
										1天前
									</span>
								</a>
							</li>
							<li class="tpl-dropdown-menu-notifications">
								<a href="javascript:;" class="tpl-dropdown-menu-notifications-item">
									<i class="am-icon-bell"></i>进入列表...
								</a>
							</li>
						</ul>
					</li>
					<!-- 切换皮肤 -->
					<li class="dropdown active lnc">
						<a href="#" class="dropdown-toggle theme" data-toggle="dropdown" title="切换皮肤">
							<i class="fa fa-tree"></i>
						</a>
						<ul class="dropdown-menu" id="bjui-themes">
							<li>
								<a href="javascript:;" class="theme_purple" data-toggle="theme" data-theme="purple"
									style="color:purple;">&nbsp;
									<i class="fa fa-tree"></i>紫罗兰
								</a>
							</li>
							<li class="active">
								<a href="javascript:;" class="theme_blue" data-toggle="theme" data-theme="blue" 
									style="color:#0e90d2;">&nbsp;
									<i class="fa fa-tree"></i>天空蓝
								</a>
							</li>
							<li>
								<a href="javascript:;" class="theme_green" data-toggle="theme" data-theme="green" 
									style="color:green">&nbsp;
									<i class="fa fa-tree"></i>绿草如茵
								</a>
							</li>
						</ul>
					</li>
					<!-- 退出 -->
					<li class="am-text-sm">
						<a href="javascript:;" onclick="quitLogin();">
							<span class="am-icon-sign-out">退出</span>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</header>
		
	<div id="bjui-body-box">
		<div class="container-_fluid" id="bjui-body">
			<!-- 左侧导航区 -->
			<div id="bjui-sidenav-col">
				<div id="bjui-sidenav">
				<div id="bjui-sidenav-arrow" data-toggle="tooltip" data-placement="left" data-title="隐藏菜单" 
					style="position:absolute; left:180px;">
					<i class="fa fa-long-arrow-left"></i>
				</div>
				<div id="bjui-sidenav-box">
					<!-- 侧边导航栏 -->
					<div class="left-sidebar">
						<!-- 用户信息栏 -->
						<div class="tpl-sidebar-user-panel" style="border-bottom:1px #eee solid;height:90px;">
							<div class="tpl-user-panel-slide-toggleable">
								<div class="tpl-user-panel-profile-picture">
									<%String headIcon = ((User)session.getAttribute("user")).getHeadIcon(); 
										if(headIcon==null || headIcon.equals("")){
											headIcon = "images/user/default.png";
										}
									%>
									<img alt="头像" src="<%=headIcon%>">
								</div>
								<div style="margin-left:80px;margin-top:-60px;">
									<span class="user-panel-logged-in-text">
										<i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>&nbsp;${ sessionScope.user.role.roleName}
									</span>
									<a href="javascript:;" class="tpl-user-panel-action-link"
										onclick="userSetting(${sessionScope.user.userId});">
										<span class="am-icon-pencil"></span>&nbsp;&nbsp;账号设置
									</a>
								</div>
							</div>
						</div>
						<!-- 垂直菜单栏内容  根据权限生成导航菜单 -->
						<div id="navTab"></div>
					</div>
				</div>
			</div>
		</div>
			
		<!-- 内容 -->
		<div id="bjui-navtab" class="tabsPage">
			<div id="bjui-sidenav-btn" data-toggle="tooltip" data-title="显示菜单" data-placement="right">
				<i class="fa fa-bars"></i>
			</div>
		</div>
			
	</div>
</div>
		
	
</body>
</html>
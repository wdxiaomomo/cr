<#macro layout>
<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<script type="text/javascript">
	var base = "${ctx}";
	console.log(base);
</script>
<#-- import css -->
<link rel="stylesheet" href="${ctx}/plugins/bootstrap/css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/plugins/dist/css/adminlte.min.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/plugins/dist/css/skins/skin-blue.min.css" type="text/css" />
<link rel="stylesheet" href="${ctx}/plugins/font-awesome/css/font-awesome.min.css" type="text/css" />
<#-- import js -->
<script src="${ctx}/js/jquery.min.js" type="text/javascript"></script>
<script src="${ctx}/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${ctx}/plugins/dist/js/app.min.js" type="text/javascript"></script>
<title>${system_title}</title>
</head>
<body class="skin-blue sidebar-mini">
<div class="wrapper">
	<#-- header -->
	<header class="main-header">
	  <a href="/" class="logo">
			<span class="logo-mini">CR</span>
			<span class="logo-lg"><b>Personal</b>CR</span>
	  </a>
		<nav class="navbar navbar-static-top" role="navigation">
			<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
				<span class="sr-only">Toggle navigation</span>
			</a>
		</nav>
	</header>
	
	<#-- menu -->
	<aside class="main-sidebar">
	  <section class="sidebar">

			<div class="user-panel">
        <div class="pull-left image">
        	<img src="${ctx}/images/logo.jpg" class="img-circle" alt="my logo" />
        </div>
        <div class="pull-left info">
          <p>wdxiaomomo</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
          
	    <ul class="sidebar-menu">
	      <li><a href="#"><i class='header fa fa-pie-chart'></i> <span>首页</span></a></li>
	      <li class="treeview">
	        <a href="#"><i class='fa fa-table'></i> <span>收支管理</span> <i class="fa fa-angle-left pull-right"></i></a>
	        <ul class="treeview-menu">
	          <li><a href="#"><i class="fa fa-circle-o"></i>家庭管理</a></li>
	          <li><a href="#"><i class="fa fa-circle-o"></i>类型管理</a></li>
	          <li><a href="#"><i class="fa fa-circle-o"></i>收支明细</a></li>
	        </ul>
	      </li>
	      <li class="treeview">
	        <a href="#"><i class='fa fa-table'></i> <span>计算器</span> <i class="fa fa-angle-left pull-right"></i></a>
	        <ul class="treeview-menu">
	          <li><a href="#"><i class="fa fa-circle-o"></i>房贷计算器</a></li>
	          <li><a href="#"><i class="fa fa-circle-o"></i>个税计算器</a></li>
	        </ul>
	      </li>
	       <li class="treeview">
	        <a href="#"><i class='fa fa-table'></i> <span>小工具</span> <i class="fa fa-angle-left pull-right"></i></a>
	        <ul class="treeview-menu">
	          <li><a href="#"><i class="fa fa-circle-o"></i>GDP</li>
	          <li><a href="#"><i class="fa fa-circle-o"></i>人口</a></li>
	        </ul>
	      </li>
	    </ul>
	  </section>
	</aside>
	<#-- content page -->
	<#nested>
	
	<#-- footer -->
	<footer class="main-footer">
   <strong>Copyright &copy; 2015 <a href="#">pcr</a></strong>
	</footer>
	<div class='control-sidebar-bg'></div>
</div>
</body>
</html>
</#macro>

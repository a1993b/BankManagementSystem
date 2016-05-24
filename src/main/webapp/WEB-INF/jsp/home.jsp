<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="BMSApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank App</title>
<script type="text/javascript"
	src="resources/js/common/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="resources/js/common/angular.min.js"></script>
<script type="text/javascript"
	src="resources/js/common/angular-route.min.js"></script>
<script type="text/javascript"
	src="resources/js/common/bootstrap.min.js"></script>
<script type="text/javascript"
	src="resources/js/common/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="resources/js/bmsApp.js"></script>
<link rel="stylesheet" type="text/css"
	href="resources/css/common/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="resources/css/common/bootstrap-datepicker.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/app.css">
<link rel="stylesheet" type="text/css"
	href="resources/css/common/font-awesome.min.css">
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Bank Management System</h1>
		</div>
	</div>
	<div class="content-wrapper" ng-controller="BMSController">
		<nav class="navbar navbar-default main-nav">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">BMS</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-alignment">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">Page 1</a></li>
					<li><a href="#">Page 2</a></li>
					<li><a href="#">Page 3</a></li>
					<li><a href="#">Page 4</a></li>
					<li><a href="#">Page 5</a></li>
					<li><a href="#">Page 6</a></li>
					<li><a href="#">Page 7</a></li>
				</ul>
			</div>
		</div>
		</nav>
		<div class="row width-100-percent">
			<div class="col-sm-1"></div>
			<div class="col-sm-2">
				<div class="sidebar-nav">
					<div class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target=".sidebar-navbar-collapse">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<span class="visible-xs navbar-brand">Sidebar menu</span>
						</div>
						<div class="navbar-collapse collapse sidebar-navbar-collapse">
							<ul class="nav navbar-nav">
								<li class="active"><a href="#">Menu Item 1</a></li>
								<li><a href="#">Menu Item 2</a></li>
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown">Dropdown <b class="caret"></b></a>
									<ul class="dropdown-menu">
										<li><a href="#">Action</a></li>
										<li><a href="#">Another action</a></li>
										<li><a href="#">Something else here</a></li>
										<li class="divider"></li>
										<li class="dropdown-header">Nav header</li>
										<li><a href="#">Separated link</a></li>
										<li><a href="#">One more separated link</a></li>
									</ul></li>
								<li><a href="#">Menu Item 4</a></li>
								<li><a href="#">Reviews <span class="badge">1,118</span></a></li>
							</ul>
						</div>
						<!--/.nav-collapse -->
					</div>
				</div>
			</div>
			<div class="col-sm-8" style="padding-right: 0;">
				<div class="width-70-percent" ng-view></div>
				<div id="loginbox" style="float: right; padding-right: 0;"
					class="mainbox width-30-percent">
					<div class="panel panel-info">
						<div class="panel-heading">
							<div class="panel-title">
								Sign In
								<div
									style="float: right; font-size: 11px; position: relative; margin-top: 3px">
									<a href="#">Forgot password?</a>
								</div>
							</div>
						</div>
						<div style="padding-top: 30px" class="panel-body">
							<div style="display: none" id="login-alert"
								class="alert alert-danger col-sm-12"></div>
							<form id="loginform" class="form-horizontal" role="form">
								<div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span> <input
										id="login-username" type="text" class="form-control"
										name="username" ng-model="customerId" value=""
										placeholder="Customer ID">
								</div>
								<div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-lock"></i></span> <input
										id="login-password" type="password" class="form-control"
										ng-model="password" name="password" placeholder="password">
								</div>
								<div class="input-group">
									<div class="checkbox">
										<label> <input id="login-remember" type="checkbox"
											name="remember" value="1"> Remember me
										</label>
									</div>
								</div>
								<div style="margin-top: 10px" class="form-group">
									<!-- Button -->
									<div class="col-sm-12 controls">
										<a id="btn-login" href="" class="btn btn-success"
											ng-click="login()">Login </a>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-1"></div>
		</div>
	</div>
	<footer class="footer">
	<div class="container width-85-percent">
		<div class="footer-app-container display-inline-block">
			<p style="margin-top: 18px;">Bank Management System</p>
		</div>
		<div class="footer-social-links-container display-inline-block">
			<ul class="ul-list-container display-block" style="margin-bottom: 0;">
				<li class="padding-right-8 display-inline-block"><a href="" target="_blank"><i
						class="fa fa-twitter-square" aria-hidden="true"></i></a></li>
				<li class="padding-right-8 display-inline-block"><a href="" target="_blank"><i
						class="fa fa-facebook-official" aria-hidden="true"></i></a></li>
				<li class="padding-right-8 display-inline-block"><a href="" target="_blank"><i
						class="fa fa-google-plus-square" aria-hidden="true"></i></a></li>
			</ul>
			<p style="margin-bottom: 0;">Copyright ©&nbsp;2016 ABC Corp. All Rights Reserved.</p>
			<p style="margin-bottom: 30px;"><a href="" rel="nofollow">Privacy</a> | <a href="" rel="nofollow">Disclaimer</a></p>
		</div>
	</div>
	</footer>
</body>
</html>
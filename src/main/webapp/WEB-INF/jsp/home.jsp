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
	<script type="text/javascript" src="resources/js/common/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="resources/js/bmsApp.js"></script>
<link rel="stylesheet" type="text/css"
	href="resources/css/common/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="resources/css/common/bootstrap-datepicker.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/app.css">
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Bank Management System</h1>
		</div>
	</div>
	<div ng-controller="BMSController">
		<div ng-view></div>
	</div>
</body>
</html>
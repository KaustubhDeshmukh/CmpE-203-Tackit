<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<body>
			
			
	<div class="navbar navbar-fixed-top navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"	data-target=".navbar-collapse">
					<span class="icon-bar">	</span>
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand col-sm-offset-3"
					href="http://www.hp.com/country/us/en/hho/welcome.html"><img
					src="images/hp/hp-logo.gif" /></a>
			</div>

			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="hello.htm"><h4>Home</h4></a></li>
					<li><a href="#"><h4>Catalog</h4></a></li>
					<li><a href="#"><h4>Contact US</h4></a></li>
					<li><a href="#"><h4>About US</h4></a></li>
				</ul>
				<div style="float:right">
						<form class="form-inline">
						<input type="text" align="right" class="span4" placeholder="Search at HP..." />
						<button class="btn btn-primary">Search</button>
					</form>
			</div>
			</div>
		</div>
	</div>

</body>

</html>
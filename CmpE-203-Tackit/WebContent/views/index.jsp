<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/views/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head><title>Example :: Spring Application</title></head>
  <body>
  	<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
	<c:redirect url="/hello.htm"/>
    <h1>Example - Spring Application</h1>
    <p>This is my test.</p>
  </body>
</html>

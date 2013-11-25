<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/views/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
</br></br></br></br>
<div class="container">
<div class="row">

<div class="col-md-6">
<h3 class="caption">Sign In:</h3>

<form:form cssClass="form-horizontal" method="post" commandName="login">

<div class="form-group">
<form:label  path="emailId" for="email" cssClass="col-sm-2 control-label " >Email:</form:label>
<div class="col-sm-6">
<form:input path="emailId" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="password" for="password" cssClass="col-sm-2 control-label " >Password:</form:label>
<div class="col-sm-6">
<form:password path="password" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<div class="col-sm-6 col-sm-offset-2">
<button type="submit" class="btn btn-primary">Submit</button>
<button type="reset" class="btn btn-default">Clear</button>
</div>
</div>


</form:form>
</div>

</div>
</div>

</body>
</html>
<%@ include file="/views/footer.jsp" %>
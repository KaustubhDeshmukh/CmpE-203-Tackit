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
<h3 class="caption">Sign Up:</h3>

<form:form cssClass="form-horizontal" method="post" commandName="signUp">

<div class="form-group">
<form:label path ="firstName" for="firstName" cssClass="col-sm-3 control-label " >First Name:</form:label>
<div class="col-sm-6">
<form:input path="firstName" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="lastName" for="lastName" cssClass="col-sm-3 control-label " >Last Name:</form:label>
<div class="col-sm-6">
<form:input path="lastName" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="addr1" for="addr1" cssClass="col-sm-3 control-label " >Address line 1:</form:label>
<div class="col-sm-6">
<form:input path="addr1" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="addr2" for="addr2" cssClass="col-sm-3 control-label " >Address line 2:</form:label>
<div class="col-sm-6">
<form:input path="addr2" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="city" for="city" cssClass="col-sm-3 control-label " >City:</form:label>
<div class="col-sm-6">
<form:input path="city" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="state" for="state" cssClass="col-sm-3 control-label " >State:</form:label>
<div class="col-sm-6">
<form:input path="state" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="zip" for="zip" cssClass="col-sm-3 control-label " >Zip:</form:label>
<div class="col-sm-6">
<form:input path="zip" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label  path="emailId" for="emailId" cssClass="col-sm-3 control-label " >Email:</form:label>
<div class="col-sm-6">
<form:input path="emailId" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="password" for="password" cssClass="col-sm-3 control-label " >Password:</form:label>
<div class="col-sm-6">
<form:password path="password" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<form:label path ="rePassword" for="rePassword" cssClass="col-sm-3 control-label " >Re-enter Password:</form:label>
<div class="col-sm-6">
<form:password path="rePassword" cssClass="form-control" />
</div>
</div>

<div class="form-group">
<div class="col-sm-6 col-sm-offset-3">
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
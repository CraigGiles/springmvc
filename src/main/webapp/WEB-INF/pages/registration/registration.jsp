<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration Form</h1>

<div class="error">
    ${exception}
</div>
<br/>

<div class="form">
    <form:form method="post" action="registration" modelAttribute="registration">
        <form:label path="username">User Name</form:label>
        <form:input path="username"></form:input>
        <form:errors path="username" cssclass="error"></form:errors>
        <br/>

        <form:label path="password">Password:</form:label>
        <form:password path="password"></form:password>
        <form:errors path="password" cssclass="error"></form:errors>
        <br/>

        <form:label path="password_confirmation">Password Confirmation:</form:label>
        <form:password path="password_confirmation"></form:password>
        <form:errors path="password_confirmation" cssclass="error"></form:errors>
        <br/>

        <form:label path="email">Email:</form:label>
        <form:input path="email"></form:input>
        <form:errors path="email" cssclass="error"></form:errors>
        <br/>

        <input type="submit" value="Submit"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form:form>
</div>
</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration Form</h1>
<form:form method="post" action="registration" modelAttribute="registration">
    <table>
        <tr>
            <td><form:label path="username">User Name</form:label></td>
            <td><form:input path="username"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="password">Password:</form:label></td>
            <td><form:password path="password"></form:password></td>
        </tr>

        <tr>
            <td><form:label path="password_confirmation">Password Confirmation:</form:label></td>
            <td><form:password path="password_confirmation"></form:password></td>
        </tr>

        <tr>
            <td><form:label path="email">Email:</form:label></td>
            <td><form:input path="email"></form:input></td>
        </tr>

            <td colspan="20"><form:button name="submit" value="Register"></form:button></td>
    </table>
</form:form>
</body>
</html>
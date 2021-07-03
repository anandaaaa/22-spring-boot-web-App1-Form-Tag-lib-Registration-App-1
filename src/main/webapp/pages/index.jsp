<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="/register" method="POST" modelAttribute="student">

<table>
<tr>
<td>Student Name:</td>
<td><form:input path="studentName"/></td>
</tr>
<tr>
<td>Student Email:</td>
<td><form:input path="email"/></td>
</tr>

<tr>
<td>Student PhoneNo:</td>
<td><form:input path="phno"/></td>
</tr>

<tr>
				<td>Gender</td>
				<td><form:radiobuttons items="${gender}" path="gender" /></td>
			</tr>
			<tr>
				<td>Course</td>
				<td><form:select path="course">
						<form:options items="${courses}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Timings</td>
				<td><form:checkboxes items="${timings}" path="timing" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="Register"/>
			</tr>
</table>
</form:form>

</body>
</html>
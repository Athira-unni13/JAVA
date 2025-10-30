<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Employee Management System</title>
</head>
<body>
	<div>
		<h1>Employee Management System</h1>
		<h2>Save Employee</h2>
		<%-- spring tag --%>
		<form:form method="post" action="/saveEmployee"
			modelAttribute="employee">
			<form:label path="empName">Employee Name</form:label>
			<form:input path="empName" />
			<form:label path="empSalary">Employee Salary</form:label>
			<form:input path="empSalary" />
			<input type="submit" value="Submit" />
		</form:form>

		<%-- jsp code --%>
		<%--
<form action="/savedata" method="post" >
Employee Name<input type="text" name="empName"><br>
Employee Salary<input type="text" name="empSal"><br>
<button type="submit" value="Submit">Submit</button>
</form>
--%>
		<a href="/"> Back to Employee List</a>
	</div>
</body>
</html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
</head>
<body>
	<div>
		<h1>Employee Management System</h1>

		<h2>Update Employee</h2>

		<form:form action="/saveEmployee" method="post" modelAttribute="employee">
			<table>
				<form:hidden path="empId" />
				<tr>
					<td>Employee Name</td>
					<td><form:input path="empName" /></td>
				</tr>
				<tr>
					<td>Employee Salary</td>
					<td><form:input path="empSalary" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update Employee" /></td>
				</tr>
			</table>
		</form:form>
		<a href="/"> Back to Employee List</a>
	</div>
</body>
</html>
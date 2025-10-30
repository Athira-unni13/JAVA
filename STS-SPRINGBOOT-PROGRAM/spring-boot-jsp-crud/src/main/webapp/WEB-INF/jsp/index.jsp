<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>::Employee Management System::</title>
</head>
<body>
	<div>

		<a href="/showNewEmployeeForm"> Add Employee </a>
		<h2>Employees list</h2>
		<table>
			<tr>
				<th>Employee Name</th>
				<th>Employee Salary</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>

			<tbody>
				<!-- The <tbody> tag in HTML is used to group the body content of a <table> -->
				<c:forEach items="${listEmployees}" var="employee">
					<tr>
						<td>${employee.empName}</td>
						<td>${employee.empSalary}</td>
						<td><a href="showFormForUpdate/${employee.empId}">Update</a></td>
						<td><a href="deleteEmployee/${employee.empId}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
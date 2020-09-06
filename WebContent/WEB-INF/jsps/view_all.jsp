<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Record</title>
<style type="text/css">
body {
	background: linear-gradient(to right, #99ccff 0%, #336600 100%);
}
</style>
</head>
<body>
	<pre>
		<h1>Employees List</h1>
		<table border="2" width="70%" cellpadding="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Date of Birth</th>
				<th>Department</th>
				<th>Email Address</th>
				<th>Residential Address</th>
				<th>Edit Student</th>
				<th>Delete Student</th>
			</tr>
			<c:forEach var="std" items="${stdList}">
				<tr>
					<td>${std.std_id}</td>
					<td>${std.name}</td>
					<td>${std.dob}</td>
					<td>${std.department}</td>
					<td>${std.email}</td>
					<td>${std.address}</td>
					<td><a href="editstd/${std.std_id}">Edit</a></td>
					<td><a href="deletestd/${std.std_id}" onclick="return confirm('Are you sure you want to delete?')">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<br />
		<a href="stdform">Add New Employee</a>
	</pre>
</body>
</html>
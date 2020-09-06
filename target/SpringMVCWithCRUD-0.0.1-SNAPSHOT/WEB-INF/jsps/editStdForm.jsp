<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form:form method="POST" action="editsave">
	<h1>Edit Employee</h1>
		<table>
			<tr>
				<td>Id :</td>
				<td><h6>${command.std_id }</h6></td>
			</tr>
			<tr>
				<td></td>
				<td><form:hidden path="std_id" /></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Date of birth :</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Department :</td>
				<td><form:input path="department" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><form:input path="address" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Save Change" /></td>
			</tr>
		</table>
	</form:form>
</pre>
</body>
</html>
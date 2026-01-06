<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Data</title>
</head>
<body>
	<h1>Register Page</h1>
	<form action="dataInsert">
		<table>
			<tr>
				<td>Employee Id </td>
				<td><input type="number" name="empid">
			</tr>
			<tr>
				<td>Employee Name </td>
				<td><input type="text" name="ename">
			</tr>
			<tr>
				<td>Job Role</td>
				<td><input type="text" name="jobrole">
			</tr>
			<tr>
				<td>Department </td>
				<td><input type="text" name="dept">
			</tr>
			<tr>
				<td>Department Id </td>
				<td><input type="number" name="deptid">
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="Insert Data">
			</tr>
		</table>
	</form>
	

	<br>
	<hr>
	<h1>Delete using Id</h1>
	<form action="delete">
		<table>
			<tr>
				<td>Enter ID of user to be deleted</td>
				<td><input type="number" name="empid"></td>
				<td><input type="submit" value="Delete"></td>
			</tr>
		</table>
	</form>
	<br>
	<hr>
	<br>
	
	<h1>Insert data to Update user</h1>
	<form action = "update">
		<table>
			
			<tr>
				<td>Employee Id </td>
				<td><input type="number" name="empid">
			</tr>
			<tr>
				<td>Employee Name </td>
				<td><input type="text" name="ename">
			</tr>
			<tr>
				<td>Job Role</td>
				<td><input type="text" name="jobrole">
			</tr>
			<tr>
				<td>Department </td>
				<td><input type="text" name="dept">
			</tr>
			<tr>
				<td>Department Id </td>
				<td><input type="number" name="deptid">
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="Update Data">
			</tr>
		</table>
	</form>
	
	<br>
	<hr>
	<h1>Get User using Id</h1>
	<form action="get">
		<table>
			<tr>
				<td>Enter ID of user to display</td>
				<td><input type="number" name="empid"></td>
				<td><input type="submit" value="display User"></td>
			</tr>
		</table>
	</form>
	<br>
	<hr>
	<br>
	<h1>Get User using Id</h1>
	<form action="getAll">
		<table>
			<tr>
				<td>Get All Users</td>
				<td><input type="submit" value="Display all User"></td>
			</tr>
		</table>
	</form>
	<br>
</body>
</html>






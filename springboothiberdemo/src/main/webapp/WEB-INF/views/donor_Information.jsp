<%@page import="com.bloodbankapplication.model.BloodBankDonorDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Donor Home</title>
<link rel="icon"
	href="https://c8.alamy.com/comp/E94316/red-blood-drop-cartoon-character-E94316.jpg"
	type="image" sizes="40x40">
<style>
h1 {
	color: white;
}

table {
	margin-right: 10%;
	align: center;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 15px;
}

th {
	background-color: black;
	color: white;
	text-align: center;
}

table tr:nth-child(odd) {
	background-color:;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #56baed;">
	<h1>
		<center>CaresWorth Blood Bank</center>
	</h1>
	<h3>Welcome ${key.firstName}!</h3>
	<h4>Status: ${key.status}</h4>
	<br />
	<div class="container">
		<br>

		<table class="table table-bordered table-dark table-striped">
			<tr>
				<td>DonorId</td>
				<td>${key.id}</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td>${key.firstName}</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${key.lastName}</td>
			</tr>
			<tr>
				<td>Blood Group</td>
				<td>${key.bloodGroup}</td>
			</tr>
			<tr>
				<td>Haemoglobin level</td>
				<td>${key.heamoglobin}</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>${key.gender}</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>${key.age}</td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td>${key.email}</td>
			</tr>
			<tr>
				<td>Contact Number</td>
				<td>${key.contactNumber}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>${key.address}</td>
			</tr>
		</table>
		<a href="./">HOME PAGE</a>
</body>
</html>
<%@page import="java.util.List"%>
<%@page import="com.bloodbankapplication.model.BloodBankDonorDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Available Donors</title>
<link rel="icon"
	href="https://c8.alamy.com/comp/E94316/red-blood-drop-cartoon-character-E94316.jpg"
	type="image" sizes="40x40">
<style type="text/css">
h1 {
	color: black;
	text-align: center;
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
	<h1>CaresWorth Blood Bank</h1>
	<br>
	<br>
	<h2>AVAILABLE DONOR DETAILS!!!</h2>
	<br>
	<br>
	<div class="container">
		<br>

		<table class="table table-bordered table-dark table-striped">
			<th>Donor ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Blood Group</th>
			<th>Hemoglobin Level</th>
			<th>Age</th>
			<th>E-mail</th>
			<th>Contact Number</th>
			<th>Address</th>


			<%
				List<BloodBankDonorDetails> details = (List<BloodBankDonorDetails>) request.getAttribute("donorDetails");
				for (BloodBankDonorDetails detail : details) {
			%>


			<tr>
				<td><%=detail.getId()%></td>
				<td><%=detail.getFirstName()%></td>
				<td><%=detail.getLastName()%></td>
				<td><%=detail.getGender()%></td>
				<td><%=detail.getBloodGroup()%></td>
				<td><%=detail.getHeamoglobin()%></td>
				<td><%=detail.getAge()%></td>
				<td><%=detail.getEmail()%></td>
				<td><%=detail.getContactNumber()%></td>
				<td><%=detail.getAddress()%></td>

				<%
					}
				%>

			</tr>

		</table>
		<a href="./">HOME PAGE</a>

	</div>

</body>
</html>
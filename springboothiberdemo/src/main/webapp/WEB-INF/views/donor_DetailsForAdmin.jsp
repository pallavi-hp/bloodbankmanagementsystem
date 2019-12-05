<%@page import="com.bloodbankapplication.model.BloodBankDonorDetails"%>
<%@page
	import="com.bloodbankapplication.model.BloodBankRequestorDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<link rel="icon"
	href="https://c8.alamy.com/comp/E94316/red-blood-drop-cartoon-character-E94316.jpg"
	type="image" sizes="40x40">
<style type="text/css">
a {
	color: white;
}

h2 {
	color: white;
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
	<h2>CaresWorth Blood Bank</h2>
	<br>
	<br> Acceptance or rejection of the request
	<br>
	<br>
	<table class="table table-bordered table-dark table-striped">

		<th>ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gender</th>
		<th>Blood Group</th>
		<th>Haemoglobin Level</th>
		<th>Age</th>
		<th>E-mail</th>
		<th>Contact Number</th>
		<th>Address</th>
		<th>Role</th>
		<th>Click here to accept</th>
		<th>Click here to reject</th>

		<%
			List<BloodBankDonorDetails> list = (List<BloodBankDonorDetails>) request.getAttribute("details");
			for (BloodBankDonorDetails detail : list) {
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
			<td><%=detail.getRole()%></td>
			<td>
				<%
					if (detail.getStatus().equalsIgnoreCase("Submitted")) {
				%>
				<form action="./accept" method="post">
					<input type="submit" value="Accept" name="Accept"> <input
						type="hidden" name="id" value=<%=detail.getId()%>> <input
						type="hidden" name="role" value=<%=detail.getRole()%>>
				</form>
			</td>
			<td>
				<form action="./reject" method="post">
					<input type="submit" value="Reject" name="Reject"> <input
						type="hidden" name="id" value=<%=detail.getId()%>> <input
						type="hidden" name="role" value=<%=detail.getRole()%>>
				</form> <%
 	}
 %>
			</td>
			<%
				}
			%>


		</tr>
		<%
			List<BloodBankRequestorDetails> list1 = (List<BloodBankRequestorDetails>) request.getAttribute("key");
			for (BloodBankRequestorDetails detail1 : list1) {
		%>


		<tr>
			<td><%=detail1.getId()%></td>
			<td><%=detail1.getFirstName()%></td>
			<td><%=detail1.getLastName()%></td>
			<td><%=detail1.getGender()%></td>
			<td><%=detail1.getBloodGroup()%></td>
			<td><%=detail1.getHeamoglobin()%></td>
			<td><%=detail1.getAge()%></td>
			<td><%=detail1.getEmail()%></td>
			<td><%=detail1.getContactNumber()%></td>
			<td><%=detail1.getAddress()%></td>
			<td><%=detail1.getRole()%></td>
			<td>
				<%
					if (detail1.getStatus().equalsIgnoreCase("Submitted")) {
				%>
				<form action="./accept" method="post">
					<input type="submit" value="Accept" name="Accept"> <input
						type="hidden" name="id" value=<%=detail1.getId()%>> <input
						type="hidden" name="role" value=<%=detail1.getRole()%>>
				</form>
			</td>
			<td>
				<form action="./reject" method="post">
					<input type="submit" value="Reject" name="Reject"> <input
						type="hidden" name="id" value=<%=detail1.getId()%>> <input
						type="hidden" name="role" value=<%=detail1.getRole()%>>
				</form> <%
 	}
 %>
			</td>
			<%
				}
			%>
		</tr>


	</table>
	<a href="./">HOME PAGE</a>
</body>
</html>
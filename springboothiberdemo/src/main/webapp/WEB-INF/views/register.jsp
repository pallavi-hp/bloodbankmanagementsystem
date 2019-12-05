<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="icon"
	href="https://c8.alamy.com/comp/E94316/red-blood-drop-cartoon-character-E94316.jpg"
	type="image" sizes="40x40">
<style type="text/css">
h1 {
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
<body>
<body style="background-color: #56baed;">
	<h1>CaresWorth Blood Bank</h1>
	<form action="./registrationsubmit" method="post" novalidate="novalidate" modelAttribute="donorDetails">

		<div class="container">
			<br>

			<table class="table table-bordered table-dark table-striped">


				<tr>
					<td>Enter first name</td>

					<td><input type="text" name="firstName" required></td>
				</tr>
				<tr>
					<td>Enter last name</td>

					<td><input type="text" name="lastName" required></td>
				</tr>

				<tr>
					<td>Enter password</td>

					<td><input type="password" name="password" required></td>

				</tr>
				<tr>
					<td>Enter your age</td>

					<td><input type="text" name="age" required></td>
				</tr>

				<tr>
					<td>Enter address</td>

					<td><input type="text" name="address" required></td>
				</tr>
				<tr>
					<td>Contact number</td>

					<td><input type="text" name="contactNumber" required></td>
				</tr>
				<tr>
					<td>Gender</td>

					<td><input type="radio" name="gender" value="male">Male
						<input type="radio" name="gender" value="female">Female</td>

				</tr>
				<tr>
					<td>Enter email</td>

					<td><input type="email" name="email" required></td>
				</tr>
				<tr>
					<td>Enter blood group</td>

					<td><select name="bloodGroup">
							<option value="A+">A+</option>
							<option value="B+">B+</option>
							<option value="A-">A-</option>
							<option value="B-">B-</option>
							<option value="AB+">AB+</option>
							<option value="AB-">AB-</option>
							<option value="O+">O+</option>
							<option value="O-">O-</option>
					</select></td>
				</tr>
				<tr>
					<td>Select role</td>

					<td><select name="role">

							<option value="donor">Donor</option>

							<option value="requestor">Requestor</option>


					</select></td>
				</tr>
				<tr>
					<td>Enter haemoglobin content</td>

					<td><input type="text" name="heamoglobin" required></td>
				</tr>

				<input type="hidden" value="submitted" name="status">

			</table>

			<td><input type="submit" value="submit"></td>
			<td><input type="reset" value="reset"></td>
	</form>
</body>
</html>
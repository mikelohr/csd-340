
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Calendar"%>
<%@page import="dao.ApplicationDao"%>
<!DOCTYPE html >

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Weight loss profile</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">


				<!-- navbar -->
			</div>
			<!-- container nav-elements -->
		</nav>
	</header>

	<section id="profile" class="section">
		<div class="container">
			<h2 class="headline">My Profile</h2>
			<table id="profile">

				<tr>
					<td>Username</td>
					<td>${user.username}</td>
				</tr>
				<tr>
					<td>First Name</td>
					<td>${user.firstName}</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>${user.lastName}</td>
				</tr>
				<tr>
					<td>Age</td>
					<td>${user.age}</td>
				</tr>
				<tr>
					<td>Interested in</td>
					<td>${user.activity}</td>
				</tr>
				<tr>
					<td>Weight Goal</td>
					<td>${user.weightGoal}</td>
				</tr>

			</table>
			</div>
		
	</section>

</body>
</html>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here</title>
</head>
<body>
	<section id="registration" class="section">
	 <div class="container">
	 <em>Register User</em><br/>
		<form action="registerUser" method="post">
			<label>User Name</label> <input type="text" name="username" id="username"><br/>
			<label>First Name</label> <input type="text" name="firstName" id="firstName"><br/>
			<label>Last Name</label> <input type="text" name="lastName" id="lastName"><br/>
			<label>Age</label> <input type="text" name="age" id="age"><br/>
			<label>Goal Weight</label> <input type="text" name="goalWeight" id="goalWeight"><br/>
			<label>How would you like to lose it? </label> 
			<input type="radio" name="activity" id="activity" value="Playing a sport">Play a Sport?
			<input type="radio" name="activity" id="activity" value="Exercise in Gym">Hit the Gym?<br/>
			<input type="submit" value="Submit" id="submit">
		</form>
		</div>
	</section>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Slide Navbar</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/CSS/indexCSS.css">
<link
	href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="main">
		<input type="checkbox" id="chk" aria-hidden="true">

		<div class="signup">
			<form action="signUp" method="post">
				<label for="chk" aria-hidden="true">Sign up</label> <input
					type="text" name="fname" placeholder="First Name" required="true">
				<input type="text" name="lname" placeholder="Last Name"
					required="true">
					 <input type="text" name="mob"
					placeholder="Mobile Number" required="true"> 
					
				<select name="role" >
					<option value="Admin">Admin</option>
					<option value="User">User</option>

				</select> <input type="email" name="email" placeholder="Email"
					required="true"> <input type="password" name="pass"
					placeholder="Password" required="true">
					<input type="password" name="repass"
					placeholder="Confirm Password" required="true">
				<button type="submit">Sign up</button>
			</form>
		</div>

		
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Hello ${nU }</p>
<form action="update-user">
	ID: ${id } <input type="hidden" name="id" value="${id }">
		First Name: <input type="text" name="firstname">
		Last Name: <input type="text" name="lastname">  
		Email: <input type="text" name="email"> 
		Phone Number: <input type="text" name="phone"> 
		Password: <input type="text" name="password"> 
		Birthday: <input type="text" name="birthday"> 
		Street Address: <input type="text" name="address"> 
		State: <input type="text" name="state"> 
		Zipcode: <input type="text" name="zipcode"> 
		Gender: <input type="text" name="gender"> 
		<input type="submit" value="Update">
	</form>
</body>
</html>
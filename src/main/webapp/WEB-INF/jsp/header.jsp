<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<style>
#container1 {
    height: 50px;
}
#img1 {
    height: 50px;
    width: 120px;
    float: left;
    margin-left: 180px;
}

#img2 {
    height: 50px;
    width: 140px;
    margin-left: 20px;
    float: left;
}

#sdt {
	margin-left:100px;
    height: 100%;
    float: left;
}
#email{
	margin-top:30px;
	margin-left: 80px;
}
</style>
</head>
<body>
	<div>
		<div id="container1">

			<img id="img1" src="./img/logo-lisaho.png"> <img id="img2"
				src="./img/logo-southbank.png">
			<h3 id="sdt">HOTLINE:037483748347847</h3>
			<c:choose>
				<c:when test="${loginedUser != null}">
					<b id="email">${loginedUser.email}</b>
					<a id="logout_link"
						href="${pageContext.request.contextPath}/logout">Logout</a>
				</c:when>
				<c:otherwise>
					<button onclick="openform(1)" id="login_btn">Login</button>
					<button onclick="openform(2)" id="Regis_btn">Register</button>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	<br>
	<br>
	
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"></a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a
					href=" ${pageContext.request.contextPath}">Home</a></li>
				<li><a href="${pageContext.request.contextPath}/car">Car</a></li>
				<li><a href="#">Car Order</a></li>
				<li><a href="#">Customer</a></li>
				<li><a href="${pageContext.request.contextPath}/account">Account</a></li>

			</ul>
		</div>
	</nav>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Scrolling Nav - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
	integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
	crossorigin="anonymous"></script>

<!-- Custom styles for this template -->
<link href="http://localhost:8080/finalProject/css/scrolling-nav.css"
	rel="stylesheet">

</head>
<body>
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>로그인</h2>
						</thead>
						<tbody>
							<form:form action="login" commandName="loginSession" name="loginSession" ng-controller="MainController">
								<tr>
									<th><form:label path="commandId">아이디 : </form:label></th>
									<td><form:input path="commandId" />
									<form:hidden path="commandName" /></td>
								</tr>
								<tr>
									<th><form:label path="commandPw">비밀번호</form:label></th>
									<td><form:password path="commandPw" /><form:hidden path="commandDvice" /></td>
								</tr>
								<tr>
									<th><form:label path="commandCookie">자동 로그인</form:label></th>
									<td><form:checkbox path="commandCookie" />
									</td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="등록" /> <a
										href="join"><input type="button" value="회원가입" /></a></td>
								</tr>
							</form:form>
					</table>
				</div>
			</div>
		</div>
	</section>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.*, java.util.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
	request.setCharacterEncoding("utf-8");
	Member member = (Member) request.getAttribute("member");
%>



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

<!-- <script type="text/javascript">
	if(!form.memberId.value){
    alert("아이디를 입력하세요.");
    return false;
	}
</script> -->


<!-- Custom styles for this template -->
<link href="http://localhost:8080/finalProject/css/scrolling-nav.css"
	rel="stylesheet">

</head>


		<section id="services" class="bg-light">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>ID찾기</h2>
						</thead>
						<tbody>
							<form:form commandName="member" action="idfind" method="POST">
								
								<tr>
									<th>이름 : </th>
									<td><form:input path="memberName" placeholder="이름을 입력하세요"  /></td>
								</tr>
					
								<tr>
									<th>이메일 : </th>
									<td><form:input path="memberEmail" placeholder="이메일을 입력하세요" /></td>
								</tr> 	
								<tr>
									<td colspan="2"><input type="submit" value="삭제" /> <a
										href="member_list"><input type="button" value="취소" /></a></td>
								</tr>
							</form:form>
					</table>
				</div>
			</div>
		</div>
	</section>
</body>


<!-- Footer -->

<!--     Bootstrap core JavaScript
    <script src="http://localhost:8080/finalProject/jquery/jquery.min.js"></script>
    <script src="http://localhost:8080/finalProject/js/bootstrap.bundle.min.js"></script>

    Plugin JavaScript
    <script src="http://localhost:8080/finalProject/jquery-easing/jquery.easing.min.js"></script>

    Custom JavaScript for this theme
    <script src="http://localhost:8080/finalProject/js/scrolling-nav.js"></script> -->

</body>

</html>

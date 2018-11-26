<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	Hotel telm = (Hotel) request.getAttribute("modify");
%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>activity_modify.jsp</title>

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

<body id="page-top">
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row">
				<form:form commandName="hotel" action="hotel_modify">
				<table class="table table-bordered">
					<!-- encType="multiplart/form-data" -->
						<thead>
							<h2>액티비티 상품 수정</h2>
							<tr>
								<th scope="col" style="width: 90px">등록인</th>
								<td><%=telm.getStaffNumber()%></td>
								<th scope="col">등록일</th>
								<td><%=telm.getHotelRegdate()%></td>
								
							</tr>
						</thead>
						<tbody>
							 <tr>
								<form:hidden path="hotelNum"
									value="<%=telm.getHotelNum()%>" />
								<form:hidden path="staffNumber"
									value="<%=telm.getStaffNumber()%>" />
								<th>상품명 :</th>
								<td><form:input path="hotelName"
										value="<%=telm.getHotelName()%>" /></td>
								<th>상품분류 :</th>
								<td><form:input value="<%=telm.getHotelCate()%>"
										path="hotelCate" />
							</tr>
							<tr>
								<th>상품내용 :</th>
								<td><form:textarea cols="30" path="hotelContent"
										value="<%=telm.getHotelContent()%>" /></td>
							</tr>
							<!-- <tr>
								<th>첨부파일 :</th>
								<td><input type="file" placeholder="파일을 선택하세요. "
									name="filename" class="" /></td>
							</tr>
							<tr>
								<th>비밀번호 :</th>
								<td><input type="password" placeholder="비밀번호를 입력하세요"
									class="" /></td>
							</tr> -->
							<tr>
								<td colspan="2"><input type="submit" value="수정" /> <a
									href="product"><input type="button" value="글 목록" /></a></td>
							</tr>
				</table>
				</form:form>
			</div>
		</div>
	</section>
</body>
</html>


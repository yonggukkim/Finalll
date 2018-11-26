<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.*"%>
<%
	request.setCharacterEncoding("utf-8");
	Hotel tel = (Hotel)request.getAttribute("hoteldetail");
%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>activity_detail.jsp</title>

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
	crossorigin="anonymous">
	</script>


<!-- Custom styles for this template -->
<link href="http://localhost:8080/finalProject/css/scrolling-nav.css"
	rel="stylesheet">

</head>
<body id="page-top">
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>액티비티 상품 정보</h2>
							<tr>
								<th scope="col" style="width: 90px">등록인</th>
								<td><%= tel.getStaffNumber() %></td>
								<th scope="col">등록일</th>
								<td><%= tel.getHotelRegdate() %></td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="col">상품명</th>
								<td><%= tel.getHotelName() %></td>
								<th scope="col">상품분류</th>
								<td><%= tel.getHotelCate() %></td>
							</tr>
							<tr>
								<th rowspan="5" scope="row">상품내용</th>
								<td rowspan="5" colspan="5"><%= tel.getHotelContent() %></td>
							</tr>
						</tbody>
						<tfoot>
							<!-- <tr>
								<th scope="row">첨부파일</th>
								<td colspan="3"></td>
							</tr> -->
							<tr>
								<th scope="row">후기</th>
								<td colspan="3">후기입니다</td>
							</tr>
							<tr>
								<td colspan="5" scope="row">
								<a href="hotel_modify?hotelNum=<%= tel.getHotelNum() %>"><input type="button" value="글 수정" /></a>
								<a href="hotel_delete?hotelNum=<%= tel.getHotelNum() %>"><input type="button" value="글 삭제" /></a>
								<a href="product"><input type="button" value="글 목록" /></a></td>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
	</section> 
</body>

</html>


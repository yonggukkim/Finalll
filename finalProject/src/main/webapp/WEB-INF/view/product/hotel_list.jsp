<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*, java.util.*"%>
<%
	List list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>호텔 상품</h2>
					<table class="table table-hover">
						<thead>
							<tr>
								<th scope="col">글번호</th>
								<th scope="col">글쓴이</th>
								<th scope="col">제목</th>
								<th scope="col">작성일</th>
								<th scope="col">종류</th>
							</tr>
							<% for (Object o : list) {
								Hotel hotel = (Hotel)o;	
							%>
							<tr>
								<th scope="col"><%= hotel.getHotelNum() %></th>
								<th scope="col"><%= hotel.getStaffNumber() %></th>
								<th scope="col"><a href="hotel_detail?hotelNum=<%= hotel.getHotelNum() %>"><%= hotel.getHotelName() %></a></th>
								<th scope="col"><%= hotel.getHotelRegdate() %></th>
								<th scope="col"><%= hotel.getHotelCate() %></th>
							</tr>
							<% } %>
						</thead>
					</table>
					<div class="container">
						<!-- <nav aria-label="Page navigation example">-->
						<ul class="pagination justify-content-center">
							<li class="page-item"><a class="page-link" href="#"> 이전
							</a></li>
							<li class="page-item"><a class="page-link" href="#"> 1 </a></li>
							<li class="page-item"><a class="page-link" href="#"> 2 </a></li>
							<li class="page-item"><a class="page-link" href="#"> 3 </a></li>
							<li class="page-item"><a class="page-link" href="#"> 다음
							</a></li>
						</ul>
					</div>
					<div class="form-button">
						<a href="hotel_insert">
							<button type="button" class="button float-right">글쓰기</button>
						</a>
					</div>
</body>
</html>
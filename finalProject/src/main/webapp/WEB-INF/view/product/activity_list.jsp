<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*, java.util.*"%>
<%
	List list = (List)request.getAttribute("actlist");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>액티비티 상품</h2>
					<table class="table table-hover">
						<thead>
							<tr>
								<th scope="col">상품번호</th>
								<th scope="col">등록인</th>
								<th scope="col">소재도시번호</th>
								<th scope="col">상품명</th>
								<th scope="col">작성일</th>
								<th scope="col">종류</th>
							</tr>
							<% for (Object o : list) {
								Activitys activity = (Activitys)o;	
							%>
							<tr>
								<th scope="col"><%= activity.getActivityNum() %></th>
								<th scope="col"><%= activity.getStaffNumber() %></th>
								<th scope="col"><%= activity.getCityNum() %></th>
								<th scope="col"><a href="activity_detail?activityNum=<%= activity.getActivityNum() %>"><%= activity.getActivityName() %></a></th>
								<th scope="col"><%= activity.getActivityRegdate() %></th>
								<th scope="col"><%= activity.getActivityCate() %></th>
							</tr>
							<% } %>
						</thead>
					</table>
					<div class="container">
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
						<a href="activity_insert">
							<button type="button" class="button float-right">글쓰기</button>
						</a>
					</div>
</body>
</html>
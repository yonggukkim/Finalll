<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*, java.util.*"%>
<%
	List list = (List)request.getAttribute("pkglist");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>패키지 상품</h2>
					<table class="table table-hover">
						<thead>
							<tr>
								<th scope="col">패키지여행상품등록번호</th>
								<th scope="col">등록인</th>
								<th scope="col">담당가이드이름</th>
								<th scope="col">여행상품이름</th>
								<th scope="col">여행상품가격</th>
								<th scope="col">여행상품여행기간</th>
								<th scope="col">여행상품등록날짜</th>
								<th scope="col">여행상품테마종류</th>
								<th scope="col">여행구분</th>
							</tr>
							<% for (Object o : list) {
								Pkg pkg = (Pkg)o;	
							%>
							<tr>
								<th scope="col"><%= pkg.getPkgNum() %></th>
								<th scope="col"><%= pkg.getStaffNumber() %></th>
								<th scope="col"><%= pkg.getGuideNum() %></th>
								<th scope="col"><a href="pkg_detail?pkgNum=<%= pkg.getPkgNum() %>"><%= pkg.getPkgName() %></a></th>
								<th scope="col"><%= pkg.getPkgPrice() %></th>
								<th scope="col"><%= pkg.getPkgPeriod() %></th>
								<th scope="col"><%= pkg.getPkgRegdate() %></th>
								<th scope="col"><%= pkg.getPkgTheme() %></th>
								<th scope="col"><%= pkg.getPkgCate() %></th>
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
						<a href="pkg_insert">
							<button type="button" class="button float-right">글쓰기</button>
						</a>
					</div>
</body>
</html>
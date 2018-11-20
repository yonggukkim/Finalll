<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Qna"%>

<%
	request.setCharacterEncoding("utf-8");
	Qna qna = (Qna) request.getAttribute("qna");
	System.out.println(qna);
%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>qna_list.jsp</title>

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
		<div class="container" style="margin-top: 70px">
			<div class="row justify-content-center">
				<div class="col-lg-4">
					<ul class="list-group">
						<!-- <a href="#"
							class="list-group-item d-flex justify-content-between align-items-center">
							여행정보게시판 <span class="badge badge-primary badge-pill">12</span>
						</a> -->
						<a href="#"
							class="list-group-item d-flex justify-content-between align-items-center">
							후기게시판 <span class="badge badge-primary badge-pill">50</span>
						</a>
						<a href="#"
							class="list-group-item d-flex justify-content-between align-items-center">
							공지사항게시판 <span class="badge badge-primary badge-pill">99</span>
						</a>
						<a href="#"
							class="list-group-item d-flex justify-content-between align-items-center">
							질문게시판 <span class="badge badge-primary badge-pill">99</span>
						</a>
						<a href="#"
							class="list-group-item d-flex justify-content-between align-items-center">
							자유여행플랜게시판 <span class="badge badge-primary badge-pill">99</span>
						</a>
					</ul>
				</div>
				<div class="col-lg-8">
					<h2>질문게시판</h2>
					<table class="table table-hover">
						<thead>
							<tr>
								<th scope="col">글번호</th>
								<th scope="col">글쓴이</th>
								<th scope="col">제목</th>
								<th scope="col">작성일</th>
								<th scope="col">조회수</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row"><%=qna.getQnaNum()%></th>
								<td><%=qna.getMemberNum()%></td>
								<td><a href="#"><%=qna.getQnaSubject()%></a></td>
								<td><%=qna.getQnaDate()%></td>
								<td><%=qna.getQnaCount()%></td>
							</tr>
						</tbody>
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
				</div>
			</div>
			<div class="row">
				<div class="col col-lg-12">
					<div class="form-button">
						<a href="qna_insert">
							<button type="button" class="button float-right">글쓰기</button>
						</a>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>

</html>


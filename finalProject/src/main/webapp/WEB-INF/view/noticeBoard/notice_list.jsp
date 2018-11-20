<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>notice_list.jsp</title>

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

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand js-scroll-trigger" href="#page-top">기프트립 </a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#about">로그인</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#services">회원가입</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#contact">마이페이지</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<section id="services" class="bg-light">
		<div class="container" style="margin-top: 70px">
			<div class="row justify-content-center">
				<div class="col-lg-3">
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
					<!-- <nav
                  class="navbar">
                  <ul class="navbar-nav ">
                     <li class="nav-item "><a class="nav-link" href="#">여행정보게시판</a></li>
                     <li class="nav-item"><a class="nav-link" href="#">후기게시판</a></li>
                     <li class="nav-item"><a class="nav-link">공지사항게시판</a></li>
                     <li class="nav-item"><a class="nav-link" href="#">질문게시판</a></li>
                     <li class="nav-item"><a class="nav-link " href="#">자유여행플랜게시판</a>
                     </li>
                  </ul>
               </nav> -->
				</div>

				<div class="col-lg-8">
					<h2>공지사항게시판</h2>
					<table class="table table-hover">
						<thead>
							<tr>
								<!-- ??리스트에 내용이 보이나?? -->
								<th scope="col">글번호</th>
								<th scope="col">글쓴이</th>
								<th scope="col">제목</th>
								<th scope="col">작성일</th>
								<th scope="col">조회수</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">1</th>
								<td>Mark</td>
								<td><a href="#">제목1</a></td>
								<td>2018-11-10</td>
								<td>1</td>
							</tr>
							<tr>
								<th scope="row">2</th>
								<td>Jacob</td>
								<td><a href="#">제목2</a></td>
								<td>2018-11-11</td>
								<td>0</td>
							</tr>
							<tr>
								<th scope="row">3</th>
								<td>Larry</td>
								<td><a href="#">제목3</a></td>
								<td>2018-11-12</td>
								<td>0</td>

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
						<!-- </nav> -->
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col justify-content-end col-lg-8 mx-auto">
					<div class="form-button">
						<a href="notice_insert">
							<button type="button" class="button">글쓰기</button>
						</a>
					</div>
				</div>
			</div>

		</div>
	</section>


	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2017</p>
		</div>
		<!-- /.container -->
	</footer>

	<!-- 	<!-- Bootstrap core JavaScript -->
	<script
		src="http://localhost:8080/finalProject/vendor/jquery/jquery.min.js"></script>
	<script
		src="http://localhost:8080/finalProject/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!--  Plugin JavaScript-->
	<script
		src="http://localhost:8080/finalProject/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!--Custom JavaScript for this theme  -->
	<script
		src="http://localhost:8080/finalProject/resources/js/scrolling-nav.js"></script>


</body>

</html>


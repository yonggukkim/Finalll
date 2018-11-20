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

<title>notice_detail.jsp</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>


<!-- Custom styles for this template -->
<link href="http://localhost:8080/finalProject/css/scrolling-nav.css" rel="stylesheet">

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
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<table class="table table-bordered">
						<thead>
						<h2>공지사항글상세보기</h2>
							<tr>
								<th scope="col" style="width: 90px">글쓴이</th>
								<td>글쓴이입니다</td>
								<th scope="col">작성일</th>
								<td>2018-11-12</td>
							</tr>
						</thead>
						<tbody>
							<form action="" method="post" encType="multiplart/form-data">
								<tr>
									<th scope="col">제목</th>
									<td>제목입니다</td>
									<th scope="col">조회수</th>
									<td>조회수입니다</td>
								</tr>
								<tr>
									<th rowspan="5" scope="row">내용</th>
									<td rowspan="5" colspan="5">내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다내용d입니다</td>
								</tr>
						</tbody>
						<tfoot>
							<tr>
								<th scope="row">첨부파일</th>
								<td colspan="3">첨부파일입니다</td>
							</tr>
							<tr>
								<th scope="row">댓글</th>
								<td colspan="3">댓글입니다</td>
							</tr>
							<tr>
								<td colspan="5" scope="row"><input type="button"
									value="글 목록" class=" " onclick="" /></td>
							</tr>
						</tfoot>
						</form>
					</table>
				</div>
			</div>
	</section>
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h3>공지사항댓글작성</h3>
						</thead>
						<tbody>
							<form action="" method="post" encType="multiplart/form-data">
								<tr>
									<th>아이디 :</th>
									<td>아이디입니다</td>
								</tr>
								<tr>
									<th>제목 :</th>
									<td><input type="text" placeholder="제목을 입력하세요. "
										name="subject" class="" /></td>
								</tr>
								<tr>
									<th>내용 :</th>
									<td><textarea cols="80" placeholder="내용을 입력하세요. "
											name="content" class=""></textarea></td>
								</tr>
								<tr>
									<td colspan="2"><input type="button" value="등록" onclick=""
										class="" /> <input type="button" value="글 목록" class=" "
										onclick="" /></td>
								</tr>
							</form>
					</table>
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

	Plugin JavaScript
	<script
		src="http://localhost:8080/finalProject/vendor/jquery-easing/jquery.easing.min.js"></script>

	Custom JavaScript for this theme
	<script
		src="http://localhost:8080/finalProject/js/scrolling-nav.js"></script> -->
</body>

</html>


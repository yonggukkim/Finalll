<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Notice, java.util.*"%>
<%
	request.setCharacterEncoding("utf-8");
	Notice notice = (Notice) request.getAttribute("notice");
%>
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
<link href="/finalProject/css/scrolling-nav.css"
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
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>공지사항글상세보기</h2>
							<tr>
								<th scope="col" style="width: 90px">글쓴이</th>
								<td><%=notice.getStaffNumber()%></td>
								<th scope="col">작성일</th>
								<td><%=notice.getNoticeDate()%></td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="col">제목</th>
								<td><%=notice.getNoticeSubject()%></td>
								<th scope="col">조회수</th>
								<td><%=notice.getNoticeCount()%></td>
							</tr>
							<tr>
								<th rowspan="5" scope="row">내용</th>
								<td rowspan="5" colspan="5"><%=notice.getNoticeContent()%></td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<th scope="row">첨부파일</th>
								<td colspan="3"><%-- <%=notice.getNoticeFile()%> --%></td>
							</tr>
							<tr>
								<td colspan="5" scope="row"><a
									href="notice_modify?noticeNum=<%=notice.getNoticeNum()%>"><input
										type="button" value="글 수정" /></a> <a
									href="notice_delete?noticeNum=<%=notice.getNoticeNum()%>">
										<input type="button" value="글 삭제" />
								</a> <a href="notice_list"><input type="button" value="글 목록" /></a></td>
							</tr>
						</tfoot>
					</table>
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

	<!-- Bootstrap core JavaScript -->
	<script
		src="/finalProject/vendor/jquery/jquery.min.js"></script>
	<script
		src="/finalProject/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!--Plugin JavaScript-->
	<script
		src="/finalProject/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom JavaScript for this theme-->
	<script src="/finalProject/js/scrolling-nav.js"></script>

</body>

</html>


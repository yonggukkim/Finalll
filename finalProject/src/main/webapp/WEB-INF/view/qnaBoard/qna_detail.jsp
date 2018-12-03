<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.*,command.*, java.util.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	request.setCharacterEncoding("utf-8");
	Qna qna = (Qna) request.getAttribute("qna");
	QnaReply reply = (QnaReply) request.getAttribute("reply");
	List list = (List) request.getAttribute("list");
	LoginSession login = (LoginSession) session.getAttribute("info");
	List replyList = (List) request.getAttribute("replyList");
	System.out.println("qnaReplyList 확인");
%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>qna_detail.jsp</title>

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
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>질문글상세보기</h2>
							<tr>
								<th scope="col" style="width: 90px">글쓴이</th>
								<td><%=qna.getMemberNum()%></td>
								<th scope="col">작성일</th>
								<td><%=qna.getQnaDate()%></td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="col">제목</th>
								<td><%=qna.getQnaSubject()%></td>
								<th scope="col">조회수</th>
								<td><%=qna.getQnaCount()%></td>
							</tr>
							<tr>
								<th rowspan="5" scope="row">내용</th>
								<td rowspan="5" colspan="5"><%=qna.getQnaContent()%></td>
							</tr>
						</tbody>
						<tfoot>
							<%-- <tr>
								<th scope="row">첨부파일</th>
								<td colspan="3"><%=qna.getQnaFile()%></td>
							</tr> --%>
							<tr>
								<td colspan="5" scope="row"><a
									href="qna_modify?qnaNum=<%=qna.getQnaNum()%>"><input
										type="button" value="글 수정" /></a> <a
									href="qna_delete?qnaNum=<%=qna.getQnaNum()%>"> <input
										type="button" value="글 삭제" /></a> <a href="qna_list"><input
										type="button" value="글 목록" /></a></td>
							</tr>
						</tfoot>
					</table>
				</div>
			</div>
		</div>
	</section>

	<div class="container">
		<div class="row">
			<div class="col-lg-8 mx-auto">
				<table class="table table-hover">
					<thead>
						<h2>질문댓글리스트</h2>
						<tr>
							<th scope="col">댓글번호</th>
							<th scope="col">댓글쓴이</th>
							<th scope="col">댓글제목</th>
							<th scope="col">댓글내용</th>
							<th scope="col">댓글작성일</th>
						</tr>
					</thead>
					<tbody>
						<%
							System.out.println("qnaReplyList 댓글출력진입");
							for (int i = 0; i < replyList.size(); i++) {
								QnaReply list2 = (QnaReply) replyList.get(i);
								System.out.println("qnaReplyList 댓글출력진입222");
						%>
						<tr>
							<th scope="row"><%=list2.getReplyQnaNum()%></th>
							<td><%=list2.getMemberNum()%></td>
							<td><%=list2.getReplyQnaSubject()%></td>
							<td><%=list2.getReplyQnaContent()%></td>
							<td><%=list2.getReplyQnaDate()%></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<br />
	<br />
	<br />
	<br />
	<br />
	<div class="container">
		<div class="row">
			<div class="col-lg-8 mx-auto">
				<table class="table table-bordered">
					<thead>
						<h3>질문댓글작성</h3>
					</thead>
					<tbody>
						<form action="qna_reply" method="post">
							<input type="hidden" name="qnaNum" value="<%=qna.getQnaNum()%>" />
							<input type="hidden" name="replyQnaNum" /> <input type="hidden"
								name="memberNum" value="<%=login.getCommandId()%>" />
							<tr>
								<th>아이디 :</th>
								<td><%=login.getCommandId()%></td>
							</tr>
							<tr>
								<th>제목 :</th>
								<td><input type="text" placeholder="댓글제목을 입력하세요. "
									name="replyQnaSubject" /></td>
							</tr>
							<tr>
								<th>내용 :</th>
								<td><textarea cols="80" placeholder="댓글내용을 입력하세요. "
										name="replyQnaContent"></textarea></td>
							</tr>
							<tr>
								<td colspan="2"><input type="submit" value="등록" /> <a
									href="qna_list"><input type="button" value="글 목록" /></a></td>
							</tr>
						</form>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<br />
	<br />
	<br />
	<br />
	<br />
	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2017</p>
		</div>
		<!-- /.container -->
	</footer>
</body>

</html>


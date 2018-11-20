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

<title>selfPlan_list.jsp</title>

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

<body>
	<h2>자유여행게시판</h2>
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
			<%-- <%
				for (int i = 0; i < list.size(); i++) {
					Qna qna = (Qna) list.get(i);
			%>
			<tr>
				<th scope="row"><%=qna.getQnaNum()%></th>
				<td><%=qna.getMemberNum()%></td>
				<td><a href="qna_detail?qnaSubject=<%=qna.getQnaSubject()%>"><%=qna.getQnaSubject()%></a></td>
				<td><%=qna.getQnaDate()%></td>
				<td><%=qna.getQnaCount()%></td>
			</tr>
			<%
				}
			%> --%>
		</tbody>
	</table>
	<div class="container">
		<ul class="pagination justify-content-center">
			<li class="page-item"><a class="page-link" href="#"> 이전 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 1 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 2 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 3 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 다음 </a></li>
		</ul>
	</div>
	<div class="form-button">
		<a href="qna_insert">
			<button type="button" class="button float-right">글쓰기</button>
		</a>
	</div>
</body>

</html>


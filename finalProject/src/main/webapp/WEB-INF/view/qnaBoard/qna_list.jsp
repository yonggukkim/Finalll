<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Qna, java.util.*"%>

<%
	request.setCharacterEncoding("utf-8");
	List list = (List) request.getAttribute("list");
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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>

<link href="http://localhost:8080/finalProject/css/scrolling-nav.css"
	rel="stylesheet">
</head>

<body>
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
			<%
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
			%>
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


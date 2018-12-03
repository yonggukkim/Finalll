 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*, java.util.*"%>
<%
	request.setCharacterEncoding("utf-8");
/* 	Member member = (Member) request.getAttribute("member"); */ 
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

<title>member_list.jsp</title>

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
	<h2>멤버 리스트</h2>
	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">회원번호</th>
				<th scope="col">회원ID</th>
				<th scope="col">회원이름</th>
				<th scope="col">회원전화번호</th>
				<th scope="col">회원이메일</th>
				<th scope="col">회원가입날짜</th>
			</tr>
		</thead>
		<tbody>
		<%
				for (int i = 0; i < list.size(); i++) {
					Member member = (Member)list.get(i);
			%>  
		<tr>
				<th scope="row"><%=member.getMemberNum()%></th>
				<td><a 
				href="memberDetail?memberNum=<%=member.getMemberNum()%>"><%=member.getMemberId()%></a></td>
				<td><%=member.getMemberName()%></td>
				<td><%=member.getMemberPhone()%></td>
				<td><%=member.getMemberEmail()%></td>
				<td><%=member.getMemberRegDate()%></td>
			</tr>
			<%
				}
			%>
		</tbody>

		</tbody>
	</table>
	<div class="container">
		<ul class="pagination justify-content-center">
			<li class="page-item"><a class="page-link" href="#"> 이전 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 1 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 2 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 4 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 5 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 6 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 7 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 8 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 9 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 10 </a></li>
			<li class="page-item"><a class="page-link" href="#"> 다음 </a></li>
		</ul>
	</div>
	<div class="form-button">
		<a href="notice_insert">
			<button type="button" class="button float-right">글쓰기</button>
		</a>
	</div>
</body>
</body>

</html>
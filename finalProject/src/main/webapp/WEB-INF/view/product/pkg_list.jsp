<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
								<th scope="col">글번호</th>
								<th scope="col">글쓴이</th>
								<th scope="col">제목</th>
								<th scope="col">작성일</th>
								<th scope="col">조회수</th>
							</tr>
						</thead>
						<%-- <tbody>
							<tr>
								<th scope="row"><%=qna.getQnaNum()%></th>
								<td><%=qna.getMemberNum()%></td>
								<td><a href="#"><%=qna.getQnaSubject()%></a></td>
								<td><%=qna.getQnaDate()%></td>
								<td><%=qna.getQnaCount()%></td>
							</tr>
						</tbody> --%>
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
						<a href="qna_insert">
							<button type="button" class="button float-right">글쓰기</button>
						</a>
					</div>
</body>
</html>
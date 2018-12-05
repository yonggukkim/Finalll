<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.*, java.util.*"%>
	
<%
	request.setCharacterEncoding("utf-8");
	Member member = (Member) request.getAttribute("member");
	List list = (List) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
							<h2>회원상세보기</h2>
							<tr>
								<th>아이디 : </th>
								<td><%=member.getMemberId()%></td>
							</tr>
							<tr>
								<th>이름 : </th>
								<td><%=member.getMemberName()%></td>
							</tr>
							<tr>
								<th>생년월일 : </th>
								<td><%=member.getMemberBirth()%></td>
							</tr>
							<tr>
								<th>성별 : </th>
								<td><%=member.getMemberGender()%></td>
							</tr>
							<tr>
								<th>휴대폰 번호 : </th>
								<td><%=member.getMemberCountryNum()%><%=member.getMemberPhone()%></td>
							</tr>
							<tr>
								<th>이메일 : </th>
								<td><%=member.getMemberEmail()%></td>
							</tr>
							<tr>
								<th>우편번호 : </th>
								<td><%=member.getMemberPostcode()%></td>
							</tr>
							<tr>
								<th>주소 : </th>
								<td><%=member.getMemberAddr1()%></td>
							</tr>
							<tr>
								<th>상세주소 : </th>
								<td><%=member.getMemberAddr2()%></td>							</tr>
							
							<tr>
								<th>전화번호 : </th>
								<td><%=member.getMemberTel()%></td>
							</tr>
							<tr>
								<th>결혼여부: </th>
								<td><%=member.getMemberMarrige()%></td>
							</tr>
							<tr>
								<th>직업 : </th>
								<td><%=member.getMemberJob()%></td>
							</tr>
							
							
						</thead>
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



	<!-- Custom JavaScript for this theme-->
	<script src="/finalProject/js/scrolling-nav.js"></script>

</body>

</html>
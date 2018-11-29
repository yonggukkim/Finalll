<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.* ,model.Gift, command.*"%>
<%
	List<Gift> list = (List) request.getAttribute("list");
	LoginSession info = (LoginSession) session.getAttribute("info");
	System.out.println("gift_sale_page 진입 ㅆ발");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>


<!-- Custom styles for this template -->
<link href="/finalProject/css/4-col-portfolio.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<!-- Page Heading -->



		<h1 class="my-4">(도시이름<% %>) 특산품목록</h1>

		<div class="row">
			<%
			for (int i = 0; i < list.size(); i++) {
							Gift gift = (Gift) list.get(i);
							System.out.println("리스트페이지 giftNum " + gift.getGiftNum());
		%>
			<div class="col-lg-4 col-md-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="self_gift_detail"><img class="card-img-top"
						src="/finalProject/gift/images/gift_banana.jpg" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
						<!--  특산품 이름 -->
							<a href=""> <%=gift.getGiftName() %></a>
						</h4>
						<!--  특산품 설명 -->
						<p class="card-text"><%= gift.getGiftContent() %></p>
					</div>
				</div>
			</div>
			
			<%} %>
			<!-- <div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Project Two</a>
						</h4>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipiscing elit. Nam viverra euismod odio, gravida pellentesque
							urna varius vitae.</p>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Project Two</a>
						</h4>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipiscing elit. Nam viverra euismod odio, gravida pellentesque
							urna varius vitae.</p>
					</div>
				</div>
			</div> -->

		</div>

	</div>

</body>
</html>
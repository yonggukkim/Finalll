<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Qna"%>
<%
	
%>

<%
	/* request.setCharacterEncoding("utf-8");
	Qna qna = (Qna) request.getAttribute("qna");
	System.out.println(qna); */
%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>상품등록</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">

<!--jquery풀버전. 슬림버전사용시 ajax사용불가  -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
 <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>




<!-- Custom styles for this template -->
<link href="http://localhost:8080/finalProject/css/scrolling-nav.css"
	rel="stylesheet">

</head>

<body id="page-top">
	<section id="services" class="bg-light">
		<div class="container" style="margin-top: 70px">
			<div class="row justify-content-center">
				<div class="col-lg-4">
					<ul class="list-group">
						<a href="#pkg"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							패키지여행상품 <span class="badge badge-primary badge-pill">12</span>
						</a>
						<a href="#semipkg"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							세미패키지여행상품 <span class="badge badge-primary badge-pill">99</span>
						</a>
						<a href="#activity"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							액티비티 <span class="badge badge-primary badge-pill">50</span>
						</a>
						<a href="#hotel"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							호텔 <span class="badge badge-primary badge-pill">99</span>
						</a>
						<a href="#flight"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							항공권 <span class="badge badge-primary badge-pill">99</span>
						</a>
						
					</ul>
				</div>
				<div class="col-lg-8">
				<div class="tab-content">
					<div id="pkg" class="tab-pane container active">
					<jsp:include page="pkg_list.jsp"></jsp:include>
					</div>
					<div id="semipkg" class="tab-pane container fade">
					<jsp:include page="semipkg_list.jsp"></jsp:include>
					</div>
					<div id="activity" class="tab-pane container fade">
					<jsp:include page="activity_list.jsp"></jsp:include>
					</div>
					<div id="hotel" class="tab-pane container fade">
					<jsp:include page="hotel_list.jsp"></jsp:include>
					</div>
					<div id="flight" class="tab-pane container fade">
					<jsp:include page="flight_list.jsp"></jsp:include>
					</div>
				</div>
					
				</div>
			</div>
		</div>
	</section>
</body>

</html>


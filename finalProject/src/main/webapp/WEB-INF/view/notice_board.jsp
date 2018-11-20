<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Qna, java.util.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">

<!--jquery풀버전. 슬림버전사용시 ajax사용불가  -->
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
						<!-- <a href="#"
							class="list-group-item d-flex justify-content-between align-items-center">
							여행정보게시판 <span class="badge badge-primary badge-pill">12</span>
						</a> -->
						<a href="#review_list"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							후기게시판 <span class="badge badge-primary badge-pill">50</span>
						</a>
						<a href="#notice_list"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							공지사항게시판 <span class="badge badge-primary badge-pill">99</span>
						</a>
						<a href="#qna_list"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							질문게시판 <span class="badge badge-primary badge-pill">99</span>
						</a>
						<a href="#selfPlan_list"
							class="list-group-item d-flex justify-content-between align-items-center" data-toggle="tab">
							자유여행플랜게시판 <span class="badge badge-primary badge-pill">99</span>
						</a>
					</ul>
				</div>
				<div class="col-lg-8">
					<div class="tab-content">
					<div id="review_list" class="tab-pane container active">
						<jsp:include page="reviewBoard/review_list.jsp"></jsp:include>
					</div>
					<div id="notice_list" class="tab-pane container fade">
						<jsp:include page="noticeBoard/notice_list.jsp"></jsp:include>
					</div>
					<div id="qna_list" class="tab-pane container fade">
						<jsp:include page="qnaBoard/qna_list.jsp"></jsp:include>
					</div>
					<div id="selfPlan_list" class="tab-pane container fade">
						<jsp:include page="selfPlanBoard/selfPlan_list.jsp"></jsp:include>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
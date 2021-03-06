<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,command.*,model.*"%>
<!DOCTYPE html>
<%
	/* PkgDeteilCommand pkgone = (PkgDeteilCommand)request.getAttribute("pkgone"); */
	AllSelectActivity activitys = (AllSelectActivity)session.getAttribute("activitys");
	AllSelectHotel hotels = (AllSelectHotel)session.getAttribute("hotels");
	AllSelectPkg pkgone = (AllSelectPkg)session.getAttribute("pkgone");
%>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Shop Item - Start Bootstrap Template</title>

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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Custom styles for this template -->
<link href="/finalProject/css/shop-item.css" rel="stylesheet">
<link href="/finalProject/css/simple-sidebar.css" rel="stylesheet">
<link href="/finalProject/css/pkgdeteil.css" rel="stylesheet">

</head>

<body>
	<div id="wrapper">
	
	 <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="pkgOrder?pkg_num=<%= pkgone.getPkgNum() %>">
                        	상품 구매하기
                    </a>
                </li>
            </ul>
        </div>
        
	<!-- Page Content -->
	<div id="page-content-wrapper">
		<div class="container-fluid">
			<div class="container">

				<div class="row">

					<div class="col-lg-3">
						<h1 class="my-4">패키지 여행상품</h1>
						<div class="list-group">
							<a href="pkgMain" class="list-group-item active">이전 상품 목록</a><!--  <a
								href="#" class="list-group-item">Category 2</a> <a href="#"
								class="list-group-item">Category 3</a> -->
						</div>
					</div>
					<!-- /.col-lg-3 -->
					
					<div class="col-lg-9">

						<div class="card mt-4">
							<div id="carouselExampleIndicators"
								class="carousel slide card-img-top img-fluid"
								data-ride="carousel">
								<ol class="carousel-indicators">
								<% for(int j=0; j < pkgone.getRestores().size(); j++) { 
									if(j == 0) {
								%>
									<li data-target="#carouselExampleIndicators" data-slide-to="<%= j %>"
										class="active"></li>
								<% }else { %>
									<li data-target="#carouselExampleIndicators" data-slide-to="<%= j %>"></li>
								<%}} %>	
								</ol>
								<div class="carousel-inner">
								<% for(int i=0; i < pkgone.getRestores().size(); i++) { 
									Restore restore = pkgone.getRestores().get(i);
									if(i == 0) {
								%>
									<div class="carousel-item active">
										<img class="d-block w-100" src="/finalProject/files/<%= restore.getStoredFileName() %>"
											alt="First slide">
									</div>
								<% }else { %>
									<div class="carousel-item">
										<img class="d-block w-100" src="/finalProject/files/<%= restore.getStoredFileName() %>"
											alt="Second slide">
									</div>
								<% }
								} %>
								</div>
								<a class="carousel-control-prev"
									href="#carouselExampleIndicators" role="button"
									data-slide="prev"> <span class="carousel-control-prev-icon"
									aria-hidden="true"></span> <span class="sr-only">Previous</span>
								</a> <a class="carousel-control-next"
									href="#carouselExampleIndicators" role="button"
									data-slide="next"> <span class="carousel-control-next-icon"
									aria-hidden="true"></span> <span class="sr-only">Next</span>
								</a>
							</div>
							<div class="card-body">
								<h3 class="card-title">[<%=pkgone.getPkgName() %>]</h3>
								<h4>₩<%= pkgone.getPkgPrice() %></h4>
								<br/>
								<h5><p class="card-text"><%=pkgone.getPkgContent() %></p></h5>
								<span class="text-warning">&#9733; &#9733; &#9733;
									&#9733; &#9734;</span> 4.0 stars
							</div>
						</div>
						<!-- /.card -->
						
						<div class="card card-outline-hotel my-4">
							<div class="card-header"><h3>호텔정보</h3></div>
							<div class="card-body card card-outline-secondary">
								
									
									<% 
									for(int i=0; i<hotels.getHotels().size(); i++) {
									Restore hRestore = hotels.getRestores().get(i); 
									%>
									
								<img src="/finalProject/files/<%= hRestore.getStoredFileName() %>" height="350px">
								
								<center> [<%= i+1 %>.<%= hotels.getHotels().get(i).getHotelName() %> 사진]</center><br/>
								
								<% } %>	
								<hr>
							</div>
						</div>
						
						<div class="card card-outline-hotel my-4">
							<div class="card-header"><h3>액티비티 정보</h3></div>
							<div class="card-body card card-outline-secondary">
								
									
									<% 
									for(int i=0; i<activitys.getRestores().size(); i++) {
									Restore aRestore = activitys.getRestores().get(i); 
									%>
									
								<img src="/finalProject/files/<%= aRestore.getStoredFileName() %>" height="350px">
								
								<center> <%= i+1 %>.<%= activitys.getActivitys().get(i).getActivityName() %> 사진</center><br/>
								
								<% } %>	
								<hr>
							</div>
						</div>
						
						
						
						

						<div class="card card-outline-secondary my-4">
							<div class="card-header">해당 상품 후기</div>
							<div class="card-body card card-outline-secondary">
								<p>후기란입니다. 추후 추가</p>
								
								<small class="text-muted">Posted by Anonymous on 3/1/17</small>
								
								<hr>
								<a href="#" class="btn btn-secondary" id="menu-toggle">특산품추가</a>
								 <a href="pkgMain" calss="btn">뒤로가기</a>
								
							</div>
						</div>
						<!-- /.card -->

					</div>
					<!-- /.col-lg-9 -->

				</div>

			</div>
		</div>
	</div>
	<!-- /.container -->
        
	</div>
	
	<script src="/finalProject/jquery/jquery.min.js"></script>
<script src="/finalProject/js/bootstrap.bundle.min.js"></script>

<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
</body>

</html>
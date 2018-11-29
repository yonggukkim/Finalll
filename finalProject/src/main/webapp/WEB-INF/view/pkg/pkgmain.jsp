<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="command.*,model.*,java.util.*"%>
<%
	List pkglist = (List) request.getAttribute("pkglist");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<style>
.dropbtn {
	background-color: #fff;
	color: black;
	padding: 16px;
	font-size: 16px;
	border: none;
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f1f1f1;
	min-width: 300px;
	height: 300px;
	width: 500px;
	column-count: 3;
	column-rule: 1px solid;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

#dropdown {
	position: absolute;
}

li {
	list-style: none;
}

.dropdown-content a {
	color: black;
	/* padding: 12px 16px; */
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: #99ccff;
}

a:link {
	text-decoration: none;
}

a:visited {
	color: black;
	text-decoration: none;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script
	src="http://localhost:8080/finalProject/js/bootstrap.bundle.min.js"></script>
<title>Modern Business - Start Bootstrap Template</title>
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
<link href="http://localhost:8080/finalProject/css/modern-business.css"
	rel="stylesheet">

</head>

<body>
	<!-- <div class="row justify-content-center">
    <nav class="navbar navbar-expand-lg navbar-light bg-light col-xs-7 col-md-7 col-lg-7 mx-auto; ">
   	<div class="container">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive1" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-center" id="navbarResponsive1">
  <button class="dropbtn"><a class="navbar-brand" href="#">대륙이름</a></button>
  <div class="dropdown-content">
    <ul class="navbar-nav">
    	<li class="nav-item dropdown mx-auto"><a href="#">나라이름</a></li>
    		<ul>
    			<li><a class="dropdown-item" href="#">도시이름</a></li>
    			<li><a class="dropdown-item" href="#">도시이름</a></li>
    			<li><a class="dropdown-item" href="#">도시이름</a></li>
    		</ul>
    		<hr />
    	<li><a href="#">나라이름</a></li>
    		<ul>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    		</ul>
    		<hr />
    	<li><a href="#">나라이름</a></li>
    		<ul>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    		</ul>
    	<hr />
    	<li><a href="#">나라이름</a></li>
    		<ul>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    		</ul>
    		<hr />
    	<li><a href="#">나라이름</a></li>
    		<ul>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    		</ul>
    		<hr />
    	<li><a href="#">나라이름</a></li>
    		<ul>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    			<li><a href="#">도시이름</a></li>
    		</ul>
    </ul>
  </div>
</div>
    </ul>
  </div>
</div>
</nav>
</div> -->
	<div class="row justify-content-center">
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">대륙이름</a>
			</button>
			<div class="dropdown-content">
				<ul>
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">대륙이름</a>
			</button>
			<div class="dropdown-content" id="dropdown">
				<ul>
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">대륙이름</a>
			</button>
			<div class="dropdown-content" id="dropdown1">
				<ul>
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
				</ul>
			</div>
		</div>
		<div class="dropdown col-lg-1 col-md-1 col-xs-1">
			<button class="dropbtn">
				<a href="#">대륙이름</a>
			</button>
			<div class="dropdown-content" id="dropdown2">
				<ul>
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">대륙이름</a>
			</button>
			<div class="dropdown-content" id="dropdown3">
				<ul>
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">대륙이름</a>
			</button>
			<div class="dropdown-content" id="dropdown4">
				<ul>
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
					<hr />
					<li><a href="#">나라이름</a></li>
					<ul>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
						<li><a href="#">도시이름</a></li>
					</ul>
				</ul>
			</div>
		</div>
	</div>
	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<!-- Slide One - Set the background image for this slide in the line below -->
			<div class="carousel-item active"
				style="background-image: url('/finalProject/img/pkg1.jpg')">
				<div class="carousel-caption d-none d-md-block">
					<h3>
						<a href="#" class="text-white">First Slide</a>
					</h3>
					<p>This is a description for the first slide.</p>
				</div>
			</div>
			<!-- Slide Two - Set the background image for this slide in the line below -->
			<div class="carousel-item"
				style="background-image: url('/finalProject/img/pkg2.jpg')">
				<div class="carousel-caption d-none d-md-block">
					<h3>
						<a href="#" class="text-white">Second Slide</a>
					</h3>
					<p>This is a description for the second slide.</p>
				</div>
			</div>
			<!-- Slide Three - Set the background image for this slide in the line below -->
			<div class="carousel-item"
				style="background-image: url('/finalProject/img/pkg3.jpg')">
				<div class="carousel-caption d-none d-md-block">
					<h3>
						<a href="#" class="text-white">Third Slide</a>
					</h3>
					<p>This is a description for the third slide.</p>
				</div>
			</div>
		</div>
	</div>
	<!-- Page Content -->
	<div class="container">
		<h2 class="my-4">여행상품 목록</h2>
		<div class="row">
		<% 
			for (int i = 0; i < pkglist.size(); i++) {
				PkgMainListCommand pkg = (PkgMainListCommand)pkglist.get(i);
				System.out.println("aaasa "+ pkg.getPkgNum());
				System.out.println(pkg.getRestores().size());
				Restore restore = pkg.getRestores().get(0);
				System.out.println(request.getRealPath("/"));
		%>
			<div class="col-lg-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						<%-- src="'${pageContext.request.contextPath}'" alt=""></a> --%>
						 src="/finalProject/files/<%= restore.getStoredFileName() %>" alt=""></a> 
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Project One</a>
						</h4>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Amet numquam aspernatur eum quasi sapiente
							nesciunt? Voluptatibus sit, repellat sequi itaque deserunt,
							dolores in, nesciunt, illum tempora ex quae? Nihil, dolorem!</p>
					</div>
				</div>
			</div>
			<% } %>
			<div class="col-lg-4 col-sm-6 portfolio-item">
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
			<div class="col-lg-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Project Three</a>
						</h4>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Quos quisquam, error quod sed cumque, odio
							distinctio velit nostrum temporibus necessitatibus et facere
							atque iure perspiciatis mollitia recusandae vero vel quam!</p>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Project Four</a>
						</h4>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipiscing elit. Nam viverra euismod odio, gravida pellentesque
							urna varius vitae.</p>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Project Five</a>
						</h4>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipiscing elit. Nam viverra euismod odio, gravida pellentesque
							urna varius vitae.</p>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="#"><img class="card-img-top"
						src="http://placehold.it/700x400" alt=""></a>
					<div class="card-body">
						<h4 class="card-title">
							<a href="#">Project Six</a>
						</h4>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Itaque earum nostrum suscipit ducimus nihil
							provident, perferendis rem illo, voluptate atque, sit eius in
							voluptates, nemo repellat fugiat excepturi! Nemo, esse.</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
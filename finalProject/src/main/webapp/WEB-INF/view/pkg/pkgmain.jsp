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
	min-width: 400px;
	height: 300px;
	width: 800px;
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
				<a href="#">아시아</a>
			</button>
			<div class="dropdown-content">
				<ul>
					<li><a href="#">태국</a></li>
					<ul>
						<li><a href="#">방콕</a></li>
						<li><a href="#">파타야</a></li>
						<li><a href="#">치앙마이</a></li>
					</ul>
					<hr />
					<li><a href="#">필리핀</a></li>
					<ul>
						<li><a href="#">보라카이</a></li>
						<li><a href="#">세부</a></li>
						<li><a href="#">보홀</a></li>
						
					</ul>
					<hr />
					<li><a href="#">베트남</a></li>
					<ul>
						<li><a href="#">하노이</a></li>
						<li><a href="#">다낭</a></li>
						<li><a href="#">호치민</a></li>
					</ul>
					<hr />
					
					<li><a href="#">말레이시아</a></li>
					<ul>
						<li><a href="#">쿠알라룸프르</a></li>
						<li><a href="#">말라카</a></li>
						<li><a href="#">랑카위</a></li>
						<li><a href="#">페낭</a></li>
					</ul>
					<hr />
					<li><a href="#">대만</a></li>
					<ul>
						<li><a href="#">타이베이</a></li>
						<li><a href="#">가오슝</a></li>
						<li><a href="#">타이중</a></li>
					</ul>
					<hr />
					<li><a href="#">인도네시아</a></li>
					<ul>
						<li><a href="#">자카르타</a></li>
						<li><a href="#">발리</a></li>
						<li><a href="#">빈탄</a></li>
					</ul>
					<hr />
					
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">유럽</a>
			</button>
			<div class="dropdown-content" id="dropdown">
				<ul>
					<li><a href="#">영국</a></li>
					<ul>
						<li><a href="#">런던</a></li>
						<li><a href="#">멘체스터</a></li>
						<li><a href="#">에딘버러</a></li>
					</ul>
					<hr />
					<li><a href="#">프랑스</a></li>
					<ul>
						<li><a href="#">파리</a></li>
						<li><a href="#">리옹</a></li>
						<li><a href="#">마르세유</a></li>
					</ul>
					<hr />
					<li><a href="#">이탈리아</a></li>
					<ul>
						<li><a href="#">로마</a></li>
						<li><a href="#">베니스</a></li>
						<li><a href="#">피렌체</a></li>
					</ul>
					<hr />
					<li><a href="#">스페인</a></li>
					<ul>
						<li><a href="#">마드리드</a></li>
						<li><a href="#">바르셀로나</a></li>
						<li><a href="#">발렌시아</a></li>
					</ul>
					<hr />
					<li><a href="#">독일</a></li>
					<ul>
						<li><a href="#">베를린</a></li>
						<li><a href="#">뮌헨</a></li>
						<li><a href="#">프랑크푸르트</a></li>
					</ul>
					<hr />
					<li><a href="#">러시아</a></li>
					<ul>
						<li><a href="#">모스크바</a></li>
						<li><a href="#">블라디보스토크</a></li>
						<li><a href="#">상트페테르부르크</a></li>
					</ul>
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">북아메리카</a>
			</button>
			<div class="dropdown-content" id="dropdown1">
				<ul>
					<li><a href="#">미국</a></li>
					<ul>
						<li><a href="#">뉴욕</a></li>
						<li><a href="#">LA</a></li>
						<li><a href="#">보스턴</a></li>
					</ul>
					<hr />
					<li><a href="#">캐나다</a></li>
					<ul>
						<li><a href="#">밴쿠버</a></li>
						<li><a href="#">토론토</a></li>
						<li><a href="#">퀘백</a></li>
					</ul>
					<hr />
					<li><a href="#">멕시코</a></li>
					<ul>
						<li><a href="#">멕시코시티</a></li>
						<li><a href="#">티후아나</a></li>
						<li><a href="#">&nbsp;</a></li>
					</ul>
					<hr />
					<!-- <li><a href="#">나라이름</a></li>
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
					</ul> -->
				</ul>
			</div>
		</div>
		<div class="dropdown col-lg-1 col-md-1 col-xs-1">
			<button class="dropbtn">
				<a href="#">남아메리카</a>
			</button>
			<div class="dropdown-content" id="dropdown2">
				<ul>
					<li><a href="#">브라질</a></li>
					<ul>
						<li><a href="#">상파울루</a></li>
						<li><a href="#">리우데자네이루</a></li>
						<li><a href="#">브라질리아</a></li>
					</ul>
					<hr />
					<li><a href="#">칠레</a></li>
					<ul>
						<li><a href="#">산티아고</a></li>
						<li><a href="#">콘셉시온</a></li>
						<li><a href="#">발파라이소</a></li>
					</ul>
					<hr />
					<li><a href="#">볼리비아</a></li>
					<ul>
						<li><a href="#">라파스</a></li>
						<li><a href="#">산타크루즈</a></li>
						<li><a href="#">우유니</a></li>
					</ul>
					<hr />
					<li><a href="#">아르헨티나</a></li>
					<ul>
						<li><a href="#">부에노스아이레스</a></li>
						<li><a href="#">코르도바</a></li>
						<li><a href="#">이과수</a></li>
					</ul>
					<hr />
					<li><a href="#">페루</a></li>
					<ul>
						<li><a href="#">리마</a></li>
						<li><a href="#">나스카</a></li>
						<li><a href="#">쿠스코</a></li>
					</ul>
					<hr />
					<li><a href="#">쿠바</a></li>
					<ul>
						<li><a href="#">하바나</a></li>
						<li><a href="#">&nbsp;</a></li>
						<li><a href="#">&nbsp;</a></li>
					</ul>
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">아프리카</a>
			</button>
			<div class="dropdown-content" id="dropdown3">
				<ul>
					<li><a href="#">이집트</a></li>
					<ul>
						<li><a href="#">카이로</a></li>
						<li><a href="#">알렉산드리아</a></li>
						<li><a href="#">수에즈</a></li>
					</ul>
					<hr />
					<li><a href="#">남아프리카공화국</a></li>
					<ul>
						<li><a href="#">요하네스버그</a></li>
						<li><a href="#">케이프타운</a></li>
						<li><a href="#">&nbsp;</a></li>
					</ul>
					<hr />
					<li><a href="#">모로코</a></li>
					<ul>
						<li><a href="#">카사블랑카</a></li>
						<li><a href="#">마라케쉬</a></li>
						<li><a href="#">&nbsp;</a></li>
					</ul>
					<hr />
					<li><a href="#">케냐</a></li>
					<ul>
						<li><a href="#">나이로비</a></li>
						<li><a href="#">몸바사</a></li>
						<li><a href="#">&nbsp;</a></li>
					</ul>
					<hr />
					
				</ul>
			</div>
		</div>
		<div class="dropdown col-sm-1 col-lg-1 col-md-1">
			<button class="dropbtn">
				<a href="#">오세아니아</a>
			</button>
			<div class="dropdown-content" id="dropdown4">
				<ul>
					<li><a href="#">호주</a></li>
					<ul>
						<li><a href="#">시드니</a></li>
						<li><a href="#">멜버른</a></li>
						<li><a href="#">퍼스</a></li>
						<li><a href="#">브리즈번</a></li>
					</ul>
					<hr />
					<li><a href="#">뉴질랜드</a></li>
					<ul>
						<li><a href="#">오클랜드</a></li>
						<li><a href="#">웰링턴</a></li>
						<li><a href="#">&nbsp;</a></li>
					</ul>
					<hr />
					<li><a href="#">파푸아뉴기니</a></li>
					<ul>
						<li><a href="#">포트 모르스비</a></li>
						<li><a href="#">&nbsp;</a></li>
						<li><a href="#">&nbsp;</a></li>
					</ul>
					<hr />
					
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
		<h2 class="my-4">여행상품 목록 </h2>
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
						 src="http://192.168.6.125:8080/finalProject/files/<%= restore.getStoredFileName() %>" height="250" alt="사진없음" 
						 onclick="javascript:location.href='pkgDeteil?pkg_num=<%= pkg.getPkgNum() %>';"></a> 
					<div class="card-body">
						<h2 class="card-title">
							<a href="pkgDeteil?pkg_num=<%= pkg.getPkgNum() %>" ><%= pkg.getPkgName() %></a>
						</h2>
						<p class="card-text">- <%= pkg.getPkgContent() %></p>
						<hr/>
						<p class="card-text">기간 <strong> <%= pkg.getPkgPeriod() %></strong></p>
						<p class="card-text">테마 <strong><%= pkg.getPkgTheme() %></strong></p>
						<p class="card-text">가격 ₩ <strong><%= pkg.getPkgPrice() %></strong></p>
						<p class="card-text">최소출발 인원 <strong><%= pkg.getPkgMemberMin() %></strong>명</p>
						<p class="card-text">현재 신청 인원 <strong><%= pkg.getPkgMemberCur() %></strong>명</p>
						<p class="card-text">마감 인원  <strong><%= pkg.getPkgMemberMax() %></strong>명</p>
					</div>
				</div>
			</div>
			<% } %>
<!-- 			<div class="col-lg-4 col-sm-6 portfolio-item">
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
			</div> -->
		</div>
	</div>
</body>
</html>
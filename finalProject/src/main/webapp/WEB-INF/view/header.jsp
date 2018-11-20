<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="command.*"%>
<%
	LoginSession info = (LoginSession)session.getAttribute("info");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  

</head>
<body>
<% if(session.getAttribute("info") == null) { %>
<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="main">GIFTRIP 기프트립</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="intro">회사소개</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">커뮤니티</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="login">로그인</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="join">회원가입</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <% }else { %>
<% if(info.getCommandDvice().equals("s")) { %>
	<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="index.html">GIFTRIP 기프트립</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="intro">회사소개</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="product">상품등록</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="logout">로그아웃</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">회원가입</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
 <% }else if(info.getCommandDvice().equals("m")) { %>   
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="index.html">GIFTRIP 기프트립</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="intro">회사소개</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">커뮤니티</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="logout">로그아웃</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">회원가입</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
 <% }
}%>
</body>
</html>
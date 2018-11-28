<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Gift"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
    <% Gift listDetail = (Gift)request.getAttribute("listDetail"); %>
    <% System.out.println("gift modify 페이지 listDetail 값 확인 giftNum = "+ listDetail.getGiftNum()); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	특산품 수정 진입 성공!
	<form:form commandName="gift" action="gift_modify">
	<p>특산품 등록번호 : <form:hidden path="giftNum" value="<%=listDetail.getGiftNum() %>"/><%=listDetail.getGiftNum() %></p>
	<p>특산품 이름 : <form:input path="giftName" placeholder="<%=listDetail.getGiftName() %>"/></p>
	<p>특산품 가격 : <form:input path="giftPrice" placeholder="<%=listDetail.getGiftPrice() %>"/></p>
	<%-- <p>특산품 상품이미지파일이름 : <form:input path="giftFile" placeholder="<%=listDetail.getGiftFile() %>"/></p> --%>
	<p>특산품 종류 : <form:input path="giftCate" placeholder="<%=listDetail.getGiftCate() %>"/></p>
	<p>특산품 상품설명내용 : <form:input path="giftContent" placeholder="<%=listDetail.getGiftContent() %>"/></p>
	<p>특산품 업체이름 :<form:input path="giftCompany" placeholder="<%=listDetail.getGiftCompany() %>"/></p>
	<p>특산품 업체전화번호 : <form:input path="giftTel" placeholder="<%=listDetail.getGiftTel() %>"/></p>
	<p>특산품 대표자이름 : <form:input path="giftPresident" placeholder="<%=listDetail.getGiftPresident() %>"/></p>
	<p>대륙이름 : <form:hidden path="continentName" value="<%=listDetail.getContinentName() %>"/><%=listDetail.getContinentName() %></p>
	<p>나라번호 : <form:hidden path="countryNum" value="<%=listDetail.getCountryNum() %>"/><%=listDetail.getCountryNum() %></p>
	<p>도시번호 : <form:hidden path="cityNum" value="<%=listDetail.getCityNum()%>"/><%=listDetail.getCityNum()%></p>

	<input type="submit" value="수정">	
</form:form>	
	
	
</body>
</html>
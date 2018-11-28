<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Gift"%>
<% Gift giftDetail = (Gift)request.getAttribute("giftDetail"); %>
    <% System.out.println("gift_detail 페이지 giftNum= "+giftDetail.getGiftNum()); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>특산품 등록번호 : ${giftDetail.giftNum}</p>
	<p>특산품 이름 : ${giftDetail.giftName }</p>
	<p>특산품 가격 : ${giftDetail.giftPrice }</p>
	<%-- <p>특산품 상품이미지파일이름 : ${giftDetail.giftFile }</p> --%>
	<p>특산품 종류 : ${giftDetail.giftCate }</p>
	<p>특산품 상품설명내용 : ${giftDetail.giftContent }</p>
	<p>특산품 업체이름 : ${giftDetail.giftCompany }</p>
	<p>특산품 업체전화번호 : ${giftDetail.giftTel }</p>
	<p>특산품 대표자이름 : ${giftDetail.giftPresident }</p>
	<p>대륙이름 : ${giftDetail.continentName }</p>
	<p>나라번호 : ${giftDetail.countryNum }</p>
	<p>도시번호 : ${giftDetail.cityNum }</p>
	
	<p><button onclick="location.href='gift_modify?giftNum=<%= giftDetail.getGiftNum() %>'" type="button">
     수정하기</button>
	
	<button onclick="location.href='gift_delete?giftNum=<%= giftDetail.getGiftNum() %>'" type="button">
     삭제하기</button>
     <button onclick="location.href='gift_list'" type="button">
     목록으로</button></p>
</body>
</html>
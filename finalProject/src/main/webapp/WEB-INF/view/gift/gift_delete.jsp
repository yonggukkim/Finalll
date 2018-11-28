<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Gift"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<% Gift gift = (Gift)request.getAttribute("gift"); 
System.out.println("delete 페이지 값 확인 giftNum = " + gift.getGiftNum());%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form commandName="gift" action="gift_delete">
	<form:hidden path="giftNum" value="<%= gift.getGiftNum() %>"/> 
	<p>관리자 비밀번호(StaffPw) 입력 <form:input path=""/></p>
	<p><input type="submit" value="최종삭제"></p>
	</form:form>
	

</body>
</html>
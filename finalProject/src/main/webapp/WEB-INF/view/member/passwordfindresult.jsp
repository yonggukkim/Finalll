<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% String result = (String) request.getAttribute("result"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
성공!  님의 비밀번호는 <%= result %> 입니다. 다시는 잊어버리지 마세요
</body>
</html>
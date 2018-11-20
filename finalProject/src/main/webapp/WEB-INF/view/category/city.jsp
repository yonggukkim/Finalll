<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	List list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<select id="city1" name="cityNum">
<% for( Object o : list) { 
	City city = (City)o;
%>
	<option value="<%= city.getCityNum() %>"><%= city.getCityName() %></option>
<% } %>
</select>
</div>
</body>
</html>
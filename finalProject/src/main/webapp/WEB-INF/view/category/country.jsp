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
<select id="country1" name="countryNum" onclick="javascript:ccc();">
<% for( Object o : list) { 
	Country country = (Country)o; %>
	<option value="<%= country.getCountryNum() %>"><%= country.getCountryName() %></option>
<% } %>
</select>
</body>
</html>

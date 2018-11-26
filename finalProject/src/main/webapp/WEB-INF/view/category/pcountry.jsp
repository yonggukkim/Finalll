<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	List pkglist = (List)request.getAttribute("list");
%>

<select id="pkgcountry1" name="CountryNum" onclick="javascript:bp();">
<% for( Object o : pkglist) { 
	Country country = (Country)o; %>
	<option value="<%= country.getCountryNum() %>"><%= country.getCountryName() %></option>
<% } %>
</select>

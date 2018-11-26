<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	List pkglist = (List)request.getAttribute("list");
%>

<select id="pkgcity1" name="CityNum" onclick="javascript:cp();">
<% for( Object o : pkglist) { 
	City city = (City)o;
%>
	<option value="<%= city.getCityNum() %>"><%= city.getCityName() %></option>
<% } %>
</select>

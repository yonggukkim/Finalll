<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	List list = (List)request.getAttribute("list");
%>

<select id="country1" name="CountryNum" onclick="javascript:ba();">
<% for( Object o : list) { 
	Country country = (Country)o; %>
	<option value="<%= country.getCountryNum() %>"><%= country.getCountryName() %></option>
<% } %>
</select>

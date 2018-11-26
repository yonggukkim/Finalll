<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	Hotel pkghotelmodify = (Hotel)request.getAttribute("list");
%>

<table id="pkghotelmodify1">
	<tr>
		<th>가격 : </th>
		<td><%= pkghotelmodify.getHotelPrice() %></td>
		<th>등급 : </th>
		<td><%= pkghotelmodify.getHotelGrade() %></td>
	</tr>
</table>
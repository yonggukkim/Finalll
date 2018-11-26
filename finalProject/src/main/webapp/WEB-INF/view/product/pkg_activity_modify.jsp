<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	Activitys pkgactivitymodify = (Activitys)request.getAttribute("list");
%>

<table id="pkgactivitymodify1">
	<tr>
		<th>가격 : </th>
		<td><%= pkgactivitymodify.getActivityPrice() %></td>
		<th>분류 : </th>
		<td><%= pkgactivitymodify.getActivityCate() %></td>
	</tr>
</table>
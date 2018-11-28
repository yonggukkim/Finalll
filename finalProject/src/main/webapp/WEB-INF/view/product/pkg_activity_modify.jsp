<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*,command.*" %>
<%
	Activitys pkgactivitymodify = (Activitys)request.getAttribute("list");
	List activitycart = (List)session.getAttribute("activitycart");
%>
<%
	if(activitycart == null) {
%>
	<h1 align="center">상품이 존재하지 않습니다.</h1>
<% }else { %>
<table id="pkgactivitymodify1">
	<tr>
		<th>상품명 </th>
		<th>가격 </th>
		<th>분류 </th>
	</tr>
	<%
		for(int i = 0; i < activitycart.size(); i++) {
		ActivityCommand activity = (ActivityCommand)activitycart.get(i);
		%>
	<tr>	
		<td><%= activity.getActivityName() %></td>		
		<td><%= activity.getActivityPrice() %></td>
		<td><%= activity.getActivityCate() %></td>
	</tr>
		<% } %>
</table>
<% } %>
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
<
<table id="pkgactivitymodify1">
	<tr>
		<th>상품이미지</th>
		<th>상품명</th>
		<th>분류</th>
		<th>회사명</th>
		<th>회사번호</th>
	</tr>
	<%
		for(int i = 0; i < activitycart.size(); i++) {
			ActivityListSession activity = (ActivityListSession)activitycart.get(i);
		%>
	<tr>
		<td><img alt="activity" src="files/<%= activity.getActivityImage() %>" width="50" height="50"></td>
		<td><%= activity.getActivityName() %></td>		
		<td><%= activity.getActivityCate() %></td>
		<td><%= activity.getActivityCompany() %></td>
		<td><%= activity.getActivityTel() %></td>
	</tr>
		<% } %>
</table>
<% } %>
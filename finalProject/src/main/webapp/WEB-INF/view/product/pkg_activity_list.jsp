<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	List pkgactivitylist = (List)request.getAttribute("list");
%>

<select id="pkgactivitylist1" name="activitys" onclick="javascript:ep();">
<option>--선택하세요--</option>
<% for( Object o : pkgactivitylist) { 
	Activitys activitys = (Activitys)o; %>
	<option value="<%= activitys.getActivityNum() %>"><%= activitys.getActivityName() %></option>
<% } %>
</select>
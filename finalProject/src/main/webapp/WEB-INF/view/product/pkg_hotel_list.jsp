<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*" %>
<%
	List pkghotellist = (List)request.getAttribute("list");
	System.out.println("pkg_hotel_list 페이지 진입");
%>

<select id="pkghotellist1" name="hotels" onclick="javascript:dp();">
	<option>--선택하세요--</option>
<% for( Object o : pkghotellist) { 
	Hotel hotel = (Hotel)o; %>
	<option value="<%= hotel.getHotelNum() %>"><%= hotel.getHotelName() %></option>
<% } %>
</select>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,model.*,command.*" %>
<%
	Hotel pkghotelmodify = (Hotel)request.getAttribute("list");
	List hotelcart = (List)session.getAttribute("hotelcart");
%>
<%
	if(hotelcart == null) {
%>
	<h1 align="center">상품이 존재하지 않습니다.</h1>
<% }else { %>
<table id="pkghotelmodify1">
	<tr>
		<th>상품명 : </th>
		<%
		for(int i = 0; i < hotelcart.size(); i++) {
		HotelCommand hotel = (HotelCommand)hotelcart.get(i);
		%>
		<td><%= hotel.getHotelName() %></td>
		<% } %>
		<th>가격 : </th>
		<%
		for(int i = 0; i < hotelcart.size(); i++) {
		HotelCommand hotel = (HotelCommand)hotelcart.get(i);
		%>
		<td><%= hotel.getHotelPrice() %></td>
		<% } %>
		<th>등급 : </th>
		<%
		for(int i = 0; i < hotelcart.size(); i++) {
		HotelCommand hotel = (HotelCommand)hotelcart.get(i);
		%>
		<td><%= hotel.getHotelGrade() %></td>
		<% } %>
	</tr>
</table>
<% } %>
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
		<th>상품이미지 </th>
		<th>상품명 </th>
		<th>분류 </th>
		<th>등급 </th>
		<th>회사명 </th>
		<th>회사번호</th>
	</tr>
	<%
		for(int i = 0; i < hotelcart.size(); i++) {
		HotelListSession hotel = (HotelListSession)hotelcart.get(i);
		%>
	<tr>	
		<%-- <td><%= hotel.getHotelNum() %></td> --%>
		<td><img alt="hotel" src="files/<%= hotel.getHotelImage() %>" width="50" height="50"></td>		
		<td><%= hotel.getHotelName() %></td>
		<td><%= hotel.getHotelCate() %></td>		
		<td><%= hotel.getHotelGrade() %></td>
		<td><%= hotel.getHotelCompany() %></td>
		<td><%= hotel.getHotelTel() %></td>
	</tr>
		<% } %>
</table>
<% } %>
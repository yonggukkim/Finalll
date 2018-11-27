<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.* ,model.Gift"%>
<%
	List list = (List) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center><h2>특산품 리스트</h2></center>
	<table align="center">
		<tr>
			<th>상품번호</th>
			<th>상품분류</th>
			<th>상품명</th>
		</tr>
		
		<%
			for (int i = 0; i < list.size(); i++) {
				 Gift gift = (Gift) list.get(i);
				 System.out.println("리스트페이지 giftNum "+ gift.getGiftNum());
		%>
		<tr>
			<td><%=gift.getGiftNum()%></td>
			<td><%=gift.getGiftCate()%></td>
			<td><a href="gift_detail?giftNum=<%=gift.getGiftNum()%>"><%=gift.getGiftName()%></a></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="gift_insert" class="btn btn-primary btn-lg right" role="button" aria-pressed="true">상품등록</a>
</body>
</html>
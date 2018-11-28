<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.* ,model.Gift, command.*"%>


<%
	List list = (List) request.getAttribute("list");

	LoginSession info = (LoginSession) session.getAttribute("info");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (session.getAttribute("info") == null) {
	%>

	<h2 align="center">관리자가 아니면 볼수 없는 페이지 입니다!</h2>

	<%
		} else {
			if (info.getCommandDvice().equals("m")) {
	%>
	<h2 align="center">관리자가 아니면 볼수 없는 페이지 입니다!</h2>


	<%
		} else if (info.getCommandDvice().equals("s")) {
	%>

	<br />
	<form action="gift_list_byName" method="POST">
		<table border="1" align="center">
			<tr>
				<th><select>
						<option value="byName">상품명으로 검색</option>
						<option value="byContent">상품내용으로 검색</option>
				</select></th>
				<td><input type="text" name="giftName" /></td>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>

	<br />
	<center>
		<h2>특산품 리스트</h2>
	</center>
	<%
		if (list.size() == 0) {
	%>
	<center>등록된 게시물이 없습니다!</center>

	<%
		} else {
	%>
	<table align="center">
		<tr>
			<th>상품번호</th>
			<th>상품분류</th>
			<th>상품명</th>
		</tr>

		<%
			for (int i = 0; i < list.size(); i++) {
							Gift gift = (Gift) list.get(i);
							System.out.println("리스트페이지 giftNum " + gift.getGiftNum());
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

	<%
		}
	%>
	<a href="gift_insert" class="btn btn-primary btn-lg right"
		role="button" aria-pressed="true">상품등록</a>
	<a href="gift_list" class="btn btn-primary btn-lg right" role="button"
		aria-pressed="true">목록보기</a>

	<%
		}
	%>

	<%
		}
	%>
</body>
</html>
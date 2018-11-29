<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
	request.setCharacterEncoding("utf-8");
	Member member = (Member)request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<section id="services" class="bg-light">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>회원삭제</h2>
						</thead>
						<tbody>
							<form:form commandName="member" action="memberDelete" method="post"
								encType="multiplart/form-data">
								<form:hidden path="memberNum" value="<%=member.getMemberNum()%>" />
								<tr>
									<th>비밀번호 :</th>
									<td><input type="password" placeholder="비밀번호를 입력하세요" /></td>
								</tr>
								<tr>
									<td colspan="2"><input type="submit" value="삭제" /> <a
										href="member_list"><input type="button" value="취소" /></a></td>
								</tr>
							</form:form>
					</table>
				</div>
			</div>
		</div>
	</section>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%
	request.setCharacterEncoding("utf-8");
	Member member = (Member) request.getAttribute("member");
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
							<h2>회원 정보 수정</h2>
						</thead>
						<tbody>
							<form:form commandName="member" action="memberModify"
								method="post" encType="multiplart/form-data">
								<form:hidden path="memberNum" value="<%=member.getMemberNum()%>" />
								<tr>
									<th>비밀번호 수정</th>
									<td><input type="text" placeholder="수정할 비밀번호를 입력해 주세요"
										name="memberPw" class="" /></td>
								</tr>
								<!-- 								<tr>
									<th>비밀번호 수정 확인</th>
									<td><textarea cols="30" placeholder="수정할 비밀번호를 다시 한번 입력해 주세요 "
											name="" class=""></textarea></td>
								</tr> -->
								 <tr>
									<th>휴대폰 번호 :</th>
									<td><select name="memberCountryNum">
											<option value="010" selected="selected">010</option>
											<option value="011">011</option>
											<option value="012">012</option>
											<option value="013">013</option>
											<option value="014">014</option>
											<option value="015">015</option>
									</select> <input type="text" name="memberPhone"
										placeholder="수정할 휴대전화 번호를 입력해 주세요 " /></td>
								</tr>


								<tr>
									<th>이메일 주소</th>
									<td><input type="email" placeholder="이메일을 입력 하세요 "
										name="memberEmail" class="" /></td>
								</tr>

								<!-- <tr>
									<th>우편번호 :</th>
									<td><input type="text" placeholder="우편번호를 입력하세요 "
										name="memberPostcode" class="" />
									<td><input id="sample6_postcode" name="memberPostcode" /></td>
									<td><input type="button"
										onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br></td>
								</tr>  -->
								 <tr>
									<th>주소</th>
									<td><input type="text" placeholder="주소를 입력하세요."
										name="memberAddr1" class="" /></td>
								</tr>
								<tr>
									<th>상세주소</th>
									<td><input type="text" placeholder="상세주소를 입력하세요. "
										name="memberAddr2" class="" /></td>
								</tr>

								<tr>
									<th>전화번호</th>
									<td><input type="text" placeholder="전화번호를 입력하세요. "
										name="memberTel" class="" /></td>
								</tr>
								<tr>
									<th>결혼 유무 :</th>
									<td><input type="radio" name="memberMarrige" value="N" />미혼
										<input type="radio" name="memberMarrige" value="Y" />기혼</td>
								</tr>
								<tr>
									<th>이벤트 이메일 수신여부 :</th>
									<td><input type="radio" name="memberAgreeMailing" value="Y" /> 동의합니다. 
										<input type="radio" name="memberAgreeMailing" value="N" />동의하지 않습니다.</td>
								</tr>
								<tr>
									<th>이벤트 문자 수신여부 :</th>
									<td><input type="radio" name="memberAgreeSms" value="Y" />동의합니다.
										<input type="radio" name="memberAgreeSms" value="N" />동의하지 않습니다.</td>
								</tr>
								<tr>
									<th>이벤트 우편물 수신여부 :</th>
									<td><input type="radio" name="memberAgreePost" value="Y" />동의합니다.
										<input type="radio" name="memberAgreePost" value="N" />동의하지 않습니다.</td>
								</tr>
								<tr>
									<th>이벤트 유선전화 수신여부 :</th>
									<td><input type="radio" name="memberAgreeTel" value="Y" /> 동의합니다.
										<input type="radio" name="memberAgreeTel" value="N"  />동의하지 않습니다.</td>
								</tr>




								<tr>
									<td colspan="2"><input type="submit" value="수정" /> <a
										href="main"> <input type="button" value="글 목록" /></a></td>
								</tr>
							</form:form>
					</table>
				</div>
			</div>
		</div>
	</section>


	<%-- <%= member.getMemberPw() %><br />


<%= member.getMemberPhone() %><br />
<%= member.getMemberEmail() %><br />
<%= member.getMemberPostcode() %><br />
<%= member.getMemberAddr1() %><br />
<%= member.getMemberAddr2() %><br />
<%= member.getMemberEmail() %><br />
<%= member.getMemberTel() %><br />
<%= member.getMemberJob() %><br />

 --%>


</body>
</html>
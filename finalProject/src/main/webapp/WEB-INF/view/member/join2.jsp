<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.Member"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Scrolling Nav - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
	integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
	crossorigin="anonymous"></script>


<!-- Custom styles for this template -->
<link href="http://localhost:8080/finalProject/css/scrolling-nav.css"
	rel="stylesheet">

</head>

<body id="page-top">

	<table>
		<form:form commandName="member" action="memberJoin" method="POST">
			<form:hidden path="memberNum"  />
			<form:hidden path="memberMileage" value="1" />
			<form:hidden path="memberDvice" value="m" />
			<tr>
				<th>아이디 :</th>
				<td><form:input path="memberId" /></td>
			</tr>
			<tr>
				<th>패스워드 :</th>
				<td><form:password path="memberPw" /></td>
			</tr>
			<tr>
				<th>패스워드 확인 :</th>
				<td><form:password path="" /></td>
			</tr>
			<tr>
				<th>이름 :</th>
				<td><form:input path="memberName" /></td>
			</tr>

			<tr>
				<th>생년월일 :</th>
				<td><form:input path="memberBirth" /></td>
			</tr>
			<tr>
				<th>성별 :</th>
				<td><form:input path="memberGender" /></td>
			</tr>
			<tr>
				<th>국가번호</th>
				<td><form:input path="memberCountryNum" /></td>
			</tr>
			<tr>
				<th>휴대폰 번호 :</th>
				<td><form:input path="memberPhone" /></td>
			</tr>
			<tr>
				<th>이메일 :</th>
				<td><form:input path="memberEmail" /></td>
			</tr>
			<tr>
				<th>우편번호 :</th>
				<td><form:input path="memberPostcode" /></td>
			</tr>
			<tr>
				<th>주소 :</th>
				<td><form:input path="memberAddr1" /></td>
			</tr>
			<tr>
				<th>상세주소 :</th>
				<td><form:input path="memberAddr2" /></td>
			</tr>
			<tr>
				<th>유선 전화 :</th>
				<td><form:input path="memberTel" /></td>
			</tr>
			<tr>
				<th>결혼 유무 :</th>
				<td><form:input path="memberMarrige" /></td>
			</tr>
			<!-- 			<label for="inputMarriage" class="col-lg-2 control-label">결혼
				유무</label>
			<div class="col-lg-10">
				<label class="radio-inline"> <input type="radio"
					id="memberMarrige" name="memberMarrige" value="Y" checked>미혼
				</label> <label class="radio-inline"> <input type="radio"
					id="memberMarrige" name="memberMarrige" value="N">기혼
				</label>
			</div> -->
			<tr>
				<th>직업 :</th>
				<td><form:input path="memberJob" /></td>
			</tr>
			<!-- 				<option value="회사원">회사원</option>
				<option value="자영업">자영업</option>
				<option value="주부">주부</option>
				<option value="공무원">공무원</option>
				<option value="학생">학생</option>
				<option value="기타">기타</option>
			</select>
			<br>
			<br> -->
			<tr>
				<th>이벤트 이메일 수신여부 :</th>
				<td><form:input path="memberAgreeMailing" /> <!-- <form:radiobutton path="memberAgreeMailing" value="0"
						label="동의합니다." /> <form:radiobutton path="memberAgreeMailing"
						value="1" label="동의하지 않습니다." /> --></td>
			</tr>
			<tr>
				<th>이벤트 문자 수신여부 :</th>
				<td><form:input path="memberAgreeSms" /> <!-- <form:radiobutton path="memberAgreeSms" value="0"
						label="동의합니다." /> <form:radiobutton path="memberAgreeSms"
						value="1" label="동의하지 않습니다." />--></td>
			</tr>
			<tr>
				<th>이벤트 우편물 수신여부 :</th>
				<td><form:input path="memberAgreePost" /> <!--<form:radiobutton path="memberAgreePost" value="0"
						label="동의합니다." /> <form:radiobutton path="memberAgreePost"
						value="1" label="동의하지 않습니다." />--></td>
			</tr>
			<tr>
				<th>이벤트 유선전화 수신여부 :</th>
				<td><form:input path="memberAgreeTel" />
					<!-- <form:radiobutton path="memberAgreeTel" value="0"
						label="동의합니다." /> <form:radiobutton path="memberAgreeTel"
						value="1" label="동의하지 않습니다." />--></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" class="btn"
						style="margin-bottom: 20px">작성 완료</button> <a href="memberTerms"><button
							type="button" class="btn" style="margin-bottom: 20px">취소</button></a></td>
			</tr>
		</form:form>
	</table>
</html>

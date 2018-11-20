<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*, model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	List list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function bbb() {
		var num = document.getElementById("continent").value;
		
		$.ajax({
			type : 'post',
			url : 'country',
			dataType : 'html',
			data : "continentName="+num,
			success : function(result) {
				$('#country').html(result);
				$('#city').html("");
			}
		});
	}
	function ccc() {
		var num1 = document.getElementById("continent").value;
		var num2 = document.getElementById("country1").value;
		$.ajax({
			type : 'post',
			url : 'city',
			dataType : 'html',
			data : "continentName="+num1+"&countryNum="+num2,
			success : function(result) {
				$('#city').html(result);
			}
		});
	}
</script>
<body>
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6 mx-auto">
					<table class="table table-bordered">
						<thead>
							<h2>액티비티 상품등록</h2>
						</thead>
						<tbody>
							<form:form commandName="activity" action="activity_insert"
								enctype="Multipart/form-data">
								<tr>
								<td><div>
									<select id="continent" name="continentName"
										onclick="javascript:bbb();">
										<%
											for (Object o : list) {
													Continent continent = (Continent) o;
										%>
										<option value="<%=continent.getContinentName()%>"><%=continent.getContinentName()%></option>
										<%
											}
										%>
									</select>
								</div></td>
								<td><div id="country"></div></td>
								<td><div id="city"></div></td>
								</tr>
								<form:hidden path="activityNum" value="1" />
								<tr>
									<th>상품명 :</th>
									<td colspan="2"><form:input path="activityName" /></td>
								</tr>
								<tr>
									<th>가격 :</th>
									<td colspan="2"><form:input path="activityPrice" /></td>
								</tr>
								<tr>
								<tr>
									<th>이미지파일 :</th>
									<td colspan="2"><input type="file" name="activityFile" /></td>
								</tr>
								<tr>
									<th>종류 :</th>
									<td colspan="2"><form:select path="activityCate">
											<option value="식당">식당</option>
											<option value="레져">레져</option>
											<option value="관광">관광</option>
										</form:select></td>
								</tr>
								<tr>
									<th>내용 :</th>
									<td colspan="2"><form:textarea path="activityContent" rows="5"
											cols="22" /></td>
								</tr>
								<tr>
									<th>대표자이름 :</th>
									<td colspan="2"><form:input path="activityPresident" /></td>
								</tr>
								<tr>
									<th>업체명 :</th>
									<td colspan="2"><form:input path="activityCompany" /></td>
								</tr>
								<tr>
								<tr>
									<th>업체번호 :</th>
									<td colspan="2"><form:input path="activityTel" /></td>
								</tr>
								<tr>
									<td colspan="3"><input type="submit" value="등록" /> <a
										href="#"><input type="button" value="글 목록" /></a></td>
								</tr>
							</form:form>
					</table>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
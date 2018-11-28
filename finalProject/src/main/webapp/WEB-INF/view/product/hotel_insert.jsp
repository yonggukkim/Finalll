<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*, model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	List hotellist = (List) request.getAttribute("list");
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
	function ah() {
		var num = document.getElementById("hotelcontinent").value;

		$.ajax({
			type : 'post',
			url : 'telcountry',
			dataType : 'html',
			data : "continentName=" + num,
			success : function(result) {
				$('#hotelcountry').html(result);
				$('#hotelcity').html("");
			}
		});
	}
	function bh() {
		var num1 = document.getElementById("hotelcontinent").value;
		var num2 = document.getElementById("hotelcountry1").value;
		$.ajax({
			type : 'post',
			url : 'telcity',
			dataType : 'html',
			data : "continentName=" + num1 + "&countryNum=" + num2,
			success : function(result) {
				$('#hotelcity').html(result);
			}
		});
	}

	$(document)
			.ready(
					function() {

						$("#add")
								.click(
										function() {

											$("#addfile")
													.append(
															"<a href='#' class='cancel'>&nbsp;X&nbsp;</a><input type='file' name='files'/><br>");

											$(".cancel").click(function() {

												$(this).next().next().remove();
												$(this).next().remove();
												$(this).remove();
											});
										});

						/*  $("#insBtn").click(function(){
						     
						     if(confirm("입력값을 등록하시겠습니까?")){
						     
						     $("form").attr("action","${path}/board_kyu.do?method=insert");
						     $("form").submit();
						 
						     }
						     
						 });
						 
						 //조회 jquery
						 $("#mainBtn").click(function(){
						     
						     $(location).attr("href","${path}/board_kyu.do?method=list");
						     
						 }); */
					});
</script>
<body>
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6 mx-auto">
					<form:form commandName="hotel" action="hotel_insert" enctype="Multipart/form-data">
						<table class="table table-bordered">
							<thead>
								<h2>호텔 상품등록</h2>
							</thead>
							<tbody>
								<%--  --%>

								<tr>
									<td><div>
											<select id="hotelcontinent" name="continentName"
												onclick="javascript:ah();">
												<%
													for (Object o : hotellist) {
															Continent continent = (Continent) o;
												%>
												<option value="<%=continent.getContinentName()%>"><%=continent.getContinentName()%></option>
												<%
													}
												%>
											</select>
										</div></td>
									<td><div id="hotelcountry"></div></td>
									<td><div id="hotelcity"></div></td>
								</tr>
								<tr>
									<th>호텔명 :</th>
									<td colspan="2"><form:input path="hotelName" /></td>
								</tr>
								<tr>
									<th>가격 :</th>
									<td colspan="2"><form:input path="hotelPrice" /></td>
								</tr>
								<tr>
								<tr>
									<th>첨부파일추가 <a href="#" id="add">(클릭)</a></th>
                					<td colspan="2" id="addfile" ><a href="#" class="cancel">&nbsp;X&nbsp;</a><input type="file" name="hotelFile"/><br></td>
								</tr>
								<tr>
									<th>종류 :</th>
									<td colspan="2"><form:select path="hotelCate">
											<option value="호텔">호텔</option>
											<option value="리조트">리조트</option>
											<option value="펜션">펜션</option>
										</form:select></td>
								</tr>
								<tr>
									<th>내용 :</th>
									<td colspan="2"><form:textarea path="hotelContent"
											rows="5" cols="22" /></td>
								</tr>
								<tr>
									<th>체크인 시간 :</th>
									<td colspan="2"><form:input path="hotelCheckin" /></td>
								</tr>
								<tr>
									<th>체크아웃 시간 :</th>
									<td colspan="2"><form:input path="hotelCheckout" /></td>
								</tr>
								<tr>
									<th>조식여부 :</th>
									<td colspan="2"><form:checkbox path="hotelBreakfast" /></td>
								</tr>
								<tr>
									<th>호텔등급 :</th>
									<td colspan="2"><form:select path="hotelGrade">
											<option value="5성">5성</option>
											<option value="4성">4성</option>
											<option value="3성">3성</option>
											<option value="2성">2성</option>
											<option value="1성">1성</option>
										</form:select></td>
								</tr>
								<tr>
									<th>대표자이름 :</th>
									<td colspan="2"><form:input path="hotelPresident" /></td>
								</tr>
								<tr>
									<th>업체명 :</th>
									<td colspan="2"><form:input path="hotelCompany" /></td>
								</tr>
								<tr>
									<th>업체번호 :</th>
									<td colspan="2"><form:input path="hotelTel" /></td>
								</tr>
								<tr>
									<td colspan="3"><input type="submit" value="등록" /> <a
										href="#"><input type="button" value="글 목록" /></a></td>
								</tr>
						</table>
					</form:form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
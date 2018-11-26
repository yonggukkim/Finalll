<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*, model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	List pkglist = (List) request.getAttribute("list");
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
	function ap() {
		var num = document.getElementById("pkgcontinent").value;

		$.ajax({
			type : 'post',
			url : 'pcountry',
			dataType : 'html',
			data : "continentName=" + num,
			success : function(result) {
				$('#pkgcountry').html(result);
				$('#pkgcity').html("");
				$('#pkghotelList').html("");
				$('#pkgactivityList').html("");
			}
		});
	}
	function bp() {
		var num1 = document.getElementById("pkgcontinent").value;
		var num2 = document.getElementById("pkgcountry1").value;
		$.ajax({
			type : 'post',
			url : 'pcity',
			dataType : 'html',
			data : "continentName=" + num1 + "&countryNum=" + num2,
			success : function(result) {
				$('#pkgcity').html(result);
				$('#pkghotelList').html("");
				$('#pkgactivityList').html("");
			}
		});
	}

	function cp() {
		var num1 = document.getElementById("pkgcontinent").value;
		var num2 = document.getElementById("pkgcountry1").value;
		var num3 = document.getElementById("pkgcity1").value;
		$.ajax({
			type : 'post',
			url : 'photel_list',
			dataType : 'html',
			data : "continentName=" + num1 + "&countryNum=" + num2
					+ "&cityNum=" + num3,
			success : function(result) {
				$('#pkghotelList').html(result);
			}
		});
		$.ajax({
			type : 'post',
			url : 'pactivity_list',
			dataType : 'html',
			data : "continentName=" + num1 + "&countryNum=" + num2
					+ "&cityNum=" + num3,
			success : function(result) {
				$('#pkgactivityList').html(result);
			}
		});
	}

	function dp() {
		var num1 = document.getElementById("pkgcontinent").value;
		var num2 = document.getElementById("pkgcountry1").value;
		var num3 = document.getElementById("pkgcity1").value;
		var num4 = document.getElementById("pkghotellist1").value;
		$.ajax({
			type : 'post',
			url : 'photel_modify',
			dataType : 'html',
			data : "continentName=" + num1 + "&countryNum=" + num2
					+ "&cityNum=" + num3 + "&hotelNum=" + num4,
			success : function(result) {
				$('#pkghotelmodify').html(result);
			}
		});
	}

	function ep() {
		var num1 = document.getElementById("pkgcontinent").value;
		var num2 = document.getElementById("pkgcountry1").value;
		var num3 = document.getElementById("pkgcity1").value;
		var num4 = document.getElementById("pkgactivitylist1").value;
		$.ajax({
			type : 'post',
			url : 'pactivity_modify',
			dataType : 'html',
			data : "continentName=" + num1 + "&countryNum=" + num2
					+ "&cityNum=" + num3 + "&activityNum=" + num4,
			success : function(result) {
				$('#pkgactivitymodify').html(result);
			}
		});
	}
	$(document).ready(function() {
		$("#add").click(function() {
			$("#addfile").append("<a href='#' class='cancel'>&nbsp;X&nbsp;</a><input type='file' name='files'/><br>");
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
	
	/* $(document).ready(function() {
		$("#teladd").click(function() {
			$("#teladdfile").append("<a href='#' class='cancel'>&nbsp;X&nbsp;</a><div id="pkghotelList"></div><br>");
				$(".cancel").click(function() {
					$(this).next().next().remove();
					$(this).next().remove();
					$(this).remove();
				});
		});

	});
	
	$(document).ready(function() {
		$("#actadd").click(function() {
			$("#actaddfile").append("<a href='#' class='cancel'>&nbsp;X&nbsp;</a><div id="pkgactivityList"></div><br>");
				$(".cancel").click(function() {
					$(this).next().next().remove();
					$(this).next().remove();
					$(this).remove();
				});
		});

	}); */
</script>
<body>
	<section id="services" class="bg-light">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-lg-6 mx-auto">
					<form:form commandName="pkg" action="pkg_insert">
						<table class="table table-bordered">
							<thead>
								<h2>패키지여행상품등록</h2>
							</thead>
							<tbody>
								<%-- enctype="Multipart/form-data" --%>

								<tr>
									<td><div>
											<select id="pkgcontinent" name="continentName"
												onclick="javascript:ap();">
												<%
													for (Object o : pkglist) {
															Continent continent = (Continent) o;
												%>
												<option value="<%=continent.getContinentName()%>"><%=continent.getContinentName()%></option>
												<%
													}
												%>
											</select>
										</div></td>
									<td><div id="pkgcountry"></div></td>
									<td><div id="pkgcity"></div></td>
								</tr>
								<tr>
								</tr>
								<tr>
									<!-- <th>호텔추가 <a href="#" id="teladd">(클릭)</a></th> -->
									<!-- <td colspan="1" id="teladdfile" ><a href="#" class="cancel">&nbsp;X&nbsp;</a> --><td><div id="pkghotelList"></div><!-- <br> --></td>
									<td colspan="2"><div id="pkghotelmodify"></div></td>
								</tr>
								<tr>
									<!-- <th>액티비티추가 <a href="#" id="actadd">(클릭)</a></th> -->
									<!-- <td colspan="1" id="actaddfile" ><a href="#" class="cancel">&nbsp;X&nbsp;</a> --><td><div id="pkgactivityList"></div><!-- <br> --></td>
									<td colspan="2"><div id="pkgactivitymodify"></div></td>
								</tr>
								<tr>
									<th>패키지여행상품명 :</th>
									<td colspan="2"><form:input path="pkgName" /></td>
								</tr>
								<tr>
									<th>테마종류 :</th>
									<td colspan="2"><form:select path="pkgTheme">
											<option value="신혼여행">신혼여행</option>
											<option value="골프여행">골프여행</option>
											<option value="도시투어">도시투어</option>
										</form:select></td>
								</tr>
								<tr>
									<th>가격 :</th>
									<td colspan="2"><form:input path="pkgPrice" /></td>
								</tr>
								<tr>
									<th>여행기간 :</th>
									<td colspan="2"><form:input path="pkgPeriod" /></td>
								</tr>
								<tr>
									<!-- <tr>
									<th>첨부파일추가 <a href="#" id="add">(클릭)</a></th>
                					<td colspan="2" id="addfile" ><a href="#" class="cancel">&nbsp;X&nbsp;</a><input type="file" name="files"/><br></td>
								</tr> -->
								<tr>
									<th>종류 :</th>
									<td colspan="2"><form:select path="pkgCate">
											<option value="패키지">패키지</option>
											<option value="세미패키지">세미패키지</option>
										</form:select></td>
								</tr>
								<tr>
									<th>내용 :</th>
									<td colspan="2"><form:textarea path="pkgContent" rows="5"
											cols="22" /></td>
								</tr>
								<tr>
									<th>최소신청인원 :</th>
									<td colspan="2"><form:input path="pkgMemberMin" /></td>
								</tr>
								<tr>
									<th>현재신청인원 :</th>
									<td colspan="2"><form:input path="pkgMemberCur" /></td>
								</tr>
								<tr>
									<th>마감인원 :</th>
									<td colspan="2"><form:input path="pkgMemberMax" /></td>
								</tr>
								<tr>
									<th>후기내용 :</th>
									<td colspan="2"><form:input path="pkgReview" /></td>
								</tr>
								<tr>
									<th>유의사항내용 :</th>
									<td colspan="2"><form:input path="pkgCaution" /></td>
								</tr>
								<tr>
									<th>참고전달사항 :</th>
									<td colspan="2"><form:input path="pkgReference" /></td>
								</tr>
								<tr>
									<th>날씨정보 :</th>
									<td colspan="2"><form:input path="pkgWeatherInfo" /></td>
								</tr>
								<tr>
									<th>집합장소 :</th>
									<td colspan="2"><form:input path="pkgMeetingPlace" /></td>
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
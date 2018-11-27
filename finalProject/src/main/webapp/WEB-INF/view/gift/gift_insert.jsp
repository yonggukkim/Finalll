<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<script>
	$(document)
			.ready(
					function() {

						$("#add")
								.click(
										function() {

											$("#addfile")
													.append(
															"<span class='cancel'>&nbsp;X&nbsp;</span><input type='file' name='files'/><br>");

											$(".cancel").click(function() {

												$(this).next().next().remove();
												$(this).next().remove();
												$(this).remove();
											});
										});

					});
</script>

<meta charset="UTF-8">
<title>특산품 등록 페이지</title>
</head>
<body>

	<table class="table table-bordered" width="80%">
		<thead>
			<h1 align="center">특산품 등록 페이지</h1>
		</thead>
		<tbody>
			<form:form commandName="gift" action="gift_insert"
				enctype="multipart/form-data" >
				<tr>
					<td>특산품 번호(히든값)</td>
					<td><form:hidden path="giftNum" /></td>

				</tr>
				<tr>
					<td>특산품 이름</td>
					<td><form:input path="giftName" /></td>
				</tr>
				<tr>
					<td>특산품 가격</td>
					<td><form:input path="giftPrice" /></td>
				</tr>
				<%-- <tr>
					<td>특산품 이미지 (업로드)</td>
					<td><form:input path="giftFile" /></td>
				</tr> --%>
				<tr>
					<td>특산품 종류</td>
					<td><form:input path="giftCate" />
						<div class="fileDrop"></div>
						<div id="uploadedList"></div></td>
				</tr>
				<tr>
					<td>특산품 상세설명</td>
					<td><form:textarea path="giftContent" /></td>
				</tr>
				<tr>
					
					<td class="tt" id="add">첨부파일 <br/>(클릭하면 파일추가 )</td>
                <td id="addfile" ><span class="cancel">&nbsp;X&nbsp;</span><input type="file" name="files"/><br></td>
            </tr>
				</tr>
				<tr>
					<td>특산품 업체이름</td>
					<td><form:input path="giftCompany" /></td>
				</tr>
				<tr>
					<td>특산품 업체 전화번호</td>
					<td><form:input path="giftTel" /></td>
				</tr>
				<tr>
					<td>특산품 업체 대표</td>
					<td><form:input path="giftPresident" /></td>
				</tr>
				<tr>
					<td>대륙이름</td>
					<td><form:input path="continentName" /></td>
				</tr>
				<tr>
					<td>국가번호</td>
					<td><form:input path="countryNum" /></td>
				</tr>
				<tr>
					<td>도시번호</td>
					<td><form:input path="cityNum" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="등록하기"></td>
				</tr>
			</form:form>
		</tbody>
	</table>
</body>
</html>
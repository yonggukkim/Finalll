<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<% Integer result = (Integer) request.getAttribute("result"); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	/* var openerType = typeof opener.location.href;
	
	if(openerType =='string') {
		opener.location.href="memberJoin";
		opener.focus();
	} else {
	} */
	
	function getParentText() {
		document.getElementById("cInput").value = opener.document.getElementById("pInput").value;
	}
	
	
	if (result == 1) {
		alert("test test!");
		
	}
	
	
	/* try {
		getParentText();
		
		
	}catch (e) {
		alert("Error = " + e);
	}
	 */
	
	
	/* function getParentText() {
		document.getElementById("cInput").value = opener.document.getElementById("pInput").value;
	} */
	
	
	
</script>




<body>
	idCheck 페이지입니다.
	<br /> 중복검사할 아이디를 입력하세요.
	<br />
	<form action="idCheck" method="POST">
	<input type="text" id="cInput" value="" />
	<input type="button" value="중복검사하기" onclick="location.href='idCheck2'">
	<input type="button" value="가져오기" onclick="getParentText()">
</form>
	<br>
	<br>
	<input type="button" value="창닫기" onclick="window.close()">


</body>
</html>
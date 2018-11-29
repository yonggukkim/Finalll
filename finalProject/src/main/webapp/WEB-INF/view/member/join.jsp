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
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
  <script type="text/javascript">
  function checkValue(){
      var pw = document.getElementById('memberPw').value
      var pattern1 = /[0-9]/;
       var pattern2 = /[a-zA-Z]/;
       var pattern3 = /[~!@\#$%<>^&*]/;
        var form = document.frm;
        
        if(!form.memberId.value){
            alert("아이디를 입력하세요.");
            return false;
        }
        if(!form.memberPw.value){
            alert("비밀번호를 입력하세요.");
            return false;
        }
        if(!form.memberPw1.value){
            alert("비밀번호를 입력하세요.");
            return false;00
        }
        if(form.memberPw.value != form.memberPw1.value){
            alert("비밀번호가 틀렸습니다");
            return false;        
        }
        

        if(!form.memberName.value){
            alert("이름을 입력하세요.");
            return false;
        }
        if(!form.memberBirth.value){
            alert("생년월일을 입력해 주세요");
            return false;
        }
        if(!form.memberGender.value){
            alert("성별을 선택해 주세요");
            return false;
        }
        if(!form.memberPhone.value){
            alert("전화번호를 입력하세요.");
            return false;
        }
         if(!form.memberEmail.value){
            alert("메일주소를 입력하세요.");
            return false;
        } 
        if(!form.memberPostcode.value){
            alert("우편번호를 입력하세요.");
            return false;
        }
        if(!form.memberAddr1.value){
            alert("주소를 입력하세요.");
            return false;
        }
        if(!form.memberAddr2.value){
            alert("상세주소를 입력하세요.");
            return false;
        }
        if(!form.memberTel.value){
            alert("유선전화번호를 입력하세요.");
            return false;
        }
        if(!form.memberMarrige.value){
            alert("결혼 여부를 선택해 주세요.");
            return false;
        }
        if(!form.memberAgreeMailing.value){
            alert("이벤트 이메일 수신 여부를 선택해주세요.");
            return false;
        }
        if(!form.memberAgreeSms.value){
            alert("이벤트 문자 수신 여부를 선택해주세요.");
            return false;
        }
        if(!form.memberAgreeTel.value){
            alert("이벤트 우편물 수신여부를 선택해주세요.");
            return false;
        }
        if(!form.memberAgreePost.value){
            alert("이벤트 유선전화 수신여부를 선택해주세요");
            return false;
        }
        
        
    }
  
/*   function openIdChk(){
      
      window.name = "parentForm";
      window.open("http://localhost:8080/finalProject222/idChk",
              "chkForm", "width=500, height=300, resizable = no, scrollbars = no");    
  }

function inputIdChk(){
	document.frm.idDuplication.value="idUncheck";
}
function idCheck(){
	
    var id = document.getElementById("userId").value;

    if (!id) {
        alert("아이디를 입력하지 않았습니다.");
        return false;
    } 
    else if((id < "0" || id > "9") && (id < "A" || id > "Z") && (id < "a" || id > "z")){ 
        alert("한글 및 특수문자는 아이디로 사용하실 수 없습니다.");
        return false;
    }
    else
    {
        var param="id="+id
        httpRequest = getXMLHttpRequest();
        httpRequest.onreadystatechange = callback;
        httpRequest.open("POST", "MemberIdCheckAction.do", true);    
        httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded'); 
        httpRequest.send(param);
    }
} */






function sample6_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var fullAddr = ''; // 최종 주소 변수
            var extraAddr = ''; // 조합형 주소 변수

            // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                fullAddr = data.roadAddress;

            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                fullAddr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
            if(data.userSelectedType === 'R'){
                //법정동명이 있을 경우 추가한다.
                if(data.bname !== ''){
                    extraAddr += data.bname;
                }
                // 건물명이 있을 경우 추가한다.
                if(data.buildingName !== ''){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample6_postcode').value = data.zonecode; //5자리 새우편번호 사용
            document.getElementById('sample6_address').value = fullAddr;

            // 커서를 상세주소 필드로 이동한다.
            document.getElementById('sample6_address2').focus();
        }
    }).open();
}



	</script>
	
	
	
	       <script>
          function check(){
                 if(!document.frm.memberId.value){
                      alert("아이디를 입력하세요.");
                      return false;
                  }else{
                    $.ajax({
                           type: 'POST',
                           url: "<c:url value ='/checkSignup.com'/>",
                           data: {"memberId" : $('#memberId').val()},
                           
                          success: function(data){
                              if($.trim(data) == 0){
                                     $('#checkMsg').html('<p style="color:blue">사용가능</p>');
                                     $('#idCheck').val(1);
                              }      
                              else{
                                  $('#checkMsg').html('<p style="color:red">사용불가능</p>');
                                  $('#idCheck').val('0');
                                 return false;
                              }
                          }
                     });    //end ajax    
                  }
                 }
                 </script>
	

	

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
<script type="text/javascript">

</script>
</head>

<body id="page-top">

	<table>
		<form:form name="frm" commandName="member" action="memberJoin" onsubmit="return checkValue()" method="POST">
			<form:hidden path="memberNum"  />
			<form:hidden path="memberMileage" value="1" />
			<form:hidden path="memberDvice" value="m" />
			<tr>
				<th>아이디 :</th>
				<td>
				<form:input path="memberId" name="memberId" onkeydown="inputIdChk()"/>
		    	<input type = "button" onclick="check()" value ="ID 중복 체크" >
			</tr>
			<tr>
				<th>패스워드 :</th>
				<td><form:password path="memberPw" /></td>
			</tr>
			<tr>
				<th>패스워드 확인 :</th>
				<td><input type="password" name="memberPw1" /></td>
			</tr>
			<tr>
				<th>이름 :</th>
				<td><form:input path="memberName" /></td>
			</tr>

			<tr>
				<th>생년월일 :</th>
				<td><form:input path="memberBirth" placeholder="99/99/99형식으로 입력해주세요" /></td>
			</tr> 		
			<tr>
				<th>성별 :</th>
				<td><form:radiobutton path="memberGender" value="M"
						label="남자" /> <form:radiobutton path="memberGender"
						value="W" label="여자" /></td>
			</tr>

			<tr>
				<th>휴대폰 번호 :</th>
				<td><form:select path="memberCountryNum">
				<option value="010" selected="selected">010</option>
				<option value="011">011</option>
				<option value="012">012</option>
				<option value="013">013</option>
				<option value="014">014</option>
				<option value="015">015</option>
			</form:select>		
				<form:input path="memberPhone" /></td>
			</tr>
			<tr>
				<th>이메일 :</th>
				<td><form:input type="email" path="memberEmail" /></td>
			</tr>
			<tr>
				<th>우편번호 :</th>
				<td><form:input  id="sample6_postcode" path="memberPostcode" /></td>
				<td><input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br></td>
			</tr>
			<tr>
				<th>주소 :</th>
				<td><form:input id="sample6_address" path="memberAddr1" /></td>
			</tr>
			<tr>
				<th>상세주소 :</th>
				<td><form:input  id="sample6_address2" path="memberAddr2" /></td>
			</tr>
			<tr>
				<th>유선 전화 :</th>
				<td><form:input path="memberTel" /></td>
			</tr>
			<tr>
				<th>결혼 유무 :</th>
				<td><form:radiobutton path="memberMarrige" value="N"
						label="미혼" /> <form:radiobutton path="memberMarrige"
						value="Y" label="기본" /></td>
			</tr>
			<tr>
				<th>직업 :</th>
			
				<td>
			<form:select path="memberJob">
				<option value="자영업" selected="selected">자영업</option>
				<option value="주부">주부</option>
				<option value="공무원">공무원</option>
				<option value="학생">학생</option>
				<option value="기타">기타</option>
				<option value="백수">백수</option>
			</form:select>		
				</td>
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
				<td><form:radiobutton path="memberAgreeMailing" value="Y"
						label="동의합니다."  /> <form:radiobutton path="memberAgreeMailing"
						value="N" label="동의하지 않습니다." /></td>
			</tr>
			<tr>
				<th>이벤트 문자 수신여부 :</th>
				<td><form:radiobutton path="memberAgreeSms" value="Y"
						label="동의합니다." /> <form:radiobutton path="memberAgreeSms"
						value="N" label="동의하지 않습니다." /></td>
			</tr>
			<tr>
				<th>이벤트 우편물 수신여부 :</th>
				<td><form:radiobutton path="memberAgreePost" value="Y"
						label="동의합니다." /> <form:radiobutton path="memberAgreePost"
						value="N" label="동의하지 않습니다." /></td>
			</tr>
			<tr>
				<th>이벤트 유선전화 수신여부 :</th>
				<td>
					<form:radiobutton path="memberAgreeTel" value="Y"
						label="동의합니다." /> <form:radiobutton path="memberAgreeTel"
						value="N" label="동의하지 않습니다." /></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit" class="btn" onclick="javascritp:checkValue();"
						style="margin-bottom: 20px">작성 완료</button> <a href="memberTerms"><button
							type="button" class="btn" style="margin-bottom: 20px">취소</button></a></td>
			</tr>
		</form:form>
	</table>
</html>

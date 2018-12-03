<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,command.*,java.util.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
	AllSelectActivity activitys = (AllSelectActivity)session.getAttribute("activitys");
	AllSelectHotel hotels = (AllSelectHotel)session.getAttribute("hotels");
	AllSelectPkg pkgone = (AllSelectPkg)session.getAttribute("pkgone");
%>
<!DOCTYPE html>
<html>
<script>
//개인회원 구직정보에서 가족 추가

function family_add() {
	$("#fam_tb").clone().appendTo("#fam_tb1");
}
//  function family_add(){
// 	var Row = fam_tb.insertRow() ;
// 	Row.onmouseover=function(){fam_tb.clickedRowIndex=this.rowIndex;}
	
// 	var Cell1 = Row.insertCell();
// 	Cell1.align = "left";//cell의 align를 사용할 수 있습니다. (left, center, right)							
// 	Cell1.innerHTML = "<input type=text name=FAMILY_RELATION maxlength=10 class=input_res style=width:50px;>";

// 	var Cell2 = Row.insertCell();
// 	Cell2.align = "left";//cell의 align를 사용할 수 있습니다. (left, center, right)							
// 	Cell2.innerHTML = "<input type=text name=FAMILY_NAME maxlength=10 class=input_res style=width:100px;>";

// 	var Cell3 = Row.insertCell();
// 	Cell3.align = "left";//cell의 align를 사용할 수 있습니다. (left, center, right)							
// 	Cell3.innerHTML = "<input type=text name=FAMILY_AGE maxlength=3 class=input_res style=width:50px;>";

// 	var Cell4 = Row.insertCell();
// 	Cell4.align = "left";//cell의 align를 사용할 수 있습니다. (left, center, right)							
// 	Cell4.innerHTML = "<input type=text name=FAMILY_JOB maxlength=20 class=input_res style=width:100px;>";

// 	var Cell5 = Row.insertCell();
// 	Cell5.align = "left";//cell의 align를 사용할 수 있습니다. (left, center, right)							
// 	Cell5.innerHTML = "<select name=LIVE_TOGETHER_CHECK><option value=Y selected>동거</option><option value=N>비동거</option></select>";

// 	var Cell6 = Row.insertCell();
// 	Cell6.align = "left";//cell의 align를 사용할 수 있습니다. (left, center, right)							
// 	Cell6.innerHTML = "<img src=../../../images/mypage/bt_del.gif / onclick=rowdel();>";
// }

//개인회원 구직정보에서 가족 삭제
// function rowdel()
// {
// 	fam_tb.deleteRow(fam_tb.clickedRowIndex);
// }
function rowdel()
{
	("fam_tb1:last").remove();
}

function openWin() {
	window.open("self_gift_list", "gift", "width=500, height=500");
}

</script>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script> 

    <title>Shop Item - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  
    <!-- Custom styles for this template -->
    <link href="http://localhost:8080/finalProject/css/shop-item.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 card card-outline-secondary">
				<div class="card-header card card-outline-secondary">
              <%= pkgone.getPkgName()  %>
            </div>
            <div class="card-body card card-outline-secondary">
              <p><%= pkgone.getPkgContent() %></p>
              <small class="text-muted"><%= pkgone.getPkgPeriod() %></small>
              <hr>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              <hr>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore, similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
              <small class="text-muted">Posted by Anonymous on 3/1/17</small>
              <hr>
              <a href="#" class="btn" onclick="openWin()">특산품 구매</a>
            </div>
			<div class="card card-outline-secondary my-4">
			<form:form commandName="pkgTouristInfo" action="pkgOrder">
           <table width="580" border="0" cellspacing="0" cellpadding="0" class="family justify-content-center">
                                <tr>
                                    <td width="65" class="ttl">이름</td>
                                    <td width="110" class="ttl">영문이름</td>
                                    <td width="65" class="ttl">성별</td>
                                    <td width="110" class="ttl">생년월일</td>
                                    <td width="65" class="ttl">여권번호</td>
                                    <td width="110" class="ttl">여권만료일</td>
                                    <td width="65" class="ttl">국적이름</td>
                                    <td width="80" class="ttl">해당없음
                                        <input type="checkbox" name="nofam" onclick="no_fam();" />
                                    </td>
                                </tr>
                             </table>
                            <table width="580" border="0" cellspacing="0" cellpadding="0" id="fam_tb" class="family">
				<tr><td width="65"><form:input path="pkgTouristName" maxlength="10" class="input_res" style="width:50px;" /></td>
                    <td width="110"><form:input path="pkgTouristEngName" maxlength="10" class="input_res" style="width:100px;" /></td>
                    <td width="65"><form:select path="pkgTouristGender" maxlength="3" class="input_res" style="width:50px;" >
                    <form:option value="남">남</form:option><form:option value="여">여</form:option>
                    </form:select></td>
                    <td width="110"><form:input path="pkgTouristBirth" maxlength="20" class="input_res" style="width:100px;" /></td>
                    <td width="65"><form:input path="pkgPassportNum" maxlength="3" class="input_res" style="width:50px;" /></td>
                    <td width="110"><form:input path="pkgPassportExpDate" maxlength="20" class="input_res" style="width:100px;" /></td>
                    <td width="65"><form:input path="pkgTouristNationality" maxlength="3" class="input_res" style="width:50px;" /></td>
                    <td>
                               </td>
                               <td width="80"></td>
                                <td><img src=../../../images/mypage/bt_del.gif / onclick=rowdel();></td>
                                </tr>
                            </table>
                             <table width="580" border="0" cellspacing="0" cellpadding="0" id="fam_tb1" class="family">
                             </table>

                            <div id="fam_add" style="display:;">
                                여행자 추가시 [추가]버튼을 눌러주세요. <img src="http://localhost:8080/finalProject/images/mypage/bt_add.gif" align="absmiddle" border="0" onclick="family_add();" /> 
                            </div>
                        <div class="row justify-content-center">
	          <button type="submit" class="btn" style="margin-bottom:20px">결제하기</button>
			  <button type="button" class="btn" style="margin-bottom:20px">취소하기</button>
          </div>
                </form:form>
          </div>
          </div>
		</div>
	</div>
</body>
</html>
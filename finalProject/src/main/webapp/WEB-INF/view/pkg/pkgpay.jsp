<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
		<div class="row justify-content-center">
			<div class="col-lg-4 card card-outline-secondary">
			 <div class="form-group">
				    <label for="exampleInputText1">*이름</label>
				    <input type="text" class="form-control" id="exampleInputText1" aria-describedby="emailHelp" placeholder="한글을 입력하세요.">
				    <small id="emailHelp" class="form-text text-muted">*표시는 필수입니다.</small>
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPayMent1">*결제방식</label>
				    <select class="form-control">
					  	<option value="1">카드</option>
					  	<option value="2">현금</option>
					</select>
				  </div>
				  <div class="form-group">
				    <label for="exampleInputBank1">*은행선택</label>
				    <select class="form-control">
					  	<option value="1">하나은행</option>
					  	<option value="2">신한은행</option>
					</select>
				  </div>
				  <div class="form-group">
				  	<label for="exampleInputCardNumber1">*카드번호</label>
				  	<input type="text" class="form-control" id="exampleInputCardNumber1" aria-describedby="emailHelp" placeholder="카드번호를 입력하세요.">
				  </div>
				  <div class="row justify-content-center">
				  <button type="submit" class="btn btn-primary" style="margin-right:5px">결제하기</button>
				  <button type="reset" class="btn btn-primary" style="margin-right:5px">재작성하기</button>
				  <button type="button" class="btn btn-primary">이전 페이지</button>
				  </div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
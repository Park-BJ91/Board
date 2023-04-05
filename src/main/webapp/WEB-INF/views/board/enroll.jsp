<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"
 integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous">
</script>
<script src="https://cdn.ckeditor.com/ckeditor5/36.0.1/classic/ckeditor.js"></script>

<style type="text/css">

.ck.ck-editor{
	max-width: 500px;
}
.ck-editor__editable {
    min-height: 400px;
}
</style>

<meta charset="UTF-8">
<title>게시판 등록</title>
</head>
<body>
<form id="enroll_form" method="post">
	<div class="input_wrap">
		<label>Title</label>
		<input name="title" id="t">
	</div>
	
	<div class="input_wrap">
		<label>Content</label>
		<textarea rows="3" cols="8" name="content" id="c"></textarea>
	</div>
	
	<div class="input_wrap">
		<label>Writer</label>
		<input name="writer" id="w">
	</div>
	<button class="btn">등록하기</button>
</form>	


</body>
<script>

	var tCheck = false;
	var cCheck = false;
	var wCheck = false;
	
	
	

$(document).ready(function(){
	
	$(".btn").click(function(){
	
	var title = $("#t").val();
	var context = $("#c").val();
	var writer = $("#w").val();
	
	if(title ==""){
		alert("제목을 입력해 주세요.");
		tCheck = false;
	}else{
		tCheck = true;
	}
	
	
	if(writer ==""){
		alert("작성자를 입력해 주세요.");
		wCheck = false;
	}else{
		wCheck = true;
	}
	
	
	if(tCheck&&wCheck){	

		
		$("#enroll_form").attr("action","/board/enroll");
		$("#enroll_form").submit();
		
		alert("등록 되었습니다.");
		
	}
	
	return false;
		
		
	});
	
}); //docment


ClassicEditor
.create( document.querySelector( '#c' ) )
.catch( error => {
    console.error( error );
} );




</script>
</html>
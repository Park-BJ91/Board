<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"
 integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8=" crossorigin="anonymous">
</script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게시판 리스트 페이지</h1>	
	
	<div class="table_wrap">
		<button class="btn_enroll" onclick="location.href='/board/enroll';" type="button">게시판 등록</button> 
			<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>수정일</th>
				</tr>
			</thead>	
				<c:forEach items="${list}" var="lis">
					<tr>
						<td><c:out value="${lis.bno}"/></td>
						<td>
							<a class="move" href="<c:out value='${lis.bno}'/>">
								<c:out value="${lis.title}"></c:out>
							</a>
						</td>
						<td><c:out value="${lis.writer}"/></td>
						<td><c:out value="${lis.regdate}"/></td>
						<td><c:out value="${lis.updatedate}"/></td>
					</tr>
			
				</c:forEach>	
				
			</table>
	
	</div>
	
	<form id="move_form" method="get">
	</form>

</body>

<script>
$(document).ready(function(){
	

	let result = '<c:out value="${result}"/>'; 
	
	check(result);

	
	function check(result){
		
		if(result == ''){
			return;
		}
		
		if(result === "sucess"){
			alert("수정 완료.");
		}
		
		if(result == "delete"){
			alert("삭제 완료.");
		}
		
	}
	
});//doc

	let moveForm = $("#move_form");


	$(".move").on("click",function(e){
		e.preventDefault();
		
		moveForm.empty();
		
		moveForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+ "'>");
		moveForm.attr("action","/board/getPaging");
		moveForm.submit();
				
		
	});
	
	


</script>
</html>
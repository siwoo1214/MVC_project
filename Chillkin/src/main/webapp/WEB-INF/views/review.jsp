<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문의 조회</title>
<link href="/Chillkin/css/review.css" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script>
	const contextPath = "<%=request.getContextPath()%>";

	document.addEventListener("DOMContentLoaded",
	    function reviewList(){
			$.ajax({
				type:"GET",
				url:"<%=request.getContextPath()%>/reviewList",
				success:function(data){
					console.log(data);
					$("#result tr:not(:first)").remove();
					for(let i = 0; i < data.length; i++){
						let review = data[i];
						console.log(review);

						let str = "<tr>";
						str += "<td>" + review.R_CODE + "</td>";
						str += "<td>" + review.Title + "</td>";
						str += "<td>" + review.ID + "</td>";
						str += "<td>" + review.Detail + "</td>";
						str += "<td><a href='" + contextPath + "/answer123?r_code=" + review.R_CODE + "'>답변달기</a></td>";
						str += "</tr>";
						$("#result").append(str);
					}
				},
				error:function(err){
					alert("시스템 실행 오류 ㅜㅜ");
				}
			});
		}
	);
</script>
</head>
<body>
	<h2>건의사항 조회 페이지</h2>
	<a href="/Chillkin/h_main">홈페이지 돌아가기</a>

	<div>
		<table id="result">
			<tr>
				<th>건의 코드</th>
				<th>제목</th>
				<th>작성자</th>
				<th>내용</th>
			</tr>
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>재고 관리</title>
<link href="/Chillkin/css/stock.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h2>재고 관리 페이지</h2>
	<a href="/Chillkin/h_main">본사 홈페이지</a>
	
	<table>
		<tr>
			<th>식재료 코드</th>
			<th>식재료</th>
			<th>수량</th>
			<th>가격</th>
		</tr>
		
		<c:forEach var="h" items="${list}">
			<tr>
				<td>${h.getCode()}</td>
				<td>${h.getName()}</td>
				<td>${h.getCnt()}</td>
				<td class="price">${h.getPrice()}</td>
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
		document.addEventListener("DOMContentLoaded", function () {
		    let items = document.querySelectorAll(".price");
		    items.forEach(item => {
		        let num = Number(item.innerText);
		        item.innerText = num.toLocaleString() + '원';
		    });
		});
	</script>
</body>
</html>
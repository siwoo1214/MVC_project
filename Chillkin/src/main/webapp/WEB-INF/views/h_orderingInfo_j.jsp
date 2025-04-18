<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="o" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>발주 정보</title>
<link href="/Chillkin/css/ordering.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h2>발주 정보 관리 페이지</h2>
	<a href="/Chillkin/h_main">본사 홈페이지</a>
	
	<table>
		<tr>
			<th>점포번호</th>
			<th>식재료코드</th>
			<th>수량</th>
		</tr>
		
		<o:forEach var="b" items="${list }">
			<tr>
				<td>${b.getB_code()}</td>
				<td>${b.getI_code()}</td>
				<td>${b.getCnt()}</td>
			</tr>
		</o:forEach>
	</table>
</body>
</html>
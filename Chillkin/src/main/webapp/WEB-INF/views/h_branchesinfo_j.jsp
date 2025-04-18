<%@page import="headquerter.Branches"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가맹점 관리</title>
<link href="/Chillkin/css/branches.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h2>가맹점 정보 관리 페이지</h2>
	<a href="/Chillkin/h_main">본사 홈페이지</a><br>
	<table>
		<tr>
			<th>지점ID</th>
			<th>지점PW</th>
			<th>주소</th>
			<th>전화번호</th>
		</tr>
		
		<c:forEach var="b" items="${list}">
			<tr>
				<td>${b.getBranch_id()}</td>
				<td>${b.getPw()}</td>
				<td>${b.getAddress()}</td>
				<td>${b.getTel()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

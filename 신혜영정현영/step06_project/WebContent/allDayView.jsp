<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" 
	uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>대분류</th>
		<th>소계</th>
	</tr>
	<c:forEach var="data" items="${requestScope.day1}">
		<tr>
			<td>${data.bigClassify}</td>
			<td>${data.dayName}</td>
			<td>${data.sum}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
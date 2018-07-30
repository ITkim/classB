<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" 
	uri = "http://java.sun.com/jsp/jstl/core"%>
모든 고객 정보를 jstl tag로 출력 <br>
<table border="1">
	<tr>
		<th>대분류</th>
		<th>중분류</th>
		<th>소계</th>
	</tr>
	<c:forEach var="data" items="${requestScope.data}">
		<tr>
			<td>${data.bigClassify}</td>
			<td>${data.middleClassify}</td>
			<td>${data.crimeSum}</td>
		</tr>
	</c:forEach>
</table>
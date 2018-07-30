<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- jstl tag즉 외부 지원 tag를 사용하기 위한 필수 설정 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
	모든 고객 정보를 jstl tag로 출력<br>
	<table border="1">
		<c:forEach items="${requestScope.allData}" var="data">
			<tr>
				<td>${data.national}</td>
				<td>${data.gender}</td>
				<td>${data.gend_total}</td>
				<td>${data.age4}</td>
				<td>${data.age9}</td>
				<td>${data.age14}</td>
				<td>${data.age19}</td>
				<td>${data.age24}</td>
				<td>${data.age29}</td>
				<td>${data.age34}</td>
				<td>${data.age39}</td>
				<td>${data.age44}</td>
				<td>${data.age49}</td>
				<td>${data.age54}</td>
				<td>${data.age59}</td>
				<td>${data.age60}</td>
			</tr>
		</c:forEach>
	</table>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
[
          ['Age', 'Number of Crime'],
          <c:forEach var="data" items="${requestScope.crimeMan }">
          ['20세이하',    ${data.sum1}],
          ['21-30',     ${data.sum2}],
          ['31-40',     ${data.sum3}],
          ['41-50',     ${data.sum4}],
          ['51-60',     ${data.sum5}],
          ['61-70',    ${data.sum6}],
          ['70세 이상',   ${data.sum7}]
          </c:forEach>
]

<%--
	jstl - 산업 표준 tag에 ArrayList값을 반복 tag로 처리 가능한 forEach
	<c:forEach items="" var="">
		var 속성에 선언된 변수명으로 처리 ...
	</c:forEach>
--%>
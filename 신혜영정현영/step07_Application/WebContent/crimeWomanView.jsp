<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
[
        	 ['Age', 'Number of Crime'],
             <c:forEach var="data" items="${requestScope.crimeWoman }">
          	['20세이하',    ${data.sum1}],
          	['21-30',     ${data.sum2}],
          	['31-40',     ${data.sum3}],
          	['41-50',     ${data.sum4}],
          	['51-60',     ${data.sum5}],
          	['61-70',    ${data.sum6}],
          	['70세 이상',   ${data.sum7}]
          </c:forEach>
        ]
    
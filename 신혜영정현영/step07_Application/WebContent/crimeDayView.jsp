<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

[['Genre','일요일' ,'월요일', '화요일', '수요일', '목요일','금요일', '토요일', { role: 'annotation' } ],
<c:forEach var="data" items="${requestScope.crimeDay }">
['${data.bigClassify }', ${data.sumOfSun }, ${data.sumOfMon }, ${data.sumOfTue }, ${data.sumOfWed }, ${data.sumOfThu },${data.sumOfFri },${data.sumOfSat },''],
</c:forEach>

]
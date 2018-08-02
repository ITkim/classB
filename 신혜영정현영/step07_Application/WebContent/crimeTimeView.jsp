<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
[['Year', '강력범죄', '절도범죄', '폭력범죄', '지능범죄', '풍속범죄'],
<c:forEach var="data" items="${requestScope.crimeTime }">
["${data.timeInterval }", ${data.sum1 }, ${data.sum2 }, ${data.sum3 }, ${data.sum4 }, ${data.sum5 }],
</c:forEach>
]
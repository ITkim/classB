<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 리스트 보기</title>
</head>
<body>
	<center>
	<h2> 전체 게시글 보기 </h2>
	<table width="700" border="1" bordercolor="skyblue">
		<tr height="40">
			<td colspan="5" align="right">
				<button onclick="location.href='jsp/boardWriteForm.jsp'"> 글쓰기 </button>
			</td>
		</tr>
		<tr>
			<th>번호</th><th>작성가</th><th>제목</th><th>작성일</th>
		</tr>
		<c:forEach var="bean" items="${v}">
			<tr>
				<td align="center"><a href="">${bean.bbsNum}</a></td>
				<td align="center">${bean.bbsWriter}</td>
				<td>${bean.bbsSubject}</td>
				<td align="center">${bean.bbsDate}</td>
			</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>
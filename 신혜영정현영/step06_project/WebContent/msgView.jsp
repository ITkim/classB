<%@ page language="java" 
		contentType="text/html; charset=EUC-KR"
    	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>msgView.jsp</title>
</head>
<body>
<%--

	Expression Language
	 - 화면에 자바 데이터를 효과적으로 출력 가능한 tag
	 - 요청, 세션 객체에 저장된 데이터 출력시에 주로 사용
	 - jstl tag의 도우미 tag로 사용
	 
	 - 동일한 서블릿 코드
	 String msg = (String) request.getAttribute("msg");
	 out.println(msg);
 --%>
	${requestScope.msg}
</body>
</html>




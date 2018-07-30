<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 작성 폼</title>
<style>
	#boardWriteBox {margin: 0 auto; 
				text-align:left;
				width: 800px;
				height: 550px;
				background-color:#white;
				margin-top:20px; }
				
	#writeboard {margin: 0 auto;
				width: 3000px;
				height: 1500px;
				text-align:center;}
	.input1 { width: 200px; align:left; }
	.input2 { width:350px; }		
	.input3{width: 500px;
			height:300px;
			left-margin:10px;}
	
	</style>
</head>
<body>
	<form id="newBoardForm" name="newBoardForm" method="post" action="BoardListProcess"> 
	<div id="wrap">
		<header>
		<div id="topMenuBox">
		</header>
		<nav>
		
			</nav>
			<section>
				<article>
					<div id="boardWriteBox" >
						<br><h3>게시글 작성</h3> <hr>
						<form method="post" action="../BoardListProcess">
							<table id="wirteboard">
							<tr>
								<th>작성자</th>
								<td width="30"><input type="text" id="bbsWriter" name="bbsWriter" class="input1"></td>
								</tr>
								<tr>
									<th>글 제목</th>
									<td width="80"><input type="text" id="bbssubject" name="bbssubject" class="input2"></td>
									</tr>
								<tr>
									<th>글 내용</th>
									<td width="80"><input type="text" id="bbscontent" name="bbcontent" class="input3"></td>
									</tr>	
							
									<tr>
										<td colspan="2" align="center"><input type="submit" value="등록">
																		<input type="reset" value="취소"></td>
									</tr>
							</table>
						</form>			
					</div>
			</article>
		</section>
		<footer>
			
			</footer>
		</div>
		</form>
	</body>
</html>
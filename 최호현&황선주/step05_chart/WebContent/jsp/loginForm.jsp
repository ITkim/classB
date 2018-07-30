<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 폼</title>
<style>
	#loginBox {margin: 0 auto; 
				text-align:center;
				width: 400px;
				height: 250px;
				background-color:#white;
				margin-top:20px; }
				
	#loginTable {margin: 0 auto;
				width: 300px;
				height: 150px;}
				
	.input{width: 150px;}
	</style>
</head>
<body>
	<div id="wrap">
		<header>
		</header>
		<nav>
		
			</nav>
			<section>
				<article>
					<div id="loginBox">
						<br><h3>LOGIN</h3> <hr>
						<form method="post" action="../LoginProcess">
							<table id="loginTable">
							<tr>
								<th>아이디</th>
								<td width="30"><input type="text" id="id" name="Memid" class="input"></td>
								</tr>
								<tr>
									<th>비밀번호</th>
									<td><input type="password" id="password" name="Mempassword" class="input"></td>
									</tr>
									<tr>
										<td colspan="2" align="center"><input type="submit" value="로그인">
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
	</body>
</html>
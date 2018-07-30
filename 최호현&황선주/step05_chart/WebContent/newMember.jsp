<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<style>
			#newMem {margin: 0 auto; 
				width: 800px;
				height: 500px;
				background-color:#white;
				margin-top:20px; }
		
		</style>
			</head>
	<body>
      <div id=newMem> 
      <li><img src="image/logo.png" id="logoImg"></li>
      <h2>      회원 가입     </h2>
        <form id="newMember" name="newMember" method="post" action="NewMemberProcess">
          <table>
			<tr><td>아이디</td><td><input type="text private String ;" id="memid" name="memid" size="10"> &nbsp; <input type="button" value="ID중복체크" readonly>&nbsp; (영문자+특수문자:6~10자) </td></tr>            
            
			<tr><td>비밀번호</td><td><input type="password" id="mempassword" name="mempassword" size="10">&nbsp; (영문자+숫자+특수문자:10~20자)</td></tr>
            
            <tr><td> 성명 </td><td><input type="text" id="memname" name="memname"></td></tr>
            
            <tr><td> 나이 </td><td><input type="text" id="memage" name="memage"></td></tr>
            
            <tr><td>성별</td><td> <label> <input type="radio" id="memgender" name="memgender" value="women" checked> 여성 </label><label> <input type="radio" name="gender" value="men"> 남성 </label>
			</td></tr>
            
            <tr><td>생년월일</td><td><input type="text" id="year" name="year" size="10"> 년
			<select type="text" id="month" name="month"> 월 
			<option value="01">1월</option>				
			<option value="02">2월</option>				
			<option value="03">3월</option>						
			<option value="04">4월</option>				
			<option value="05">5월</option>				
			<option value="06">6월</option>				
			<option value="07">7월</option>				
			<option value="08">8월</option>				
			<option value="09">9월</option>				
			<option value="10">10월</option>			
			<option value="11">11월</option>			
			<option value="12">12월</option>		
			</select>
			
			<select type="text" id="day" name="day">일											
			<option value="01">1일</option>												
			<option value="02">2일</option>												
			<option value="03">3일</option>													
			<option value="04">4일</option>												
			<option value="05">5일</option>												
			<option value="06">6일</option>												
			<option value="07">7일</option>												
			<option value="08">8일</option>												
			<option value="09">9일</option>												
			<option value="10">10일</option>												
			<option value="11">11일</option>												
			<option value="12">12일</option>												
			<option value="13">13일</option>																							
			<option value="14">14일</option>									
			<option value="15">15일</option>								
			<option value="16">16일</option>	
			<option value="17">17일</option>	
			<option value="18">18일</option>	
			<option value="19">19일</option>	
			<option value="20">20일</option>	
			<option value="21">21일</option>
			<option value="22">22일</option>
			<option value="23">23일</option>	
			<option value="24">24일</option>
			<option value="25">25일</option>
			<option value="26">26일</option>	
			<option value="27">27일</option>	
			<option value="28">28일</option>
			<option value="29">29일</option>
			<option value="30">30일</option>
			<option value="31">31일</option>
				</select>
				
			<label> <input type="radio" name="romanCalender" value="solar" checked>양력</label>
 			<label> <input type="radio" name="romanCalender" value="ying">음력</label>
			</td></tr>
			
            <tr><td>휴대폰 번호</td><td> <select name="memhp1">
				<option value="010">010</option>
				<option value="016">016</option>
				<option value="017">017</option>
				<option value="018">018</option>
				<option value="019">019</option>
				<option value="011">011</option>
				</select> - <input type="text" id="memhp2" name="memhp2" size="10" > - <input type="text" id="memhp3" name="memhp3" size="10" >	
				</td></tr>
				
			<tr><td>주소</td><td>	 <input type="text" id="memaddress" name="memaddress" size="70"></td></tr>
		 	         
		
			<tr><td>이메일</td><td><input type="text" id="mememail1" name="mememail1" size="15"> 
					@ <select id="mememail2" name="mememail2">
							<option value="naver.com"> naver.com</option>
							<option value="gmail.com"> gmail.com</option>
							<option value="hanmail.net"> hanmail.net</option>
							<option value="hotmail.net"> hotmail.com</option>
							<option value="기타"> 기타(직접입력)</option>
							</select>
			</td></tr>       
			
             <tr>
                <td colspan="2" align="center">
                    <br><input type="submit" value="가입">
                    <input type="reset" value="취소">
                </td>
            </tr>             
            </table>
      </form>
      </div>	          
    </body>
</html>
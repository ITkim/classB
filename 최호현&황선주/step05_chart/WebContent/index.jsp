<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Havre pour l'espirit</title>  
        <link rel="stylesheet" type="text/css" href="css/common.css">     
        <link rel="stylesheet" type="text/css" href="css/index.css">  
        <link rel="stylesheet" type="text/css" href="css/menu.css">
        <link rel="stylesheet" type="text/css" href="css/slideShow.css">   
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/subMenu.js"></script>
        <script src="js/index.js"></script>
        <script src="js/slideShow.js"></script>
       
	</head>
    
	<body>
	
    	<header>

		
	</header>
	
    	<div id="wrap">
        	<header>
            	<div id="topMenuBox" style="font: bold 1.5em/1.0em 나눔바른펜;">
            	<c:if test= "${empty sessionScope.sid}">
            	
				<a href="jsp/loginForm.jsp"> LOGIN </a>
				</c:if>
				<c:if test="${not empty sessionScope.sid}"> 
				${sid}님 환영합니다. | <a href="LoginProcess?command=logout">LOGOUT</a>
				| <a href="BoardListProcess"> 게시판</a>
				</c:if>
				| CART | Q&A |
				<a href="newMember.jsp"> SIGN IN</a></div>
            </header>
            
            <nav>            
            	<div id="mainMenuBox">
            		<ul id="menuItem">
            			<li><a href="index.jsp"><img src="image/logo.png" id="logoImg"></a></li>
            			<li><a href="#">PHYSICAL</a></li>
            			<li><a href="#">VESSEL SYSTEM</a></li>
            			<li><a href="#">SERUM</a></li>
            			<li><a href="#">OTHERS</a></li>
            	   			
            		</ul>
            	</div>
            	
            	
            	
                <div id="subMenuBox">
                	<div class="subMenuItem" id="subMenuItem1">
                		<ul>
                			<li><a href="1-1.html">HEIGHT</a></li>
                			<li><a href="1-2.html">WEIGHT</a></li>
                			<li><a href="1-3.html">WAIST</a></li>
                			<li><a href="1-4.html">LEFTEYE</a></li>
                			<li><a href="1-5.html">RIGHTEYE</a></li>
                			<li><a href="1-6.html">LEFTEAR</a></li>
                			<li><a href="1-7.html">RIGHTEAR</a></li>
                		</ul>
                	</div>
                	            
                	
                	<div class="subMenuItem" id="subMenuItem2">
                		<ul>
                			<li><a href="2-1.html">SYSTOLIC PRESSURE</a></li>       
                			<li><a href="2-2.html">DIASTOLIC PRESSURE</a></li>    
                			<li><a href="2-3.html">BLOOD SUGAR</a></li>
                			<li><a href="2-4.html">TOTAL CHOLESTEROL</a></li>
                			<li><a href="2-5.html">TRIGLYCERIDE</a></li>
                			<li><a href="2-6.html">HDL</a></li>
                			<li><a href="2-7.html">LDL</a></li>
                			<li><a href="2-8.html">HEMOGLOBIN</a></li>
                			
                		</ul>
                	</div>
                	
                	
                	<div class="subMenuItem" id="subMenuItem3">
                		<ul>
                			<li><a href="3-1.html">SERUM CREATININE</a></li>       
                			<li><a href="3-2.html">SERUM AST</a></li>    
                			<li><a href="3-3.html">SERUM ALT</a></li>
                			<li><a href="3-4.html">yGTP</a></li>
                	
                		</ul>
                	</div>
                	
 					
 					<div class="subMenuItem" id="subMenuItem4">
                		<ul>
                			<li><a href="4-1.html">ALBUMINURIA</a></li>      
                			<li><a href="4-2.html">SMOKE</a></li> 
                  			<li><a href="4-3.html">TEETH</a></li> 
          
                			      
                		</ul>
                	</div>
                
                
                
                
                
                
                </div>
            </nav>     
            
            
            
                    
            <section>
            	<article>
                	<img id="topImg" src="image/topImg.png">                    
                </article>
            	<article  id="slideShow">
            		<div id="prevNextButtonBox">
            			<img id="prevButton" src="image/prevButton.png">
            			<img id="nextButton" src="image/nextButton.png">
            		</div>
            		<div id="slideShowBox">
            			<div id="slidePanel">
            				<img src="image/slideImg1.jpg" class="slideImage"/>
            				<img src="image/slideImg2.jpg" class="slideImage"/>
            				<img src="image/slideImg3.jpg" class="slideImage"/>
            				<img src="image/slideImg4.jpg" class="slideImage"/>
            				<img src="image/slideImg5.jpg" class="slideImage"/>           				
            			</div>
            		</div>
            		<div id="controlPanel">
            			<div class="controlButton"><img src="image/controlButton1.png"/></div>
            			<div class="controlButton"><img src="image/controlButton1.png"/></div>
            			<div class="controlButton"><img src="image/controlButton1.png"/></div>
            			<div class="controlButton"><img src="image/controlButton1.png"/></div>
            			<div class="controlButton"><img src="image/controlButton1.png"/></div>
            		</div> 
                </article>
                
                <article>
            		<div id="content">
            		 <div id="notice"> NOTICE </div> 
            		 
						
            		</div> 
						
                </article>
            </section>
            <footer>
            	<div id="bottomMenuBox" style="font: bold 1.5em/1.0em 나눔바른펜;" > ABOUT US | TERMS of USE | PRIVACY POLICY | AGENCY INQUIRY | HELP</div>
            	<div id="companyInfo"><img src="image/footerImg.png"></div>
                <div><img src="image/moveToTop.png" id="moveToTop"></div>
            </footer>           
        </div>
	</body>
</html>



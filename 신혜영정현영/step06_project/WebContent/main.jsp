<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="c" 
	uri = "http://java.sun.com/jsp/jstl/core"%>    
	
<%@ page import="java.util.*" %>
<%@ page import="model.*" %>
	
<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Poppins">

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<style>

body, h1, h2, h3, h4, h5 {
	font-family: "Poppins", sans-serif
}

body {
	font-size: 16px;
}

.w3-half img {
	margin-bottom: -6px;
	margin-top: 16px;
	opacity: 0.8;
	cursor: pointer
}

.w3-half img:hover {
	opacity: 1
}
</style>
<body onLoad="ajaxReq()">

	<!-- Sidebar/menu -->
	<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding"
		style="z-index: 3; width: 300px; font-weight: bold;" id="mySidebar">
		<br> <a href="javascript:void(0)" onclick="w3_close()"
			class="w3-button w3-hide-large w3-display-topleft"
			style="width: 100%; font-size: 22px">Close Menu</a>
		<div class="w3-container">
			<h3 class="w3-padding-64">
				<b>신혜영<br>& 정현영
				</b>
			</h3>
		</div>
		<div class="w3-bar-block">
			<a href="#" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hover-white">홈</a>
			<a href="#services" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hover-white">버블차트</a> 
			<a href="#packages" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hover-white">파이차트</a> 
			<a href="#showcase" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hover-white">라인차트</a>

			<a href="#designers" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hover-white">히스토그램</a> 
			<a href="#designers2" onclick="w3_close()"
				class="w3-bar-item w3-button w3-hover-white">팀프로필</a>


		</div>
	</nav>

	<!-- Top menu on small screens -->
	<header
		class="w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding">
		<a href="javascript:void(0)" class="w3-button w3-red w3-margin-right"
			onclick="w3_open()">&#9776;</a> <span>Company Name</span>
	</header>

	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()"
		style="cursor: pointer" title="close side menu" id="myOverlay"></div>

	<!-- !PAGE CONTENT! -->
	<div class="w3-main" style="margin-left: 340px; margin-right: 40px">

		<!-- Header -->
		
			<h1 class="w3-jumbo">
				<b>신혜영&정현영</b>
			</h1>
			
					<!-- Services -->
		<div class="w3-container" id="services" style="margin-top: 75px">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>범죄 버블</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
	
			<jsp:include page="bubble.html" flush="false"/>
		</div>
		
		<!-- Packages / Pricing Tables -->
		<div class="w3-container" id="packages" style="margin-top: 75px">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>성별,연령 별 범죄 발생률</b>
			</h1>
		</div>
		<br><br>
<!-- PIE START -->
		<div class="w3-row-padding">
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<%
	ArrayList<CrimeDTO> crimeMan = CrimeDAO.selectCrime(0);
	ArrayList<CrimeDTO> crimeWoman = CrimeDAO.selectCrime(1);

	
%>    
    
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
		
    	
        var data = google.visualization.arrayToDataTable([
          ['Age', 'Number of Crime'],
          ['20세이하',     <%=crimeMan.get(0).getSum1()%>],
          ['21-30',      <%=crimeMan.get(0).getSum2()%>],
          ['31-40',  <%=crimeMan.get(0).getSum3()%>],
          ['41-50', <%=crimeMan.get(0).getSum4()%>],
          ['51-60',    <%=crimeMan.get(0).getSum5()%>],
          ['61-70', 	  <%= crimeMan.get(0).getSum6()%>],
          ['70세 이상',       <%=crimeMan.get(0).getSum7()%>]
        ]);

        var options = {
          title: 'Number of Crime in terms of Age (MAN)'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>
    
     <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
        	  ['Age', 'Number of Crime'],
              ['20세이하',     <%=crimeWoman.get(0).getSum1()%>],
              ['21-30',      <%=crimeWoman.get(0).getSum2()%>],
              ['31-40',  <%=crimeWoman.get(0).getSum3()%>],
              ['41-50', <%=crimeWoman.get(0).getSum4()%>],
              ['51-60',    <%=crimeWoman.get(0).getSum5()%>],
              ['61-70', 	   <%=crimeWoman.get(0).getSum6()%>],
              ['71-80',       <%=crimeWoman.get(0).getSum7()%>]
        ]);

        var options = {
          title: 'Number of Crime in terms of Age (WOMAN)'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart2'));

        chart.draw(data, options);
      }
    </script>
		 <table align="center" padding="0 auto">
		 <tr>
		 	<td> <div id="piechart" style="width: 450px; height: 500px;"></div></td>
		 	<td> <div id="piechart2" style="width: 450px; height: 500px;"></div></td>
		 </tr>
		
		 </table>

	</div>
	<!-- PIE END -->
		<br><br>
		
		
		
		<div class="w3-container" style="margin-top: 80px" id="showcase">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>시간대 별 범죄 발생 통계</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
		</div>
<%
	ArrayList<CrimeTimeDTO> crimeTime1 = CrimeTimeDAO.selectCrime("강력범죄");
	ArrayList<CrimeTimeDTO> crimeTime2 = CrimeTimeDAO.selectCrime("절도범죄");
	ArrayList<CrimeTimeDTO> crimeTime3 = CrimeTimeDAO.selectCrime("폭력범죄");
	ArrayList<CrimeTimeDTO> crimeTime4 = CrimeTimeDAO.selectCrime("지능범죄");
	ArrayList<CrimeTimeDTO> crimeTime5 = CrimeTimeDAO.selectCrime("풍속범죄");


%>
		<!-- Photo grid (modal) -->
		<div class="w3-row-padding" id="linechart_material" style="width:1000px; height:500px">
			
			<script type="text/javascript">
			 google.charts.load('current', {'packages':['corechart']});
		     google.charts.setOnLoadCallback(drawChart);
			
		    function drawChart() {

		      var data = google.visualization.arrayToDataTable([
		    	  ['Year', '강력범죄', '절도범죄', '폭력범죄', '지능범죄', '풍속범죄'],
		    	  ["0-:00 -02:59",  <%= crimeTime1.get(0).getSum()%>, <%= crimeTime2.get(0).getSum()%>, <%=crimeTime3.get(0).getSum()%>, <%= crimeTime4.get(0).getSum()%>, <%=crimeTime5.get(0).getSum() %>],
			        ["03:00 - 05:59",  <%= crimeTime1.get(1).getSum()%>, <%= crimeTime2.get(1).getSum()%>, <%=crimeTime3.get(1).getSum()%>, <%= crimeTime4.get(1).getSum()%>, <%=crimeTime5.get(1).getSum() %>],
			        ["06:00 - 08:59",  <%= crimeTime1.get(2).getSum()%>, <%= crimeTime2.get(2).getSum()%>, <%=crimeTime3.get(2).getSum()%>, <%= crimeTime4.get(2).getSum()%>, <%=crimeTime5.get(2).getSum() %>],
			        ["09:00 - 11:59",  <%= crimeTime1.get(3).getSum()%>, <%= crimeTime2.get(3).getSum()%>, <%=crimeTime3.get(3).getSum()%>, <%= crimeTime4.get(3).getSum()%>, <%=crimeTime5.get(3).getSum() %>],
			        ["12:00 - 14:59",  <%= crimeTime1.get(4).getSum()%>, <%= crimeTime2.get(4).getSum()%>, <%=crimeTime3.get(4).getSum()%>, <%= crimeTime4.get(4).getSum()%>, <%=crimeTime5.get(4).getSum() %>],
			        ["15:00 - 17:59",  <%= crimeTime1.get(5).getSum()%>, <%= crimeTime2.get(5).getSum()%>, <%=crimeTime3.get(5).getSum()%>, <%= crimeTime4.get(5).getSum()%>, <%=crimeTime5.get(5).getSum() %>],
			        ["18:00 - 20:59",  <%= crimeTime1.get(6).getSum()%>, <%= crimeTime2.get(6).getSum()%>, <%=crimeTime3.get(6).getSum()%>, <%= crimeTime4.get(6).getSum()%>, <%=crimeTime5.get(6).getSum() %>],
			        ["21:00 - 23:59",  <%= crimeTime1.get(7).getSum()%>, <%= crimeTime2.get(7).getSum()%>, <%=crimeTime3.get(7).getSum()%>, <%= crimeTime4.get(7).getSum()%>, <%=crimeTime5.get(7).getSum() %>]
		    	  
		      ]);
		     

		      var options = {
		        title : '',
		        curveType : 'function',
		        legend : {position : 'bottom'}
		      };

		      var chart = new google.visualization.LineChart(document.getElementById('linechart_material'));

		      chart.draw(data, options);
		    }
</script>
		</div>
		
		<br><br><br><br>
		<!-- Modal for full size images on click-->
		<div id="modal01" class="w3-modal w3-black" style="padding-top: 0"
			onclick="this.style.display='none'">
			<span class="w3-button w3-black w3-xxlarge w3-display-topright">&times;</span>
			<div
				class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
				<img id="img01" class="w3-image">
				<p id="caption"></p>
			</div>
		</div>



		<!-- 히스토그램 -->
		<div class="w3-container" id="designers" style="margin-top: 75px">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>요일별 범죄 발생률</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">

			<script type="text/javascript"
				src="https://www.gstatic.com/charts/loader.js"></script>
			<script type="text/javascript">
<%	
	ArrayList<CrimeDayDTO> crimeDay1 = CrimeDayDAO.selectCrime("강력범죄");
	ArrayList<CrimeDayDTO> crimeDay2 = CrimeDayDAO.selectCrime("절도범죄");
	ArrayList<CrimeDayDTO> crimeDay3 = CrimeDayDAO.selectCrime("폭력범죄");
	ArrayList<CrimeDayDTO> crimeDay4 = CrimeDayDAO.selectCrime("지능범죄");
	ArrayList<CrimeDayDTO> crimeDay5 = CrimeDayDAO.selectCrime("풍속범죄");
	
%>			
    		google.charts.load("current", {packages:['corechart']});
    		google.charts.setOnLoadCallback(drawChart);
    		
    		function drawChart() {
    	  		var data = google.visualization.arrayToDataTable([
    	       	 	['Genre','일요일' ,'월요일', '화요일', '수요일', '목요일',
    	         	'금요일', '토요일', { role: 'annotation' } ],
    	         	
    	         	['강력범죄', <%=crimeDay1.get(0).getSum()%>, <%=crimeDay1.get(1).getSum()%>,
	       				   <%=crimeDay1.get(2).getSum()%>, <%=crimeDay1.get(3).getSum()%>,
	       				   <%=crimeDay1.get(4).getSum()%>, <%=crimeDay1.get(5).getSum()%>,
	       				   <%=crimeDay1.get(6).getSum()%>, ''],
	       				   
	        		['절도범죄', <%=crimeDay2.get(0).getSum()%>, <%=crimeDay2.get(1).getSum()%>,
    				   	   <%=crimeDay2.get(2).getSum()%>, <%=crimeDay2.get(3).getSum()%>,
    				       <%=crimeDay2.get(4).getSum()%>, <%=crimeDay2.get(5).getSum()%>,
    				       <%=crimeDay2.get(6).getSum()%>, ''],
    	       	 	
	        		['폭력범죄', <%=crimeDay3.get(0).getSum()%>, <%=crimeDay3.get(1).getSum()%>,
    				       <%=crimeDay3.get(2).getSum()%>, <%=crimeDay3.get(3).getSum()%>,
    				       <%=crimeDay3.get(4).getSum()%>, <%=crimeDay3.get(5).getSum()%>,
    				       <%=crimeDay3.get(6).getSum()%>, ''],
	        		['지능범죄', <%=crimeDay4.get(0).getSum()%>, <%=crimeDay4.get(1).getSum()%>,
    				       <%=crimeDay4.get(2).getSum()%>, <%=crimeDay4.get(3).getSum()%>,
    				       <%=crimeDay4.get(4).getSum()%>, <%=crimeDay4.get(5).getSum()%>,
    				       <%=crimeDay4.get(6).getSum()%>, ''],
	        		['풍속범죄', <%=crimeDay5.get(0).getSum()%>, <%=crimeDay5.get(1).getSum()%>,
    				       <%=crimeDay5.get(2).getSum()%>, <%=crimeDay5.get(3).getSum()%>,
    				       <%=crimeDay5.get(4).getSum()%>, <%=crimeDay5.get(5).getSum()%>,
    				       <%=crimeDay5.get(6).getSum()%>, '']
    	      ]);

      var view = new google.visualization.DataView(data);
   

      var options = {
    	        width: 900,
    	        height: 600,
    	        legend: { position: 'top', maxLines: 3 },
    	        bar: { groupWidth: '75%' },
    	        isStacked: true,
    	      };
      var chart = new google.visualization.ColumnChart(document.getElementById("columnchart_values"));
      chart.draw(view, options);
  }
  </script>

		<div id="columnchart_values" style="width: 900px; height: 600px;"></div>

</div>
		<!-- Designers -->
		<div class="w3-container" id="designers2" style="margin-top: 75px">
			<h1 class="w3-xxxlarge w3-text-red">
				<b>팀 프로필</b>
			</h1>
			<hr style="width: 50px; border: 5px solid red" class="w3-round">
			<p>최고의 팀</p>
			<p></p>
			<p>
				<b>팀 프로필</b>
			</p>
		</div>
		<!-- The Team -->
		<div class="w3-row-padding w3-grayscale">
			<div class="w3-half">
				<div class="w3-light-grey">
					<img src="images/team2.jpg" alt="John" style="width: 100%">
					<div class="w3-container">
						<h3>정현영</h3>
						<p class="w3-opacity">Designer</p>
						<p>Phasellus eget enim eu lectus faucibus vestibulum.
							Suspendisse sodales pellentesque elementum.</p>
					</div>
				</div>
			</div>
			<div class="w3-half">
				<div class="w3-light-grey">
					<img src="images/team1.jpg" alt="Jane" style="width: 100%">
					<div class="w3-container">
						<h3>신혜영</h3>
						<p class="w3-opacity">CEO & Founder</p>
						<p>Phasellus eget enim eu lectus faucibus vestibulum.
							Suspendisse sodales pellentesque elementum.</p>
					</div>
				</div>
			</div>
		</div>

		
		<!-- End page content -->
	</div>

	<!-- W3.CSS Container -->
	<div class="w3-light-grey w3-container w3-padding-32"
		style="margin-top: 75px; padding-right: 58px">
		<p class="w3-right">
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				title="W3.CSS" target="_blank" class="w3-hover-opacity">w3.css</a>
		</p>
	</div>

	<script>
// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}

// Modal Image Gallery
function onClick(element) {
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
  var captionText = document.getElementById("caption");
  captionText.innerHTML = element.alt;
}

function ajaxReq(){
	 var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	    	//innerHTML - js에서 html tag를 화면에 출력할 때 사용되는 속성
	    	//주의사항 : div와 p tag에 반영되는 속성
	    	//innerText는 tag반영 안됨
	     	return this.responseText;
	    }
	  };
	  
	  var executeString1 = "cont?command=crime";
	  var executeString2 = "cont?command=crimeTime";
	  var executeString3 = "cont?command=crimeDay";

	  
	  xhttp.open("GET", executeString1, true);
	  xhttp.open("GET", executeString2, true);
	  xhttp.open("GET", executeString3, true);
	  xhttp.send();
}
</script>
</body>
</html>
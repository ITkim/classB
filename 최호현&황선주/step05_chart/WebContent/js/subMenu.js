/**
 * subMenu.js
 */

$(function() {
	//시작 시 슬라이드 업(0.001초)해서 메뉴 항목 안 보이게
	$('.subMenuItem').slideUp(1);
	
	//시작 시 서브 메뉴 영역 숨기기
	$('#subMenuBox').hide();
	//클래스명이 subMenuItem요소 모두 찾아 배열로 저장
	var $subMenuItem=$('.subMenuItem');
	
	$('#menuItem li').each(function(index) {		//각 메뉴 항목에 대해
		var newIndex=index-1;			//logo<li>빼고 두 번째부터 시작하기 위해 -1(두번째가 0이 되도록)
		$(this).hover(		//각 menuItem <li> 메뉴 항목에 마우스
			function() {	//올렸을 때
				if(index>0){		//logo빼고 두 번째 메뉴 항목부터
					//서브 메뉴 항목과 서브 메뉴 영역 둘 다 보이게
					$('#subMenuBox').css('visibility','visible');
					$('#subMenuBox').show();
					//인덱스에 해당되는 subMenuItem <div> slideDown
					$subMenuItem.eq(newIndex).slideDown(300);		//0.3초 슬라이드 다운
				}
			},
			function() {		//마우스 뗐을 때
				if(index>0){	//logo 빼고 두 번째 메뉴 항목부터
					//인덱스에 해당되는 subMenuItem<div> slideUp
					$subMenuItem.eq(newIndex).slideUp(100);		//0.001초 슬라이드 업
					//서브 메뉴 항목과 서브 메뉴 영역 둘 다 숨기기
					$('#subMenuBox').hide();
				}
			}
		);
	});
	
	$('.subMenuItem').hover(
	function() {
		$subMenuItem.stop();
		$('#subMenuBox').show();
	},
	function() {
		$subMenuItem.slideUp(1);
		$('#subMenuBox').hide();
	}
	);
	
	
	
});		//$(function()) 끝

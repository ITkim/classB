/**
 * 
 */

$(function() {
	//이동한 이미지의 index값 저장(현재 위치)
	var movedIndex;
	
	//슬라이드 패널을 움직여주는 함수
	function moveSlide(index) {
		//전달받은 index값을 movedIndex에 저장
		//prev와 next 메소드에서 사용
		movedIndex=index;
		
		//슬라이드 이동
		var moveLeft= -(index*960);	//왼쪽으로 이동 거리
		$('#slidePanel').animate({'left':moveLeft}, 'slow');
	}
	
	//초기 슬라이더 위치 랜덤하게 지정
	var randomNumber= Math.floor(Math.random()*5);
	moveSlide(randomNumber);
	
	//prev버튼 클릭하면 앞으로 이동
	$('#prevButton').on('click',function() {
		if(movedIndex !=0) 		//첫번째가 아니라면
			movedIndex=movedIndex-1;		//인덱스값-1
		moveSlide(movedIndex);		//인덱스값 전달
	});
	
	//next버튼 클릭하면 뒤로 이동
	$('#nextButton').on('click',function() {
		if(movedIndex!=4)
			movedIndex=movedIndex+1;
		moveSlide(movedIndex);
	});
	
	//5초마다 자동으로 슬라이드 이동
	setInterval(function() {
		if(movedIndex!=4)
			movedIndex=movedIndex+1;
		else //오른쪽이면
			movedIndex=0;
		
		moveSlide(movedIndex);
	}, 5000);
	
	//각 컨트롤 버튼에 대해
	$('.controlButton img').each(function(index) {
		$(this).hover(
				function() {
					$(this).attr('src','image/controlButton2.png');
				},
				function() {
					$(this).attr('src','image/controlButton1.png');
				}
				);
		
		
	//클릭했을 때 현재 인덱스값을 moveSlide()함수에게 전달
		$(this).on('click',function() {
			moveSlide(index);
		});
		});
	
	});
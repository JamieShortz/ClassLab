function scrollAppear(){
	var textBlock = document.querySelector('.text-block');
	var textPosition = textBlock.getBoundingClientRect().top;
	var screenPosition = window.innerHeight;

	if(textPosition <screenPosition){
		textBlock.classList.add('text-appear');
	}
}

	window.addEventListener('scroll', scrollAppear);

function scrollAppear2(){
	var textBlock2 = document.querySelector('.text-block2');
	var textPosition = textBlock2.getBoundingClientRect().top;
	var screenPosition = window.innerHeight;

	if(textPosition <screenPosition){
		textBlock2.classList.add('text-appear');
	}
}

	window.addEventListener('scroll', scrollAppear2);

function scrollAppear3(){
	var textBlock3 = document.querySelector('.text-block3');
	var textPosition = textBlock3.getBoundingClientRect().top;
	var screenPosition = window.innerHeight;

	if(textPosition <screenPosition){
		textBlock3.classList.add('text-appear');
	}
}

	window.addEventListener('scroll', scrollAppear3);

function scrollAppear4(){
	var textBlock4 = document.querySelector('.text-block4');
	var textPosition = textBlock4.getBoundingClientRect().top;
	var screenPosition = window.innerHeight;

	if(textPosition <screenPosition){
		textBlock4.classList.add('text-appear');
	}
}

	window.addEventListener('scroll', scrollAppear4);
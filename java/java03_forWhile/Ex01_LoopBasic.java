package java03_forWhile;

//** 반복문 의 3요소 : 반복자의 초기값, 조건식(true or false), 증감식
//=> while, do while : 초기값(before while), 조건식(true or false => while 조건문), 증감식(in while) 		
//=> for : for(초기값; 조건식; 증감식)	

//** 반복자(iterator) 
//=> 반복문에서 횟수를 count 하는 변수

//** 변수 적용 범위 => 전역변수, 지역변수

public class Ex01_LoopBasic {

	public static void main(String[] args) {
		// Test 1)  기본형  : 1~100 까지의 합을 출력	
		// => 복습 : 100 ~ 1 까지로 변경하기 
		// => 1+2+3+4+......100
		//int result = 1+2+3+4+......100 ;
		// =>  result += 1~100   
		int result = 0;
		int i = 0;
		// for (int i=1; i<=100; i++) { => i 는 for 구문의 지역변수
		for (i=100; i>0; i--) { // => i 의 적용범위는 main 메서드  
			result += i ;
		} //for
		System.out.println("** For result1 => "+result);
		System.out.println("** For 종료후 i => "+i);
		
		// Test 1.2) 홀수의 합만 계산하기
		// => 방법1) for 구문 내에서 if 문으로 홀수 만 계산하도록 
		// => 방법2) 1부터 시작하고 2씩 증가 하도록
		
		// ** 방법1)
		result = 0;
		for (i=1; i<=100; i++) {  
			// if 문으로 i가 홀수인 경우만 계산하도록
			if ( i%2==1) result += i ;
		} //for
		System.out.println("** For 홀수의합 1 => "+result);
		
		// ** 방법2)
		// => 1부터 시작하고 2씩 증가 
		result = 0;
		for (i=1; i<=100; i++) { 
			//result += i+1 ;  // 논리적 오류 (i 의 값은 계속 1씩 증가함) => 5150
			result += i ;
			i++;
		} //for
		System.out.println("** For 홀수의합 2_1 => "+result);
		result = 0;
		for (i=1; i<=100; i+=2) { 
			result += i ;
		} //for
		System.out.println("** For 홀수의합 2_2 => "+result);
		
		// Test 2)  while : 1~100 까지의 합 출력 
		// => 초기값이 조건에 안맞으면 1회도 안함. 
		// => 복습 : 100 ~ 1 까지로 변경하기 
		result = 0;
		i=100; // result=0, i=101 출력
		while (i>0) {
			result += i ;
			i-- ;
		} // while
		System.out.println("** while result => "+result);
		System.out.println("** while 종료후 i => "+i);
		// Test3) do ~ while : 1~100 까지의 합 출력 
		// => 초기값이 조건에 안맞아도 1회는 시행함.
		// => 복습 : 100 ~ 1 까지로 변경하기 
		result = 0;
		i=100; // result=101, i=102 출력
		do {
			result += i ;
			i-- ;
		}while(i>0) ; 
		System.out.println("** do_while result => "+result);	
		System.out.println("** do_while 종료후 i => "+i);
		
	} //main
} // class

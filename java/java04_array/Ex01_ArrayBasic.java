package java04_array;

public class Ex01_ArrayBasic {

	public static void main(String[] args) {
		// 5명의 학생의 점수를 처리 한다고 가정
		int s1=10,s2=20,s3=30,s4=40,s5=50 ;
		int sum = s1+s2+s3+s4+s5;
		double avg = sum/5 ;
		
		// ** 배열 : 동일성격의 동일Type 의 자료를 하나의 묶음으로 처리 
		// 장점 => 일괄처리 (반복문적용)
		// 특징 => 동일타입, 모든 자료형에 적용가능
		// 방법
		// => 선언 후 사용 : 명시적선언, 묵시적선언		
		// => 크기(length), 인덱스(0 부터 length-1)
		
		// 1. 명시적 선언 (new 연산자 이용)
		// => 크기를 반드시 지정
		//int[] score = new int[5] ;
		
		int[] score ; // 변수명만 정의
		int len = 5 ;
		score = new int[len] ;
		// => write / read : 
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50 + score[3]; // 90
		score[1] += 20; // 20+20
		score[0] = score[1] + score[2]; // 40 + 30
		sum = score[0]+score[1]+score[2]+score[3]+score[4] ;
		
		// 2. 일괄처리 (반복문적용)
		sum=0;
		for (int i=0; i<score.length; i++) {
			sum+=score[i] ;
			System.out.println("학생"+(i+1)+"=>"+score[i]);
		}
		System.out.println(" sum => "+sum);
		System.out.println(" avg => "+(sum/score.length));
		
		// 3. 묵시적 정의
		// => new 연산자 사용하지않고, 선언과 동시에 초기화
		int[] score2 = {22,33,44,55,66,77,88} ;
		// => index 0 ~ 6 , length 7
		
		// 4. eachFor (쉬운,간단한 For)
		// for each 문 : JDK5.0 부터 지원되는 향상된 for 문 
		// for (변수타입 변수명 : 배열이름 ) { 실행부  }
		// => 배열의 요소의 갯수(배열의 크기) 만큼 반복 하며
		//    배열  score 가 가지고 있는 값을 순차적으로  변수(s) 에 전달 
		// => 주의사항
		//    배열의 값만 순차적으로 사용가능하며 read만 가능. write 불가능
		//    (순차처리, readOnly)	
		sum = 0 ;
		for (int s:score2) {
			sum+=s ;
			System.out.println("Score2 => "+s);
		}
		System.out.println("Score2, sum => "+sum);
		System.out.println("Score2, avg => "+(sum/score2.length));
		
	} // main

} //class

package j07_APITest;

// ** String 1
// 1) 선언(정의) 과 인스턴스
// => 목시적, 명시적
// => 참조형변수 : 주소값을 가지고 있음

public class Ex01_String01 {

	public static void main(String[] args) {
		// 1) 묵시적선언
		String s1 = "그린" ;
		String s2 = "그린" ;
		// 2) 명시적선언
		String s3 = new String("그린"); 
		String s4 = new String("그린"); 
		// 값 출력 비교
		System.out.printf("s1=%s, s2=%s, s3=%s, s4=%s \n",s1,s2,s3,s4);
		// => 값 변경후 Test
		s1="홍길동" ; s3="홍길동" ;  // 주소 : f , t, f
		s4="홍길동" ; // 주소 : f , t, t
		// 3) 주소 확인 비교
		if (s1==s2) System.out.println("s1 == s2 : true");
		else System.out.println("s1 == s2 : false");
		if (s1==s3) System.out.println("s1 == s3 : true");
		else System.out.println("s1 == s3 : false");
		if (s3==s4) System.out.println("s3 == s4 : true");
		else System.out.println("s3 == s4 : false");
		
		// 4) 값(리터럴) 의 비교 
		if (s1.equals(s2)) System.out.println("s1 equals s2 : true");
		else System.out.println("s1 equals s2 : false");
		
		if (s1.equals(s3)) System.out.println("s1 equals s3 : true");
		else System.out.println("s1 equals s3 : false");

		// 5) length(글자수) , 문자열연산
		s2 = "My Name is Green" ;
		s3 = "안녕하세요 !!!" ;
		System.out.println("영문 length => "+s2.length());
		System.out.println("한글 length => "+s3.length());
		int i=123, j=100;
		System.out.println("문자열연산 => "+s1+s2+s3+s4+i+j);
		System.out.println("문자열연산(우선순위) => "+s1+s2+s3+s4+(i+j));
		
	} //main
} //class

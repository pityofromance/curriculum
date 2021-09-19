package java01_basic;

public class Ex02_variable01 {
	
	public static void main(String[] args) {
		//변수(variable)와 상수(constant, 변하지 않는 고정값, 대문자로 표기)
		final double PI = 3.141592;//최종값 final 선언
		//pi = 31415;// 상수
		String job = "강사";
		String name = "엄미현";
		String 이름 = "가나다라"; //한글 변수명은 지원은 되나 쓰면 안됨 // 경로에는 영어만 있어야 원활
		int age = 20; //숫자열만 쌍따옴표 넣고 정수나 실수는 그냥 표기
		double weight = 45.5; //실수형 double
		boolean tf = false ; // 참거짓 불린
		String lang = "Java 조금/많이";
		
		job="학생";
		name="이현진";
		
	System.out.println("~~ Hello Java !!! ~~");
	System.out.println("~~안녕하세요~~"); // 문자열 연산
	System.out.println("* 직업 : "+job); // 문자열 연산
	System.out.println("* 이름 : "+name);
	System.out.println("* 나이 : "+age);
	System.out.println("* 몸무게 : "+weight);
	System.out.println("* 프로그램경험있다 :"+tf);
	System.out.println("* 사용언어 :"+lang);
	System.out.println("* 희망사항 : 개발자로 취업");
	System.out.println("* 한글변수명 Test : "+이름);

} //main

} //class


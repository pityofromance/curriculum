package j12_innerClass;

import j07_APITest.Ex04_Person;

// ** 클래스 맴버
// => 맴버(전역)변수, 
// => 메서드 : 생성자, main, setter/getter, toString, 일반메서드
// => 내부(inner) 클래스 : 클래스 내부에 다른 클래스를 정의

// ** Inner Class 기본형식과 특성

class Outerclass {
	// 1) 맴버(전역)변수
	int age = 100;
	private String name = "홍길동";
	static String grade = "A++"; 
	// ** 클래스 사용 : has-a 관계 , 변수로 정의 
	// => inner 클래스와 비교
	// => 재사용성이 많은 경우
	Ex04_Person person;
	
	// 2) 생성자
	Outerclass() { System.out.println("** Outerclass 기본생성자 **"); }
	// => 위 외에 메서드 : main, setter/getter, toString, 일반메서드 ..
	// 3) 클래스
	// => 내부(inner) 클래스
	// => 외부(outer) 클래스 의 모든맴버(private 포함) 에 접근 가능
	class Inner {
		static String country = "Korea" ;
		Inner() {System.out.println("** Innerclass 기본생성자 **");}
		public void printData() {
			System.out.println("* printData : age => "+age);
			System.out.println("* printData : name => "+name);
			System.out.println("* printData : grade => "+grade);
		} //printData()
	} //Inner
} // Outerclass

public class Ex01_innerBasic {

	public static void main(String[] args) {
		Outerclass out1 = new Outerclass(); 
		// => outer 클래스 만 생성
		// => inner 클래스 생성 
		Outerclass.Inner in1 = out1.new Inner() ;
		in1.printData();
		
		// Inner 클래스 직접 생성
		Outerclass.Inner in2 = new Outerclass().new Inner();
		in2.printData();
		
		// ** static 변수 Test
		System.out.println("* Outerclass.grade => "+Outerclass.grade);
		System.out.println("* Innerclass.country => "+Outerclass.Inner.country);
		
	} //main
} //class

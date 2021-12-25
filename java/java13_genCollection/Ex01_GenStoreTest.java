package j13_genCollection;

import j07_APITest.Ex04_Person;
import j07_APITest.Ex05_Student;

//------------------------------------------------------------
//** Generic
//=> 컬렉션(Collection:자료구조) 을 보강해준 기능
//=> 컴파일 단계에서 객체의 자료형을 선언(정의) 해주면
//   다른 타입의 자료가 저장될수 없도록 해주는기능

//** Generic 클래스 정의
//=> 클래스 이름 옆에 <> 사이에 알파벳 1글자를 사용하여 
//   Generic Type 명을 선언해줌 
//   ex : <T> 처럼 "<" 와 ">" 사이에 선언 
//=> 대문자로 T, E 등을 많이 사용 
//   Type 의미로 "T" 를 주로 사용
//=> Generic 타입으로 클래스를 사용한다는 의미 
//=> 제네릭으로 기본 자료형(int, float, double....)은 사용할 수 없지만
//   기본자료형의 wrapper 클래스를 이용할 수있다. 
//=> 실행 Test : Ex01_GenStoreTest.java

//** Generic 타입제한 (Wildcards_와일드카드타입 이용으로)
//=> <?>
//   Unbounded Wildcards (제한없음_모든 클래스나 인터페이스 타입 가능)
//=> <? extends ...>
//   Upper Bounded Wildcards (상위클래스 제한_같거나 하위 타입 가능)
//=> <? super ...>
//   Lower Bounded Wildcards (하위클래스 제한_ 같거나 상위타입 가능)
//------------------------------------------------------------

//** 1. 기존방식
// Object data = new String("Test");
// => 모든 클래스는 Object의 후손이므로 
//    우측에 사용되어 대입될수 있다
//    즉, 모든 클래스는 아래 setter의 매개변수가 될수있다
class Store {
	private Object data ;
	public void setData(Object data) { this.data=data; }
	public Object getData() { return this.data; } 
} //Store

//** 2. Generic 방식
//=> 클래스변수의 타입을 T(임의의 알파벳) 로 표현 해놓고
//   실행코드에서 결정해서 사용 
//=> 결정된 타입 이외에는 사용불가 ( Exception 발생 )
class StoreG<T> {
	private T data;
	public void setData(T data) { this.data=data; }
	public T getData() { return this.data; }
	// ** 생성자 추가하기
	StoreG() { }
	StoreG(T data) { this.data=data; }
} //StoreG

public class Ex01_GenStoreTest {

	public static void main(String[] args) {
		//** 1. 기존방식
		// => 컴파일 오류는 없으나 런타임 오류 가능성 매우 높음
		// => 어떤 타입으로든 대입이 가능하기 때문에 오류 발생확률이 매우 높음. 
		// => Object 에는 어떠한 Type의 클래스 인스턴스도 들어갈 수 있음
		// => 그러므로 Compile Time 에는 실제 들어있는 값과 무관하게
		//	  형변환하여도 오류가 발생하지 않음 
		// => 그러나 아래의 경우처럼 스트링은 Integer화 될수없기 때문에
        //	  런타임오류발생 : ClassCastException
		// => 이러한 상황을 방지하기위해 사용시에 Type을 결정하여,
		//	  Compile Time에 오류를 알 수 있도록 하기위한 방법이 Generic 
		Store s1 = new Store();
		s1.setData("짜장면");
		s1.setData(new Ex04_Person());  
		s1.setData("12345"); 
		s1.setData(12345); // Integer
		s1.setData(123.456); // Double 
		// int : 모든 기본자료형 -> Integer (자동형변환)
		// double -> Double (자동형변환)
		s1.setData("홍길동");
		String s = (String)s1.getData(); // OK
		//Integer i = (Integer)s1.getData(); 
		// => java.lang.ClassCastException : 오류 (그러나 컴파일오류 없음)
		System.out.println("** 1. 기존방식 : s,i =>"+s);
		
		//** 2. Generic 방식
		// 2.1) T : String
		// ** 생성
		// => 생성시 Generic Type 생략가능(경고) 하지만,
		//    Generic 이 적용안됨 (기존방식처럼 작동됨)
		StoreG sg = new StoreG(); 
		sg.setData("nonGeneric 처럼 작동됨");
		sg.setData(12345);
		sg.setData(new Ex04_Person());
		StoreG<String> sg1 = new StoreG<String>();
		sg1.setData("홍길동");
		//sg1.setData(123.456); // Type 안맞으면 컴파일 오류 
		System.out.println("2.1) T : String => "+sg1.getData());
		
		// 2.2) T : Integer
		StoreG<Integer> sg2 = new StoreG<Integer>();
		//sg2.setData("12345"); // 컴파일 오류
		sg2.setData(12345);
		System.out.println("2.2) T : Integer => "+sg2.getData());
		
		// 2.3) T : Person
		StoreG<Ex04_Person> sg3 = new StoreG<Ex04_Person>();
		sg3.setData(new Ex04_Person("090909-3123456","홍길순"));
		System.out.println("2.3) T : Person => "+sg3.getData());
		
		// 2.4) T : Student
		// => 생성자로 초기화 
		//   ( StoreG에 생성자를 추가하고 작성 하세요 )  
		StoreG<Ex05_Student> sg4 = new 
				StoreG<Ex05_Student>(new Ex05_Student("990314-2039444","Apple", 90, 88));
		System.out.println("2.4) T : Student => "+sg4.getData());

	} //main

} //class

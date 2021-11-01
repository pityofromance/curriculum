package j06_classExtends;

import java.util.Arrays;

//** 자바의 상속 
//=> 다중 상속은 허용 하지 않음.
//=> 계층적으로 계속 상속받는 것은 제한 없음. 
//=> 조상은 Default 생성자가 있어야 함.

//** 메서드 오버라이딩
//=> 조상의 메서드를 재정의

//** static , final
//=> 맴버변수, 맴버메서드 , 클래스(final)

//public final class Ex03_01Father {
//=> 상속 불가능 (단종 클래스 , String)

//** 접근제어
//=> private 은 클래스내 에서만 사용가능함
//=> protected : default(패키지 범위) + 상속

public class Ex03_01Father {
	// 맴버변수
	static String country = "Korea" ;
	String name ;
	private int money;
	
	// 생성자
	public Ex03_01Father() {System.out.println("** Father Default 생성자 **");} 
	
	Ex03_01Father(String name, int money) {
		System.out.println("** Father name, money 초기화 생성자 **");
		this.name=name;
		this.money=money;
	} 
	// 메서드
	// => static, 일반, final
	public static void staticTest(String name) {
		System.out.println("** Static Method Test name1 : "+name);
		//System.out.println("** Static Method Test name2 : "+this.name);
		// => static 메서드에서 this, super 를 이용한 접근 불가능
		// => 매개변수로 인스턴스를 전달받아 접근하는것은 가능함
		System.out.println("** Static Method Test country : "+country);
	}
	public void info() {
		System.out.printf("** Father info : %s, name=%s, money=%d \n", country, name, money);
	}
	// ** 메서드 오버라이딩 금지 가능
	// => final
	public final void bank(int money) {
		this.money+=money;
		System.out.println("** Father Total Money = "+this.money);
	}
	// ** main OverLoad Test
	// => 허용은 되지만 바람직하지않음 
	public static void main(String name, int i) {
		System.out.println(" main OverLoad Test => "+ name);
	}
	
	public static void main(String[] args) {
		// ** main 매개변수 args 활용
		System.out.println("** main 매개변수 args => "+Arrays.toString(args));
		
		// 1) default 생성자
		Ex03_01Father f1 = new Ex03_01Father();
		f1.name="홍길동" ;
		f1.money=1000;
		f1.info();
		f1.bank(5000);
		country="대한민국" ;
		f1.info();
		
		// 2) 초기화 생성자
		System.out.println("** 초기화 생성자 **");
		Ex03_01Father f2 = new Ex03_01Father("김길동",7000);
		f2.bank(-1500);
		f2.info();
		
		// 3) static Test
		country="고구려" ;
		f1.info();
		f2.info();
		staticTest(f1.name);
		staticTest(f2.name);
		
		// 4) main OverLoad Test
		main("하하하",100);

	} // main
} //class

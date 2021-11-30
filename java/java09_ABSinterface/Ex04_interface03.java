package j09_ABSinterface;

//** interface 3
//=> 상수, 추상메서드
//=> static, default 메서드 (구현부가 있는 메서드, Java8 부터 추가됨)

interface NewInter {
	// 추상메서드 : 반드시 헤더만 정의, 구현(바디)부는 없어야함 
	void test();  // public abstract 생략
	
	// static, default
	// => 반드시 바디를 구현 해야함
	// => 구현클래스의 오버라이딩 의무 없음
	// static void staticTest(); XXXXXXX
	static void staticTest() {
		System.out.println("** interface : staticTest() **");
	}
	// default void defaultTest(); XXXXXX
	// default 는 인터페이스에서만 허용, 오버라이딩은 가능 (의무는 아님)
	default void defaultTest() {
		System.out.println("** interface: defaultTest() **");
	}
} //NewInter 

class NewTest  implements NewInter {
	@Override
	public void test() {
		System.out.println("** Override test() **");
	}
	// ** static
	// => 클래스 또는 인터페이스 종속이므로 동일 메서드명 허용됨
	static void staticTest() {
		System.out.println("** NewTest : staticTest() **");
	}
	
	// ** default : interface 에서만 허용
	// => default 없이 오버라이딩은 허용
	// => 오버로드 허용됨
	@Override
	public void defaultTest() {
		NewInter.super.defaultTest(); // 조상이 interface 인경우 접근방법
		//super.defaultTest();
		System.out.println("** NewTest : Override defaultTest() **");
	}
	void defaultTest(int i) {
		System.out.println("** NewTest : defaultTest(i) **"+i);
	}
	
} // NewTest

public class Ex04_interface03 {

	public static void main(String[] args) {
		// 1) 클래스 인스턴스 생성
		NewTest n1 = new NewTest() ;
		n1.test();
		n1.defaultTest();  // 오버라이딩 Test
		// default 
		// => interface 에 정의된 non_static 인스턴스로 접근 가능 
		NewInter.staticTest();
		// static 메서드는 클래스 또는 인터페이스 종속
		// => 상속 되지 않음
		// => 인터페이스의 static 메서드는 인터페이스명으로만 접근 가능 
		
		// 2) NewInter 에 메서드 추가후 
		n1.defaultTest(0);  // 오버로드 메서드
		NewTest.staticTest();
		
		// 3) NewInter Type 으로 생성
		NewInter n2 = new NewTest();
		// interface 에 정의된 만큼 n2 로는 접근가능\
		// 그러나 static 은 접근가능
		n2.test();
		n2.defaultTest();
		NewInter.staticTest();
		NewTest.staticTest();
	
	} //main
} //class

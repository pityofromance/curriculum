package j09_ABSinterface;

class MyinterChild1 implements Ex02_MYinterface {
	// ** 오버라이딩
	// => 반드시 조상의 접근범위보다 같거나 넓어야함 
	@Override
	public int getNum() { return NUM; }
	
	void child1() { System.out.println("** Child1 method Test **"); }
}//MyinterChild1

class MyinterChild2 implements Ex02_MYinterface {
	@Override
	public int getNum() { return NUM*NUM; }
	
	void child2() { System.out.println("** Child2 method Test **"); }
} //MyinterChild2

public class Ex02_interface01 {

	public static void main(String[] args) {
		// interface 생성
		// => 직접생성은 불가능
		//Ex02_MYinterface in1 = new Ex02_MYinterface() ;
		// => 인스턴스의 Type 으로는 정의가능, 구현클래스를 통해 생성됨
		// => 그러나 사용범위는 interface 에 정의된 만큼만
		Ex02_MYinterface in1 = new MyinterChild1();
		System.out.println(" main in1 => "+in1.getNum());
		
		MyinterChild1 ch1 = new MyinterChild1() ;
		System.out.println(" main ch1 => "+ch1.getNum());
		ch1.child1();
		
		// ** interface 의 특징
		// MyinterChild1 , MyinterChild2 은 서로 관련이 없지만,
		// 동일 인터페이스를 구현했기때문에 같은 계층구조로 묶을 수 있게됨
		// => 다형성 적용가능
		in1 = new MyinterChild2();
		Ex02_MYinterface in2 = new MyinterChild2();
		System.out.println(" main in2 => "+in2.getNum());
	} //main

} //class

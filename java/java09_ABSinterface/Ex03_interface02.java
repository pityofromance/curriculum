package j09_ABSinterface;

//** interface II.
//1) 인터페이스와 인터페이스 관계
//=> 인터페이스 간의 상속(extends) 가능.
//=> 다중상속(부모 여러개 허용), 계층적 상속 모두 가능 

//2) 클래스 와 인터페이스 관계
//=> 다중 구현(implements) 가능
//=> 클래스가 클래스를 상속(extends) 받으면서 동시에
//   인터페이스를 구현(implements, 다중구현도 포함) 하는것 가능 
//** 그러므로 자바는 다중상속이 안되는점을 극복 가능함 

interface Inter1 {
	float PI = 3.1415f;  // public static final 생략
	int getA(); // public abstract 생략	
}
interface Inter2 { int getB(); }
interface Inter3 extends Inter1, Inter2 { float getC(); }

// ** 복수의 interface 를 다중구현 클래스
//class IntMul1 implements Inter1, Inter2, Inter3 {
class IntMul1 implements Inter3 {	
	int a=123, b=200 ;
	@Override
	public int getA() { return a; }
	@Override
	public int getB() { return b; }
	@Override
	public float getC() { return (a+b)*PI; }
} //IntMul1

// ** 클래스 extends 와 interface 동시 구현 가능
class Add { 
	int addNum(int a, int b) { return a+b; } 
} // Add

class IntMul2 extends Add implements Inter1, Inter2, Inter3 {	
	int a=123, b=200 ;
	@Override
	public int getA() { return a; }
	@Override
	public int getB() { return b; }
	@Override
	public float getC() { return addNum(a,b)*PI; } 
} //IntMul1

public class Ex03_interface02 {
	public static void main(String[] args) {
		// ** Test1
		IntMul1 in1 = new IntMul1();
		// => 다형성 적용 : Inter3 은 무관 (Inter1 , Inter2 를 포함하고 있으므로 )
		//Inter3 in1 = new IntMul1(); // Inter1 in1 = .. or Inter2 in1 =.. : 오류
		System.out.printf("in1=> getA=%d, getB=%d, getC=%f \n",in1.getA(),in1.getB(),in1.getC());
		
		// => instanceof 확인 후에 적용하기
		if (in1 instanceof Inter1) System.out.println(" in1 은 Inter1 입니다 ");
		else System.out.println(" in1 은 Inter1 이 아닙니다 ");
		
		// ** Test2
		IntMul2 in2 = new IntMul2();
		System.out.printf("in2=> getA=%d, getB=%d, getC=%f \n",in2.getA(),in2.getB(),in2.getC());
		// => instanceof 확인
		//    extends, implements 모두 확인 & 비교
		if (in2 instanceof Inter1) System.out.println(" in2 은 Inter1 입니다 ");
		else System.out.println(" in2 은 Inter1 이 아닙니다 "); 
		
		if (in2 instanceof Add) System.out.println(" in2 은 Add 클래스 입니다 ");
		else System.out.println(" in2 은 Add 클래스 가 아닙니다 ");
		// ** Inter1 과 무관한 Add 클래스를 비교
		// => 컴파일 오류 없고, 런타임시에 비교 결과(적합성 여부) 알려줌
		//    Inter1 test = new Add() ; 성립될 수 없음을 확인
		if (new Add() instanceof Inter1 ) System.out.println(" Add 인스턴스는 Inter1 입니다 ");
		else System.out.println(" Add 인스턴스는 Inter1 이 아닙니다 ");
		
	} //main
} //class

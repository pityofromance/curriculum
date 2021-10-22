package j05_classMethod;

//** 맴버 메서드 (method) : 함수(Function), 프로시져(Procedure)
//J06_  15,16 p
//1) 정의 , 실행
//2) 매개변수
//=> 매개변수(Argument, 인자), Parameter
//=> 메서드의 지역변수이며, 모든 타입 가능
//=> 매개변수의 값 전달방법
//   CallByValue (기본자료형, String, 매개변수의 값 전달)
//   CallByReference (참조자료형,배열... 주소전달)   
//3) return 값
//=> return 이 있으면 Type 을 지정, 없으면 무조건 void  
//=> 메서드 실행결과 return Type에 해당하는 결과값을 제공
//=> return 명령어를 void 메서드 에서 사용하면 메서드 종료

public class Ex02_Method {
	
	// ** Test 1) 메서드 정의(4종류), 사용
	// ** Test 3) return
	
	int price = 5000; // 맴버(전역) 변수
	
	// 1) 매개변수, return 값 없음
	public void juiceMachine1() {
		System.out.println(" 무슨 쥬스를 원하십니까 ? ");
	} //juiceMachine1
	
	// 2) 매개변수는 있고, return 값 없음
	public void juiceMachine2(String s, int n) {
		if (s.contains("불량")) {
			System.out.println(s+"는 쥬스를 만들 수 없습니다~~");
			return; // 요기서 메서드 종료
		}
		System.out.println(s+" 쥬스를 "+n+"잔 주세요 ");
	} //juiceMachine2
	
	// 3) 매개변수는 없고, return 값 있음
	public String juiceMachine3() {
		 return " 쥬스 1잔 가격은 "+price+"원 입니다.";
	} //juiceMachine3
	
	// 4) 매개변수 있고, return 값도 있음
	// => 총매출액 return
	public int juiceMachine4(String s, int n) {
		s+= "+복숭아" ;  // CallByValue Test
		System.out.println(s+" 쥬스 "+n+"잔 주문");
		return n*price ; 
	} //juiceMachine4
	
	// 5) 참조자료형 Test
	// => 매개변수 있고, return 값도 있음
	public int carTest(Ex01_Car car, int speed) {
		System.out.println("** carTest car => "+car);
		System.out.println(" inMethod color => "+car.color); // Yellow
		car.color="Black" ;
		return  speed*10;
	}

	public static void main(String[] args) {
		
		// 인스턴스 변수 사용연습
		//price = 7000; // 인스턴스 없이 사용 불가능
		Ex02_Method mTest = new Ex02_Method() ;
		mTest.price = 7000; // 인스턴스를 통해 접근가능
		mTest.juiceMachine1();
		mTest.juiceMachine2("불량 Orange", 10);
		System.out.println("juiceMachine3 => "+mTest.juiceMachine3());
		
		// ** Test 2) 매개변수 전달
		// 2.1) CallByValue (기본자료형, 매개변수의 값 전달됨) 
		String s = "딸기" ;
		System.out.println("juiceMachine4 => "+mTest.juiceMachine4(s,5));
		System.out.println(" after s => "+s); // 딸기  /  딸기+복숭아 ?
		
		// 2.2) CallByReference (참조자료형 , 주소값을 전달)
		Ex01_Car myCar = new Ex01_Car() ;
		int speed = 300;
		myCar.color="Yellow" ;
		System.out.println("CallByReference Test1 => "+mTest.carTest(myCar,speed));
		System.out.println("CallByReference Test2 => "+mTest.carTest(new Ex01_Car(),speed));
		// 매개변수 위치에서 바로 생성해도 됨 -> Car 를 일회성 매개변수로만 사용하는 경우 적당
		System.out.println(" after color => "+myCar.color);  // Black
		
	} //main
} //class

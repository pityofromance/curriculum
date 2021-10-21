package java05_classMethod;

// ** Car 의 사용자클래스 (UserClass) 

public class Ex01_CarUse {

	public static void main(String[] args) {
		// ** 객체일생
		// => 생성 -> 사용 -> 소멸
		// => 생성: 인스턴스화 한다 또는 인스턴스를 생성한다 라고함
		Ex01_Car myCar = new Ex01_Car();
		myCar.color="Pink";
		myCar.mileage=5000;
		myCar.speed=200;
		myCar.speedUp();
		//System.out.println("** MyCar => "+myCar.toString());
		System.out.println("** MyCar => "+myCar);
		// toString() : 클래스에 toString() 메서드를 작성해놓으면 
		//              출력문에서 인스턴스명을 사용했을때 자동 호출됨
		//              클래스의 속성값들을 편리하게 출력해줌
		// toString() 메서드가 없는경우 
		// => myCar : 주소출력 j05_classMethod.Ex01_Car@379619aa
		
		Ex01_Car uCar = new Ex01_Car();
		uCar.color="Blue";
		uCar.mileage=3000;
		uCar.speed=150;
		uCar.speedDown();
		System.out.println("** UCar => "+uCar.toString());
		// 소멸 : 메모리 청소 (가비지콜렉터 Garbage Collector : 쓰레기수집기)
		myCar=null; 
		System.out.println("** MyCar nullTest => "+myCar);
		//myCar.speedUp(); // NullPoint Access 경고
		// => 실행시에는 java.lang.NullPointerException 발생
		
		myCar = uCar ;
		System.out.println("** MyCar 대입연산Test => "+myCar);
		System.out.println("** UCar 대입연산Test => "+uCar);
		System.out.println("** 대입연산 Color Test => "
					+myCar.color+" , uCar.color => "+uCar.color);
		
	} //main
} //class

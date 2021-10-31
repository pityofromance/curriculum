package j06_classExtends;

//** 상속 : extends
//=> 기능을 확장해서 업그레이드 버젼 만듦.
//=> 기존(조상) 클래스의 맴버들(필드와 메소드)을 재사용 & 일부변경도 가능 

//** 생성순서
// => JVM은 extends 키워드가 있으면 조상생성후 후손생성
//    이때 기본은 조상의 default 생성자를 실행하고,
//    특별히 후손 생성자에서 조상생성자_super(...)를 호출해 놓으면 그생성자를 실행함.
// => 상속을 허용하는 클래스는 default 생성자를 반드시 작성하는것이 바람직함.

//** 조상 : Super (Parent, Base) class  
//=> super.  : 조상의 인스턴스를 의미 (조상의 맴버에 접근 가능)
//=> super()
//   조상의 생성자를 의미 (조상의 생성자에 접근 가능).
//   this() 처럼 생성자 메서드 내에서 첫줄에 위치해야함.
//   * 생성자메서드_super(), this() 호출은 생성자 내에서만 가능 

//** 후손 : Sub ( Chiled, Derived [diráivd] ) class
//=> super class 를 포함 

class Car {
	public int speed ;
	public int mileage = 1000;
	public String color;
	
	public Car() {
		super(); // 생략가능
		System.out.println("** Car Default 생성자 **");
	}
	public Car(int speed, int mileage, String color) {
		super();
		this.speed = speed;
		this.mileage = mileage;
		this.color = color;
		System.out.println("** Car 맴버초기화 생성자 **");
	}
	
	public void speedUp() {
		speed+=100;
	} //speedUp()
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", mileage=" + mileage + ", color=" + color + "]";
	}
} //Car

// ** Child Class
class SportsCar extends Car  {
	int turbo ;
	//int mileage = 5000 ;
	
	public SportsCar() {
		System.out.println("** SportsCar Default 생성자 **");
	}
	public SportsCar(int turbo, int speed, int mileage, String color) {
		// this.speed=speed; // this : child 클래스에 동명의 변수가 없으면 조상맴버변수에 접근가능 
		// super.speed=speed; // super : Super 클래스 인스턴스를 가리킴
		// 조상의 생성자 호출가능 : super(...) 
		// => 반드시 첫줄에 위치해야함.
		super(speed, mileage, color); 
		this.turbo=turbo;
		System.out.println("** SportsCar 맴버초기화 생성자 **");
	}
	public void varTest(int speed) {
		System.out.println("** varTest mileage => "+mileage);
		System.out.println("** varTest this.mileage => "+this.mileage);
		System.out.println("** varTest super.mileage => "+super.mileage);
	} //varTest
	
	public void turboSpeedUp() {
		// speedUp 후 add 하기
		// => 조상의 맴버 speed, speedUp() 에 접근가능
		speedUp();
		turbo+=speed;
	} //speedUp()
	
	@Override
	public String toString() {
		return "SportsCar [turbo=" + turbo + ", speed=" + speed + ", mileage=" + mileage + ", color=" + color + "]";
	}
} // SportsCar

public class Ex01_CarTest {

	public static void main(String[] args) {
		// Car Test
		Car car = new Car(100,20000,"Red");
		car.speedUp();
		System.out.println(car);
		
		// SportsCar Test
		// 1) default 생성자 이용
		System.out.println("** SportsCar Test **");
		SportsCar sCar1 = new SportsCar() ;
		// => 생성후 변수값 초기화
		sCar1.color="Blue" ;
		sCar1.mileage=30000;
		sCar1.speed=300;
		sCar1.turbo=50;
		sCar1.turboSpeedUp();
		System.out.println(sCar1);
		
		// 2) 맴버초기화 생성자 이용
		SportsCar sCar2 = new SportsCar(70, 500, 50000, "Yellow") ;
		System.out.println(sCar2);
		
		// 3) varTest
		SportsCar sCar3 = new SportsCar();
		sCar3.varTest(10000);

	} //main

} //class

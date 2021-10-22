package j05_classMethod;

// ** 생성과정
// => new 연산자가 해당되는 클래스를 메모리에 로드해서 생성함.
// => 이때 생성직후 생성자메서드를 호출함

//** 생성자(Contructor) 메서드
// => 클래스와 이름 동일하고, return 값이 없음. (void 조차도 생략됨)
//    그러나 매개변수는 갯수, Type 제한 없음
// => 생성시에 단한번 호출가능 
// => 한 클래스의 생성자는 여러개 가능 (생성자 오버로딩) 
// => 생성자를 작성하지 않으면 컴파일러가 자동으로 기본생성자를 만들어줌(Default Contructor)
//    (단, 하나라도 생성자 메서드를 작성하면 deafult 생성자는 자동으로 만들어지지않음)
	
// ** 생성자 메서드에서 생성자 메서드 호출 가능 
// => this(?,?,...)
// => this(...) 은 반드시 생성자 메서드 내에서 첫줄에 위치해야함.

class Car {
	int speed ;
	String color;
	
	// ** 생성자 메서드
	// 1) 기본생성자 (Default Contructor)
	// => 매개변수 없음
	Car() { System.out.println("** Default Contructor **"); }
	// 2) 매개변수 1개 를 초기화 하는 생성자
	// => 생성자 내에서 생성자 호출 가능 : this(...) 
	Car(int speed) { 
		this(speed,null); // 반드시 첫줄에 위치해야함.
		//this.speed=speed;
		System.out.println("**Contructor speed => " + speed);
	}
	Car(String color) {
		this(0, color);
	}
	// 3) 매개변수를 모두 초기화 하는 생성자
	Car(int speed, String color) {
		this.speed=speed;
		this.color=color;
	}
	void speedUp() {
		speed+=10;
	} //speedUp

	// 자동완성 하기 : 우클릭,단축메뉴 - Source - Generate toString() ..
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
} //Car

public class Ex04_Constructor {

	public static void main(String[] args) {
		// 1) Contructor Test
		Car c1 = new Car() ;
		System.out.println(" Car1 => "+c1);
		Car c2 = new Car(500) ;
		System.out.println(" Car2 => "+c2);
		Car c3 = new Car("White") ;
		System.out.println(" Car3 => "+c3);
		Car c4 = new Car(1000, "White") ;
		System.out.println(" Car4 => "+c4);
		
		// 2) 배열에 적용
		// => Car 5개를 가진 cars 배열 정의하기 & 초기화
		int[] nums = {1,2,3,4,5,6};
		Car[] cars1 = {c1, c2, c3, c4, new Car(3000,"Pink")} ;
		
		Car[] cars2 = new Car[5] ;
		cars2[0] = new Car(100,"Red");
		cars2[1] = new Car(110,"Green");
		cars2[2] = new Car(120,"Blue");
		cars2[3] = new Car(130,"Gray");
		cars2[4] = new Car(140,"Lime");
		// => 출력
		System.out.println("** Car 배열출력 Test **");
		for ( Car c:cars2 ) {
			c.speedUp();
			System.out.println(c);
		}
		// 비교
		for (int i=0; i<cars1.length; i++) {
			cars1[i].speedUp();
			System.out.println("cars1=> "+cars1[i]);
		}
		
	} //main

} //class

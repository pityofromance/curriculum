package j09_ABSinterface;

//** 추상 클래스 
//=> J10 , 3page
//=> 추상메서드가 하나라도 정의되면 그 클래스는 반드시 추상클래스로 정의 해야 함 
//=> 직접 인스턴스를 생성하지 못함. ( new 사용불가 )
//   그러나 참조형 변수(인스턴스)의 타입으로 선언은 가능하다.
//   그리고 후손으로 인스턴스를 생성할 수 있음. 

//** 추상 메서드
//=> Body 부분이 없고 Header 만 선언
//=> 앞쪽에 abstract, 매개변수 뒤에 ; 붙여야됨.
//=> Body 부분은 Child 클래스에서 반드시 재정의(오버라이딩) 해야 함.
//   ( 실행문이 없어도 공백으로 작성해야함 -> { } )
//=> 추상 메서드 목적 : 후손에게 오버라이딩 의 강제성을 부여 (메서드명의 통일성)

//** 다형성 적용
//=> 조상의 타입 으로 변수 선언, 후손의 타입으로 인스턴스 생성
//=> 조상에 정의된 범위내에서만 후손의 맴버 사용가능
//=> 후손의 타입에 따라 다양한 형태로 실행됨 
	
//** 다형성 적용의 장점
//=> 계층구조에서 일괄 작업 가능 (개발 및 유지보수의 효율을 높여줌)
//=> 실행시 클래스의 교체가 간편

//** instanceof 연산자
//=> A(Object) instanceof B(Class, Interface) 형태로 사용
//   즉 A위치에는 Object(인스턴스), B 위치에는 클래스 나 인터페이스

//=> A Object를 B 클래스나 인터페이스로 캐스팅이 가능한것인지를 확인하는 연산자
//   즉,명시적 형변환이 가능한지를 묻는 연산자 임.	
//   A 인스턴스가  B클래스 의 집안에 해당 되는지 (상속관계인지) 묻는 연산자 
//=> true / false  

//=> 따라서 B가 클래스일 경우에는 A가 반드시 B클래스와 상속관계에 있어야만 유효하며
//   상속관계가 없을 경우 캐스팅이 불가능하기에 컴파일 타임 에러 발생  
//   (왜냐하면 컴파일 타임에 내부적으로 캐스팅 처리를 해야 하기 때문) 
//=> 그러나 B가 인터페이스라면 컴파일 타임 에러는 안 나지만 런타임 에러 발생

abstract class Animal {
	String kind ;
	// 생성자 : 작성해도 오류는 없지만 생성이 가능해지는것은 아님 
	Animal() { } 
	
	// 일반 메서드 : 후손에 구현(Override) 의무 없음
	void breath() { System.out.println(kind +" 는 숨을 쉽니다 ~~"); }
	
	// 추상메서드
	// => 후손에 구현(Override) 의무 있음
	// => 추상메서드를 하나라도 가진 클래스는 추상 클래스로 정의 해야함
	abstract void sound();
	abstract void special();
} //Animal

class Cat extends Animal {
	Cat() { kind="고양이" ; }
	@Override
	void sound() { System.out.println(" 야옹 야옹 웁니다 ~~"); }
	@Override
	void special() {System.out.println(" 고양이는 eye color 가 멋집니다 ~~");}
	
	void eyeColor() { System.out.println(" OLD : 고양이는 eye color 가 멋집니다 ~~"); }
	// ** 조상에 없는 메서드는 다형성에 적용할 수 없음 -> 불편
	// => 일원화 하기 위해 Animal 에 special() 를 추가함 
} //Cat

class Dog  extends Animal {
	Dog() { kind="강아지"; }
	@Override
	void sound() { System.out.println(" 멍~ 멍~ 짖어요 ~~"); }
	@Override
	void special() {System.out.println(" 강아지는 빠릅니다 ~~");}
	void speed() { System.out.println(" OLD : 강아지는 빠릅니다 ~~"); }
} // Dog
class Eagle extends Animal {
	Eagle() { kind = "독수리" ; }
	@Override
	void sound() { } // 내용이 없어도 반드시 body 부분구현
	@Override
	void special() {System.out.println(" 독수리는 훨훨 날아요~~");}
	void flying() { System.out.println(" OLD : 독수리는 훨훨 날아요~~"); }
} //Eagle

class Bear {
	void breath() { System.out.println(" 곰은 을 쉽니다 ~~"); } 
	void sound() { System.out.println("곰~곰 곰~~"); }
	void tree() { System.out.println(" 곰은 크지만 나무를 잘 탑니다 "); }
} //Bear

public class Ex01_AbsAnimal {

	public static void main(String[] args) {
		// ** 추상클래스 Animal 생성 확인
		// => 추상 클래스는 직접 인스턴스를 생성할 수 없다.
		//    그러나 인스턴스의 타입으로는 정의 가능하고, 후손으로 생성함.
		//    이때 이 인스턴스의 접근범위는 조상에 정의된 만큼만 가능
		//Animal animal = new Animal(); // XXXXXX
		
		System.out.println("** Animal:다형성적용 Test **");
		// ** 다형성 적용
		// => 우측의 생성자만 교체하면 쉽게 클래스 교체 가능
		// => 코드 내에서 조상의 정의된 맴버만 사용 했다는 의미
		Animal animal = new Dog();  // Cat(); Dog(); Eagle(); 변경하면 클래스교체 용이 
		animal.breath();
		animal.sound();
		animal.special();
		//animal.speed(); //  XXX speed() is undefined Error
		
		animal = new Eagle();
		animal.breath();
		animal.sound();
		animal.special();
		
		animal = new Cat();
		animal.breath();
		animal.sound();
		animal.special();
		
		// ** 메서드로 다형성 Test 
		animalUse(animal) ;     // OK
		//animalUse(new Cat()) ;  // OK
		
		Bear bear = new Bear();
		bear.breath();
		bear.sound();
		bear.tree();
		// animalUse(new Bear()) ; // Error => 사용여부를 확인해주는 연산자 instanceof
		//if ( bear instanceof Animal ) animalUse(bear) ;
		/// => 컴파일 오류 발생
		//  => 그러나 비교대상(Animal) 이 인터페이스라면 컴파일 오류 발생하지 않고,
		//     런타임 오류 발생 그래서 확인이 필요함  
		
		// ** Object Type 메서드 Test
		animalUse(bear); // 오류 없음
		animalUse((Object)animal);
		
		// ** 배열 Type 메서드 Test
		// => Animal Type 의 배열 정의 후 매개변수로 사용  
		Animal[] animals = {animal, new Dog(), new Eagle()}; // new Bear() -> Type mismatch 
		animalUse(animals);
		
		// Test1.
		System.out.println("** Test 1 **");
		Cat cat = new Cat();
		cat.breath();
		cat.sound();
		cat.eyeColor();
		
		animalUse(cat) ;
		// Animal cat = new Cat() ;
		
		Dog dog = new Dog();
		dog.breath();
		dog.sound();
		dog.speed();
		
		Eagle eagle = new Eagle();
		eagle.breath();
		eagle.sound();
		eagle.flying();
		
		// Test2.
		System.out.println("** Test 2 **");
		Animal an1 = new Cat();
		an1.breath();
		an1.sound();
		Animal an2 = new Dog();
		an2.breath();
		an2.sound();
		Animal an3 = new Eagle();
		an3.breath();
		an3.sound();		
	} //main
	
	// *** 메서드 오버로드
	// => 매개변수 Type:  Animal, Object, Animal 배열
	public static void animalUse(Animal[] ans) {
		for (Animal an : ans) {
			an.breath();
			an.sound();
			an.special();
		}
	}
	public static void animalUse(Animal an) {
		an.breath();
		an.sound();
		an.special();
	}
	public static void animalUse(Object ob) {
	// 매개변수로 모든 클래스를 전달받을 수 있지만
	// Object 클래스에 정의된 만큼만 실행가능 	
		System.out.println("** Your Address => "+ob);
	}

} //class

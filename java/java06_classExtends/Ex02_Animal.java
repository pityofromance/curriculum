package j06_classExtends;

// ** Java 의 상속의 특징
// => 계층적으로 다중 상속이 가능하고 제한이 없음.
// => 그러나 다중 상속은 안된다 ( 부모는 무조건 1개의 클래스만 허용 )
//    class WildAnimal extends Mammal , Reptile {  -> XXXXXX

// Animal
// => Mammal (String cry, crying)  , 
//    Reptile ( swimming ) 
// => WildAnimal ( allPrint ) , PetAnimal ( infoPrint() )

// ** final
// => class : 종단클래스 (상속불가)
// => method : 재정의(Override) 금지
// => 필드 : 상수

class Animal {
	static int legs=1;
	String name;
	Animal() { System.out.println("** Animal default 생성자 **");
	}
	void breath() {	System.out.println(name+"은(는) 숨을 쉬고 다리는 "+legs+"개 입니다.");
	}
} //Animal
//---------------------------------
class Mammal extends Animal {
	String cry;
	int legs=2;
	Mammal() { System.out.println("** Mammal default 생성자 **");
	}
	void crying() { System.out.println(name+"은(는) "+cry+" 웁니다 ~~");
	}
} //Mammal
class Reptile extends Animal {
} //Reptile
//---------------------------------

//class WildAnimal extends Mammal , Reptile {
// => 다중 상속 불허
class WildAnimal extends Mammal {
	WildAnimal() { System.out.println("** WildAnimal default 생성자 **");
	}
	
	// ** 조상인 Animal에 있는 메서드와 동명의 메서드 작성 
	// => 메소드 재정의 (method overriding)
	// => 조상메서드 + 기능추가
	// => 메서드 오버로드 와 구별
	//    Overload: 한클래스내, 매서드명은 같고, 매개변수의 갯수 또는 Type이 반드시 달라야함 
	//    Override: 상속관계, 매개변수, 리턴타입, 매서드명 이 조상메서드와 같아야함
	@Override
	void breath() {
		super.breath();
		System.out.println("WildAnimal은 숨을 쉬어야만 삽니다.");
	}
	
	void allPrint() {
		//super.breath();
		breath();
		crying();
		System.out.printf("%s legs => Local:%d, Global_Pet:%d, Parent_Mam:%d, Animal:%d"
				, name, legs, this.legs, super.legs, Animal.legs);
					//=>  2,  2,  2,  1
	}
} //WildAnimal 
class PetAnimal extends Mammal {
	int legs=3;
	PetAnimal() { System.out.println("** PetAnimal default 생성자 **");
	}
	void checking() { System.out.println(name+"은(는) 예방접종을 했습니다 ~~"); 
	}
	void infoPrint(int legs) {
		//super.super.breath(); this.super.crying(); // XXXXX
		super.breath();
		super.crying();
		this.checking();
		System.out.printf("%s legs => Local:%d, Global_Pet:%d, Parent_Mam:%d, Animal:%d"
				, name, legs, this.legs, super.legs, Animal.legs);
	}
} //PetAnimal

public class Ex02_Animal {

	public static void main(String[] args) {
		PetAnimal cat = new PetAnimal() ;
		cat.name="고양이";
		cat.cry="애옹 야옹";
		//cat.legs=4;
		cat.infoPrint(4);
		System.out.println("main cat.legs => "+cat.legs);  // this.legs 와 동일한값
		//System.out.println("main cat.legs => "+cat.this.legs); // XXXX
		//System.out.println("main cat.legs => "+cat.super.legs);// XXXX
		// => this, super 는 상속받은 클래스 내부에서만 사용가능 
		
		// ** WildAnimal tiger 생성하고 출력 해 보세요 ~
		WildAnimal tiger = new WildAnimal();
		tiger.name="호랑이";
		tiger.cry="애홍 어흥";
		tiger.allPrint();

		// ** 클래스 계층도 확인
		// => 클래스를 클릭한후 ctrl+t 누르면 됨.
		// ** 소스코드보기
		// => 클래스명을 ctrl+click -> source code 로  
		Object object = new Object() ;
		System.out.println("\n* Object Test => "+object.toString());
		
	} //main

} //class

package j06_classExtends;

public class Ex03_02Child extends Ex03_01Father {
	
	String name;
	int money;
	
	Ex03_02Child() {System.out.println("** Child Default 생성자 **");}
	
	// Son, Father 모두 초기화 하려면
	// => super.name = "홍길동"  : 조상의 맴버변수에 접근
	// => 조상의 생성자(초기화하는 생성자)를 이용
	Ex03_02Child(String name, int money, String fname, int fmoney) {
		super(fname, fmoney) ;
		// 명시적 호출
		// => 조상의 생성자를 직접 호출하면 조상의 Default 생성자는 호출 하지 않는다. 
		
		System.out.println("** Child & Father name, money 초기화 생성자 **");
		this.name=name;
		this.money=money;
	}
	// super , this 는 non_static (인스턴스 메서드) 에서만 사용가능
	// => super , this 인 인스턴스를 의미하기 때문
	public static void staticTest(String name) {
//		 super.name = name ; 
//		 this.name = name ;
		System.out.println("** Static Method Test Child name => "+name);
	}
	// ** static 메서드는 상속(오버라이딩) 안됨
	// => 클래스(종속) 메서드로써 각자 사용됨.
	//    Father.staticTest(name)
	//    Child.staticTest(name)
 	
	// ** 메서드 오버라이딩 (재정의)
	// => 조상의 메서드와 매개변수, 리턴값, 이름 모두 동일한 메서드
	//  ( 매개변수가 다르다면 메서드 오버로딩에 해당됨.) 
	//    현재 클래스에 구현된 메서드가 호출됨
	//    이름은 동일하지만 다양한 기능을 구현할 수 있음. 
	// => Father , Son info 모두 출력
	public void info(String school) {
		// 1) super. 로 변수에 접근
		// System.out.printf("\n** Son info : %s, name=%s, money=%d \n", country, super.name, super.money);
		// super.money -> money private 으로 정의되어있으므로 안됨
		// 2) super. 로 메서드에 접근
		super.info();
		System.out.println("Son School => "+school);
		System.out.printf("** Son info : %s, name=%s, money=%d \n", country, name, money);
													// super.country , this.name, this.money
	}
	// ** 오버라이딩
	// => 오버라이딩 금지 가능
	// => 조상 메서드에 final 정의
//	@Override
//	public void bank(int money) {
 	public void bank() {  // 매개변수가 다르기 때문에 오버라이딩에 해당 되지 않음
		if (this.money <0) super.bank(money) ;
		else this.money+=money;
		System.out.println("** Son Total Money = "+this.money);
	}

	public static void main(String[] args) {
		// 1) Default 생성자
		Ex03_02Child c1 = new Ex03_02Child() ;
		c1.name="Tom";
		c1.money=1000;
		c1.bank();
		c1.info("Green");
		
		// 2) 초기화 생성자
		Ex03_02Child c2 = new Ex03_02Child("홍토미",1000,"홍길동",10000);
		c2.bank();
		c2.info("Blue");
		
		// 3) static Test
		Ex03_02Child.staticTest("static_Child");
		Ex03_01Father.staticTest("static_Father");
	} //main

} //class

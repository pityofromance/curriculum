package j05_classMethod;

//** static Test
//=> Phone 클래스 정의
// 맴버변수 3개 (static 1개, non_static 2개)
// 메서드 2개 (static 1개, non_static 1개) 
// 맴버변수 3개를 생성자로 초기화한다

public class Phone {
	
	// 맴버변수 3개 정의
	// => 전역(맴버) 변수의 정의 위치는 전역(Gloabl) 으로 사용하는데 무관함 
	static String company ;
	String modelNo ;
	private int price;
	// 상수 Test
	// => 고정값을 인스턴스별로 사용할 필요가 없으므로 static 으로 정의 
	public static final double PI = 3.14159;
	
	// 생성자메서드 정의
	public Phone(String company, String modelNo, int price) {
		Phone.company=company;
		this.modelNo=modelNo;
		this.price=price;
	} //생성자 
	
	// 메서드 2개
	public void showModelNo() {
		System.out.println("** ModelNo => "+modelNo);
	}
	static void showCompany() {
		System.out.println("** Company => "+company);
	}
	@Override
	public String toString() {
		return "Phone [company="+company+", modelNo="+modelNo+", price="+price+"]";
	}
	
} // class

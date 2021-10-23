package j05_classMethod;

// ** static Test
// => Phone 클래스 정의
//    맴버변수 3개 (static 1개, non_static 2개)
//    메서드 2개 (static 1개, non_static 1개) 
//    맴버변수 3개를 생성자로 초기화한다

public class Ex06_StaticPhone {

	public static void main(String[] args) {
		// ** Phone Test
		// 1) static Test : 클래스변수, 클래스 메서드 접근
		// => 클래스명으로 접근
		Phone.company = "삼성" ;
		Phone.showCompany(); // 삼성
		
		// 2) non_static 
		// => 인스턴스로 접근
		//Phone pp = new Phone(); 
		// Phone pp = new ; XXXXXXX
		// => 생성자를 1개라도 작성하면 default 생성자는 자동으로 만들어주지 않음
		Phone p1 = new Phone("Sumsung","갤럭시2021-001",100);
		System.out.println("p1=> "+p1);
		Phone.showCompany(); // Sumsung
		
		Phone p2 = new Phone("삼성전자","갤럭시2022-001",100);
		System.out.println("p2=> "+p2);
		Phone.showCompany(); // 삼성전자
		
		// 3) private Test
		System.out.println(" String modelNo =>"+p2.modelNo);
		//System.out.println(" private int price =>"+p2.price);
		// => private 으로 정의된 price 는 외부 클래스에서는 무조건 접근불가능

	} // main
} // class

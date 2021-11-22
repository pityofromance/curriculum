package j07_APITest;

public class Ex04_PersonTest {

	public static void main(String[] args) {
		// 생성1 : Default 생성자
		Ex04_Person p1 = new Ex04_Person();
		p1.infoPrint();
		System.out.println(p1);
		
		// 생성2 : 모든 맴버(전역)변수값을 초기화 해주는 생성자
		Ex04_Person p2 = new Ex04_Person("900909-1022333","홍길동");
		p2.infoPrint();
		System.out.println(p2);
	} //main
} //class

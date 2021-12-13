package j11_enum;

interface ScaleI {
	// 상수정의 => 상수만 정의 가능하기 때문에 생략가능
	//public static final String DO ="도" ;
	int DO = 0 ;
	int RE = 1 ;
	int MI = 2 ;
	int FA = 3 ;
	int SO = 4 ;
	int RA = 5 ;
	int SI = 6 ;
} //interface

public class Ex01_interfaceConst {
	public static void main(String[] args) {
		// ** interface 에 정의된 상수 직접 사용하기
		// => switch case 문에 적용해 보세요
		int key = ScaleI.SI;
		key = 100;
		switch (key) {
		case 0: System.out.println("~~ 도 ~~"); break;
		case 1: System.out.println("~~ 레 ~~"); break;
		case 2: System.out.println("~~ 미~~"); break;	 
		case 3: System.out.println("~~ 파~~"); break;
		case 4: System.out.println("~~ 솔~~"); break;	 
		case 5: System.out.println("~~ 라~~"); break; 
		case 6: System.out.println("~~ 시~~"); break; 
		default: System.out.println("~~도,레,미,파,솔,라,시~~");
		} //switch
	} //main
} //class

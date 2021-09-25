package java01_basic;//자주색글씨는 예약어. 빨간 글씨는 라이브러리 모듈. 

// ** 변수의 선언과 출력
// => 변수명 : 변수의 이름은 식별자 (identifier, 직접 작명)의 일종
// => 비교 : modifier는 특징을 제한한느 한정자 (public 등 예약어의 일종)
// => 변수명의 규칙(ppt J03_01, 8p)

public class Ex02_Variable02 {

	public static void main(String[] args) {
		// 1) 선언
		// 1.1) 기본자료형: 정수형
		// 연산자(+, -, *, /, %)는 식별자에 표함할 수 없다
		byte b;
		short s = 123;
		int i = 2147483647;
		long l = 123456789012345678l ;
		// Java에서 정수 리터럴의 기본 타입은 int(즉, 4byte를 초과할수없음)
		// long Type인 경우 long타입인 걸 알려줘야 함
		// =>리터럴에 l(대소문자 불문)을 붙여주면 됨 
		//l=10l; //ok
		//i=10l; //error
		
		
		// 1.2) 기본자료형 : 실수형
		float f = 123.456F;
		double d = 12345.6789;
		// Java에서 실수 리터럴의 기본 타입은 double(즉, 4byte를 초과할수없음)
		// float Type인 경우 float타입인 걸 알려줘야 함
		// =>리터럴에 f(대소문자 불문)을 붙여주면 됨 
		
		// 1.3) 기본자료형 : boolean
		boolean bool ; // true or false
		bool = s > i ; // 결과값은 false --> 관계식의 결과는 항상 T/F
		
		// 1.4) 기본자료형 : char //한 글자를 의미... 단 한 글자만 사용 가능 ! (2byte)
		char cc = 'A' ; //이는 string이 아닌 char임.--> 큰 따옴표 대신 작은따옴표 사용 
		cc = '김'; //한글도 한글자로 !
		// String과 비교
		String ss = "A" ; //String으로 하면서 작은따옴표로 정의하면 오류임. 
		ss="가나다라"	;	
		
		// 2) 변수의 사용
		// => 반드시 선언 후 & 값 할당 후 사용
		b=127;
		System.out.println("** byte b => "+b);//b를 반드시 선언하고 사용해야 인식함 // 벗 선언만하고 초기값이 없을경우 오류 뜸
		System.out.println("** boolean bool => "+bool);
		System.out.println("** char cc => "+cc);
		
		
		// 3) 최대값 & 최소값 출력하기
		// => 모든 기본 자료형에는 그 자료형을 지원 해 주는 클래스가 있음 : 래퍼(Wrapper) 클래스  (기본자료형을 감싸서 가져다 여러가지 클래스를 제공, 기본자료형의 첫글자를 대문자로)
		//    해당 클래스명은 기본 자료형의 첫글자를 대문자로 하면 됨
		System.out.println("* byte Max = > "+Byte.MAX_VALUE); //상수이기때문에 대문자로 나옴
		System.out.println("* byte Min = > "+Byte.MIN_VALUE); //상수이기때문에 대문자로 나옴
		System.out.println("* short Max = > "+Short.MAX_VALUE); //상수이기때문에 대문자로 나옴
		System.out.println("* short Min = > "+Short.MIN_VALUE); //상수이기때문에 대문자로 나옴
		System.out.println("* int Max = > "+Integer.MAX_VALUE); //상수이기때문에 대문자로 나옴
		System.out.println("* int Min = > "+Integer.MIN_VALUE); //상수이기때문에 대문자로 나옴
		System.out.println("* long Max = > "+Long.MAX_VALUE); //상수이기때문에 대문자로 나옴
		System.out.println("* long Min = > "+Long.MIN_VALUE); //상수이기때문에 대문자로 나옴
		System.out.printf("* float Max=%d , Min=%d \n",Long.MAX_VALUE , Long.MIN_VALUE);
		// 정수니까 %d로 
		
		System.out.printf("* float Max=%f , Min=%f \n",Float.MAX_VALUE , Float.MIN_VALUE); //상수이기때문에 대문자로 나옴
		// printf 는 %f(실수형)가 출력양식. 각 자리에 순서대로 나온단느 뜻 
		System.out.printf("* float Max=%f , Min=%f \n",Double.MAX_VALUE , Double.MIN_VALUE);
		
		System.out.printf("* char cc=%s , String ss=%s \n", cc, ss);
//문자는 %s
		
		// 4) 치환 
		// => 값의 맞교환
		//    중간보관을 위한 같은 타입의 임시 변수가 필요함
		//    "="은 동일성을 의미하는 것이 아니고 좌변에 우변을 넣어주는 대입연산자 ! 
		
		String cup1 = "콜라" ;
		String cup2 = "사이다" ;
		String temp = cup1 ; //임시로 옮겨놓을 임시변수 선언 
		cup1 = cup2 ; 
		cup2 = temp ;
		
		
		
	} //main

} //class

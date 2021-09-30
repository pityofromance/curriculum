package java01_basic;

public class Ex04_Oper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//연산자(operator)는 특정한 연산을 나타내는 기호
		//피연산자(operand)는 연산의 대상
		//연산자의 우선순위 => ppt J03_02 , 23p
		
		int a=10;
		int b=10;
		
		System.out.println("++a =>"+(++a)); //11되고 11출력
		System.out.println("b++ =>"+(b++)); //10 출력 후 b=11
		System.out.println("++a =>"+(--a)); //10되고 10출력
		System.out.println("b++ =>"+((b--))); //11출력후 b=10
		
		//관계연산
		//->모든 관계연산의 결과는 참(true) or 거짓(false)
		a=10; b=3;
		System.out.println("**관계연산**");
		System.out.println("a==b =>" + (a==b)); //f
		System.out.println("a!=b ->" + (a!=b)); //t
		System.out.println("a>b ->" + (a>b)); //t
		System.out.println("a>=b -> " + (a>=b)); //t

		System.out.println("a<b =>" + (a<b)); //f
		System.out.println("a<=b ->" + (a<=b)); //f
		//**삼항식
		//-> (조건) ? yes : no
		// 기본자료형 모두 사용가능
		//a, b 중 큰 수 출력하기
		int max = (a>b)? a : b;
		boolean bool = (a>b)? true : false;
		char c = (a>b)? '참':'F';
		String s = (a>b)? "참" : "거짓";
		System.out.println("** 삼항식 **");
		System.out.printf("max=%d, bool=%b, c=%s, s=%s\n", max, bool, c, s);
		// **논리(집합) 연산
		// -> &&, ||, !
		// 1) a, b 모두 짝수이면 true
		// (a짝수확인) && (b짝수확인)
		bool = (a%2==0) && (b%2==0); //false
		// 1) a, b 둘 중 하나만 짝수이면 true
		bool = (a%2==0) || (b%2==0); 


		
	}

}

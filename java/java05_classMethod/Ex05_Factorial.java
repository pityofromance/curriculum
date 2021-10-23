package j05_classMethod;

//** 재귀적 호출 ( Recursive Call )
//=> 메서드가 메서드 내부에서 자신을 호출
//=> 5! = 5*4*3*2*1
//   n! = n*(n-1)*(n-1-1)*(n-1-1-1)...*1 

public class Ex05_Factorial {
	
	public static int factorial(int n) {
		if (n==1) return 1;
		else return n*factorial(n-1); // 메서드 자신을 호출  
	} //factorial

	public static void main(String[] args) {
		// ** factorial Test
		// => 인스턴스 생성 후 호출
		// => 인스턴스 없이 호출하기
		//    메서드를 static 으로 정의 하면됨
		System.out.println("** 10! => " +factorial(10));
		System.out.println("** 5! => " +factorial(5));  // 120

	} //main
} //class

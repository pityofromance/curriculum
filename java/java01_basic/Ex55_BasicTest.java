package java01_basic;
import java.util.Scanner;
//과제
//두 개의 숫자(정수)와 연산자(4칙연산)을 입력받아 결과를 출력하기

//** Scanner : console 을 통한 키보드값 입력
//=> nextLine() : 엔터 입력 하면 행 단위로 입력 받아 진행 
//=> nextInt() : 엔터 입력 하면 입력값만 전달 
//  주의사항
// nextInt() 만 사용하면 괜찮지만, nextInt() 뒤에 nextLine()이 오면 
// -> nextInt() 값 입력후 엔터 칠때  nextLine()이 진행되어버리므로     
//    nextLine() 은 값을 입력 받지 못한상태로 처리가 끝나게됨


public class Ex55_BasicTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 입력 : ");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("정수2 입력 : ");
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.println("연산자 입력 : ");
		String oper = sc.nextLine();
		float result=0;

		//1)사칙연산 결과 출력
		System.out.println(" + → "+(n1+n2));
		System.out.println(" - → "+(n1-n2));
		System.out.println(" * → "+(n1*n2));
		System.out.println(" / → "+(n1/n2));
		System.out.println(" % → "+(n1%n2));
		
		//2) 입력받은 연산자 사용하기
		// 비교구문 필요
		//→ 삼항식 : +, -만
		//→ if : 예습

		System.out.println("**if 적용**");
		if(oper.equals("+"))
			System.out.println("+ → "+ (n1+n2));
		else if (oper.equals("-"))
			System.out.println("-  → "+ (n1-n2));
		else if (oper.equals("*"))
			System.out.println("*  → "+ (n1*n2));
		else if (oper.equals("/"))
			System.out.println("/  → "+ (n1/n2));


		
		}
}

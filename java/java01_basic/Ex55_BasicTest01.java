package java01_basic;

import java.util.Scanner;

// ** 복습 과제
// → 이름과 나이를 입력하면 평생 먹은 밥값 계산 출력하기
// → 예 : 나이 : 20살 → 20(나이) * 365(1년) * 3(3끼) * 5000(가격)


public class Ex55_BasicTest01 {

	public static void main(String[] args) {
		// 1)입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("** 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("** 나이를 입력하세요 : ");
		int age = sc.nextInt();
		//숫자가 아닌 것을 입력하면 오류 : java.util.InputMismatchException
		// 2)계산하기
		int result = age * 365 * 3 * 5000;
		// 3)출력하기
		System.out.println("**이름 → " + name);
		System.out.println("**나이 → " + age);
		System.out.println("**나의 밥값 → " + result);
		sc.close();

	} //main

} //class

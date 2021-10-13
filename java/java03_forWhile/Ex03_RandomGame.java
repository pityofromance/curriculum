package java03_forWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex03_RandomGame {

	public static void main(String[] args) {
		// 1) myNumber 입력 받기
		// => Scanner 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 범위의 숫자를 하나 입력 하세요 =>");
		int myNumber = sc.nextInt(); 
		
		// => 입력값 오류 확인
		// => 오류 없을때 까지 (반복문적용 : while)
		// => 오류 없으면 -> Random값 찾기 -> 비교 & 등수 확인 
		// Test1) 오류상황을 조건식으로
		// => 오류시 계속 반복, 맞으면 반목문 아래로...
//		while (myNumber<1 || myNumber>10) {
//			System.out.println("입력숫자오류 : 1~10 범위의 숫자를 하나 입력 하세요 =>");
//			myNumber = sc.nextInt();
//		}
		
		// Test2) 무조건  while 문 실행하면서 탈출조건 주기
		while (true) {
			// 탈출 조건  (1~10 사이의 숫자)
			if (myNumber>=1 && myNumber<=10) break; // 반복문 탈출
			else {
				System.out.println("입력숫자오류 : 1~10 범위의 숫자를 하나 입력 하세요 =>");
 				myNumber = sc.nextInt();
			}
		} // while
		
		// 2) Random 값 찾기
		int r = 0;
		Random rn = new Random();
		r=rn.nextInt(10)+1;
		
		// 3) 비교 , 등수 확인 
		int t =  Math.abs(r-myNumber);
		switch (t) {
		case 0: System.out.println("축하드립니다~~금메달 당첨되었습니다~!!!");
				break;
		case 1: System.out.println("축하드립니다~~은메달 당첨되었습니다~!!!");	
				break;
		case 2: System.out.println("축하드립니다~~동메달 당첨되었습니다~!!!");	
				break;		
		default: System.out.println(" 완전 꽝꽝꽝 !!! 더이상 기회 없어요!!!");
		} //switch 
		System.out.println(" R => "+r);

	} // main
} //class

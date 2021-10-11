package java02_ifSwitch;

import java.util.Random;
import java.util.Scanner;

public class SwitchEx02_Randomgame {

	public static void main(String[] args) {

		// 1) myNumber 입력받기
		// scanner 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 범위의 숫자를 입력하세요 : ");
		int myNumber = sc.nextInt();
		
		//입력값 오류 확인 : 일단 1회만 적용 (반복문 필요)
		if ( myNumber < 1 || myNumber > 10) {
			System.out.println("숫자 입력 오류 _ 1~10범위의 숫자를 입력하세요 : ");
			myNumber = sc.nextInt();
		}
		
		//2)Random값 찾기
		int r = 0;
		Random rn = new Random();
		r=rn.nextInt(10)+1;
		
		//3) 비교, 등수 확인
		int t = Math.abs(r - myNumber);
		switch(t) {
		case 0: System.out.println("축하드립니다 금메달");
				break;
		case 1: System.out.println("축하드립니다 은메달");
				break;
		case 2: System.out.println("축하드립니다 금메달");
				break;
		default: System.out.println("꽝");		
		} //switch
		System.out.println("R = "+ r);
	} //main

} //class

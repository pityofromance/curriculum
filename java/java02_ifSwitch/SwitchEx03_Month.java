package java02_ifSwitch;

import java.util.Scanner;

//** 실습 : 
//1. 월을 입력 받아서 
//2. 몇일까지 인지,  
//=> 1,3,5,7,8,10,12월 => ?월은 31일 까지 입니다.
//=> 4,6,9,11 월 => ?월은 30일 까지 입니다.
//=> 2 월 => ?월은 29일 까지 입니다.
//3. 무슨 계절인지 출력 하기
//  => 3~5:봄 , 6~8:여름, 9~11:가을, 12~2:겨울

public class SwitchEx03_Month {

	public static void main(String[] args) {
		String msg = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("'월'을 입력하세요 : ");
		int month = sc.nextInt();
		sc.close();

		//2.몇일까지?
		int year = 2021;
		switch (month) {
		case 1:
		case 12 : msg = "31"; break;
									break;
		}
	}

}

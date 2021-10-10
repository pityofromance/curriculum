package java02_ifSwitch;
import java.util.Random;
import java.util.Scanner;

//** 숫자 맞추기 게임
//=> 1~10 범위에서 숫자 하나를 입력받아
//=> 입력 숫자가 1~10 범위를 벗어나면 " 잘못 입력 했습니다. " 
// 다시 1~10 범위의 숫자를 입력 하세요   
//=> Random 함수의 결과와 일치하면 금메달
//=> 차이가 1 이면 은메달, 차이가 2면 동메달, 아니면 꽝

public class IfEx02_randomGame {

	public static void main(String[] args) {
		
		// 1) myNumber 입력받기
		// Scanner 사용
		// 입력값 오류 확인
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 범위의 숫자를 하나 입력하세요 : ");
		int myNumber = Integer.parseInt(sc.nextLine());
		// int myNumber = sc.nextInt(); ← also OK
		
		
		// 2) Random 값 찾기
		int r = 0;
		Random rn = new Random();
		r = rn.nextInt(10)+1;
		
		// 3) 비교 , 등수 확인
		if (myNumber == r)
		{
			System.out.println("금메달");
		}
		else if ((myNumber - r)==1 || (r - myNumber) == 1) {
			System.out.println("은메달");
		}
		else if ((myNumber - r)==2 || (r - myNumber) == 2) {
			System.out.println("동메달");
		}
		else {
			System.out.println("꽝");
		}
		
		System.out.printf("입력값 = %d, 정답 = %d", myNumber, r);
		
		

	} //main

} //class

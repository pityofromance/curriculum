package java04_array;

import java.util.Arrays;
import java.util.Random;

// ** Lotto 번호 생성기 만들기
// => int 를 6개 담을 수 있 배열 생성 : lotto
// => Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
//    단, 중복은 허용하지 않음
// => 출력

public class Ex04_Lotto01 {

	public static void main(String[] args) {
		// 1) 배열 생성 : lotto
		int[] lotto = new int[6] ;
		// 2) Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
		//    단, 중복은 허용하지 않음
		
		Random rn = new Random();
		
		for (int i=0; i<lotto.length; i++) {
			 lotto[i] = rn.nextInt(45)+1;
			 // 3) 중복 확인 & 제외
			 // 동일한 자료 존재하는지 확인(동일자료 찾아보기 : search)
			 for (int j=0;j<i;j++) {
				 if (lotto[i] == lotto[j]) {
					 --i;
					 break;
				 } // if
				 
			 } //for_j
		} //for_i
		
		// 4) 출력하기
		System.out.println("** Lotto => "+Arrays.toString(lotto));
		
		// 5) 최대값 & 최소값 출력하기
		int max = lotto[0];
		int min = lotto[0];
		for (int i=1; i<lotto.length; i++) {
			if (max < lotto[i]) max = lotto[i];
			if (min > lotto[i]) min = lotto[i];
		}
		System.out.println("최소값" + min + "최대값" + max);
	} //main

} //class

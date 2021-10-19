package java04_array;

import java.util.Arrays;
import java.util.Random;

// ** Lotto 번호 생성기 만들기
// => int 를 6개 담을 수 있 배열 생성 : lotto
// => Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
//    단, 중복은 허용하지 않음
// => 출력

public class Ex04_Lotto02 {

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
		
	      // 5) 오름차순 정렬(Sort) 출력하기
	      // => 순차정렬 (Sequence Sort)
	      // => 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
	      //    배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘
	      // ** 정렬 알고리즘 : 삽입(insert)정렬, 합병(Merge)정렬, 퀵(Quick)정렬...
	      // => https://blog.naver.com/tepet/221690306235 참고
		
		
		
		
	} //main

} //class

package java04_array;

import java.util.Arrays;
import java.util.Random;

//** 과제
//=> Lotto 배열 2개를 준비.
//   당첨번호, MyNumber 
//=> 두배열 모두 Random 으로 초기화
//=> 중복확인, 정렬(직접작성)
//=> 당첨확인 (일치여부만 확인)

//*** Random 클래스
//=> java.util 에 있으므로 import 필요하고, new 선언후 사용가능함.
//=> Random() : 호출시마다 현재시간을 이용한 종자값이 자동 설정됨 
//   Random(long seed) : 인자값으로 주어진 종자값이 설정됨 
//   종자값 : 난수 만드는 알고리즘에서 사용되는 값
//	        ( 같으면 같은난수 얻음 )
//
//=> Random().nextInt(큰수 - 작은수 + 1) + 작은수 
//   Random().nextInt() , Random().nextLong() , Random().nextBoolean()
//   Random().nextDouble() ,  Random().nextFloat()

public class Ex04_Lotto03 {

	public static void main(String[] args) {
		// 1. Lotto 배열 2개를 준비
		int[] lotto = new int[6]; 
		int[] mylotto = new int[6]; 
		Random rn = new Random(5);
		
		// 2. 당첨번호 만들기
		// => 중복확인, 오름차순정렬 직접작성하기
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = rn.nextInt(45)+1;
			// 중복확인 (Search)
			for (int j=0;j<i;j++) {
				if (lotto[i]==lotto[j]) {
					--i;
					break;
				} // if
			} // for_j
		} // for_i
		// 오름차순정렬 직접작성하기
		for (int i=0; i<lotto.length; i++) {
			for (int j=i+1; j<lotto.length; j++) {
				if (lotto[i] > lotto[j]) { // 오름차순
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp ;
				} // if
			} // for_j
		} // for_i
		System.out.println("** 당첨 Lotto => "+Arrays.toString(lotto));
		
		// 3. MyNumber 만들기
		// => 중복확인, 오름차순정렬 (Arrays.sort 이용)
		rn = new Random(5);
		for (int i=0; i<mylotto.length; i++) {
			mylotto[i] = rn.nextInt(45)+1;
			// 중복확인 (Search)
			for (int j=0;j<i;j++) {
				if (mylotto[i]==mylotto[j]) {
					--i;
					break;
				} // if
			} // for_j
		} // for_i
		Arrays.sort(mylotto);
		System.out.println("** MyNumber => "+Arrays.toString(mylotto));
		
		// 4. 당첨확인
		if (Arrays.equals(lotto, mylotto)) // 인덱스별로 값비교 
			System.out.println("*** 당첨 !!! ***");
		else System.out.println("*** 꽝 !!! ");

	} //main
} //class

package j05_classMethod;

import java.util.Arrays;
import java.util.Random;

//** CallByReference 1 (매개변수 참조자료형, 주소전달) 
//=> 배열

//** 과제 
//=> Ex04_Lotto02.java 의 Sort 부분을 메서드로 만들기
//=> 메서드명 : mySort

public class Ex03_CallByRefLotto {
	
	// 배열을 매개변수로 전달받아 오름차순 정렬하기
	// => 오름차순('A') or 내림차순('D') 여부를 char Type 으로 전달받아 적용하기 
	public void mySort(int[] lotto, char c) {
		
		System.out.println("** mySort lotto => "+lotto);
		// [I@1175e2db -> main 의 lotto 와 동일주소
		
		for (int i=0; i<lotto.length; i++) {
			for (int j=i+1; j<lotto.length; j++) {
				if (( c=='A' && lotto[i] > lotto[j]) || 
				    ( c=='D' && lotto[i] < lotto[j])) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp ;
				} // if
			} // for_j
		} // for_i
	} //mySort

	public static void main(String[] args) {
		// 1) 배열 생성 : lotto
		int[] lotto = new int[6] ;
		
		// 2) Random 으로 1~45 범위의 숫자를 생성해서 배열 초기화 하기
		Random rn = new Random();
		for (int i=0; i<lotto.length; i++) {
			 lotto[i] = rn.nextInt(45)+1;
		// 3) 중복 확인 & 제외 : search
			 for (int j=0; j<i; j++) {
				 if (lotto[i]==lotto[j]) {
					 --i; break;
				 } // if
			 } //for_j
		} //for_i
		// 4) 정렬전 출력
		System.out.println("** 정렬전 Lotto => "+Arrays.toString(lotto));
		
		// 5) 오름차순 정렬(Sort) 출력하기
		Ex03_CallByRefLotto ex03 = new Ex03_CallByRefLotto() ;
		System.out.println("** main lotto => "+lotto); // [I@1175e2db
		ex03.mySort(lotto,'A');
		System.out.println("** 오름차순 정렬후 Lotto => "+Arrays.toString(lotto));
		ex03.mySort(lotto,'D');
		System.out.println("** 내림차순 정렬후 Lotto => "+Arrays.toString(lotto));
	} //main
} //class

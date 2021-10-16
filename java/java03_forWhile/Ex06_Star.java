package java03_forWhile;

public class Ex06_Star {

	public static void main(String[] args) {
		// 1) 반삼각형 그리기
		// => * 을 1개 부터 시작해서 갯수를 늘려가면서 9 line 출력 
		// => 각 행별로 행번호 갯수만큼 출력하기
		System.out.println("** 1. 반삼각형 그리기 **");
		for (int i=1; i<10; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			} //for_j
			System.out.println("");
		} //for_i

		// 2) 피라미드 그리기
		// => 5행, 9컬럼 (line*2-1)
		System.out.println("** 2. 피라미드 그리기 **");
		int line = 5;
		//int col = line*2-1;
		for (int i=1; i<=line; i++) {
			// 반복문1 : space
			for (int j=1; j<=line-i; j++) {
				System.out.print(" ");
			}
			// 반복문2 : * 
			for (int j=1; j<(i*2); j++) {
			// 1:1, 2:3, 3:5, ..	
				System.out.print("*");
			}
			System.out.println("");
		}// for_i
		
		// 3) 다이아몬드 그리기
		System.out.println("** 3. 다이아몬드 그리기 **");
		// 상부출력
		for (int i=1; i<=line; i++) {
			// 반복문1 : space
			for (int j=1; j<=line-i; j++) {
				System.out.print(" ");
			}
			// 반복문2 : * 
			for (int j=1; j<(i*2); j++) {
			// 1:1, 2:3, 3:5, ..	
				System.out.print("*");
			}
			System.out.println("");
		}// for_i
		
		// 하부출력
		// => 총 그리는 line 갯수(위의 line-1=4) ~ 1 	까지 감소 
		for (int i=line-1; i>=1; i--) {
			// 반복문1 : space
			for (int j=1; j<=line-i; j++) {
				System.out.print(" ");
			}
			// 반복문2 : * 
			for (int j=1; j<(i*2); j++) {
			// 4:7, 3:5, 2:3, 1:1	
				System.out.print("*");
			}
			System.out.println("");
		}// for_i
		
		// 4) 모래시계 그리기
		//=> 다이아몬드를 반대로 출력
 		
	} //main

} //class

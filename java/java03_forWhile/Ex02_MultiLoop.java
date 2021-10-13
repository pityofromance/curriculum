package java03_forWhile;

//** 반복문의 중첩
//1) if 와의 중첩
//=> 자전거를 10바퀴를 돌리면 0.2Kg 감량 (if)
// 만약 자전거를 200바퀴를 돌렸을때의 감량 출력하기 (for)

//2) for , for 중첩
//=> 자전거를 1번 돌릴때마다 , 줄넘기를 10번 한다.
//=> 자전거 5회 돌릴때 까지 매번 과정의 횟수를 출력한다.
//자전거 1 : 줄넘기 1,2,3,4,5,6,7,...10
//자전거 2 : 줄넘기 1,2,3,4,5,6,7,...10
//[1,1] [1,2] [1,3] [1,4]......[1,10]
//[2,1] [2,2] [2,3] [2,4]......
//=> 전체 줄넘기 횟수 출력하기

public class Ex02_MultiLoop {

	public static void main(String[] args) {
		// Test 1)
		double result = 0;
		for (int i=1; i<=200; i++) {
			// 자전거를 10바퀴를 돌리면 0.2Kg 감량
			// i = 10, 20, 30, 40, .....100
			if ( i%10==0) {
				result += 0.2 ;
			} //if
		} //for
		System.out.println("** Test1) result => "+result);
		// Test 2)
		// => 자전거: i , 줄넘기: j
		// => [1,1] [1,2] [1,3] [1,4]......[1,10]
		System.out.println("** Test2) for , for 중첩 **");
		int tot = 0 ;
		for (int i=1; i<6; i++) {
			for (int j=1; j<11; j++) {
				System.out.printf("[%d,%d] ",i,j);
				tot++;
			} // for_j
			System.out.println("");
		} // for_i
		System.out.println("** Test2) 줄넘기합계 => "+tot);
		
		
	} //main

} //class

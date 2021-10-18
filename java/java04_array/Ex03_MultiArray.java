package java04_array;

// ** 다차원 배열
//1차원 배열이 2개 모이면 2차원 배열
//1차원 배열이 3개 모이면 3차원 배열 ...2차원 이상은 거의 안쓰임

public class Ex03_MultiArray {

	public static void main(String[] args) {
		// 1. 명시적 선언
		int[][] mul ;
		mul = new int[2][3];
		// int[][] mul2 = {{10,20,30},{11,22,33}}; => 묵시적 정의
		// => 초기화
		mul[0][0] = 10;
		mul[0][1] = 20;
		mul[0][2] = 30;
		mul[1][0] = 11;
		mul[1][1] = 22;
		//mul[1][2] = 33; 
		// => 명시적으로 크기가 정의되어있기 때문에 값을 할당하지 않으면 default 0 를 가짐 
		// => 활용 
		mul[0][0] = mul[0][1]+mul[0][2]; // 20+30
		// => 출력
		for (int i=0; i<mul.length; i++) {
			for (int j=0; j<mul[i].length; j++) {
				System.out.printf("mul[%d,%d]=%d \n",i,j,mul[i][j]);
			}
		}
		// 2. 묵시적 선언
		int[][] mul2 = {{101,202,303},{111,222},{100}};
		// => 명시적으로 내부배열의 크기가 정의되어있지 않기 때문에 각각의 크기를 가짐
		for (int i=0; i<mul2.length; i++) {
			for (int j=0; j<mul2[i].length; j++) {
				System.out.printf("mul2[%d,%d]=%d \n",i,j,mul2[i][j]);
			}
		}
		
	} //main
} //class

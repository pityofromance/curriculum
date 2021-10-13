package java03_forWhile;

// ** Continue 
// => Continue 문 이하를 실행하지 않고 계속진행(다음 반복문 진행)

// ** Break
// => 멈춤

// ** 과제
// => 5층건물에 각 층마다 7 개의 방이 있고 이것을 [층,호실] 출력하기 
// => 4층 4호 는 창고이기 때문에 출력하지 않는다.

public class Ex04_conBreak {

	public static void main(String[] args) {
		//** Labled break, continue 
		// => 위치를 표시하는 label
		// => 반드시 ":" 표시,
		// => 반드시 반복문 바로 위에 위치함.
		//    Lable 다음에 반복문 외의문장이 오면 break, continue 에서 인식안됨 오류
		banana:
		for (int i=1; i<6; i++) {
			for (int j=1; j<8; j++) {
				// Test1) if조건
				// => 조건이 맞으면 출력
//				if ( i!=4 || j!=4) {
//					System.out.printf("[%d층,%d호]",i,j);
//				}
				// Test2) if else 조건
				// => 4층 4호 는 창고 출력
//				if ( i==4 && j==4)  
//					 System.out.printf("[ 창 고 ]");
//				else System.out.printf("[%d층,%d호]",i,j);
				
				// Test3) continue 적용
				// => 4층 4호만 출력하지않고 건너뜀
				// => Continue 문 위치에서 아래구문을 실행하지않고 다음 반복문 진행
				// => Break 문 위치에서 해당되는(가장가까운) 반복문 멈춤(종료)
				// => Continue, Break 를 원하는 반복문에 지정하기 (Lable 사용) 
				//    
				if ( i==4 && j==4) 
					continue banana; // 요기서 i = 5 로 직행 (줄바꿈도 안함)
					//break banana; 
				System.out.printf("[%d층,%d호]",i,j);
				
			} // for_j
			System.out.println("");
		} // for_i
		
	} //main
} //class

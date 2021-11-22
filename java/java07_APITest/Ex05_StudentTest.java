package j07_APITest;

public class Ex05_StudentTest {

	public static void main(String[] args) {
		// 1) Default
		Ex05_Student s1 = new Ex05_Student() ;
		s1.infoPrint();
		// 2) 초기화
		Ex05_Student s2 = new Ex05_Student("030213-3039444","홍길동", 60, 90) ;
		s2.infoPrint();
		
		
		// 3) 배열 에 넣기
		Ex05_Student[] s = {
				new Ex05_Student("030213-3039444","Banana", 70, 80),
				new Ex05_Student("990314-2039444","Apple", 90, 88),
				new Ex05_Student("880528-1659884","Grape", 50, 100),
				new Ex05_Student("000713-4039888","Melon", 76, 76),
				new Ex05_Student("030213-1039999","Lemon", 100, 100)};

		for(int i=0;i<s.length;i++) {
			s[i].infoPrint();
			System.out.println();
		}

		testSumAvg(s);
		for(Ex05_Student toStr:s) System.out.println(toStr);

	}//main

	public static void testSumAvg(Ex05_Student[] sArr) {

		int javaSum = 0, htmlSum = 0;
		for(int i=0;i<sArr.length;i++) {
			javaSum += sArr[i].getJava();
			htmlSum += sArr[i].getHtml();
		}
		System.out.printf("Java 합계 : %d , 평균: %.2f\n",javaSum,javaSum/(float)sArr.length);
		System.out.printf("Html 합계 : %d , 평균: %.2f\n",htmlSum,htmlSum/(float)sArr.length);
	}//testSumAvg

}//class


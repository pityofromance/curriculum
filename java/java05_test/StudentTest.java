package j05_test;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("S001","홍길동1",100,50) ;
		Student s2 = new Student("S002","홍길동2",70,60) ;
		Student s3 = new Student("S003","홍길동3",80,70) ;
		Student s4 = new Student("S004","홍길동3",30,80) ;
		Student s5 = new Student("S005","홍길동5",80,90) ;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		// 배열정의
		// Student[] ss = {s1, s2, s3, s4, new Student("S005","홍길동5",80,90) } ;
		Student[] ss = {s1, s2, s3, s4, s5} ;
		// 석차순으로 출력 (내림차순)
		for (int i=0; i<ss.length; i++) {
			for (int j=i+1; j<ss.length; j++) {
				if (ss[i].getSum() < ss[j].getSum()) {
					Student temp = ss[i] ;
					ss[i] = ss[j] ;
					ss[j] = temp ;
				}
			} //for_j
		} //for_i
		System.out.println("** 석차순 출력 **");
		for (Student s:ss) {
			System.out.println(s);
		}
		
		// 석차순 정렬 메서드 
		// => Student Type 의 배열을 매개변수로 전달받아 석차순 정렬하는 메서드로 독립
		//    인스턴스 없이 호출할 수 있도록 정의한다.
		System.out.println("** 석차순 정렬 메서드 적용후 출력 **");
		Student[] ss2 = {s1, s2, s3, s4, new Student("S005","홍길동5",30,60) } ;
		studentSort(ss2);
		System.out.println(Arrays.toString(ss2));
	} //main
	
	public static void studentSort(Student[] myss) {
		for (int i=0; i<myss.length; i++) {
			for (int j=i+1; j<myss.length; j++) {
				if (myss[i].getSum() < myss[j].getSum()) {
					Student temp = myss[i] ;
					myss[i] = myss[j] ;
					myss[j] = temp ;
				}
			} //for_j
		} //for_i
	} //studentSort 

} //class

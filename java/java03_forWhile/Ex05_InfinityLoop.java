package java03_forWhile;

// ** 무한루프 
public class Ex05_InfinityLoop {

	public static void main(String[] args) {
		// 1) For
		int count = 0 ;
		System.out.println("** Test **");
		for (;;) {  // 무조건
			count++;
			System.out.println(" For count => "+count);
			if (count > 100) break;
		} //for
		// 2) while
		count = 0 ;
		while (true) {
			System.out.println(" while count => "+count++);
			if (count > 100) break;
		}
		// 3) do ~ while
		count = 0 ;
		do {
			System.out.println(" do_while count => "+count++);
			if (count > 100) break;
		}while(true) ;
		
		System.out.println("** Program Stop **");
	} //main

} //class

package j13_genCollection;

// ** Generic Class Test 
// * FruitBox 만들기
// => Apple, Banana 등 모든 과일을 담을수 있는 FruitBox class 를 만들어 보세요.
//    ( 자율적으로 해보시면 됩니다 )
class Fruit { public String toString() { return "I am Fruit";}}
class Apple extends Fruit { public String toString() { return "I am Apple";}}
class Grape extends Fruit { public String toString() { return "I am Grape";}}
class Toy { public String toString() { return "I am Toy"  ;}}

// Fruit 의 후손들만 사용가능 하도록 Type 제한  
class FruitBox<T extends Fruit> {
	private T[] farr;
	public void setFarr(T[] farr) { this.farr = farr; } 
	public void fruitPrint() {
		for (T f:farr ) {
			System.out.println(f);
		}
	} //fruitPrint
}

public class Ex55_FruitBoxTest {

	public static void main(String[] args) {
		FruitBox<Fruit> f1 = new FruitBox<Fruit>() ;
		Fruit[] fa = {new Apple(), new Grape(), new Fruit() } ; 
		f1.setFarr(fa);
		f1.fruitPrint();
		
		// FruitBox<Toy> f2 = new FruitBox<Toy>() ; => Fruit 의 자손이 아니라 불허함.
	} //main
} //class

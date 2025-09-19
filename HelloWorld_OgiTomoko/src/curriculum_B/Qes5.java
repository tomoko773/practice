package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {


		helloWorld();
		doubleValue(10);
		isEven(10);
		isEven(7);

	}

	//Qes1　引数なし、戻り値なし、"Hello, World!" を表示する。
	private static void helloWorld() {
		System.out.println("Hello, World!");
	}

	//Qes2	引数：整数 (int num)　戻り値：整数（引数の2倍の値）
	private static void doubleValue(int num) {
		System.out.println(num + "を2倍すると" + num * 2 + "です。");
	}

	//Qes3
	public static void isEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "は偶数です");
		} else {
			System.out.println(num + "は奇数です"); // 割り切れたら true、そうでなければ false
		}		
	}
	
	//Qes4
	public class Main  {
		 public void greet() {
		  System.out.println("こんにちは！これはMainクラスです。");
		 }
		}
	
	public class Greeting   {
		 public void greet() {
		  System.out.println("こんにちは！これはGreetingクラスです。");
		 }
		}
	
	//Qes5
	
	

}//消さない

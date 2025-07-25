package curriculum_A;

public class Qes1 {

	public static void main(String[] args) {
		//Qes1
		// 各型の変数を宣言し、初期値を設定する		
		byte byteNum; 
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char letter;
		String letters;
		boolean isBoolean;
		
		byteNum = 0; 
		shortNum = 0;
		intNum = 0;
		longNum = 0L;
		floatNum = 0.0f;
		doubleNum = 0.0f;
		letter = '\u0000';
		letters = null;
		isBoolean = false;
		
		//Qes2
		//1で宣言した各型の変数に指定された値を代入する
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		//Qes3
		System.out.println(longNum + intNum + shortNum + byteNum);//11110を出力する
		System.out.println(byteNum * 2);//20を出力する
		System.out.println(letter + letters + isBoolean);//a ハロー trueを出力する
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);//数字を全て足して出力	する
		System.out.println(byteNum * shortNum * intNum * longNum);//10000000000	小数点以外の数字を全てかけて出力する	
		System.out.println(doubleNum / shortNum);//10.5割る100をして出力する
		System.out.println(byteNum - shortNum);//10引く100をして出力する
		
		//Qes4
		String name;
		name = "山田太郎";
		System.out.println("こんにちは" + name + "さん！");//コンソールに こんにちは、山田太郎さん！ と表示する
		
		//Qes5
		int age;
		age = 25;
		System.out.println("年齢：" + age + "歳");//コンソールに  年齢: 25歳 と表示する
		
		//Qes6
		int num1;
		num1 = 10;
		int num2;
		num2 = 5;			
		int sum = num1 + num2;
		System.out.println(sum);//num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示する
		
		//Qes7
		int score = 80;
		score = score + 20;
		System.out.println("最終スコア：" + score);//最終スコア: 100 　をscoreを使用してコンソールに表示する。
		
		//Qes8
		double price = 99.99;
		int intPrice = (int)price; // double → int (小数点以下が切り捨て)
		System.out.println("整数価格" + intPrice);//整数価格: 99 とコンソールに表示する
				
		//Qes9
		String numStr = "123";
		int intNumStr = Integer.parseInt(numStr);
		intNumStr = intNumStr + 10;
		System.out.println("変換後の値:" + intNumStr);//変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示
		
		//Qes10 
		int num = 50;
		String strNum = String.valueOf(num);
		System.out.println("得点:" + strNum + "点");//num を String 型に変換し、"得点: 50点" の形で表示
		
		//Qes11
		int a = 10;
		int b = 20;
		boolean result = (a<b); 
		System.out.println(result);
		
		//Qes12
		int x = 15;
		String answer = x > 10 ? "OK" : "NG";
		System.out.println(answer);
		
		//Qes13
		String text = "私はJavaが好きです。Javaは楽しい！";
		text.replace("Java", "Python");
		System.out.println(text.replace("Java", "Pyshon")); 
		
		

	}

}

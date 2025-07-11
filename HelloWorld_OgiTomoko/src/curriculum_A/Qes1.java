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

		

	}

}

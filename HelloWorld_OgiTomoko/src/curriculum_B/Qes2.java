package curriculum_B;
import java.util.Scanner;

public class Qes2 {

	public static void main(String[] args) {

		//Oes1
		int score = 75;
		if (score >= 60) {
			System.out.println("合格です!");
		} //score が 60 以上なら "合格です！" と表示する

		//Qes2
		int age = 25;
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		} //age が 20 以上 30 以下なら "適正年齢です" と表示、それ以外の場合は "対象外です" と表示する

		//Qes3
		int age1 = 18;
		if (age1 >= 20) {
			System.out.println("成人です");
		} else if (age1 >= 13 && age1 <= 19) {
			System.out.println("ティーンエイジャーです");
		} else if (age1 <= 12) {
			System.out.println("子供です");
		}
		//age が 20 以上なら "成人です"13 以上 19 以下なら "ティーンエイジャーです"12 以下なら "子供です" と表示する

		//Qes4
		int x = 30;
		int y = 15;
		int z = 50;

		if (x < y && z < y) {
			System.out.println("y");
		} else if (x < z && y < z) {
			System.out.println("z");
		} else {
			System.out.println("x");
		} //一番大きい数値を判定して表示する

		//Qes5
		int num;
		num = 0;
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0 です");
		} else {
			System.out.println("負の数です");
		}
		//num の値が 0 より大きければ "正の数です" 0 なら "0 です" 0 より小さければ "負の数です" と表示する

		//Qes6
		int value;
		value = 0;
		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		//value が 偶数 なら "偶数です"  奇数 なら "奇数です" と表示する

		//Qes7
		int score1 = 0;
		if (score1 >= 90) {
			System.out.println("優");
		} else if (score1 >= 70) {
			System.out.println("良");
		} else if (score1 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		//90 以上なら "優" 70 以上なら "良" 50 以上なら "可" 50 未満なら "不可"　を表示する

		//Qes8
		Scanner scanner = new Scanner(System.in);
		String str =scanner.nextLine();
		if (str.equals("") || str.equals(null)) {
			System.out.println("入力が無効です");
		} else {
			System.out.println(str);	
		}
		//入力が null または空文字（""）のときに「入力が無効です」と表示する処理を作成する

	}

}

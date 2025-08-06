package curriculum_B;

import java.util.Random;
import java.util.Scanner;


public class Qes3 {

	public static void main(String[] args) {

		//for (初期化; 条件; 増減処理) {　// 繰り返し実行する処理}
		//Qes1
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//for 文を使って 1 から 10 までの数字を 1 つずつ表示する

		//Qes2
		for (int d = 1; d <= 20; d++) {
			if (d % 2 == 0) {
			System.out.println(d);
		}}
		//for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示する

		//Qes3
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		//for 文を使って 10 から 1 まで カウントダウンして表示する

		//Qes4
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		//for 文を使って 1 から 100 までの合計 を表示する

		//Qes5
		String star = "*";

		for (int i = 0; i < 5; i++) { //5段改行
			for (int x = 0; x <= i; x++) {
				System.out.print(star);//sterを５回
			}
			System.out.println("\n");
		}
		//for 文を使って三角形を出力する

		//Qes6
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		//while 文を使って 1 から 10 まで を 1 つずつ表示する

		//Qes7
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0)// 偶数
				System.out.println(i);
			i++;
		}
		//while 文を使って 2 から 20 までの偶数 を 1 つずつ表示する

		//Qes8
		int x = 10;
		while (x >= 1) {
			System.out.println(x);
			x--;
		}
		//while 文を使って 10 から 1 まで のカウントダウンを表示する

		//Qes9
		int y = 0;
		int count1 = 0;
		while (y < 100) {
			y++;
			count1 += y;
		}
		System.out.print(count1);
		//while 文を使って 1 から 100 までの合計 を表示する

		//Qes10
		Scanner scanner = new Scanner(System.in);
		int b;

		while (true) {
			b = scanner.nextInt();
			if (b == 0) {
				System.out.print("終了しました");
				System.out.println();
				break;
			}
		}
		//入力が 0 になるまで 何度でも入力を受け付ける,0が入力されたら「終了しました」と表示する

		//Qes11		
		for (int q = 1; q <= 9; q++) {
			for (int m = 1; m <= 9; m++) {
				int ans = q * m;
				String target = String.format("%02d", ans);
				if (m == 9) {
					System.out.print("0" + q + " * " + "0" + m + " = " + target);
				} else {
					System.out.print("0" + q + " * " + "0" + m + " = " + target + " || ");
				}
			}
			System.out.println();//改行
		}
		//九九表

		//Qes12
		Scanner scanner1 = new Scanner(System.in);	
		final int Max = 11;//上限１１
		Random rand = new Random();
        int random = rand.nextInt(12);//ランダム１１まで
        String text1 = scanner1.nextLine();
        String[] goods = text1.split("、");//、で区切る    
        
		for (String item : goods) {
        	 String ansr = item + "の残り台数は" + random + "台です";
		  switch (item) {
		   case "パソコン":		   
		   case "冷蔵庫":
		   case "扇風機":
		   case "洗濯機":
		   case "加湿器":
		    break;
		   case "テレビ":
		   case "ディスプレイ":
			   ansr = "ディスプレイ".equals(item)? item + "の残り台数は" +(Max - random)+ "台です" : ansr;
		    break;
		   default:
		    ansr = "『" + item + "』は指定の商品ではありません ";
		  }
			System.out.println(ansr);
			}

		  scanner.close(); //scanner終わり
		  scanner1.close();

	}//消さない
}

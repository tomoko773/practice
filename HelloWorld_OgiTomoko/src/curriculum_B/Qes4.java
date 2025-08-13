package curriculum_B;

import java.util.Arrays;
import java.util.Scanner;

public class Qes4 {

	public static void main(String[] args) {
		//Qes1
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//int 型の配列 を作成し、配列の全要素を順番に表示する

		//Qes2
		int[] b = { 10, 20, 30, 40, 50 };
		for (int c = b.length - 1; c >= 0; c--) {
			System.out.println(b[c]);
		}
		//配列の要素を 逆順 に表示

		//Qes3
		int[] d = { 3, 5, 37, 9, 11 };
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += d[i];
		}
		System.out.println(sum);
		//配列の全要素の 合計値 を計算し、表示する

		//Qes4
		int[] e = { 12, 7, 9, 21, 5, 18 };
		int max = e[0];
		int min = e[0];
		for (int i = 1; i < 6; i++) {

			if (max < e[i]) {
				max = e[i]; //e[i]がMaxより大きければ、e[i]がMax   

			if (min > e[i]) {
				min = e[i]; //e[i]がMinより小さければ、e[i]がMin   
			}
			}
		}

		System.out.println("最大値は" + max + "です。");
		System.out.println("最小値は" + min + "です。");
		// 配列の 最大値と最小値 を求めて表示

		//Qes5
		int[] f = { 1, 2, 3, 4, 5 };
		for (int number : f) {
			System.out.println(number * 2);
		}
		//配列のすべての要素を 2 倍 し、結果を表示、拡張for文を使用する

		//Qes6
		Scanner scanner = new Scanner(System.in);
		int str = scanner.nextInt();//scanner
		Integer g[] = { 4, 7, 10, 15, 20 };

		if (Arrays.asList(g).contains(str)) {
			System.out.println(str + "は配列に含まれています");
		} else {
			System.out.println(str + "は配列に含まれていません");
		}
		//ユーザーが入力した数が 配列に含まれているか を判定し、結果を表示する

		scanner.close(); //scanner終わり

		//Qes7
		int[][] array = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		
		for (int i = 0; i < array.length; i++) { // 行をループ
			for (int j = 0; j < array[i].length; j++) { // 列をループ
			System.out.print(array[i][j] + " ");
			}
			System.out.println(); // 改行
			}
		//配列の すべての要素を表示 

		//Qes8
		int[][] array1 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		int sum1 = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int s = 0; s < array1[i].length; s++) {
				sum1 += array1[i][s];
			}
		}
		System.out.println(sum1);
		//配列の すべての要素の合計値を表示

		//Qes9
		int[][] array2 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};

		// 最小値と最大値の初期化
		int max1 = array2[0][0];
		int min1 = array2[0][0];

		// 配列内の各要素を調べて最小値と最大値を見つける
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				int h = array2[i][j];

				// 最大値
				if (h > max1) {
					max1 = h;
				}
				// 最小値
				if (h < min1) {
					min1 = h;
				}

			}
		}
		System.out.println("最大値は " + max1);
		System.out.println("最小値は " + min1);

		//配列内の 最大値と最小値 を求めて表示

		//Qes10
		int[][][] array3 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for (int i = 0; i < array3.length; i++) { // 行をループ
			for (int j = 0; j < array3[i].length; j++) { // 列をループ
				for (int k = 0; k < array3[i].length; k++) { // 列をループ
					System.out.print(array3[i][j][k] + " ");
					}
				System.out.println(); // 改行

			}
		
			}
		//配列内のすべての要素を 表示

	}//消さない

}

package curriculum_B;
import java.util.Arrays;
import java.util.Scanner;

public class Qes4 {

	public static void main(String[] args) {
		//Qes1
		int[] a = {1,2,3,4,5};
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println(a[3]); 
		System.out.println(a[4]); 
		//int 型の配列 を作成し、配列の全要素を順番に表示する
		
		//Qes2
		int[] b = {10,20,30,40,50};
		for(int c = b.length - 1; c >= 0; c--) {
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
		int Max = e[0];
		int Min = e[0];
		for (int i = 1; i < 6; i++) {

			if (Max < e[i]) {
				Max = e[i]; //e[i]がMaxより大きければ、e[i]がMax   
			}
		}
		for (int i = 1; i < 6; i++) {

			if (Min > e[i]) {
				Min = e[i]; //e[i]がMinより小さければ、e[i]がMin   
			}
		}

		System.out.println("最大値は" + Max + "です。");
		System.out.println("最小値は" + Min + "です。");
		// 配列の 最大値と最小値 を求めて表示

		//Qes5
		int[] f = { 1, 2, 3, 4, 5 };
		for (int number : f) {
			System.out.println(number * 2);
		}
		//配列のすべての要素を 2 倍 し、結果を表示、拡張for文を使用する

		//Qes6
		Scanner scanner = new Scanner(System.in);
		int str =  scanner.nextInt();//scanner
		Integer g [] = {4,7,10,15,20};
		
		if(Arrays.asList(g).contains(str)) {
            System.out.println(str + "は配列に含まれています");
        }else {
        	 System.out.println(str + "は配列に含まれていません");
        }
		
		scanner.close(); //scanner終わり

	}//消さない

}

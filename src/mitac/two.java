package mitac;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// 神通 mis部門 第二題
		// 題目:輸入任意一個m值 這個m=n的3次方 + (n-1)的三次方 +(n-2)的三次方 +...2的三次方+1的三次方 求n=?
		// 如找不到輸出-1
		Scanner scanner = new Scanner(System.in);

		// 輸入 m 的值
		System.out.print("請輸入 m 的值：");
		int m = scanner.nextInt();

		int sum = 0;
		int n = 1;

		// 使用迴圈逐步增加 n 並計算三次方和
		while (true) {
			sum = 0;

			// 計算從 n 到 1 的每個數字的三次方和
			for (int i = n; i >= 1; i--) {
				sum += i * i * i;
			}

			// 如果和等於 m，則輸出 n
			if (sum == m) {
				System.out.println("n = " + n);
				break;
			}

			// 如果和超過 m，則輸出 -1 並結束
			if (sum > m) {
				System.out.println("-1");
				break;
			}

			// 否則，繼續增加 n
			n++;
		}

		scanner.close();
	}

}

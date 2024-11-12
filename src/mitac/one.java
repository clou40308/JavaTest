package mitac;

public class one {

	public static void main(String[] args) {
		// 神通 mis部門 第一題
		// 題目:給一任意陣列 由大到小排序
		int[] array = { 5, 3, 8, 1, 9, 2 };

		// 使用氣泡排序進行由大到小排序
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] < array[j + 1]) { // 比較相鄰兩數，若前者小於後者則交換
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// 顯示排序結果
		System.out.print("排序後的陣列 (由大到小): ");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}

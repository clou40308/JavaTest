package cathay_ins;

public class two {

	public static void main(String[] args) {
		// 國泰產險 第二題
		int rows = 5;

		// 外層迴圈控制行數
		for (int i = 0; i < rows; i++) {
			// 輸出空格
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 輸出星號
			for (int k = 0; k < (2 * (rows - i) - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

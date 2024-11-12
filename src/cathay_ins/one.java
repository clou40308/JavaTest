package cathay_ins;

public class one {

	public static void main(String[] args) {
		// 國泰產險 第一題
		int rows = 5;

		// 控制行數
		for (int i = rows; i > 0; i--) {
			// 輸出星號
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 換行
		}

	}

}

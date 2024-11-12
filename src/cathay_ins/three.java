package cathay_ins;

public class three {

	public static void main(String[] args) {
		// 國泰產險 第三題
		// 求出1-20的質數和
		int sum = 0;

		// 遍歷從 2 到 20 的每個數
		for (int i = 2; i <= 20; i++) {
			boolean isPrime = true; // 假設 i 是質數

			// 檢查 i 是否能被 2 到 sqrt(i) 之間的數整除
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false; // 如果能整除，i 不是質數
					break; // 跳出循環，沒必要繼續檢查
				}
			}

			// 如果是質數，就加到 sum 中
			if (isPrime) {
				sum += i;
			}
		}

		System.out.println("1 到 20 的質數和為: " + sum);
	}

}

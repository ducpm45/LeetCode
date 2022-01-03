package minhduc.training.leetcode;

public class _66_Plus_One {
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		int num = 1;
		int[] arr = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			arr[i] = digits[i - 1];
		}
		arr[0] = 0;

		for (int i = n; i >= 0; i--) {
			int sum = arr[i] + num;
			if (sum < 10) {
				arr[i] = sum;
				break;
			} else {
				arr[i] = sum % 10;
				num = sum / 10;
				if (num == 0) {
					break;
				}
			}
		}
		if (arr[0] == 0) {
			for (int i = 0; i < n; i++) {
				digits[i] = arr[i + 1];
			}
			return digits;
		}
		return arr;
	}

}

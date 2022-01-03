package minhduc.training.leetcode;

public class _258_Add_Digits {

	public int addDigits(int num) {
		if (num < 10)
			return num;
		int count = 0;
		while (num > 0) {
			count += num % 10;
			num = num / 10;
			if (num == 0 && count > 9) {
				num = count;
				count = 0;
			}
		}
		return count;
	}

}

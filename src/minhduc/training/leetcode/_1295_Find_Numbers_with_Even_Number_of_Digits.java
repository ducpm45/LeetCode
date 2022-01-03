package minhduc.training.leetcode;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int temp = 0;
        for (int i : nums) {
            if (String.valueOf(i).length() % 2 == 0) {
                temp++;
            }
        }
        return temp;
    }
}

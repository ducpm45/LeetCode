package minhduc.training.leetcode;

public class _912_Sort_an_Array {

	public int[] sortArray(int[] nums) {

		return mergeSort(nums, 0, nums.length - 1);
	}

	private int[] mergeSort(int[] nums, int L, int R) {
		if (L == R) {
			int[] oneElement = { nums[L] };
			return oneElement;
		}
		
		int k = (L + R) / 2;
		int[] arr1 = mergeSort(nums, L, k);
		int[] arr2 = mergeSort(nums, k + 1, R);

		// Merge
		int[] arr = merge(arr1, arr2);
		return arr;
	}

	private int[] merge(int[] arr1, int[] arr2) {
		int n = arr1.length + arr2.length;
		int[] arr = new int[n];
		int i = 0, i1 = 0, i2 = 0;
		while (i < n) {
			if (i1 < arr1.length && i2 < arr2.length) {
				if (arr1[i1] <= arr2[i2]) {
					arr[i] = arr1[i1];
					i++;
					i1++;
				} else {
					arr[i] = arr2[i2];
					i++;
					i2++;
				}
			} else {
				if (i1 < arr1.length) {
					arr[i] = arr1[i1];
					i++;
					i1++;
				} else {
					arr[i] = arr2[i2];
					i++;
					i2++;
				}
			}
		}

		return arr;
	}
}

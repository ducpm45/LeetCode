package minhduc.training.leetcode;

public class _852_Peak_Index_in_a_Mountain_Array {

	public int peakIndexInMountainArray(int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (arr[mid] > arr[mid - 1])
				left = mid;
			if (arr[mid] < arr[mid - 1])
				right = mid;
		}
		return left;

	}
}

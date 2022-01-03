package minhduc.training.leetcode;

public class _88_Merge_Sorted_Array {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
			for(int num: nums2) {
				insertElements(num, nums1, m);
				m++;
			}
		}
		public void insertElements(int num, int[] arr, int m) {
			boolean check = false;
			for(int i = 0; i < m; i++) {
				if(arr[i] > num) {
					check = true;
					for(int j = m-1;j>=i;j--) {
						arr[j+1] = arr[j];
					}
	                arr[i]=num;
					break;
				}
			}
			if(!check) {
				arr[m] = num;
			}
		}
}

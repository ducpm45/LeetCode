package minhduc.training.leetcode;

import minhduc.training.test.TreeNode;

public class _108_Convert_Sorted_Array_to_Binary_Search_Tree {
	public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode root;
		if (nums.length == 1) {
			root = new TreeNode(nums[0]);
			return root;
		}
		if (nums.length == 2) {
			root = new TreeNode(nums[1]);
			root.left = new TreeNode(nums[0]);
			return root;
		}
		if (nums.length == 3) {
			root = new TreeNode(nums[1]);
			root.left = new TreeNode(nums[0]);
			root.right = new TreeNode(nums[2]);
			return root;
		}

		int L = 0;
		int R = nums.length - 1;
		int key = (L + R) / 2;
		root = new TreeNode(nums[key]);
		int[] arrL = new int[key];
		for (int i = 0; i < key; i++) {
			arrL[i] = nums[i];
		}
		int[] arrR = new int[nums.length - key - 1];
		for (int i = 0; i < arrR.length; i++) {
			arrR[i] = nums[key + i + 1];
		}
		root.left = sortedArrayToBST(arrL);
		root.right = sortedArrayToBST(arrR);

		return root;
	}
}

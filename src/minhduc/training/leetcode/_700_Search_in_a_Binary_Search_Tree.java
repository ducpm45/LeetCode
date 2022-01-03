package minhduc.training.leetcode;

import minhduc.training.test.TreeNode;

public class _700_Search_in_a_Binary_Search_Tree {

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}

		if (val < root.val) {
			return searchBST(root, val);
		} else if (val > root.val) {
			return searchBST(root, val);
		}
		return root;
	}
}

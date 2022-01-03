package minhduc.training.leetcode;

import minhduc.training.test.TreeNode;

public class _112_Path_Sum {

	private boolean isLeaf(TreeNode root) {
		return root.left == null && root.right == null;
	}

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;

		if (isLeaf(root)) {
			return targetSum == root.val;
		} else {
			targetSum -= root.val;
		}
		boolean resultL = hasPathSum(root.left, targetSum);
		boolean resultR = hasPathSum(root.right, targetSum);

		return resultL || resultR;
	}
}

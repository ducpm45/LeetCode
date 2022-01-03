package minhduc.training.leetcode;

import minhduc.training.test.TreeNode;

public class _104_Maximum_Depth_of_Binary_Tree {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int depth;
		int depthL = maxDepth(root.left);
		int depthR = maxDepth(root.right);
		depth = Math.max(depthL, depthR);

		return depth + 1;
	}
}

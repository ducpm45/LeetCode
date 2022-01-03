package minhduc.training.leetcode;

public class _701_Insert_into_a_Binary_Search_Tree {
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {

		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode insertIntoBST(TreeNode root, int val) {
		TreeNode newNode = new TreeNode(val);
		// root = null
		if (root == null) {
			root = newNode;
			return root;
		} else {
			TreeNode temp = root;
			while (true) {
				if (temp.val > val) {
					if (temp.left == null) {
						temp.left = newNode;
						break;
					} else {
						temp = temp.left;
					}
				} else {
					if (temp.right == null) {
						temp.right = newNode;
						break;
					} else {
						temp = temp.right;
					}
				}
			}
		}
		return root;
	}
}

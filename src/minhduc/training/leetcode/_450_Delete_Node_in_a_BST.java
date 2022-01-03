package minhduc.training.leetcode;

public class _450_Delete_Node_in_a_BST {

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

	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return null;
		}
		if (key < root.val) {
			root.left = deleteNode(root.left, key);
		} else if (key > root.val) {
			root.right = deleteNode(root.right, key);

		} else {

			if (root.left == null && root.right == null) {
				return null;
			}

			if (root.left != null && root.right == null) {
				return root.left;
			}

			if (root.left == null && root.right != null) {
				return root.right;
			}

			TreeNode temp = leftNode(root.right);
			root.val = temp.val;
			root.right = deleteNode(root.right, temp.val);
		}

		return root;
	}

	public TreeNode leftNode(TreeNode root) {
		if (root == null)
			return null;
		TreeNode leftNode = root;
		while (leftNode.left != null) {
			leftNode = leftNode.left;
		}
		return leftNode;
	}
}

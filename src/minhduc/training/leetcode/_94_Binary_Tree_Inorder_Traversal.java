package minhduc.training.leetcode;

import java.util.ArrayList;
import java.util.List;

import minhduc.training.test.TreeNode;

public class _94_Binary_Tree_Inorder_Traversal {

	List<Integer> list = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return list;
		}
		inorderTraversal(root.left);
		list.add(root.val);
		inorderTraversal(root.right);

		return list;
	}
}

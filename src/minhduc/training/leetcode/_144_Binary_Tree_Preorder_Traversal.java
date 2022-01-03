package minhduc.training.leetcode;

import java.util.ArrayList;
import java.util.List;

import minhduc.training.test.TreeNode;

public class _144_Binary_Tree_Preorder_Traversal {
	List<Integer> list = new ArrayList<>();

	public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null)
			return list;
		list.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		return list;
	}
}

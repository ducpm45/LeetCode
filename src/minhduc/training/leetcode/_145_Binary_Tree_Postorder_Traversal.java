package minhduc.training.leetcode;

import java.util.ArrayList;
import java.util.List;

import minhduc.training.test.TreeNode;

public class _145_Binary_Tree_Postorder_Traversal {

	List<Integer> list = new ArrayList<>();

	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null)
			return list;

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		list.add(root.val);

		return list;
	}
}

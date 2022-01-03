package minhduc.training.test;

import minhduc.training.leetcode._21_Merge_Two_Sorted_Lists;


public class App {
	public static void main(String[] args) {
		_21_Merge_Two_Sorted_Lists test = new _21_Merge_Two_Sorted_Lists();
		ListNode list1 = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(4);
		list1.next = n1;
		n1.next = n2;

		ListNode list2 = new ListNode(1, null);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		list2.next = n3;
		n3.next = n4;

		test.mergeTwoLists(list1, list2);
	}

}

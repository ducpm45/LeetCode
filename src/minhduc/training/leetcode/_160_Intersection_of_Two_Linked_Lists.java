package minhduc.training.leetcode;

public class _160_Intersection_of_Two_Linked_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode currA = headA;
		ListNode currB = headB;

		while (currA != currB) {
			if (currA != null) {
				currA = currA.next;
			} else {
				currA = headB;
			}

			if (currB != null) {
				currB = currB.next;
			} else {
				currB = headA;
			}
		}
		return currA;
	}
}

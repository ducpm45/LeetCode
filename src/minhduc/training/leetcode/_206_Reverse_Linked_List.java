package minhduc.training.leetcode;

public class _206_Reverse_Linked_List {
	private class ListNode {
		int val;
		ListNode next;

		ListNode() {

		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode currNode = head;
		ListNode nextNode = null;

		while (currNode.next != null) {
			nextNode = currNode.next;
			currNode.next = nextNode.next;
			nextNode.next = head;
			head = nextNode;

		}

		return nextNode;
	}

}

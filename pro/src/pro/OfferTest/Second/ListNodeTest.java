package pro.OfferTest.Second;

import pro.OfferTest.Frist.ListNode;

public class ListNodeTest {
	public static void DeleteNode(ListNode listHead, ListNode listNodeToBeDeleted) {
		if (listHead.equals(listNodeToBeDeleted)) {
			listHead = listHead.next;
			return;
		}
		ListNode tmp = listNodeToBeDeleted.next;
		if (tmp != null) {
			listNodeToBeDeleted.value = tmp.value;
			if (tmp.next != null) {
				tmp.next = listNodeToBeDeleted.next = tmp.next;
				tmp.next = null;
			} else {
				tmp = listHead;
				while (!tmp.next.equals(listNodeToBeDeleted)) {
					tmp = tmp.next;
				}
				tmp.next = null;
			}

		}

	}

	public ListNode DeleterDupNode(ListNode Lhead) {
		if (Lhead.next == null || Lhead == null) {
			return null;
		}
		ListNode pre = null;
		ListNode cur = Lhead;
		while (cur != null || cur.next != null) {
			if (cur.value == cur.next.value) {
				int val = cur.value;
				while (cur != null && (cur.value == val)) {
					cur = cur.next;
				}
				if (pre == null)
					Lhead = cur;
				// 否则cur之前的pre的下一个结点何cur连接
				else
					pre.next = cur;

			} else {
				pre = cur;
				cur = cur.next;
			}

		}
		return Lhead;

	}

}

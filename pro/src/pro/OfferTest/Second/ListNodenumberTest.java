package pro.OfferTest.Second;

import pro.OfferTest.Frist.ListNode;

public class ListNodenumberTest {
	public ListNode FindNode(ListNode ListHead, int k) {
		if (ListHead == null || k < 0) {
			return null;
		}
		ListNode ListA = ListHead;
		ListNode ListB = ListHead;

		for (int i = 0; i < k - 1; i++) {
			if (ListA.next != null) {
				ListA = ListA.next;
			} else {
				return null;
			}
		}
		while (ListA.next != null) {
			ListA = ListA.next;
			ListB = ListB.next;

		}
		return ListB;

	}

	public static ListNode findListNode(ListNode listnode) {
		ListNode Pfast = listnode;
		ListNode Pslow = listnode;
		if (Pfast != null && Pfast.next != null) {
			Pfast = Pfast.next.next;
			Pslow = Pslow.next;
			// 确定是否有环，遇到的位置一定在环内
			if (Pfast == Pslow) {
				// 重置一个指针为头指针
				Pfast = listnode;
				// 相等的位置即环的起点
				while (Pfast != Pslow) {
					Pfast = Pfast.next;
					Pslow = Pslow.next;
				}
				return Pslow;
			}

		}

		return null;
	}

	public static ListNode ReverseList(ListNode listhead) {
		ListNode pro = null;
		ListNode cur = listhead;
		ListNode next = null;
		while (cur != null) {
			next = cur.next;
			cur.next = pro;
			pro = cur;
			cur = next;
		}
		return pro;

	}

//递归
	public static ListNode reverse(ListNode listhead) {
		if (listhead == null || listhead.next == null)
			return listhead;
		//
		ListNode revhead = reverse(listhead.next);
		// 倒数第一个节点
		ListNode revnext = listhead.next;
		// 反转
		revnext.next = listhead;
		// 倒数第二个节点置为空
		listhead.next = null;
		return revhead;
	}

	public static void main(String[] args) {
	}

}

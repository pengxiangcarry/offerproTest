package pro.OfferTest.third;

import pro.OfferTest.Frist.ListNode;

public class ConeListNode {
	public void coneList(ListNode listnode) {
		if (listnode == null) {
			return;
		}
		copyList(listnode);
		setrandomnode(listnode);
	}

	public void copyList(ListNode listnode) {
		ListNode curnode = listnode;
		while (curnode != null) {
			// 为每个结点的next插入一个和该结点的值一样的结点
			ListNode cone = new ListNode();
			cone.value = curnode.value;
			cone.next = curnode.next;
			curnode.next = cone;
			curnode = cone.next;
		}

	}

	public void setrandomnode(ListNode listnode) {
		ListNode cur = listnode;
		while (cur != null) {
			ListNode cone = cur.next;
			if (cur.random != null) {
				cone.random = cur.random.next;
			}
			cur = cone.next;

		}
	}

	public ListNode splitList(ListNode listnode) {
		ListNode cur = listnode;
		ListNode cloneHead = cur.next;
		while (cur != null) {
			ListNode clonenode = cur.next;
			cur.next = cur.next.next;
			if (clonenode.next != null) {
				clonenode.next = clonenode.next.next;
			}
			cur = cur.next;
		}
		return cloneHead;
	}

}

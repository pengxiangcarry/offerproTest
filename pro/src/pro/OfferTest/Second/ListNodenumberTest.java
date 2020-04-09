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
			// ȷ���Ƿ��л���������λ��һ���ڻ���
			if (Pfast == Pslow) {
				// ����һ��ָ��Ϊͷָ��
				Pfast = listnode;
				// ��ȵ�λ�ü��������
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

//�ݹ�
	public static ListNode reverse(ListNode listhead) {
		if (listhead == null || listhead.next == null)
			return listhead;
		//
		ListNode revhead = reverse(listhead.next);
		// ������һ���ڵ�
		ListNode revnext = listhead.next;
		// ��ת
		revnext.next = listhead;
		// �����ڶ����ڵ���Ϊ��
		listhead.next = null;
		return revhead;
	}

	public static void main(String[] args) {
	}

}

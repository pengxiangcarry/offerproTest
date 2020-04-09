package pro.OfferTest.Second;

import pro.OfferTest.Frist.ListNode;

public class ListNodeSecondTest {
	public static ListNode AddListNode(ListNode phead1, ListNode phead2) {
		// ���ж��Ƿ�Ϊ��
		if (phead1 == null) {
			return phead2;
		} else if (phead2 == null) {
			return phead1;
		}
		ListNode pmergeHead = null;

		if (phead1.value < phead2.value) {
			pmergeHead = phead1;
			pmergeHead.next = AddListNode(phead1.next, phead2);
		} else {
			pmergeHead = phead2;
			pmergeHead.next = AddListNode(phead1, phead2.next);

		}

		return pmergeHead;
	}

//��ӡ������ 
	public static void printList(ListNode list) {
		while (list != null) {
			if (list.next == null) {
				System.out.print(list.value + "--");
			} else {
				System.out.print(list.value + "--");
			}
			list = list.next;

		}

	}

	public static void main(String[] args) {

	}

}

package pro.OfferTest.Frist;

public class ListNode {
	public ListNode next = null;
	public int value;
	public ListNode random;

	public void printOut() {
		System.out.println(value);
		ListNode tep = next;
		while (tep != null) {
			System.out.println(tep.value);
			tep = tep.next;
		}

	}

}

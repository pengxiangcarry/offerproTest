package pro.OfferTest.Frist;

import java.util.Stack;

public class ListTest {
	public static void PrintListNode(ListNode listnode) {
		Stack<ListNode> st=new Stack<ListNode>();
		while(listnode!=null) {
			st.push(listnode);
			listnode=listnode.next;
			
		}
		while(!st.isEmpty()) {
			System.out.println(st.pop().value);
		}
		
	}
public static void main(String[] args) {
	ListNode l1=new ListNode();
	ListNode l2=new ListNode();
	ListNode l3=new ListNode();
	l1.next=l2;
	l2.next=l3;
	l1.value=12;
	l2.value=13;
	l3.value=14;
	PrintListNode(l1);
	
}
}

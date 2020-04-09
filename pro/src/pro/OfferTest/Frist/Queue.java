package pro.OfferTest.Frist;

import java.util.Stack;

public class Queue<T> {
	public Stack<T> st1=new Stack<T>();
	public Stack<T> st2=new Stack<T>();
	public  void appendTail(T element) {
		st1.push(element);
		
		
	}
	public  T deleteHead() {
		if(st2.isEmpty()) {
			while(!st1.isEmpty()) {
				st2.push(st1.pop());
				}
			}
		if(st2.isEmpty()) {
			 throw new IllegalArgumentException("queue is empty");
		}
		return st2.pop();
	}
	public static void main(String[] args) {
		Queue<Integer> qu=new Queue<>();
		qu.appendTail(1);
		qu.appendTail(2);
		qu.appendTail(3);
		qu.appendTail(4);

	}

}

package pro.OfferTest.third;

import java.util.LinkedList;

public class stackTest {
	public LinkedList<Integer> stack = new LinkedList<Integer>();
	public LinkedList<Integer> stackMin = new LinkedList<Integer>();

	public void push(int node) {
		stack.push(node);
		if (stackMin.isEmpty() && node < stackMin.peek()) {
			stackMin.push(node);

		} else {
			stackMin.push(stackMin.peek());
		}

	}

	public void pop() {
		if (stack.isEmpty()) {
			throw new RuntimeException("stack is empty");
		} else {
			stack.pop();
			stackMin.pop();
		}
	}

	public int top() {
		if (stack.isEmpty()) {
			throw new RuntimeException("stack is empty");
		} else
			return stack.peek();
	}

	public int min() {
		if (stack.isEmpty()) {
			throw new RuntimeException("stack is empty");
		}
		return stackMin.peek();

	}

	public static boolean stackT(int arr[], int brr[]) {
		if (arr == null || brr == null)
			return false;
		LinkedList<Integer> pop = new LinkedList<>();
		int popindex = 0;
		for (int i = 0; i < arr.length; i++) {
			pop.push(arr[i]);
			while (!pop.isEmpty() && pop.peek() == brr[popindex]) {
				pop.pop();
				popindex++;

			}
		}

		return pop.isEmpty();
	}

}

package pro.OfferTest.third;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import pro.OfferTest.Frist.Tree;

public class BinaryTreeTest {
	public static Tree MirrorRescoursively(Tree binary) {
		if (binary == null) {
			return null;

		}
		if (binary.LeftTree == null && binary.RightTree == null) {
			return binary;
		}
		Tree bi = binary.LeftTree;
		binary.LeftTree = binary.RightTree;
		binary.RightTree = bi;
		if (binary.LeftTree != null) {
			MirrorRescoursively(binary.LeftTree);

		}
		if (binary.RightTree != null) {
			MirrorRescoursively(binary.RightTree);

		}
		return binary;
	}

	public static void printTree(Tree tr) {
		if (tr != null) {
			System.out.println(tr.value);
			printTree(tr.LeftTree);
			printTree(tr.RightTree);

		}

	}

	public static boolean IsSymmeetrical(Tree tr1) {

		return IsTree(tr1, tr1);
	}

	public static boolean IsTree(Tree tr1, Tree tr2) {
		if (tr1.LeftTree == null && tr2.RightTree == null)

			return true;

		if (tr1.LeftTree == null || tr2.RightTree == null) {
			return false;

		}
		if (tr1.LeftTree.value != tr2.RightTree.value)
			return false;

		return IsTree(tr1.LeftTree, tr2.RightTree) && IsTree(tr1.RightTree, tr2.LeftTree);

	}

	public static ArrayList<Integer> PrintTreeTest(Tree tree) {
		ArrayList<Integer> list = new ArrayList<>();
		if (tree == null) {
			return list;
		}
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.offer(tree);
		while (!queue.isEmpty()) {
			Tree node = queue.poll();
			list.add(node.value);
			if (node.LeftTree != null)
				queue.offer(node.LeftTree);
			if (node.RightTree != null)
				queue.offer(node.RightTree);
		}
		return list;
	}

	public static void printBinaryTree(Tree tree) {
		if (tree == null) {
			return;
		}
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.offer(tree);
		int toBePrinted = 1;
		int nextnode = 0;
		while (!queue.isEmpty()) {
			Tree node = queue.poll();
			System.out.print(node.value + " ");
			toBePrinted--;
			if (node.LeftTree != null) {
				queue.offer(node.LeftTree);
				nextnode++;
			}
			if (node.RightTree != null) {
				queue.offer(node.RightTree);
				nextnode++;
			}
			if (toBePrinted == 0) {
				System.out.println();
				toBePrinted = nextnode;
				nextnode = 0;

			}
		}
	}

	public static void printZTree(Tree tree) {
		if (tree == null) {
			return;
		}
		LinkedList<Tree> stackOdd = new LinkedList<>();
		LinkedList<Tree> stackEven = new LinkedList<>();
		stackOdd.push(tree);
		while (!stackOdd.isEmpty() || !stackEven.isEmpty()) {
			if (!stackOdd.isEmpty()) {
				while (!stackOdd.isEmpty()) {
					Tree node = stackOdd.pop();
					System.out.println(node.value + " ");
					if (node.LeftTree != null)
						stackEven.push(node.LeftTree);
					if (node.RightTree != null)
						stackEven.push(node.RightTree);
				}

			} else {
				while (!stackEven.isEmpty()) {
					Tree node = stackEven.pop();
					System.out.print(node.value + " ");
					if (node.LeftTree != null)
						stackOdd.push(node.LeftTree);
					if (node.RightTree != null)
						stackOdd.push(node.RightTree);

				}
			}
//			System.out.println("");

		}

	}

	public static void main(String[] args) {
		/*
		 * Integer i1 = 100; Integer i2 = 100; Integer i3 = 200; Integer i4 = 200;
		 * System.out.println(i1 == i2); System.out.println(i3 == i4);
		 */
		Tree tr1 = new Tree();
		Tree tr2 = new Tree();
		Tree tr3 = new Tree();
		tr1.value = 0;
		tr2.value = 1;
		tr3.value = 2;
		tr1.LeftTree = tr2;
		tr1.RightTree = tr3;
		printZTree(tr1);
	}

}

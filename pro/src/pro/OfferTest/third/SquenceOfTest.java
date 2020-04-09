package pro.OfferTest.third;

import java.util.LinkedList;

import pro.OfferTest.Frist.Tree;

public class SquenceOfTest {
	public static boolean ForkTree(int arr[]) {
		if (arr == null || arr.length == 0)
			return false;
		return FTree(arr, 0, arr.length - 1);
	}

	public static boolean FTree(int arr[], int begin, int end) {
		if (begin >= end)
			return true;
		int root = arr[end];
		int i = begin;
		while (i < end && arr[i] < root) {
			i++;
		}
		int bordary = i;
		while (i < end) {
			if (arr[i] < root) {
				return false;
			}
			i++;
		}
		return FTree(arr, begin, bordary - 1) && FTree(arr, bordary, end - 1);
	}

	public LinkedList<LinkedList<Integer>> FindPath(Tree tree, int target) {
		LinkedList<LinkedList<Integer>> res = new LinkedList<>();
		LinkedList<Integer> path = new LinkedList<>();
		if (tree == null) {
			return res;
		}
		preorder(tree, target, path, res);
		return res;
	}

	public void preorder(Tree tree, int curval, LinkedList<Integer> path, LinkedList<LinkedList<Integer>> res) {

		if (tree == null) {
			return;
		}
		path.add(tree.value);
		curval -= tree.value;
		if (tree.LeftTree == null && tree.RightTree == null) {
			if (curval == 0) {
				res.add(new LinkedList<Integer>(path));
			}
		}
		preorder(tree.LeftTree, curval, path, res);
		preorder(tree.RightTree, curval, path, res);
		path.remove(path.size() - 1);
		curval += tree.value;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 7, 6, 9, 11, 10, 8 };
		System.out.println(ForkTree(arr));
	}

}

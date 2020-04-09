package pro.OfferTest.third;

import pro.OfferTest.Frist.Tree;

public class TreeNodeTest {
	private Tree preNode;

	public Tree Convert(Tree tree) {
		if (tree == null) {
			return null;
		}
		Tree root = tree;
		convertNode(root);

		while (root.LeftTree != null) {
			root = root.LeftTree;
		}

		return root;
	}

	public void convertNode(Tree tree) {
		if (tree == null)
			return;
		convertNode(tree.LeftTree);
		tree.LeftTree = preNode;
		if (preNode != null) {
			preNode.RightTree = tree;
		}
		preNode = tree;
		convertNode(tree.RightTree);
	}

}

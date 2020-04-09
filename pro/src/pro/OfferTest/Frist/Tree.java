package pro.OfferTest.Frist;

public class Tree {

	public int value;
	public Tree LeftTree;
	public Tree RightTree;

	public void printTree() {
		if (LeftTree != null) {
			LeftTree.printTree();
		}
		if (RightTree != null) {
			RightTree.printTree();
		}
		System.out.print(value);

	}

}

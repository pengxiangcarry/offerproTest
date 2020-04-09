package pro.OfferTest.Frist;

public class TreeTest {
	public static Tree createTree(int berfore[], int mid[]) {
		Tree root = upTree(berfore, 0, berfore.length - 1, mid, 0, mid.length - 1);
		return root;
	}

	public static Tree upTree(int berfore[], int BtreeFirst, int BtreeLast, int mid[], int MtreeFirst, int MtreeLast) {
		if (BtreeFirst > BtreeLast || MtreeFirst > MtreeLast) {
			return null;
		}
		Tree root = new Tree();
		root.value = berfore[BtreeFirst];
		// int i = startIn; i <= endIn; i++
		for (int i = MtreeFirst; i <= MtreeLast; i++) {
			// inorder[i] == preorder[startPre]
			if (mid[i] == berfore[BtreeFirst]) {
				// root.leftNode = rebultTree(preorder, startPre + 1, startPre + i - startIn,
				// inorder, startIn, i - 1);
				// root.rightNode = rebultTree(preorder, startPre + i - startIn + 1, endPre,
				// inorder, i + 1, endIn);
				root.LeftTree = upTree(berfore, BtreeFirst + 1, BtreeFirst + i - MtreeFirst, mid, MtreeFirst, i - 1);
				root.RightTree = upTree(berfore, BtreeFirst + i - MtreeFirst + 1, BtreeLast, mid, i + 1, MtreeLast);
			}
		}

		return root;
	}

	public static void main(String[] args) {
		int[] berfore = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] mid = { 4, 7, 2, 1, 5, 3, 8, 6 };
		Tree root = createTree(berfore, mid);
		root.printTree();
	}

}



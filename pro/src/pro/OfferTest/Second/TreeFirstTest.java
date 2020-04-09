package pro.OfferTest.Second;

import pro.OfferTest.Frist.Tree;

public class TreeFirstTest {
	public boolean HasSubTree(Tree proot1, Tree proot2) {
		boolean result = false;
		if (proot1 != null && proot2 != null) {
			result = DoesTree(proot1, proot2);
		}
		if (!result)
			return HasSubTree(proot1.LeftTree, proot2);
		if (!result)
			return HasSubTree(proot1.RightTree, proot2);
		return result;
	}

	public boolean DoesTree(Tree proot1, Tree proot2) {
		if (proot2 == null)
			return true;
		if (proot1 == null)
			return false;
		if (proot1.value != proot2.value) {
			return false;
		}
		return DoesTree(proot1.LeftTree, proot2.LeftTree) && DoesTree(proot1.RightTree, proot2.RightTree);
	}

}

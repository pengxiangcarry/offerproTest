package pro.OfferTest.Frist;

public class TreeSecondTest {
	public SecondTree GetNext(SecondTree Tree) {
		if(Tree.RightTree!=null) {
			Tree=Tree.RightTree;
			while(Tree.LiftTree!=null) {
				Tree=Tree.LiftTree;
				return Tree;
			}
		}
	while(Tree.fatherTree!=null) {
		if(Tree.fatherTree.LiftTree==Tree) {
			return Tree.fatherTree;
			
		}
		Tree=Tree.fatherTree;
		
	}
		return null;
	}

}
class SecondTree{
	char Value;
	SecondTree LiftTree;
	SecondTree RightTree;
	SecondTree fatherTree;
	public void printT() {
		if(LiftTree!=null) {
			LiftTree.printT();
		}
		if(RightTree!=null) {
			RightTree.printT();
		}
		System.out.println(Value);
	}
	

}

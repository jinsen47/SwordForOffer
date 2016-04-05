package Problem59;

public class IsSymmetrical {
	/*
	 * 判断二叉树是不是镜像
	 */
	public boolean isSymmetrical(BinaryTreeNode pRoot){
		return isSymmetrical(pRoot,pRoot);
	}
	public boolean isSymmetrical(BinaryTreeNode pRoot1,BinaryTreeNode pRoot2){

		//此时已经到叶节点 所以返回true
		if(pRoot1==null && pRoot2==null)
			return true;
		if(pRoot1==null || pRoot2==null)
			return false;
		if(pRoot1.data!=pRoot2.data)
			return false;
		
		return isSymmetrical(pRoot1.leftNode,pRoot2.rightNode) && isSymmetrical(pRoot1.rightNode,pRoot2.leftNode);
	}

}
class BinaryTreeNode {
	public int data;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;
}


package Problem19;

import java.util.Stack;

public class MirrorRecursively {
	/*
	 * 输入一个二叉树，输出它的镜像
	 */
	public BinaryTreeNode mirrorRecursively(BinaryTreeNode root)
	{
		if(root==null)
			return null;
		if(root.leftNode==null && root.rightNode==null)
			return null;

		BinaryTreeNode temp=root.leftNode;//交换左右子节点
		root.leftNode=root.rightNode;
		root.rightNode=temp;

		if(root.leftNode!=null)
            mirrorRecursively(root.leftNode);
		if(root.rightNode!=null)
            mirrorRecursively(root.rightNode);

		return root;
	}

}
class BinaryTreeNode
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}

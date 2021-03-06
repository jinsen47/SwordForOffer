package Problem23;

import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
	public void printFromTopToBottom(BinaryTreeNode root)
	{
		if(root==null)
			return ;
		Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode node=queue.poll();
			System.out.println(node.data);
			if(node.leftNode!=null)
				queue.add(node.leftNode);
			if(node.rightNode!=null)
				queue.add(node.rightNode);
		}
	}
}
class BinaryTreeNode 
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}

package Problem25;

import java.util.Stack;

public class FindPath {
	/*
	 * 输入一个二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径
	 */
	public void findPath(BinaryTreeNode root,int k)
	{
		if(root==null)
			return ;
		Stack<Integer> stack=new Stack<Integer>();
		findPath(root,k,stack);
	}
	private void findPath(BinaryTreeNode root,int k,Stack<Integer> path)
	{
		if(root==null)
			return ;
		//到达叶节点
		if(root.leftNode==null && root.rightNode==null)
		{
			if(root.data==k)
			{
				System.out.println("路径开始");
				for(int i:path)
					System.out.print(i);
				System.out.println(root.data);
			}
		}		
		else 
		{
			path.push(root.data);
			findPath(root.leftNode,k-root.data,path);
			findPath(root.rightNode,k-root.data,path);
			path.pop();//因为都用的同一个对象 所以遍历一次后要删除
		}
	}
}
class BinaryTreeNode 
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}
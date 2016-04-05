package Problem27;

public class Convert {
	/*
	 * 将二叉搜索树转换成一个排序的双向链表
	 */
	public BinaryTreeNode convert(BinaryTreeNode root)
	{
		BinaryTreeNode node=null;

		convert(root,node);

        //返回根节点
		while(node!=null && node.leftNode!=null)
			node=node.leftNode;

		return node;
	}
    //重载
    //中序遍历的格式 在中间进行操作 函数的参数可以随意改   lastNode用于保存上一个遍历的结点
	public void convert(BinaryTreeNode root,BinaryTreeNode lastNode)
	{
		if(root==null)
			return ;
		BinaryTreeNode current=root;
               
		if(current.leftNode!=null)
			convert(current.leftNode,lastNode);

		current.leftNode=lastNode;
		if(lastNode!=null)
			lastNode.rightNode=current;
		lastNode=current;  

		if(current.rightNode!=null)
			convert(current.rightNode,lastNode);
	}

}
class BinaryTreeNode 
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}

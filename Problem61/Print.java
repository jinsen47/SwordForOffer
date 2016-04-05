package Problem60;

public class Print {
	/*
	 * 按之字型打印二叉树
	 */
	public void print(BinaryTreeNode pRoot){

		if(pRoot==null)
			return;
		Stack<BinaryTreeNode> stack1=new Stack<BinaryTreeNode>();//奇数行
		Stack<BinaryTreeNode> stack2=new Stack<BinaryTreeNode>();//偶数行
		stack1.add(pRoot);

		int current=0;//标记奇偶

		while(!stack1.isEmpty()||!stack2.isEmpty()){
			
			BinaryTreeNode pNode=null;
			if(current==0){
				 pNode=stack1.pop();
				 System.out.print(pNode.data+" ");
				 if(pNode.leftNode!=null)
					 stack2.add(pNode.leftNode);
				 if(pNode.rightNode!=null)
					 stack2.add(pNode.rightNode);
				 if(stack1.isEmpty()){
					 System.out.println("");
					 current=1;
				 }
			}else{
				 pNode=stack2.pop();
				 System.out.print(pNode.data+" ");
				 if(pNode.rightNode!=null)
					 stack1.add(pNode.rightNode);
				 if(pNode.leftNode!=null)
					 stack1.add(pNode.leftNode);
				 if(stack2.isEmpty()){
					 System.out.println("");
					 current=0;
				 }
			}
		}
	}
}
class BinaryTreeNode {
	public int data;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;
}

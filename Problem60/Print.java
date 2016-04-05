package Problem60;

public class Print {
	/*
	 * 按行打印二叉树
	 */
	public void print(BinaryTreeNode pRoot){
		if(pRoot==null)
			return;
		LinkedList<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		queue.add(pRoot);
		int nextlevel=0;
		int toBePrint=1;
		while(!queue.isEmpty()){
			
			BinaryTreeNode pNode=queue.poll();
			toBePrint--;
			System.out.print(pNode.data+" ");
			
			if(pNode.leftNode!=null){
				queue.add(pNode.leftNode);
				nextlevel++;
			}
			if(pNode.rightNode!=null){
				queue.add(pNode.rightNode);
				nextlevel++;
			}
			if(toBePrint==0){
				System.out.println("");
				toBePrint=nextlevel;
				nextlevel=0;
			}
		}
	}

}
class BinaryTreeNode {
	public int data;
	public BinaryTreeNode leftNode;
	public BinaryTreeNode rightNode;
}

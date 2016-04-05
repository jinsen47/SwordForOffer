package Problem58;

public class Problem15test {
		public static void main(String[] args) {
		BinaryTreeNode root1=new BinaryTreeNode();
		BinaryTreeNode node1=new BinaryTreeNode();
		BinaryTreeNode node2=new BinaryTreeNode();
		BinaryTreeNode node3=new BinaryTreeNode();
		BinaryTreeNode node4=new BinaryTreeNode();
		BinaryTreeNode node5=new BinaryTreeNode();
		BinaryTreeNode node6=new BinaryTreeNode();
		root1.leftNode=node1;
		root1.rightNode=node2;
		node1.leftNode=node3;
		node1.rightNode=node4;
		node4.leftNode=node5;
		node4.rightNode=node6;
		
		node1.parentNode=root1;
		node2.parentNode=root1;
		node3.parentNode=node1;
		node4.parentNode=node1;
		node5.parentNode=node4;
		node6.parentNode=node4;
		
		root1.data=8;
		node1.data=8;
		node2.data=7;
		node3.data=9;
		node4.data=2;
		node5.data=4;
		node6.data=7;

		GetNext getNext=new GetNext();
		BinaryTreeNode b=getNext.getNext(node2);
		if(b!=null)
		System.out.print(b.data);
	
	}
}

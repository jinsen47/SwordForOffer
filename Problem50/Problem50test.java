package Problem19;

public class Problem19test {
	public static void main(String args[])
	{
		BinaryTreeNode root1 = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();
		BinaryTreeNode node6 = new BinaryTreeNode();
		root1.leftNode = node1;
		root1.rightNode = node2;
		node1.leftNode = node3;
		node1.rightNode = node4;
		node2.leftNode = node5;
		node2.rightNode = node6;
		root1.data = 5;
		node1.data = 3;
		node2.data = 7;
		node3.data = 2;
		node4.data = 4;
		node5.data = 6;
		node6.data = 8;
	
		Serial serial=new Serial();
		BinaryTreeNode common=serial.GetLastCommonParent(root1,node5,node4);
		System.out.print(common.data);	
	}

}

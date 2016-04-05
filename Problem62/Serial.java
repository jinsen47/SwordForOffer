package Problem62;

import java.util.Stack;

public class Serial {
	/*
	 * 二叉树序列化 反序列化
	 */
	public void Serialize(BinaryTreeNode pRoot, StringBuffer str) {
		if (pRoot == null) {
			str.append("$,");
			return ;
		}
		str.append(pRoot.data);
		str.append(",");
		Serialize(pRoot.leftNode, str);
		Serialize(pRoot.rightNode, str);
	}
	
	public void DeSerialize(BinaryTreeNode pRoot, String s,int begin) {
    
		if(s.charAt(begin)!='$' && s.charAt(begin)!=','){
			pRoot=new BinaryTreeNode();
			pRoot.data=Integer.parseInt(String.valueOf(s.charAt(begin)));
			pRoot.leftNode=null;
			pRoot.rightNode=null;
			begin++;
			DeSerialize(pRoot.leftNode,s,begin);
			DeSerialize(pRoot.rightNode,s,begin);
		}else 
			begin++;
	}	
	
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}

/*
public static void preOrder(BinaryTree root){  //前序遍历
  if(root!=null){
   System.out.print(root.data+"-");
   preOrder(root.left);
   preOrder(root.right);
  }
 }
 
 public static void inOrder(BinaryTree root){     //中序遍历

  if(root!=null){
   inOrder(root.left);
   System.out.print(root.data+"--");
   inOrder(root.right);
  }
 }
 
 public static void postOrder(BinaryTree root){    //后序遍历

  if(root!=null){
   postOrder(root.left);
   postOrder(root.right);
   System.out.print(root.data+"---");
  }
 }
*/
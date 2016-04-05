package Problem50;

import java.util.Stack;

public class Serial {

    public boolean GetNodePath(BinaryTreeNode root,BinaryTreeNode node,Stack<BinaryTreeNode> path){

        if(root == null) return false;
        if(root==node){
            path.add(root);
            return true;
        }
        path.add(root);
        boolean found=false;
        found =GetNodePath(root.leftNode,node,path)||GetNodePath(root.rightNode,node,path);
        if(!found)
            path.pop();
        return found;
    }
    public BinaryTreeNode GetLastCommonNode(Stack<BinaryTreeNode> stack1, Stack<BinaryTreeNode> stack2){

        Stack<BinaryTreeNode> path1= (Stack<BinaryTreeNode>) stack1.clone();
        Stack<BinaryTreeNode> path2= (Stack<BinaryTreeNode>) stack2.clone();
        //正常情况
        while(!path1.empty() && !path2.empty()){
            BinaryTreeNode node1=path1.pop();
            BinaryTreeNode node2=path2.pop();
            if(node1==node2){
                return node1;
            }
        }
        //此时 输入的两个节点其中一个为另一个的子节点
        if(stack1.size()>stack2.size())
            while (!stack1.empty()){
                BinaryTreeNode node1= stack1.pop();
                BinaryTreeNode node2= stack2.peek();
                if(node1==node2)
                    return node1;
            }
        else{
            while (!stack2.empty()){
                BinaryTreeNode node1= stack2.pop();
                BinaryTreeNode node2= stack1.peek();
                if(node1==node2)
                    return node1;
            }
        }
        return null;
    }

    public BinaryTreeNode GetLastCommonParent(BinaryTreeNode root,BinaryTreeNode node1,BinaryTreeNode node2){

        if(root==null||node1==null||node2==null)
            return null;
        Stack<BinaryTreeNode> path1=new Stack<BinaryTreeNode>();
        Stack<BinaryTreeNode> path2=new Stack<BinaryTreeNode>();
        GetNodePath(root, node1, path1);
        GetNodePath(root, node2, path2);
        return GetLastCommonNode(path1, path2);
    }
}

class BinaryTreeNode {
    int data;
    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;

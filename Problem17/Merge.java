package Problem17;

public class Merge {
	/*
	 * 输入两个递增的链表，合并这两个链表并使新链表仍然是递增的
	 */
	 //递归
	public ListNode merge(ListNode root1,ListNode root2)
	{
		if(root1==null)
			return root2;
		else if(root2==null)
			return root1;
		ListNode mergeHead=null;
		if(root1.data<=root2.data)
		{
			mergeHead=root1;	
			mergeHead.nextNode=merge(root1.nextNode,root2);			
		}
		else {
			mergeHead=root2;	
			mergeHead.nextNode=merge(root1,root2.nextNode);			
		}
		return mergeHead;
	}
    //不用递归 就是有点麻烦
    public ListNode merge(ListNode root1,ListNode root2)
	{

		ListNode mergeHead=null;
		if(root1.data<=root2.data){
			mergeHead=root1;
			root1=root1.nextNode;}
		else {
			mergeHead=root2;
			root2=root2.nextNode;}
		ListNode Head=mergeHead;
		while(root1!=null && root2!=null){
			if(root1.data<=root2.data){
				mergeHead.nextNode=root1;
				root1=root1.nextNode;
			}else{
				mergeHead.nextNode=root2;
				root2=root2.nextNode;
			}
			mergeHead=mergeHead.nextNode;
		}
		while(root1!=null){
			mergeHead.nextNode=root1;
			root1=root1.nextNode;
			mergeHead=mergeHead.nextNode;
		}
		while(root2!=null){
			mergeHead.nextNode=root2;
			root2=root2.nextNode;
			mergeHead=mergeHead.nextNode;
		}
		return Head;
	}

}
class ListNode
{
	int data;
	ListNode nextNode;
}

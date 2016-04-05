package Problem57;

public class DeleteDuplication {
	/*
	 * 删除单链表中的重复结点
	 */
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead==null)
			
			return null;
		ListNode pPreNode=null;
		ListNode pNode=pHead;
		while(pNode!=null){
			ListNode pNext =pNode.next;
			boolean needDelete=false;
			if(pNext!=null && pNext.data==pNode.data)
				needDelete=true;
			if(!needDelete){
				pPreNode=pNode;
				pNode=pNode.next;
			}else{
				int value=pNode.data;
				ListNode pToBeDel=pNode;
				while(pToBeDel!=null && pToBeDel.data==value){
					pNext=pToBeDel.next;
					pToBeDel=pNext;
				}
				if(pPreNode==null){
					pHead=pNext;
				}
				else
					pPreNode.next=pNext;
				pNode=pNext;
			}
		}
		return pHead;
	}

}
 class ListNode {
	public int data;
	public ListNode next;

}

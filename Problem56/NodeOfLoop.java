package Problem15;

public class NodeOfLoop {
    /*
     * 找到链表中环形的入口处
     */
    public ListNode EntryNodeOfLoop(ListNode head) {
        if (head == null)
            return null;
        ListNode meetingNode=MeetingNode(head);
        if(meetingNode==null)
            return null;
        int nodesInLoop=1;
        ListNode  pNode1=meetingNode;
        //统计环中节点总数
        while(pNode1.nextNode!=meetingNode){
            pNode1=pNode1.nextNode;
            nodesInLoop++;
        }
        pNode1=head;
        for(int i=0;i<nodesInLoop;i++)
            pNode1=pNode1.nextNode;
        ListNode pNode2=head;
        while (pNode1!=pNode2){
            pNode1=pNode1.nextNode;
            pNode2=pNode2.nextNode;
        }
        return pNode1;
    }
    //找到环中任意节点
    public ListNode MeetingNode(ListNode pHead) {
        if(pHead==null)
            return null;
        ListNode pSlow=pHead.nextNode;
        if (pSlow==null)
            return null;
        ListNode pFast=pSlow.nextNode;
        while(pSlow!=null&&pFast!=null){
            if(pFast==pSlow)
                return pFast;
            pSlow=pSlow.nextNode;
            pFast=pFast.nextNode;
            if(pFast!=null)
                pFast=pFast.nextNode;
        }
        return  null;
    }
}
class ListNode
{
    int data;
    ListNode nextNode;
}
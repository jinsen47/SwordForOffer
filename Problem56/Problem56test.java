package Problem15;

public class Problem15test {
	public static void main(String args[])
	{
        ListNode node1=new ListNode();
        ListNode node2=new ListNode();
        ListNode node3=new ListNode();
        ListNode node4=new ListNode();
        ListNode node5=new ListNode();
        ListNode node6=new ListNode();
        node1.data=1;
        node2.data=2;
        node3.data=3;
        node4.data=4;
        node5.data=5;
        node6.data=6;
        node1.nextNode=node2;
        node2.nextNode=node3;
        node3.nextNode=node4;
        node4.nextNode=node5;
        node5.nextNode=node6;
        node6.nextNode=node3;

        NodeOfLoop test=new NodeOfLoop();
        System.out.println(test.EntryNodeOfLoop(node1).data);
	}

}

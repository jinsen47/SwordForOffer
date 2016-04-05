package Problem15;

public class Problem15test {
		public static void main(String[] args) {
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode four=new ListNode();
		ListNode five=new ListNode();
		ListNode six=new ListNode();
		ListNode senven=new ListNode();
		
		head.next=second;
		second.next=third;
		third.next=four;
		four.next=five;
		five.next=six;
		six.next=senven;
		
		head.data=1;
		second.data=1;
		third.data=2;
		four.data=3;
		five.data=4;
		six.data=4;
		senven.data=5;
		
		DeleteDuplication deleteDuplication=new DeleteDuplication();
		head=deleteDuplication.deleteDuplication(head);
		
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}

	}
}
}

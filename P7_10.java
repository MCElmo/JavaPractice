
public class P7_10 {
	public static void main(String[] args) {
		
	}
	
	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode current = head;
        ListNode insert = current;
        ListNode leapNode = current;
        while(true)
        {
        	//Leap Current Forward
        	if(current.next == null)
        	{
        		return dummyHead.next;
        	}
        	current = current.next;
        	//At one before next node to swap.
        	if(current.next == null)
        	{
        		return dummyHead.next;
        	}
        	leapNode = current.next;
        	if(leapNode.next == null)
        	{
        		current.next = null;
        	}else
        	{
        		current.next = leapNode.next;
        	}
        	leapNode.next = insert.next;
        	insert.next = leapNode;
        	insert = insert.next;
        	
        	//After Insertion current has moved up by one. So we dont need to do anything.
        }
        	
    }
}

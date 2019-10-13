
public class P7_3 {
	public static void main(String[] args) {
		
	}
	
	
	
	public static boolean hasCycle(ListNode L)
	{
		ListNode fast = L.next;
		if(fast != null)
			fast = fast.next;
		ListNode slow = L;
		while(fast != null && slow != null)
		{
			if(fast == slow)
				return true;
			if(fast.next != null)
			{
				fast = fast.next.next;
			}
			slow = slow.next;
		}
		return false;
	}
}


public class P7_4 {
	
	public static void main(String[] args) {
		
	}
	
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		if(headA.next == null && headB.next == null)
		{
			return headA == headB ? headA : null;
		}else
		{
			ListNode intNode;
			intNode = getIntersectionNode(headA.next == null ? headA : headA.next, headB.next == null ? headB : headB.next);
			if(intNode == null)
				return null;
			else
			{
				if(headA == headB)
					return headA;
				else if(headA.next == headB)
				{
					return headB;
				}else if(headB.next == headA)
				{
					return headA;
				}else
				{
					return intNode;
				}
			}
		}
    }
}

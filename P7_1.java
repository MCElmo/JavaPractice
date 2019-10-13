import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}

public class P7_1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1 = Arrays.asList(1,2,3,5,7,9);
		list2 = Arrays.asList(-3,6,8,10,14);
		System.out.println(merge(list1,list2));
	}
	
	public static List<Integer> merge (List<Integer> list1, List<Integer> list2)
	{
		List<Integer> returnList = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i < list1.size() && j < list2.size())
		{
			if(list1.get(i) <= list2.get(j))
			{
				returnList.add(list1.get(i++));
			}else
			{
				returnList.add(list2.get(j++));				
			}
		}
		while(i < list1.size())
			returnList.add(list1.get(i++));
		while(j < list2.size())
			returnList.add(list2.get(j++));
		
		return returnList;
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		ListNode returnList = new ListNode(0);
		ListNode current = returnList;
		while(l1 != null && l2 != null )
		{
			
			if(l1.val <= l2.val)
			{
				returnList.val = l1.val;
				returnList.next = new ListNode(0);
				returnList = returnList.next;
			}else
			{
				returnList.val = l2.val;
				returnList.next = new ListNode(0);
				returnList = returnList.next;
			}
		}
		
		while(l1 != null)
		{
			returnList.val = l1.val;
			returnList.next = new ListNode(0);
			returnList = returnList.next;
		}
		while(l2 != null)
		{
			returnList.val = l2.val;
			returnList.next = new ListNode(0);
			returnList = returnList.next;
		}
		
		
		
		return returnList;
	}

}

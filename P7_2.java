import java.util.ArrayList;
import java.util.List;

public class P7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode reverseList(ListNode list, int s, int j)
	{
		List<Integer> temp = new ArrayList<Integer>(j-s);
		ListNode tempList = list;
		int count = 0;
		while(count <= j)
		{
			if(count >= s)
			{
				temp.add(list.val);
			}
			count++;
			tempList = tempList.next;
		}
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = list;
		count = 0;
		while(count <= j)
		{
			if(count >= s)
			{
				list.val = temp.get(count -s);
			}
			list = list.next;
			count++;
		}
		return dummyHead.next;
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,6,7,8,2,7,2,6,5,7,2,-1,3,4,2,7};
		partition(arr,3);
		int[] arr2 = new int[]{1,2,6,7,8,2,7,2,6,5,7,2,-1,3,4,2,7};
		part2(arr2,3);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}
	
	//Reorder the array such that all elements less than A[i] appear first followed by equal elements followed by greater elements.
	public static final void partition(int[] arr, int idx)
	{
		List<Integer> smaller = new ArrayList<Integer>();
		List<Integer> larger = new ArrayList<Integer>();
		List<Integer> equal = new ArrayList<Integer>();
		int target = arr[idx];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < target)
				smaller.add(arr[i]);
			else if(arr[i] > target)
				larger.add(arr[i]);
			else 
				equal.add(arr[i]);
		}
		int counter = 0;
		for(int i : smaller)
		{
			arr[counter++] = i;
		}
		for(int i : equal)
		{
			arr[counter++] = i;
		}
		for(int i : larger)
		{
			arr[counter++] = i;
		}
	}
	
	//Make 2 passess over the array
	public static final void part2(int[] arr, int idx)
	{
		int small = 0;
		int larg = arr.length -1;
		int target = arr[idx];
		for(int i = 0; i < arr.length -1; i++)
		{
			if(arr[i] < target)
				swap(arr,i,small++);
		}
		for(int i = arr.length -1; i > 0; i--)
		{
			if(arr[i] > target)
				swap(arr,i,larg--);
		}
	}
	
	public static void swap(int[] arr, int i, int j)
    {
    	arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
    	
    }

}

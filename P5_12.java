import java.util.Arrays;
import java.util.Random;

public class P5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {Integer.MAX_VALUE,1,2,Integer.MIN_VALUE,4,-1 };
		rand(arr,5);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		arr[i] += arr[j] - (arr[j] = arr[i]);
	}
	
	public static void rand(int[] arr, int k)
	{
		Random rand = new Random();
		int i = 0;
		while(i < k)
		{
			int idx =  i + rand.nextInt(arr.length - i);
			swap(arr,idx,i++);
		}
	}
}

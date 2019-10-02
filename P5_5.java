import java.util.Arrays;

public class P5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {-1,0,0,0,1,2,2,2,3,4,4,4,5,6,6,6,6,7,7,7,7};
		
		System.out.println(deleteDup(arr));
		System.out.println(Arrays.toString(arr));
	}
	
	public static int deleteDup(int[] arr)
	{
		int index = 0;
		int last = arr[0];
		int lastIndex = 1;
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > last)
			{
				arr[lastIndex++] = arr[i];
				last = arr[i];
			}
		}
		return lastIndex;
			
	}

}

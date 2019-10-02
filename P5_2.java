import java.util.Arrays;

public class P5_2 {
	public static void main(String[] args) {
		int[] arr = new int[] {3,9};
		increment(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void increment(int[] arr)
	{
		int i = arr.length;
		boolean cont = false;
		do
		{
			
			cont = false;
			i--;
			if(i < 0) break;
			int num = arr[i];
			num++;
			if(num >= 10)
			{
				cont = true;
				num = 0;
			}
			arr[i] = num;
		} while (cont);
	}
}

import java.util.HashMap;
import java.util.Scanner;

public class P5_6 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int cases = scanner.nextInt();
//		for(int i = 0; i < cases; i++)
//		{
//			int size = scanner.nextInt();
//			scanner.nextLine();
//			int[] test = new int[size];
//			for(int j = 0; j < size;j++)
//			{
//				test[j] = scanner.nextInt();
//			}
//			scanner.nextLine();
//			System.out.println(maxProfit(test));
//		}
		
		// TODO Auto-generated method stub
		int[] test = new int[] {310,315,275,235,260,270,290,230,255,250};
		int[] test2 = new int[] {0};
		int[] test3 = new int[] {45,46,728,2824,72,47,27,8,254,27};
		int[] test4 = new int[] {1,3,6,9};
		char s = 4;
		System.out.println(max2(test));
		System.out.println(max2(test2));
		System.out.println(max2(test3));
		System.out.println(max2(test4));
	}
	
//	public static int maxProfit(int[] array)
//	{
//		if(array.length <=1)
//			return 0;
//		HashMap<Integer,Integer> profitMap = new HashMap<Integer,Integer>();
//		profitMap.put(array[0], 0);
//		int min = Integer.MAX_VALUE;
//		for(int i = 1; i < array.length; i++)
//		{
//			for(int low : profitMap.keySet())
//			{     y[i] - low));
//			}
//			if(array[i] < min)
//			{
//				profitMap.put(array[i], 0);
//				
//			}
//		}
//		
//		int max = 0;
//		for(int value: profitMap.values())
//		{
//			max = Math.max(max, value);
//		}
//		
//		return max;
//	}
	
	public static int max2(int[] arr)
	{
		int minPrice = Integer.MAX_VALUE, maxProf = 0;
		//HashMap<Integer,Integer>
		for(int i : arr)
		{
			maxProf = Math.max(maxProf, i - minPrice);
			minPrice = Math.min(minPrice, i);
		}
		return maxProf;
	}

}

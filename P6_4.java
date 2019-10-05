import java.util.Arrays;

public class P6_4 {
	public static void main(String[] args) {
		char[] test = "abac   0."
				+ "".toCharArray();
		System.out.println(Arrays.toString(convert(test,4)));
	}
	
	public static char[] convert(char[] array, int x)
	{
		char[] result = new char[array.length]; 
		int idx = 0;
		for(int i = 0; i < x; i++)
		{
			if(array[i] == 'a')
			{
				result[idx++] = 'd';
				result[idx++] = 'd';
			}else if(array[i] != 'b')
			{
				result[idx++] = array[i];
			}
		}

		return result;
	}
}

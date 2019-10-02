import java.util.ArrayList;
import java.util.List;

public class P5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = new int[][] { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] test3 = new int[][] { {7},{9}, {6}};
		int[][] test2 = new int[][] { {1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(test3).toString());
		System.out.println(spiralOrder(test2).toString());

	}
	
	public static List<Integer> spiralOrder(int[][] array)
	{
		if(array.length == 0)
            return new ArrayList<Integer>();
		int width = array[0].length;
		int height = array.length;
		return spiralRecur(array,0,0,width, height);
	}
	
	public static List<Integer> spiralRecur(int[][] arr, int x, int y, int width, int height)
	{
		List<Integer> ret = new ArrayList<Integer>();
		//Check base Case
		if(width <= 0 || height <= 0)
			return ret;
		
		//x,y is the position of the top left of the array we are examining;
		
		//Generate the spiral border
		for(int i = x; i < x + width; i++)
		{
			ret.add(arr[y][i]);
		}
		
		//Generate the right side
		for(int i = y+1; i < y + height -1; i++)
		{
			ret.add(arr[i][x + width -1]);
		}
		
		//Generate the bottom
		for(int i = x + width -1; i > x; i--)
		{
			if(y + height -1 != y)
				ret.add(arr[y + height -1][i]);
		}
		
		//Generate the left side
		for(int i = y + height -1; i > y; i--)
		{
			if(i != y)
				ret.add(arr[i][x]);
		}
		
		ret.addAll(spiralRecur(arr, x +1, y+1, width -2, height -2));
		
		return ret;
	}
}

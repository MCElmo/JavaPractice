import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	
	public static void main(String[] args) {
		int[][] points = { {1,3},{-2,-2}};
		System.out.println(Arrays.toString(kClosest(points,1)));
	}
	 
	static PriorityQueue<int[]> maxHeap;
	public static int[][] kClosest(int[][] points, int K) {
		maxHeap = new PriorityQueue<int[]>(K,Collections.reverseOrder());
		for(int[] point : points)
		{
			if(maxHeap.size() < K)
			{
				maxHeap.add(point);
			}else
			{
				if(distance(point) < distance(maxHeap.peek()))
				{
					maxHeap.remove();
					maxHeap.add(point);
				}
			}
		}
		int[][] result = new int[maxHeap.size()][2];
		return maxHeap.toArray(result);
	}
	
	public static float distance(int[] x)
	{
		return (float) (Math.sqrt(Math.pow(x[0], 2) + Math.pow(x[1], 2)));
	}
}

import java.util.HashMap;
import java.util.Map;

class Rect
    {
        int x,y, width, height;
        public Rect(int x,int y, int width, int height)
        {
        //Lower left most point of Rectangle
            this.x = x;
             this.y = y;
            this.width = width;
            this.height = height;
        }
        
        @Override
        public String toString() {
        // TODO Auto-generated method stub
        return String.format("(%d,%d) - %d x %d", x,y,width,height);
        }
}

class Point
{
	int x,y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
 public class P4_11
{
    public static void main(String[] args) {
    	System.out.println(intersectRect(new Rect(0,0,5,5), new Rect(1,1,2,3)));	
    	System.out.println(intersectRect(new Rect(5,6,5,5), new Rect(1,1,2,3)));	
        System.out.println(intersectRect(new Rect(5,6,5,5), new Rect(1,1,19,56)));
        Point[] points2 = {new Point(0,0), new Point(1,5), new Point(1,7), new Point(0,5)};
        Point[] points = {new Point(0,0), new Point(1,5), new Point(1,0), new Point(0,5)};
        Point[] points3 = {new Point(0,0), new Point(1,0), new Point(2,0), new Point(3,0)};
        System.out.println(isRect(points));
        System.out.println(isRect(points2));
        System.out.println(isRect(points3));
        int[] test = new int[]{Integer.MAX_VALUE + 3 - Integer.MAX_VALUE, Integer.MAX_VALUE};
        swap(test,0,1);
        System.out.println(test[1]);
        System.out.println(test[0]);
    }
    
    public static boolean isRect(Point[] points)
    {
    	if(points.length != 4) return false;
    	Map<Integer,Integer> xMap = new HashMap<>(4,1);
    	Map<Integer,Integer> yMap = new HashMap<>(4,1);
    	
    	for(Point p : points)
    	{
    		if(xMap.containsKey(p.x))
    			xMap.put(p.x, xMap.get(p.x)+1);
    		else
    		{
    			if(xMap.size() >= 2) { return false;}
    			xMap.put(p.x, 1);
    		}
    		if(yMap.containsKey(p.y))
    			yMap.put(p.y, yMap.get(p.y)+1);
    		else
    		{
    			if(yMap.size() >= 2) { return false;}
    			yMap.put(p.y, 1);
    		}
    	}
    	if(xMap.size() != 2) { return false;}
    	if(yMap.size() != 2) { return false;}
    	if(xMap.get(points[0].x) != 2) { return false;}
    	if(yMap.get(points[0].y) != 2) { return false;}
    	
    	return true;
    }
    
    
    
        
    //Assume overlapping borders is an intersection
    public static Rect intersectRect(Rect r1, Rect r2)
    {
        if(!isIntersect(r1, r2))
        {
            return new Rect(0,0,-1,-1);
        }
        int newX, newY,newWidth, newHeight;
        newX = Math.max(r1.x, r2.x);
        newY = Math.max(r2.y,r1.y);
        newWidth = Math.min(r1.width + r1.x, r2.x + r2.width) - newX;
        newHeight = Math.min(r1.height + r1.y, r2.y + r2.height) - newY;
        // if(r1.x <= r2.x)
        // {
        //     newX = r2.x;
        // }    
        // else
        //     newX = r1.x;      
        // if(r1.y <= r2.y)
        // {
        //     newY = r2.y;
        // }
        // else
        // {
        //     newY = r1.y;
        // }
//        if(r1.x + r1.width <= r2.x + r2.width)
//            newWidth = r1.x + r1.width - newX;
//        else
//            newWidth = r2.width - newX;
//        if(r1.y + r1.height <= r2.y + r2.height)
//            newHeight = r1.y+ r1.height - newY;
//        else
//            newHeight = r2.height - newY;
        return new Rect(newX, newY, newWidth, newHeight);           

    }

    public static boolean isIntersect(Rect r1, Rect r2)
    {
        if(r1.x + r1.width < r2.x) { return false;}
        if(r1.y + r1.height < r2.y) { return false;}
        if(r2.x + r2.width < r1.x) { return false;}
        if(r2.y + r2.height < r1.y) { return false;}
        return true;
    }


}
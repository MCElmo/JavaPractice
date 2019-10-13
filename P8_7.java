class MyCircularQueue {
    
    int[] array;
    int front = 0,back = -1;
    int limit;
    boolean empty = true;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array = new int[k];
        limit = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(back - front >= limit)
        	return false;
        if(back+1 >= limit)
        {
        	back = -1;        	
        }
        array[++back] = value; 
        empty = false;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) return false;
        	front++;
        	if(front >= limit)
        		front = 0;
        	if(front == back) empty = true;
        	return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty())
        	return array[front];
        else
        	return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return isEmpty() ? -1 : array[back];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return empty;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return back-front >= limit;
    }
}

public class P8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P5_9 {

	public static void main(String[] args) {
		System.out.println(primes(100000).toString());

	}
	 
	public static List<Integer> primes(int n)
	{
		//With solution we waste time by computing if certain numbers are prime multiple times.
		//Better approach is to keep a boolean of primes that contains the multiples of each prime number up to n.
		//That solution checks odd numbers also. My solution seems pretty good.
//		List<Integer> primes = new ArrayList<Integer>();
//		if(n < 0) {return primes;}
//		primes.add(2);
//		outer: for(int i = 3;i <= n; i+=2)
//		{
//			for(int p : primes)
//			{
//				if(p > Math.sqrt(i)) {break;}
//				if(i % p == 0)
//					continue outer;
//			}
//			primes.add(i);
//		}
//		
//		if(n < 3) {return 0;}
//        int count = 1;
        //More efficient solutin
		//ADD CHECK FOR N < 2
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n +1, true));
		isPrime.set(0, false);
		isPrime.set(1, false);
		isPrime.set(2, true);
        for(int i = 3;i < n; i+=2)
		{
        	if(isPrime.get(i))
        	{
        		primes.add(i);
        		for(int p = 2 * i; p < n; p += i)
        		{
        			isPrime.set(p, false);
        		}
        	}
		}
		return primes;
		
		
	}
}

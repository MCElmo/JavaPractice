public class P4_7
{
    public static void main(String[] args) {
        System.out.println(pow(2, 12));
        System.out.println(pow(2,5));
    }

    //Write a function that returns x to the power of y.
    //pow(3,2) = 9;
    //Assume y is non-negative
   public static double pow(double x, int y)
   {
       double result = 1.0;
       int power = y;
       while(power != 0)
       {
           if((power & 1) != 0)
           {
                result *= x;
           }
           x *= x;
           power >>>=1;
       }
       return result;    
   }

    public static double powRecursive(double x, int n)
    {
        if(n == 0)
            return 1;
           
        double temp = pow(x, n /2);
        
        if(n % 2 == 0)
        {
            return temp * temp;
        }else
        {
            if(n > 0)
                return x * temp * temp;
            else
                return (temp * temp)/x;    
        }
    }
   
}
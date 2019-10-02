public class P4_1Variants 
{
    public static void main(String[] args) {
        System.out.println(P4_1Variants.rightpop(0b01010000) == 0b01011111);
        System.out.println(P4_1Variants.rightpop(0b1) == 0b1);
        System.out.println(P4_1Variants.rightpop(0b0) == 0b0);
        System.out.println(mod(77,64) == 13);
        System.out.println(mod(77,32) == 13);
        System.out.println(mod(78,32) == 14);
        System.out.println(mod(16,32) == 16);
        System.out.println(mod(16,16) == 0);
        System.out.println(mod(19,16) == 3);
        System.out.println(mod(19,1) == 0);
        System.out.println(mod(19,2) == 1);
        System.out.println(pow2(19) == false);
        System.out.println(pow2(9) == false);
        System.out.println(pow2(21) == false);
        System.out.println(pow2(8) == true);
        System.out.println(pow2(16));
        System.out.println(pow2(2));
        System.out.println(pow2(32));
        System.out.println(pow2(64));
        System.out.println(pow2(128));
        System.out.println(pow2(129) == false);
    }
        
    //Right propogate the rightmost set bit in x, e.g turns (01010000) to (01011111)
    public static int rightpop(int x)
    {
        if(x == 0) { return 0;}
        return x + ((x & ~(x-1))-1);
    }

    //Compute x mod a power of 2, returns 13 for 77 mod 64;
    //Assumptioms Y is a positve power of 2.
    public static int mod(int x, int y)
    {
        int exp = 0;
        while(y > 1)
        {
            y /= 2;
            exp++;
        }

        return x & ((1<<exp) -1) ;
    }

    public static boolean pow2(int x)
    {
        return x -(x & ~(x-1)) == 0;
    }
}
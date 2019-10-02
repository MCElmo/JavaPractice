public class P4_3Variants 
{
    public static int[] lookup = new int[256];
    public static void main(String[] args) {
        populateLookup();
        System.out.println(reverse(0b1011) == 0b11010000000000000000000000000000);
        System.out.println(reverse(0b10101010101010101010101010101010) == (0b01010101010101010101010101010101));
        System.out.println(reverse(0b10101010101010101010101010101011) == (0b11010101010101010101010101010101));
        System.out.println(lookup[0b11100000] == (0b00000111));
    }

    public static void populateLookup()
    {
        for(int i = 0; i < 256; i++)
        {
            int start = 7;
            int end = 0;
            int j = i;
            while(start >= 4)
            {
                j = swapBits(j, start, end);
                start--;
                end++;
            }
            lookup[i] = j;
        }
    }

    public static int swapBits(int x, int i, int j)
    { 
        if(((x >> i) & 1) != ((x >> j) & 1))
        {
            x = (x ^ (1 << i)) ^ (1 << j); 
        
        }
        return x;
    }

    //Reverse a 64 bit unsigned integer
    public static int reverse(int x)
    {
        //Alot of the same calculations would be made
        //Would be most optimal to use a lookup table in this situation
        //reverse(1101) == getReverese(01) + getReverse(11) for a 4 bit integer.
        //getReverese()
        //Define a bit mask = 0xFF - Grabs last 8 bits
        //For a 32 bit integer reverse(x & mask) + reverse(x >> 8 & mask) + reverse(x >> 16 & mask) + reverse(x >> 24 & mask);
        int mask = 0xFF;
        int shift = 8;
        return (getReverse(x & mask) << shift * 3) + (getReverse((x >>> shift) & mask) << shift * 2) + (getReverse((x >>> shift * 2) & mask) << shift)
         + getReverse((x >>> shift * 3) & mask);

         //Time complexity is O(n/L) for n-bit integers and L bit cache keys = O(32/8)
    }
        
    //Gets the reverse of an 8 bit int
    public static int getReverse(int x)
    {
        return lookup[x];
    }
}
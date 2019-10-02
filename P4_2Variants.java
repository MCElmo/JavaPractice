public class P4_2Variants 
{
    public static void main(String[] args) {
        System.out.println(swapBits(0b1001, 1, 3) == 0b0011);
        System.out.println(swapBits(0b1001, 1, 3) == 0b0011);
        System.out.println(swapBits(0b10010000, 1, 7) == 0b00010010);
        System.out.println(swapBits(0b10010000, 1, 1) == 0b10010000);
        System.out.println(swapBits(0b10010010, 1, 4) == 0b10010010);
        System.out.println(swapBits(0b10010010, 0, 4) == 0b10000011);
    }
        
    //Swap bits at indexs i and j
    public static int swapBits(int x, int i, int j)
    {
        //Get the bit at indexes I and j

        //If ~(i ^ j) == 0
        //We need to switch the bits.  
        int sum = 0;
        sum ^= (x & (1 << i)) >>> i;
        sum ^= (x & (1 << j)) >>> j;
        //Above 3 lines are redundanct.
        //Would have been simpler to check if ((x >> i) & 1) != ((x >> j) & 1)
        if(sum != 0)
        {
            x = (x ^ (1 << i)) ^ (1 << j); 
        }
        return x;
    }
}
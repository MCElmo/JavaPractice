public class P4_9
{
    public static void main(String[] args) {
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(-5));
        System.out.println(isPalindrome(15));
        System.out.println(isPalindrome(55));
        System.out.println(isPalindrome(565));
        System.out.println(isPalindrome(1331));
        System.out.println(isPalindrome(134431));
        System.out.println(isPalindrome(13449431));
        System.out.println(isPalindrome(1378731));
    }

    public static boolean isPalindrome(int x)
    {
        if(x < 0) return false;
        int length = (int) Math.floor(Math.log10(x));
        while(x != 0)
        {
            //Length of the number -1
            //Check if first and lasts digit are equal
            if(x / (int) Math.pow(10, length) != x % 10) return false;

            x %= Math.pow(10,length); //Better way to remove first digit;
            //x -= (int) (Math.pow(10, length) * (x%10)); //remove first digit
            x /= 10; //remove last digit
            length -= 2; //We have removed two digits from the number.
        }
        return true;
    }


}
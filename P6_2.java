
public class P6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(baseConvert("100", 10,7));
		System.out.println(convertToBase7(-7));
	}
	
	//Converts a string in b1 to a String in b2. 1 <= b1,b2 <= 16
	public static String baseConvert(String s, int b1, int b2)
	{
		if(s.equals("")) { return "";}
		if(b1 == b2) { return s;}
		int x = b10version(s, b1);
		char[] conversions = new char[16];
		String c = "0123456789ABCDEF";
		for(int i = 0; i < 16; i++)
		{
			conversions[i] = c.charAt(i);
		}
		StringBuilder result = new StringBuilder();
		while(x != 0)
		{
			int rem = x % b2;
			x /= b2;
			result.insert(0,conversions[Math.abs(rem)]);
		}
		return result.toString();
	}

	public static int b10version(String s, int b1) {
		int pow = 0;
		int result = 0;
		s = new StringBuilder(s).reverse().toString();
		for(char digit: s.toCharArray())
		{
			result += charConvert(digit) * Math.pow(b1, pow++);
		}
		return result;
	}
	
	public static int charConvert(char c)
	{
		if(c >= 'A') { return c - 'A' + 10;}
		else { return c - '0';}
	}
	
	public static String convertToBase7(int x) {
        boolean neg = false;
        if(x < 0)
        {
            x = -x;
            neg = true;
        }
        int b2 = 7;   
		StringBuilder result = new StringBuilder();
		while(x != 0)
		{
			int rem = x % b2;
			x /= b2;
			result.insert(0,rem);
		}
        if(neg) result.insert(0,"-");
		return result.toString();
    }
}

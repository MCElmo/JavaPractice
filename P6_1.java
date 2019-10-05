import java.util.OptionalInt;

public class P6_1 {
	public static void main(String[] args) {
		System.out.println(STI("124"));
		System.out.println(STI("-124"));
		System.out.println(ITS(4653));
		System.out.println(ITS(-4653));
	}
	
	public static int STI(String s)
	{
		if(s.equals(""))
			return 0;
		boolean neg = false;
		if(s.charAt(0) == '-')
		{
			neg = true;
			s = s.substring(1);
		}
		int num = 0;
		int xy = s.chars().reduce(0, (sum,y) -> sum * 10 + y - '0');
		for(char x: s.toCharArray())
		{
			num *= 10;
			num += x - '0';
		}
		return xy;
		//return neg ? -num : num;
	}
	
	public static String ITS(int x)
	{
		StringBuilder str = new StringBuilder();
		boolean neg = false;
		if(x < 0)
		{
			neg = true;
			x = -x;
		}
		while(x != 0)
		{
			int j = x% 10;
			x/= 10;
			str.insert(0,j);
		}
		if(neg)
			str.insert(0,'-');
		return str.toString();
	}
}

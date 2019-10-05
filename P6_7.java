
public class P6_7 {

	public static void main(String[] args) {
		System.out.println(lookAndSay(4));

	}
	
	
	public static String lookAndSay(int x)
	{
		if(x == 0) { return ""; }
		int count = 1;
		int lastCount = 0;
		char last = '1';
		String res = "1";
		String temp = "";
		while(count < x)
		{
			temp = "";
			if(res.length() > 0)
			{
				last = res.charAt(0);
				lastCount = 0;
			}
			for(char c: res.toCharArray())
			{
				if(c != last)
				{
					temp += String.valueOf(lastCount) + last;
					last = c;
					lastCount = 1;
				}else
				{
					lastCount++;
				}
			}
			res = temp + String.valueOf(lastCount) + last;
			count++;
		}
		return res;
	}
}


public class P6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromicString("A man, a plan, a canal, Panama"));
		System.out.println(isPalindromicString("Ap,x,pA"));
		System.out.println(isPalindromicString("Ap,x,pA"));
		System.out.println(isPalindromicString(" "));

	}
	
	
	public static boolean isPalindromicString(String s)
	{
		if (s.equals("") || s.trim().length() == 0) return true;
		int start = 0;
		int end = s.length() -1;
		s = s.toLowerCase();
		while(start < end)
		{
			if(!Character.isLetter(s.charAt(start)))
			{
				start++;
				continue;
			}
			if(!Character.isLetter(s.charAt(end)))
			{
				end--;
				continue;
			}
			if(s.charAt(start) != s.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}


public class P6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sentenceReverse("a good   example".toCharArray()));
	}
	
	 
	public static String sentenceReverse(char[] sentence)
	{
		String s = String.valueOf(sentence);
		String[] split = s.split(" ");
		String result = "";
		for(String str : split)
		{
			if(!(str.trim().equals("")))
				    result = str + " " + result;
		}
		return result.substring(0,result.length() -1);
	}
}

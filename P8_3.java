import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class P8_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true)
		{
			String s = in.nextLine();
			System.out.println(isValid(s));
		}
	}
	
	public static boolean isValid(String s) {
		Map<Character,Character> charMap = new HashMap(5,1);
		charMap.put('(',')');
		charMap.put('{','}');
		charMap.put('[',']');
		Stack<Character> temp = new Stack<Character>();
		for(char c: s.toCharArray())
		{
			if(charMap.containsKey(c))
			{
				temp.push(charMap.get(c));
			}else
			{
				if(temp.empty()) return false;
				if(temp.pop() != c) return false;
			}
		}
		return temp.empty();
	}
}

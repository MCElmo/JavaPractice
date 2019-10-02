import java.util.*;
import java.util.List;

public class P5_17 {

	public static void main(String[] args) {

	}

	public boolean isValidSudoku(char[][] board) 
	{
		//Check rows
		for(char[] bd : board)
		{
			if(!checkDuplicates(bd)) return false;		
		}
		
		//Check Columns
		for(int i = 0; i < 9; i++)
		{
			char[] col = new char[9];
			int idx = 0;
			for(char[] bd: board)
			{
				col[idx++] = bd[i];
			}
			if(!checkDuplicates(col)) return false;
		}
		
		//Check all 
		for(int k = 0; k < 3; k ++)
		{
			for(int j = 0; j < 3; j++)
			{
				char[] col = new char[9];
				int idx = 0;
				for(int i = (k * 3); i < ((k + 1) * 3); i++)
				{
					for(int q = (j * 3); q < ((j + 1) * 3); q++)
					{
						col[idx++] = board[i][q];
					}
				}
				if(!checkDuplicates(col)) return false;
			}
		}
		
		return true;
	}

	public static boolean checkDuplicates(char[] board) {
		Set<Character> seen = new HashSet<Character>();
		for (char c : board) {
			if (seen.contains(c))
				return false;
			if(c != '.')
				seen.add(c);
		}
		return true;
	}

}

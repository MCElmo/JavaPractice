
class BalObj {
	boolean balanced;
	int height;
	public BalObj(boolean balanced, int height)
	{
		this.balanced = balanced;
		this.height = height;
	}
}


public class P9_1 {
	public static void main(String[] args) {
		
	}
	
	
	public boolean isBalanced(TreeNode root) {
        BalObj leftBalanced = balanceCheck(root.left);
        if(!leftBalanced.balanced) { return false;}
        BalObj rightBalanced = balanceCheck(root.right);
        if(!rightBalanced.balanced) { return false;}
        return Math.abs(leftBalanced.height - rightBalanced.height) <= 1;
    }
	
	public static BalObj balanceCheck(TreeNode node)
	{
		if(node == null)
		{
			return new BalObj(true, 0);
		}
		BalObj leftBalanced = balanceCheck(node.left);
		if(!leftBalanced.balanced)
		{
			return leftBalanced;
		}
		BalObj rightBalanced = balanceCheck(node.right);
		if(!rightBalanced.balanced)
		{
			return rightBalanced;
		}
		if(Math.abs(leftBalanced.height - rightBalanced.height) > 1)
		{
			return new BalObj(false,0);
		}
		return new BalObj(true, Math.max(leftBalanced.height, rightBalanced.height) + 1);
	}
}

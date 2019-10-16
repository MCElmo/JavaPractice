
public class P9_2 {
	public static void main(String[] args) {
		
	}
	
	public boolean isSymmetric(TreeNode root) {
		if(root == null) { return true;}
        return symmetry(root.left, root.right);
    }
	
	public boolean symmetry(TreeNode left, TreeNode right)
	{
		if(left == null && right == null)
		{
			return true;
		}else if(left != null && right != null)
		{
			return left.val == right.val && symmetry(left.right, right.left)
					&& symmetry(left.left, right.right);
		}else
		{
			//One is Null and the other is not
			return false;
		}
	}
}

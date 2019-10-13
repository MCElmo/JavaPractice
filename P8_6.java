import java.util.ArrayList;
import java.util.List;

public class P8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> levelOrder(TreeNode root) 
	{
		List<List<Integer>> levelOrderTraversal = new ArrayList<>();
		return levelOrderTraversal;
	}
	
	public void traverse(TreeNode root, int level, List<List<Integer>> traversal)
	{
		if(root == null)
			return;
		if(level < traversal.size())
		{
			traversal.add(new ArrayList<>());
		}
		traversal.get(level -1).add(root.val);
		traverse(root.left,level +1, traversal);
		traverse(root.right,level +1,traversal);
		return;
	}
}

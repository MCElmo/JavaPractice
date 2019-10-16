import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.Node;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        return traverse(root, new ArrayList<Integer>());
    }
	
	public List<Integer> inorderTraversal2(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> q = new Stack<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
        	if(q.peek() == null)
        	{
        		q.pop();
        		continue;
        	}
        	if(!(q.peek().left == null))
        	{
                TreeNode left = q.peek().left;
                q.peek().left = null;
        		q.push(left);
        		continue;
        	}
        	TreeNode node = q.pop();
        	list.add(node.val);
        	if(!(node.right == null))
        		q.push(node.right);	
        }
		return list;
    }
	
	public List<Integer> traverse(TreeNode node, List<Integer> list)
	{
		if(node == null)
		{
			return list;
		}
		if(node.left != null)
		{
			traverse(node.left,list);
		}
		list.add(node.val);
		if(node.right != null)
		{
			traverse(node.right,list);
		}
		return list;
	}
}

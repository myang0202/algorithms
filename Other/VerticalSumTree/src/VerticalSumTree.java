import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class VerticalSumTree {
	public TreeNode root;
	public void verticalSum() {
		if(root == null)return;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		computeVerticalSumTree(hm, root, 0);
	}
	public void computeVerticalSumTree(HashMap<Integer,Integer> hm, TreeNode root, int distance) {
		// base case
		if(root ==null) return;
		//key contains
		if(!hm.containsKey(distance)) {
			hm.put(distance, root.value);
		}
		else {
			int added = hm.get(distance);
			hm.put(distance, hm.get(distance) + distance);
		}
		computeVerticalSumTree(hm, root.left, distance - 1);
		computeVerticalSumTree(hm, root.right, distance + 1);

	}
	
}

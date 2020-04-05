import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		String[] input2 = sc.nextLine().split(" ");
		input2[i] = TreeNode.addTree();
	}

	public class TreeNode{
		
		private TreeNode parent;
		private String data;
		private ArrayList<TreeNode> Children;
		
		public TreeNode getParent() {
			return parent;
		}
		public void setParent(TreeNode parent) {
			this.parent = parent;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public ArrayList<TreeNode> getChildren() {
			return Children;
		}
		public void setChildren(ArrayList<TreeNode> children) {
			Children = children;
		}
		public void addTree(TreeNode root) {
			System.out.println(root.data);
			for(int i = 0 ; i < root.Children.size(); i++){
				root.getChildren().add(root);
			}
		}
	}
	
}
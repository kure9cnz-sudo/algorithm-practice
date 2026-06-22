// Practice version generated from class017/BinaryTreeTraversalRecursion.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class017;

// 递归序的解释
// 用递归实现二叉树的三序遍历
public class BinaryTreeTraversalRecursion {

	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

	// 递归基本样子，用来理解递归序
	public static void f(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement f in practice module");
	}

	// 先序打印所有节点，递归版
	public static void preOrder(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement preOrder in practice module");
	}

	// 中序打印所有节点，递归版
	public static void inOrder(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement inOrder in practice module");
	}

	// 后序打印所有节点，递归版
	public static void posOrder(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement posOrder in practice module");
	}

	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(5);
		head.right.left = new TreeNode(6);
		head.right.right = new TreeNode(7);

		preOrder(head);
		System.out.println();
		System.out.println("先序遍历递归版");

		inOrder(head);
		System.out.println();
		System.out.println("中序遍历递归版");

		posOrder(head);
		System.out.println();
		System.out.println("后序遍历递归版");

	}

}

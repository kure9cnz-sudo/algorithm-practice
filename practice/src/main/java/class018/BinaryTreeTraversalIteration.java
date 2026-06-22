// Practice version generated from class018/BinaryTreeTraversalIteration.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class018;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 不用递归，用迭代的方式实现二叉树的三序遍历
public class BinaryTreeTraversalIteration {

	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

	// 先序打印所有节点，非递归版
	public static void preOrder(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement preOrder in practice module");
	}

	// 中序打印所有节点，非递归版
	public static void inOrder(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement inOrder in practice module");
	}

	// 后序打印所有节点，非递归版
	// 这是用两个栈的方法
	public static void posOrderTwoStacks(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement posOrderTwoStacks in practice module");
	}

	// 后序打印所有节点，非递归版
	// 这是用一个栈的方法
	public static void posOrderOneStack(TreeNode h) {
		throw new UnsupportedOperationException("TODO: implement posOrderOneStack in practice module");
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
		System.out.println("先序遍历非递归版");
		inOrder(head);
		System.out.println("中序遍历非递归版");
		posOrderTwoStacks(head);
		System.out.println("后序遍历非递归版 - 2个栈实现");
		posOrderOneStack(head);
		System.out.println("后序遍历非递归版 - 1个栈实现");
	}

	// 用一个栈完成先序遍历
	// 测试链接 : https://leetcode.cn/problems/binary-tree-preorder-traversal/
	public static List<Integer> preorderTraversal(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement preorderTraversal in practice module");
	}

	// 用一个栈完成中序遍历
	// 测试链接 : https://leetcode.cn/problems/binary-tree-inorder-traversal/
	public static List<Integer> inorderTraversal(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement inorderTraversal in practice module");
	}

	// 用两个栈完成后序遍历
	// 提交时函数名改为postorderTraversal
	// 测试链接 : https://leetcode.cn/problems/binary-tree-postorder-traversal/
	public static List<Integer> postorderTraversalTwoStacks(TreeNode head) {
		throw new UnsupportedOperationException("TODO: implement postorderTraversalTwoStacks in practice module");
	}

	// 用一个栈完成后序遍历
	// 提交时函数名改为postorderTraversal
	// 测试链接 : https://leetcode.cn/problems/binary-tree-postorder-traversal/
	public static List<Integer> postorderTraversalOneStack(TreeNode h) {
		throw new UnsupportedOperationException("TODO: implement postorderTraversalOneStack in practice module");
	}

}

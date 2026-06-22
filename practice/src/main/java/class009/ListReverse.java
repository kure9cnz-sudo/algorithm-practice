// Practice version generated from class009/ListReverse.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class009;

// 按值传递、按引用传递
// 从堆栈角度解释链表节点
// 以堆栈视角来看链表反转
public class ListReverse {

	public static void main(String[] args) {
		// int、long、byte、short
		// char、float、double、boolean
		// 还有String
		// 都是按值传递
		int a = 10;
		f(a);
		System.out.println(a);

		// 其他类型按引用传递
		// 比如下面的Number是自定义的类
		Number b = new Number(5);
		g1(b);
		System.out.println(b.val);
		g2(b);
		System.out.println(b.val);

		// 比如下面的一维数组
		int[] c = { 1, 2, 3, 4 };
		g3(c);
		System.out.println(c[0]);
		g4(c);
		System.out.println(c[0]);
	}

	public static void f(int a) {
		throw new UnsupportedOperationException("TODO: implement f in practice module");
	}

	public static class Number {
		public int val;

		public Number(int v) {
			val = v;
		}
	}

	public static void g1(Number b) {
		throw new UnsupportedOperationException("TODO: implement g1 in practice module");
	}

	public static void g2(Number b) {
		throw new UnsupportedOperationException("TODO: implement g2 in practice module");
	}

	public static void g3(int[] c) {
		throw new UnsupportedOperationException("TODO: implement g3 in practice module");
	}

	public static void g4(int[] c) {
		throw new UnsupportedOperationException("TODO: implement g4 in practice module");
	}

	// 单链表节点
	public static class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	// 反转单链表测试链接 : https://leetcode.cn/problems/reverse-linked-list/
	class Solution {

		public static ListNode reverseList(ListNode head) {
			throw new UnsupportedOperationException("TODO: implement reverseList in practice module");
		}

	}

	// 双链表节点
	public static class DoubleListNode {
		public int value;
		public DoubleListNode last;
		public DoubleListNode next;

		public DoubleListNode(int v) {
			value = v;
		}
	}

	// 反转双链表
	// 没有找到测试链接
	// 如下方法是对的
	public static DoubleListNode reverseDoubleList(DoubleListNode head) {
		throw new UnsupportedOperationException("TODO: implement reverseDoubleList in practice module");
	}

}

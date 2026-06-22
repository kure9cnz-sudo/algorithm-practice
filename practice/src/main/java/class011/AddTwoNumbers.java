// Practice version generated from class011/AddTwoNumbers.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class011;

// 给你两个 非空 的链表，表示两个非负的整数
// 它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字
// 请你将两个数相加，并以相同形式返回一个表示和的链表。
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头
// 测试链接：https://leetcode.cn/problems/add-two-numbers/
public class AddTwoNumbers {

	// 不要提交这个类
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

	class Solution {

		// 也可以复用老链表
		// 不过这个实现没有这么做，都是生成的新节点(为了教学好懂)
		public static ListNode addTwoNumbers(ListNode h1, ListNode h2) {
			throw new UnsupportedOperationException("TODO: implement addTwoNumbers in practice module");
		}

	}

}

// Practice version generated from class034/Code06_SortList.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class034;

// 排序链表
// 要求时间复杂度O(n*logn)，额外空间复杂度O(1)，还要求稳定性
// 数组排序做不到，链表排序可以
// 测试链接 : https://leetcode.cn/problems/sort-list/
public class Code06_SortList {

	// 不要提交这个类
	public static class ListNode {
		public int val;
		public ListNode next;
	}

	// 提交如下的方法
	// 时间复杂度O(n*logn)，额外空间复杂度O(1)，有稳定性
	// 注意为了额外空间复杂度O(1)，所以不能使用递归
	// 因为mergeSort递归需要O(log n)的额外空间
	public static ListNode sortList(ListNode head) {
		throw new UnsupportedOperationException("TODO: implement sortList in practice module");
	}

	// 包括s在内，往下数k个节点返回
	// 如果不够，返回最后一个数到的非空节点
	public static ListNode findEnd(ListNode s, int k) {
		throw new UnsupportedOperationException("TODO: implement findEnd in practice module");
	}

	public static ListNode start;

	public static ListNode end;

	// l1...r1 -> null : 有序的左部分
	// l2...r2 -> null : 有序的右部分
	// 整体merge在一起，保证有序
	// 并且把全局变量start设置为整体的头，全局变量end设置为整体的尾
	public static void merge(ListNode l1, ListNode r1, ListNode l2, ListNode r2) {
		throw new UnsupportedOperationException("TODO: implement merge in practice module");
	}

}

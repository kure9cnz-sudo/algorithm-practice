// Practice version generated from class034/Code02_ReverseNodesInkGroup.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class034;

// 每k个节点一组翻转链表
// 测试链接：https://leetcode.cn/problems/reverse-nodes-in-k-group/
public class Code02_ReverseNodesInkGroup {

	// 不要提交这个类
	public static class ListNode {
		public int val;
		public ListNode next;
	}

	// 提交如下的方法
	public static ListNode reverseKGroup(ListNode head, int k) {
		throw new UnsupportedOperationException("TODO: implement reverseKGroup in practice module");
	}

	// 当前组的开始节点是s，往下数k个找到当前组的结束节点返回
	public static ListNode teamEnd(ListNode s, int k) {
		throw new UnsupportedOperationException("TODO: implement teamEnd in practice module");
	}

	// s -> a -> b -> c -> e -> 下一组的开始节点
	// 上面的链表通过如下的reverse方法调整成 : e -> c -> b -> a -> s -> 下一组的开始节点
	public static void reverse(ListNode s, ListNode e) {
		throw new UnsupportedOperationException("TODO: implement reverse in practice module");
	}

}

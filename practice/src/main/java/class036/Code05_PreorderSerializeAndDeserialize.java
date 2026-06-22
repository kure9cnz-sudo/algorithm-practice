// Practice version generated from class036/Code05_PreorderSerializeAndDeserialize.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class036;

// 二叉树先序序列化和反序列化
// 测试链接 : https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/
public class Code05_PreorderSerializeAndDeserialize {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

    // 二叉树可以通过先序、后序或者按层遍历的方式序列化和反序列化
    // 但是，二叉树无法通过中序遍历的方式实现序列化和反序列化
    // 因为不同的两棵树，可能得到同样的中序序列，即便补了空位置也可能一样。
    // 比如如下两棵树
    //         __2
    //        /
    //       1
    //       和
    //       1__
    //          \
    //           2
    // 补足空位置的中序遍历结果都是{ null, 1, null, 2, null}
	// 提交这个类
	public class Codec {

		public String serialize(TreeNode root) {
			throw new UnsupportedOperationException("TODO: implement serialize in practice module");
		}

		void f(TreeNode root, StringBuilder builder) {
			throw new UnsupportedOperationException("TODO: implement f in practice module");
		}

		public TreeNode deserialize(String data) {
			throw new UnsupportedOperationException("TODO: implement deserialize in practice module");
		}

		// 当前数组消费到哪了
		public static int cnt;

		TreeNode g(String[] vals) {
			throw new UnsupportedOperationException("TODO: implement g in practice module");
		}

	}

}

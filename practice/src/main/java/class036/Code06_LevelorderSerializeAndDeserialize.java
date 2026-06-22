// Practice version generated from class036/Code06_LevelorderSerializeAndDeserialize.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class036;

// 二叉树按层序列化和反序列化
// 测试链接 : https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/
public class Code06_LevelorderSerializeAndDeserialize {

	// 不提交这个类
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;

		public TreeNode(int v) {
			val = v;
		}
	}

	// 提交这个类
	// 按层序列化
	public class Codec {

		public static int MAXN = 10001;

		public static TreeNode[] queue = new TreeNode[MAXN];

		public static int l, r;

		public String serialize(TreeNode root) {
			throw new UnsupportedOperationException("TODO: implement serialize in practice module");
		}

		public TreeNode deserialize(String data) {
			throw new UnsupportedOperationException("TODO: implement deserialize in practice module");
		}

		private TreeNode generate(String val) {
			return val.equals("#") ? null : new TreeNode(Integer.valueOf(val));
		}

	}

}

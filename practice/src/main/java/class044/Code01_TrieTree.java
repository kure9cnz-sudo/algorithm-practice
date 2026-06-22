// Practice version generated from class044/Code01_TrieTree.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class044;

import java.util.HashMap;

// 用类描述实现前缀树。不推荐！
// 测试链接 : https://leetcode.cn/problems/implement-trie-ii-prefix-tree/
public class Code01_TrieTree {

	// 路是数组实现的
	// 提交时把类名、构造方法改为Trie
	class Trie1 {

		class TrieNode {
			public int pass;
			public int end;
			public TrieNode[] nexts;

			public TrieNode() {
				pass = 0;
				end = 0;
				nexts = new TrieNode[26];
			}
		}

		private TrieNode root;

		public Trie1() {
			root = new TrieNode();
		}

		public void insert(String word) {
			throw new UnsupportedOperationException("TODO: implement insert in practice module");
		}

		// 如果之前word插入过前缀树，那么此时删掉一次
		// 如果之前word没有插入过前缀树，那么什么也不做
		public void erase(String word) {
			throw new UnsupportedOperationException("TODO: implement erase in practice module");
		}

		// 查询前缀树里，word单词出现了几次
		public int countWordsEqualTo(String word) {
			throw new UnsupportedOperationException("TODO: implement countWordsEqualTo in practice module");
		}

		// 查询前缀树里，有多少单词以pre做前缀
		public int countWordsStartingWith(String pre) {
			throw new UnsupportedOperationException("TODO: implement countWordsStartingWith in practice module");
		}

	}

	// 路是哈希表实现的
	// 提交时把类名、构造方法改为Trie
	class Trie2 {

		class TrieNode {
			public int pass;
			public int end;
			HashMap<Integer, TrieNode> nexts;

			public TrieNode() {
				pass = 0;
				end = 0;
				nexts = new HashMap<>();
			}
		}

		private TrieNode root;

		public Trie2() {
			root = new TrieNode();
		}

		public void insert(String word) {
			throw new UnsupportedOperationException("TODO: implement insert in practice module");
		}

		public void erase(String word) {
			throw new UnsupportedOperationException("TODO: implement erase in practice module");
		}

		public int countWordsEqualTo(String word) {
			throw new UnsupportedOperationException("TODO: implement countWordsEqualTo in practice module");
		}

		public int countWordsStartingWith(String pre) {
			throw new UnsupportedOperationException("TODO: implement countWordsStartingWith in practice module");
		}

	}

}
// Practice version generated from class038/Code05_ReverseStackWithRecursive.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class038;

import java.util.Stack;

// 用递归函数逆序栈
public class Code05_ReverseStackWithRecursive {

	public static void reverse(Stack<Integer> stack) {
		throw new UnsupportedOperationException("TODO: implement reverse in practice module");
	}

	// 栈底元素移除掉，上面的元素盖下来
	// 返回移除掉的栈底元素
	public static int bottomOut(Stack<Integer> stack) {
		throw new UnsupportedOperationException("TODO: implement bottomOut in practice module");
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		reverse(stack);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}

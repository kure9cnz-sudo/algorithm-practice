// Practice version generated from class030/Code02_GetMaxWithoutJudge.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class030;

// 不用任何判断语句和比较操作，返回两个数的最大值
// 测试链接 : https://www.nowcoder.com/practice/d2707eaf98124f1e8f1d9c18ad487f76
public class Code02_GetMaxWithoutJudge {

	// 必须保证n一定是0或者1
	// 0变1，1变0
	public static int flip(int n) {
		throw new UnsupportedOperationException("TODO: implement flip in practice module");
	}

	// 非负数返回1
	// 负数返回0
	public static int sign(int n) {
		throw new UnsupportedOperationException("TODO: implement sign in practice module");
	}

	// 有溢出风险的实现
	public static int getMax1(int a, int b) {
		throw new UnsupportedOperationException("TODO: implement getMax1 in practice module");
	}

	// 没有任何问题的实现
	public static int getMax2(int a, int b) {
		throw new UnsupportedOperationException("TODO: implement getMax2 in practice module");
	}

	public static void main(String[] args) {
		int a = Integer.MIN_VALUE;
		int b = Integer.MAX_VALUE;
		// getMax1方法会错误，因为溢出
		System.out.println(getMax1(a, b));
		// getMax2方法永远正确
		System.out.println(getMax2(a, b));
	}

}

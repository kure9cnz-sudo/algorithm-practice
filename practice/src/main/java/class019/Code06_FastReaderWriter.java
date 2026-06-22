// Practice version generated from class019/Code06_FastReaderWriter.java.
// Core implementation bodies were removed intentionally. Keep comments and tests, then implement TODO methods yourself.
package class019;

// 本文件课上没有讲
// java同学可以使用FastReader进行快读，可以使用FastWriter进行快写，速度是很快的
// 如何使用可以参考main函数

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.InputMismatchException;

public class Code06_FastReaderWriter {

	public static void main(String[] args) {
		FastReader reader = new FastReader(System.in);
		FastWriter writer = new FastWriter(System.out);
		System.out.println("输入一个字符：");
		int cha = reader.readByte(); // reader会读到字符的ASCII码
		System.out.println("输入一个int类型的数字：");
		int num1 = reader.readInt(); // reader会读到该数字
		System.out.println("输入一个long类型的数字：");
		long num2 = reader.readLong(); // reader会读到该数字
		System.out.println("打印结果:");
		writer.println(cha);
		writer.println(num1);
		writer.println(num2);
		writer.close();// close方法包含flush，会把结果刷出去
	}

	// 快读
	public static class FastReader {
		InputStream is;
		private byte[] inbuf = new byte[1024];
		public int lenbuf = 0;
		public int ptrbuf = 0;

		public FastReader(final InputStream is) {
			this.is = is;
		}

		public int readByte() {
			throw new UnsupportedOperationException("TODO: implement readByte in practice module");
		}

		public int readInt() {
			throw new UnsupportedOperationException("TODO: implement readInt in practice module");
		}

		public long readLong() {
			throw new UnsupportedOperationException("TODO: implement readLong in practice module");
		}
	}

	// 快写
	public static class FastWriter {
		private static final int BUF_SIZE = 1 << 13;
		private final byte[] buf = new byte[BUF_SIZE];
		private OutputStream out;
		private Writer writer;
		private int ptr = 0;

		public FastWriter(Writer writer) {
			this.writer = new BufferedWriter(writer);
			out = new ByteArrayOutputStream();
		}

		public FastWriter(OutputStream os) {
			this.out = os;
		}

		public FastWriter(String path) {
			try {
				this.out = new FileOutputStream(path);
			} catch (FileNotFoundException e) {
				throw new RuntimeException("FastWriter");
			}
		}

		public FastWriter write(byte b) {
			throw new UnsupportedOperationException("TODO: implement write in practice module");
		}

		public FastWriter write(String s) {
			throw new UnsupportedOperationException("TODO: implement write in practice module");
		}

		private static int countDigits(long l) {
			throw new UnsupportedOperationException("TODO: implement countDigits in practice module");
		}

		public FastWriter write(long x) {
			throw new UnsupportedOperationException("TODO: implement write in practice module");
		}

		public FastWriter writeln(long x) {
			throw new UnsupportedOperationException("TODO: implement writeln in practice module");
		}

		public FastWriter writeln() {
			throw new UnsupportedOperationException("TODO: implement writeln in practice module");
		}

		private void innerflush() {
			throw new UnsupportedOperationException("TODO: implement innerflush in practice module");
		}

		public void flush() {
			throw new UnsupportedOperationException("TODO: implement flush in practice module");
		}

		public FastWriter println(long x) {
			return writeln(x);
		}

		public void close() {
			throw new UnsupportedOperationException("TODO: implement close in practice module");
		}

	}

}

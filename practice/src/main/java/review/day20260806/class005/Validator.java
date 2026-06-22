package review.day20260806.class005;

import java.util.Arrays;

public class Validator {

    private static final String SOURCE = "class005.Validator";
    private static final String DUE_REASON = "D45 review";

    public static void main(String[] args) {
        System.out.println(SOURCE + " - " + DUE_REASON);
        checkSort("selectionSort", Validator::selectionSort);
        checkSort("bubbleSort", Validator::bubbleSort);
        checkSort("insertionSort", Validator::insertionSort);
        System.out.println("passed");
    }

    public static void selectionSort(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement selectionSort");
    }

    public static void bubbleSort(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement bubbleSort");
    }

    public static void insertionSort(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement insertionSort");
    }

    private static void checkSort(String name, IntArraySorter sorter) {
        int[][] samples = {
                {},
                {1},
                {2, 1},
                {3, 2, 1},
                {1, 2, 3},
                {5, 1, 5, 2, 0, -3},
                {9, 9, 9, 1, 2, 1}
        };

        for (int[] sample : samples) {
            assertSameAsArraysSort(name, sample, sorter);
        }
        for (int times = 0; times < 5000; times++) {
            assertSameAsArraysSort(name, randomArray(60, 200), sorter);
        }
    }

    private static int[] randomArray(int maxLen, int maxValue) {
        int n = (int) (Math.random() * (maxLen + 1));
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (maxValue + 1))
                    - (int) (Math.random() * (maxValue + 1));
        }
        return arr;
    }

    private static void assertSameAsArraysSort(String name, int[] sample, IntArraySorter sorter) {
        int[] expected = Arrays.copyOf(sample, sample.length);
        int[] actual = Arrays.copyOf(sample, sample.length);
        Arrays.sort(expected);
        sorter.sort(actual);
        if (!Arrays.equals(expected, actual)) {
            throw new IllegalStateException(name + " failed, input="
                    + Arrays.toString(sample)
                    + ", expected=" + Arrays.toString(expected)
                    + ", actual=" + Arrays.toString(actual));
        }
    }

    @FunctionalInterface
    private interface IntArraySorter {
        void sort(int[] arr);
    }
}

package review.day20260623.class005;

import java.util.Arrays;

public class Validator {

    private static final String SOURCE = "class005.Validator";
    private static final String DUE_REASON = "D1 review";

    public static void main(String[] args) {
        System.out.println(SOURCE + " - " + DUE_REASON);
        checkSort("selectionSort", Validator::selectionSort);
        checkSort("bubbleSort", Validator::bubbleSort);
        checkSort("insertionSort", Validator::insertionSort);
        System.out.println("passed");
    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int curMinIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            curMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[curMinIndex]) {
                    curMinIndex = j;
                }
            }
            swap(arr, i, curMinIndex);
        }
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1] ; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

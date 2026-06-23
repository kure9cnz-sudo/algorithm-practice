package review;

import java.util.Arrays;

public class ReviewChecks {

    private ReviewChecks() {
    }

    public static void checkFindNumber(String source, String dueReason, FindNumberSolver solver) {
        System.out.println(source + " - " + dueReason);

        int[][] samples = {
                {},
                {1},
                {1, 2, 3},
                {1, 1, 2, 4, 8},
                {-5, -1, 0, 3, 3, 9}
        };
        int[] nums = {-6, -5, -1, 0, 1, 3, 7, 9, 10};
        for (int[] sample : samples) {
            int[] sorted = Arrays.copyOf(sample, sample.length);
            Arrays.sort(sorted);
            for (int num : nums) {
                assertFindNumber(sorted, num, solver);
            }
        }

        for (int times = 0; times < 5000; times++) {
            int[] arr = randomArray(100, 1000);
            Arrays.sort(arr);
            int num = randomValue(1000);
            assertFindNumber(arr, num, solver);
        }

        System.out.println("passed");
    }

    public static void checkFindLeft(String source, String dueReason, FindLeftSolver solver) {
        System.out.println(source + " - " + dueReason);

        int[][] samples = {
                {},
                {1},
                {1, 2, 3},
                {1, 1, 2, 4, 8},
                {-5, -1, 0, 3, 3, 9}
        };
        int[] nums = {-6, -5, -1, 0, 1, 3, 7, 9, 10};
        for (int[] sample : samples) {
            int[] sorted = Arrays.copyOf(sample, sample.length);
            Arrays.sort(sorted);
            for (int num : nums) {
                assertFindLeft(sorted, num, solver);
            }
        }

        for (int times = 0; times < 5000; times++) {
            int[] arr = randomArray(100, 1000);
            Arrays.sort(arr);
            int num = randomValue(1000);
            assertFindLeft(arr, num, solver);
        }

        System.out.println("passed");
    }

    public static void checkFindRight(String source, String dueReason, FindRightSolver solver) {
        System.out.println(source + " - " + dueReason);

        int[][] samples = {
                {},
                {1},
                {1, 2, 3},
                {1, 1, 2, 4, 8},
                {-5, -1, 0, 3, 3, 9}
        };
        int[] nums = {-6, -5, -1, 0, 1, 3, 7, 9, 10};
        for (int[] sample : samples) {
            int[] sorted = Arrays.copyOf(sample, sample.length);
            Arrays.sort(sorted);
            for (int num : nums) {
                assertFindRight(sorted, num, solver);
            }
        }

        for (int times = 0; times < 5000; times++) {
            int[] arr = randomArray(100, 1000);
            Arrays.sort(arr);
            int num = randomValue(1000);
            assertFindRight(arr, num, solver);
        }

        System.out.println("passed");
    }

    public static void checkFindPeakElement(String source, String dueReason, PeakElementSolver solver) {
        System.out.println(source + " - " + dueReason);

        int[][] samples = {
                {1},
                {1, 2},
                {2, 1},
                {1, 2, 3, 1},
                {1, 2, 1, 3, 5, 6, 4},
                {3, 2, 1, 2, 3}
        };
        for (int[] sample : samples) {
            assertFindPeakElement(sample, solver);
        }

        for (int times = 0; times < 5000; times++) {
            assertFindPeakElement(randomNoEqualAdjacentArray(100, 1000), solver);
        }

        System.out.println("passed");
    }

    private static void assertFindNumber(int[] arr, int num, FindNumberSolver solver) {
        boolean expected = rightFindNumber(arr, num);
        boolean actual = solver.exist(Arrays.copyOf(arr, arr.length), num);
        if (expected != actual) {
            throw new IllegalStateException("exist failed, arr="
                    + Arrays.toString(arr)
                    + ", num=" + num
                    + ", expected=" + expected
                    + ", actual=" + actual);
        }
    }

    private static void assertFindLeft(int[] arr, int num, FindLeftSolver solver) {
        int expected = rightFindLeft(arr, num);
        int actual = solver.findLeft(Arrays.copyOf(arr, arr.length), num);
        if (expected != actual) {
            throw new IllegalStateException("findLeft failed, arr="
                    + Arrays.toString(arr)
                    + ", num=" + num
                    + ", expected=" + expected
                    + ", actual=" + actual);
        }
    }

    private static void assertFindRight(int[] arr, int num, FindRightSolver solver) {
        int expected = rightFindRight(arr, num);
        int actual = solver.findRight(Arrays.copyOf(arr, arr.length), num);
        if (expected != actual) {
            throw new IllegalStateException("findRight failed, arr="
                    + Arrays.toString(arr)
                    + ", num=" + num
                    + ", expected=" + expected
                    + ", actual=" + actual);
        }
    }

    private static void assertFindPeakElement(int[] arr, PeakElementSolver solver) {
        int actual = solver.findPeakElement(Arrays.copyOf(arr, arr.length));
        if (actual < 0 || actual >= arr.length) {
            throw new IllegalStateException("findPeakElement returned invalid index, arr="
                    + Arrays.toString(arr)
                    + ", actual=" + actual);
        }
        boolean leftOk = actual == 0 || arr[actual] > arr[actual - 1];
        boolean rightOk = actual == arr.length - 1 || arr[actual] > arr[actual + 1];
        if (!leftOk || !rightOk) {
            throw new IllegalStateException("findPeakElement failed, arr="
                    + Arrays.toString(arr)
                    + ", actual=" + actual
                    + ", value=" + arr[actual]);
        }
    }

    private static boolean rightFindNumber(int[] sortedArr, int num) {
        for (int cur : sortedArr) {
            if (cur == num) {
                return true;
            }
        }
        return false;
    }

    private static int rightFindLeft(int[] sortedArr, int num) {
        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] >= num) {
                return i;
            }
        }
        return -1;
    }

    private static int rightFindRight(int[] sortedArr, int num) {
        for (int i = sortedArr.length - 1; i >= 0; i--) {
            if (sortedArr[i] <= num) {
                return i;
            }
        }
        return -1;
    }

    private static int[] randomArray(int maxLen, int maxValue) {
        int n = (int) (Math.random() * (maxLen + 1));
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = randomValue(maxValue);
        }
        return ans;
    }

    private static int[] randomNoEqualAdjacentArray(int maxLen, int maxValue) {
        int n = 1 + (int) (Math.random() * maxLen);
        int[] ans = new int[n];
        ans[0] = randomValue(maxValue);
        for (int i = 1; i < n; i++) {
            do {
                ans[i] = randomValue(maxValue);
            } while (ans[i] == ans[i - 1]);
        }
        return ans;
    }

    private static int randomValue(int maxValue) {
        return (int) (Math.random() * (maxValue + 1))
                - (int) (Math.random() * (maxValue + 1));
    }

    @FunctionalInterface
    public interface FindNumberSolver {
        boolean exist(int[] arr, int num);
    }

    @FunctionalInterface
    public interface FindLeftSolver {
        int findLeft(int[] arr, int num);
    }

    @FunctionalInterface
    public interface FindRightSolver {
        int findRight(int[] arr, int num);
    }

    @FunctionalInterface
    public interface PeakElementSolver {
        int findPeakElement(int[] arr);
    }
}

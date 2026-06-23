package review.day20260623.class006;

import review.ReviewChecks;

public class Code01_FindNumber {

    public static void main(String[] args) {
        ReviewChecks.checkFindNumber("class006.Code01_FindNumber", "D1 review", Code01_FindNumber::exist);
    }

    public static boolean exist(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == num) {
                return true;
            } else if (arr[m] > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}

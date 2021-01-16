package alekseytyan.codewars;


/**
 * You might know some pretty large perfect squares. But what about the NEXT one?
 *
 * Complete the findNextSquare method that finds the next integral perfect
 * square after the one passed as a parameter. Recall that an integral perfect
 * square is an integer n such that sqrt(n) is also an integer.
 *
 * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is positive.
 *
 * Examples:
 *
 * findNextSquare(121) --> returns 144
 * findNextSquare(625) --> returns 676
 * findNextSquare(114) --> returns -1 since 114 is not a perfect
 */
public class NumberFun {

    // My solution
    public static long findNextSquare(long sq) {
        if(!checkPerfectSquare(sq)) {
            return -1;
        }
        long next_sq = (long) Math.sqrt(sq);
        return pow(++next_sq,2);
    }
    private static long pow(long value, int degree) {
        long v = value;
        for (int i = 1; i < degree; i++) {
            v *= value;
        }
        return v;
    }

    private static boolean checkPerfectSquare(double x) {
        // finding the square root of given number
        double sq = Math.sqrt(x);
        /* Math.floor() returns closest integer value, for
         * example Math.floor of 984.1 is 984, so if the value
         * of sq is non integer than the below expression would
         * be non-zero.
         */
        return ((sq - Math.floor(sq)) == 0);
    }

    // The most ratted solution
    public static long findNextSquarePro(long sq) {
        long root = (long) Math.sqrt(sq);
        return root * root == sq ? (root + 1) * (root + 1) : -1;
    }
}
public class Sort {

    // find(x, y)
    public static boolean find(int[] x, int y) {
        boolean found = false;

        for (int i = 0; i < x.length; i++) {
            if (y == x[i]) {
                found = true;
            }
        }
        return found;
    }

    // findAll(x, y)
    public static int findAll(int[] x, int y) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (y == x[i]) {
                count = count + 1;
            }
        }
        return count;

    }

    // findMax(x)
    public static int findMax(int[] x) {
        int max = 0;

        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        return max;

    }

}
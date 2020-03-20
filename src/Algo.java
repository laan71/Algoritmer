public class Algo {

    // Bobblesort
    public static int[] bobblesort(int[] x){
        int[] list = x;

        int n = list.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j - 1] > list[j]) {

                    //Swapping elements
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    // Linear
    public static boolean linear(int[] x, int y){
        boolean result = false;

        for (int i = 0; i < x.length; i++) {
            if (y == x[i]) {
                result = true;
                break;
            }
        }
        
        return result;
    }
}
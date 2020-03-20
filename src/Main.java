public class Main {

    public static void main(String[] args) {

        int number = 5;

        // Creating an Array
        int[] data = new int[10];

        // Generating random data between 1-99
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 99 + 1);

        }
        System.out.println("The Array is");
        for (int tal : data) {
            System.out.print(tal + " ");
        }

        System.out.println();
        System.out.println("Results for " + number + ":");

        System.out.println("Number is present in Array " + Sort.find(data, number));

        System.out.println("Number is present " + Sort.findAll(data, number) + " times.");

        System.out.println("The largest number in Array is " + Sort.findMax(data));


        // uses the two algoritems
        System.out.println("Bobbelsort returns: " + Algo.bobblesort(data));

        System.out.println("Linear returns: " + Algo.linear(data, number));

    }

}

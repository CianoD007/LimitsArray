import java.util.Random;

public class LimitsArray {
    public static void main(String[] args) {
        // Creating a one-dimensional array with 10 elements
        int[] numbers = new int[10];

        // Filling the array with random numbers from 1 to 100
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        // Finding the smallest and largest elements in the array
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Displaying the array
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Displaying the smallest and largest elements
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}

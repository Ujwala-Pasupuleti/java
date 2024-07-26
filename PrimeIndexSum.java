import java.util.Scanner;

public class PrimeIndexSum {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to calculate the sum of prime index values
    public static int sumOfPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (isPrime(i)) {
                sum += input1[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // User input for array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate and print the sum of prime index values
        int sum = sumOfPrimeIndexValues(array, n);
        System.out.println("Sum of prime index values: " + sum);
    }
}
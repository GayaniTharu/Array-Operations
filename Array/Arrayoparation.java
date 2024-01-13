public class Arrayoparation {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 8, 2, 10, 7};

        // Display the array
        System.out.println("Array elements:");
        displayArray(numbers);

        // Calculate and display the sum
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);

        // Calculate and display the average
        double average = calculateAverage(numbers);
        System.out.println("Average of array elements: " + average);

        // Find and display the maximum element
        int max = findMax(numbers);
        System.out.println("Maximum element in the array: " + max);

        // Find and display the minimum element
        int min = findMin(numbers);
        System.out.println("Minimum element in the array: " + min);
    }

    // Method to display the elements of an array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Method to calculate the sum of elements in an array
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the average of elements in an array
    private static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find the maximum element in an array
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the minimum element in an array
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

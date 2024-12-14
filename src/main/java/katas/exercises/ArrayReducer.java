package katas.exercises;

public class ArrayReducer {

    /**
     * Modifies the array so that each element becomes the difference between
     * itself and its predecessor. The first element remains unchanged.
     *
     * @param numbers the array of integers to modify
     */
    public static void reduceArray(int[] numbers) {



    }

    public static void main(String[] args) {
        int[] sampleArray = {10, 15, 7, 20, 25};
        System.out.println("Original array: ");
        printArray(sampleArray);
        reduceArray(sampleArray);
        System.out.println("Reduced array: ");
        printArray(sampleArray);
    }

    /**
     * Helper method to print the elements of an array.
     *
     * @param array the array to print
     */
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

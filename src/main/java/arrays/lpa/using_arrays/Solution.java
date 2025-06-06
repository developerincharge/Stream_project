package arrays.lpa.using_arrays;

import java.util.Arrays;
import java.util.Scanner;

import static arrays.lpa.using_arrays.MinimumElement.readIntegers;

public class Solution {

    public static void main(String[] args) {
        int[] numbers = readIntegers();
        System.out.println("Numbers entered: " + Arrays.toString(numbers));

        int min = findMin(numbers);
        System.out.println("Minimum number: " + min);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a comma-separated list of integers:");
        int count = scanner.nextInt();
        int[] array = new int[count];
        Arrays.fill(array, count);
        return array[0];
    }

    private static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
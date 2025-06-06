package arrays.lpa.using_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MinimumElement {

    static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a comma-separated list of integers:");
        String input = scanner.nextLine();
        
        String[] splits = input.split(",");
        int[] intArray = new int[splits.length];
        
        for (int i = 0; i < splits.length; i++) {
            intArray[i] = Integer.parseInt(splits[i].trim());
        }
        
        return intArray;
    }

    private static int findMin(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = Integer.MAX_VALUE;

        for (int el : array){
            if(el < min){
                min = el;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = readIntegers();
        System.out.println("Numbers entered: " + Arrays.toString(numbers));
        
        int min = findMin(numbers);
        System.out.println("Minimum number: " + min);
    }
}
package arrays.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {

        int[] arrayRandom = getRandomArray(5);
        System.out.println("Original ==> " +Arrays.toString(arrayRandom));
          // sort the array
        Arrays.sort(arrayRandom);
        System.out.println(" sorted ===> " + Arrays.toString(arrayRandom));
        // reverse the array
       int[] sortingArray =  sortIntegers(arrayRandom);
        System.out.println("reversed ==> " +Arrays.toString(sortingArray));

    }

      public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];
        for(int i = 0; i < len; i++){
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array) {

        // Method to sort the array in descending order
          int[] sortedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    // Swap elements to sort in descending order
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
          }
          return sortedArray;

    }






}

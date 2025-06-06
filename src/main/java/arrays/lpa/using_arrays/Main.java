package arrays.lpa.using_arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        System.out.println("#######################################");

        int [] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        System.out.println("########" +
                "####  Full Copy Array  ##############");

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        System.out.println("###########  full sorted Copy #############");
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));
        System.out.println(Arrays.toString(thirdArray));

        System.out.println("##########  Partial Copy  #############");

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        System.out.println("#############  Copy to a larger array  ##############");
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));


        String[] sArray = {"Ulysses","Bob","Dale","George","Sally","Hector","Abe","Irene","Judy","Kurt","Lloyd","Eve","Felix","Mallory","Nancy","Oliver","Pam","Quinn","Rudy","Tara","Violet","Wally","Xander","Yvonne","Charlie","Zach"};
        System.out.println(Arrays.toString(sArray));
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"Charlie") >= 0) {
            System.out.println("Found Charlie in the list");
        }

        System.out.println("######################################################################");

        int[] s1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] s2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
       if (Arrays.equals(s1,s2)){
           System.out.println("Arrays are equal");
       } else {
           System.out.println("Arrays are not equal");
       }
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}

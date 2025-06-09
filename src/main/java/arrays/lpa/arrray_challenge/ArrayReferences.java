package arrays.lpa.arrray_challenge;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {


        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray == anotherArray: " + (myIntArray == anotherArray) + "  " +Arrays.toString(myIntArray) + " "  +Arrays.toString(myIntArray));
       // Both Arrays are pointing to the same location in memeory
        anotherArray[0] = 1;
        // modifying the array
        modifyArray(myIntArray);

    System.out.println("#################   After Changing the Array   ##################");
        System.out.println("myIntArray == anotherArray: " + (myIntArray == anotherArray) + "  " +Arrays.toString(myIntArray) + " "  +Arrays.toString(myIntArray));

        }

        private static void modifyArray(int [] array){
            array[1] = 2;
        }


}

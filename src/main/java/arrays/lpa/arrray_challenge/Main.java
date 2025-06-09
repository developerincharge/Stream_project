package arrays.lpa.arrray_challenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("Last = " + firstTen[arrayLength - 1]);

//
//
//      int[] newArray;
        int[] newArray = new int[]{5, 4, 3, 2, 1};

        System.out.println();
        System.out.println("##### for loop ######");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        System.out.println("### Enhanced for loop ###");
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(newArray));


        System.out.println();

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]) {
            //int[] intArray = (int[]) objectVariable;
            System.out.println("The array is an int array");
        } else {
            System.out.println("The array is not an int array");
        }

        System.out.println();
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = Arrays.toString(newArray);  // this is an array inside an array

        for (int i = 0; i < objectArray.length; i++) {
            System.out.println(objectArray[i]);
        }

    }
}

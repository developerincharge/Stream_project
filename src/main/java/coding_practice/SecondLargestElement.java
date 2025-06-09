package coding_practice;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] numbers = {10, 7, 23, 45, 8};

        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second largest number: " + secondLargest);



    }

    private static int findSecondLargest(int[] array) {
//        if (array.length < 2) {
//            throw new IllegalArgumentException("Array must have at least two elements");
//        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

}

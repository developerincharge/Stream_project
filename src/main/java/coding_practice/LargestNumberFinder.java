package coding_practice;

public class LargestNumberFinder {

    public static void main(String[] args) {
        int[] numbers = {10, 7, 23, 45, 8};
        int largestNumber = findLargestNumber(numbers);
        System.out.println("Largest number: " + largestNumber);
    }

    private static int findLargestNumber(int[] array) {
        int largestNumber = array[0];
        for (int num : array) {
            if (num > largestNumber) {
                largestNumber = num;
            }
        }
        return largestNumber;
    }


}

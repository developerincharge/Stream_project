package coding_practice;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);
    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

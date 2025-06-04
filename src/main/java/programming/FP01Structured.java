package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 13, 14, 15, 13, 14,18, 19, 20);
        System.out.println("######  Structured Programming ########");
        printAllNumbers(numbers);
        System.out.println("##################");
        printEvenNumbers(numbers);
    }

/*    private static void print(int number){
        System.out.println(number);
    }*/

    private static void printAllNumbers(List<Integer> numbers) {

       for( int number : numbers){
           System.out.println(number);

        }
    }

    private static void printEvenNumbers(List<Integer> numbers) {

        for( int number : numbers){
           if(number % 2 == 0)
            System.out.println(number);

        }
    }
}

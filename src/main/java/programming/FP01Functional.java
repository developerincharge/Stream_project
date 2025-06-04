package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 13, 14, 15, 13, 14,18, 19, 20);

        System.out.println("######  Functional Programming ########");

        printAllNumbersFunctional(numbers);
        System.out.println("#####################");
        printEvenNumbersFunctional(numbers);
        System.out.println("####### Add List Functional ###############");
        System.out.println(addListFunctional(numbers));
    }

     /*private static boolean isEven(int number) {
        return number % 2 == 0;
    }*/
    private static void printAllNumbersFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }
    private static void printEvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
               // .filter(FP01Functional::isEven) // is only allow even numbers
                .filter(number -> number % 2 == 0)  // Lambda Expression
                .forEach(System.out::println);
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);

    }

}

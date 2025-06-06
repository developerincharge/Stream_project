package arrays.lpa;


import java.util.Arrays;

public class VarArgsDemo {
    public static void main(String... args) {
        System.out.println("Hello World Again  : " + args.length);
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("_".repeat(20));
        printText();


        String[] sStringArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sStringArray));

        System.out.println(Arrays.toString(sStringArray));




    }


    private static void printText(String... textList){

        for (String t : textList) {
            System.out.println(t);
        }
    }
}

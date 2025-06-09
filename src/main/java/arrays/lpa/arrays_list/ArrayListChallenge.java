package arrays.lpa.arrays_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1 -> addItems(groceries);
                    case 2 -> removeItems(groceries);
                    case 0 -> flag = false;
                    default -> System.out.println("Invalid option. Please try again.");
                }
                groceries.sort(Comparator.naturalOrder());
                System.out.println("Current list: " + groceries);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (0, 1, or 2).");
            }
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add items to list (Comma delimited list):");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove items from list (Comma delimited list):");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printActions() {
        String textBlock = """
        Available actions:
        0. to shut down
        1. To add an item(s) to list (Comma delimited list)
        2. To remove an item(s) from list (Comma delimited list)
        Enter your choice of action to perform:""";
        System.out.println(textBlock + " ");
    }
}
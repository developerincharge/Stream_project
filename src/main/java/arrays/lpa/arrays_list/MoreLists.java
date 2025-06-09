package arrays.lpa.arrays_list;

import java.util.*;

public class MoreLists {
    public static void main(String[] args) {

          String[] items = {"apples", "bananas", "oranges", "milk", "eggs"};

          List<String> list = List.of(items);
          System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
            List.of("pickles", "mustard", "cheese", "eggs"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third Item  =  " + groceries.get(2));
          if(groceries.contains("eggs")) {
              System.out.println("List contains the eggs");
          }
        groceries.add("yogurt");
        System.out.println("first =  "+ groceries.indexOf("yogurt"));
        System.out.println("last =  "+ groceries.lastIndexOf("yogurt"));

        System.out.println(groceries.containsAll(nextList));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);
        groceries.retainAll(List.of("apples","milk", "mustard","cheese"));
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("Is Empty =  " + groceries.isEmpty());

        groceries.addAll(Arrays.asList("apples", "bananas", "oranges", "milk", "eggs", "yogurt","apples", "milk", "mustard","yogurt"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);


        System.out.println("##########################");
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}

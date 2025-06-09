package arrays.lpa.arrays_list;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
    @Override
    public String toString() {
//        return "GroceryItem{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", count=" + count +
//                '}';

        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class ArrayListDemo {

    public static void main(String[] args) {

        GroceryItem[] groceryList = new GroceryItem[3];

        groceryList[0] = new GroceryItem("Milk");
        groceryList[1] = new GroceryItem("Butter","PRODUCE", 6);
        groceryList[2] = new GroceryItem("Oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryList));

       for (Object groceryItem : groceryList) {
           System.out.println(groceryItem);
       }

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Milk"));
        objectList.add("Yogurt");
        //System.out.println(objectList);

        ArrayList<GroceryItem> groceryList2 = new ArrayList<>();
        groceryList2.add(new GroceryItem("Butter"));
        groceryList2.add(new GroceryItem("Milk"));
        groceryList2.add(new GroceryItem("Oranges","PRODUCE", 5));

        groceryList2.set(0, new GroceryItem("Apple", "PRODUCE", 6));
        groceryList2.remove(1);
        System.out.println(groceryList2);

    }
}


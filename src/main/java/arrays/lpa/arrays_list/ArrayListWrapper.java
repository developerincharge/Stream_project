package arrays.lpa.arrays_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListWrapper {
    public static void main(String[] args) {

            String[] originalArray = new String[] {"First", "Second", "Third"};
            var originalList = Arrays.asList(originalArray);
//            System.out.println("Original List before: " + originalList);
//            System.out.println("Original Array before: " + Arrays.toString(originalArray));
            originalList.set(0, "one");
            System.out.println("Original List after: " + originalList);
            System.out.println("Original Array after" + Arrays.toString(originalArray));

            originalList.sort(Comparator.naturalOrder());
            System.out.println("Original ArrayList : " + Arrays.toString(originalArray));
           // originalList.set(2, "fourth");


//            List<String> days = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

        //             var newList = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

//            System.out.println(days);
//            days.add( 1,"fourth");
//            days.set("second");




 //             String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            List<String> days = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
 //             var daysList = Arrays.asList(days);
              var daysList = List.of(days);
              System.out.println(daysList);
              //daysList.set( 1,"fourth");
              System.out.println(daysList);
              //daysList.add(5, Collections.singletonList("Seventh"));
            System.out.println(daysList);
             // daysList.set("second");
             // System.out.println(Arrays.toString(days));
        System.out.println(days);



    }
}

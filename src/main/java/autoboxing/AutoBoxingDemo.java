package autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        Integer i = 15;
        Integer boxedInt = Integer.valueOf(15);  // preferred way of Autoboxing
       // Integer deprecatedBoxing = new Integer(15); // deprecated
        int unboxedInt = boxedInt.intValue();  // unboxing  not necessary
        System.out.println(i);
        System.out.println(boxedInt);
        System.out.println(unboxedInt);

        // Automatic Auto Unboxing
      Integer autoBoxed = 15;
      int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        //System.out.println(autoUnboxed.getClass().getName());



        Double resultBoxed = getLiteralDoublePrimitive();
        System.out.println(resultBoxed.getClass().getName());

        double resulUnboxed = getDoubleObject();
        System.out.println(resulUnboxed);



        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(Arrays.toString(characterArray));
        System.out.println(characterArray[0].getClass().getName());

      var ourList = getList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
      //var ourList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println(ourList);

    }

    private static ArrayList<Integer> getList(Integer... varargs){

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }


    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }



    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.00;
    }



}

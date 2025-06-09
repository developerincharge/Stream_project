package coding_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c","d"));
        Iterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = (String) listIterator.next();
            if (element.equals("b")) {
                listIterator.remove();
            }
        }
        System.out.println(list);
    }
}

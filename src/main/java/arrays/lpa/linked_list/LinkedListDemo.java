package arrays.lpa.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {


    public static void main(String[] args) {
    // LinkedList<String> placesToVisit = new LinkedList<String>();
      var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Melbourne");
        placesToVisit.add(2,"Brisbane");
        addMoreElements(placesToVisit);

        System.out.println(placesToVisit.toString());

//removeElements(placesToVisit);

        System.out.println(placesToVisit.toString());

        //gettingElements(placesToVisit);

        System.out.println(placesToVisit.toString());

        //printItinerary4(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        // adding from method
      list.add("Perth");
      list.addFirst("Darwin");
      list.addLast("Adelaide");
       // Queue methods
      list.offerFirst("Toowooba");
      list.offer("Alice Springs");
      list.offerLast("Mount Isa");
       // stack
      list.push("Canberra");
      list.push("Mount Gambier");


    }

    private static void removeElements(LinkedList<String> list){
        // removing from the list
        list.remove(4);
        list.remove("Perth");

        System.out.println(list.toString());
        String s1 = list.remove(); // removing from first of the list
        System.out.println(s1 + " was removed");

        // removing from the beginning or last of list
       // list.removeFirst();
        String s2 = list.removeFirst(); // removing from first of the list
        System.out.println(s2 + " was removed");

//        list.removeLast();
        String s3 = list.removeLast(); // removing from last of the list
        System.out.println(s3 + " was removed");

        System.out.println(list.toString());
          // removing from the queue
//        list.poll();
        String p1 = list.poll(); // removing from first of the list
        System.out.println(p1 + " was removed");

//        list.pollFirst();

        String p2 = list.pollFirst(); // removing from first of the list
        System.out.println(p2 + " was removed");

//        list.pollLast();
        String p3 = list.pollLast(); // removing from last of the list
        System.out.println(p3 + " was removed");

        System.out.println(list.toString());


        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        System.out.println(list);

        // removing from the stack
       // list.pop();

        String p4 = list.pop(); // removing from first of the list
        System.out.println(p4 + " was removed");
        list.push("Darwin");
        list.push("Perth");
        list.push("Alice Springs");
        list.push("Adelaide");
        list.push("Mount Isa");
        list.push("Mount Gambier");
        list.push("Mount Stuart");
        list.push("Mount Isa");



    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println( "Retrieved Element = " + list.get(0));
        System.out.println( "Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position:  " + list.indexOf("Darwin"));
        System.out.println("Brisbane is at position:  " + list.lastIndexOf("Brisbane"));

        // Queue methods retrieval
        System.out.println("Element from element() = " + list.element());
        System.out.println("First Element from peek() = " + list.peek());
        System.out.println("First Element from peekFirst()= " + list.peekFirst());
        System.out.println("Last Element from peekLast()= " + list.peekLast());

    }


    public static void printItinerary(LinkedList<String> list){

        System.out.println("Trip starts at "  + list.getFirst());

        for (int i = 1;  i < list.size(); i++) {
            System.out.println("===>  From  " + list.get(i - 1) + "  to  " + list.get(i));
        }
        System.out.println("Trip ends at "  + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at "  + list.peekFirst());

        for (int i = 1;  i < list.size(); i++) {
            System.out.println("===>  From  " + list.get(i - 1) + "  to  " + list.get(i));
        }
        System.out.println("Trip ends at "  + list.peekLast());
    }


    public static void printItinerary3(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.getFirst();
        for (String currentTown : list) {
            System.out.println("===>  From  " + previousTown + "  to  " + currentTown);
            previousTown = currentTown;
        }

    }

    public static void printItinerary4(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var currentTown = iterator.next();
            System.out.println("===>  From  " + previousTown + "  to  " + currentTown);
            previousTown = currentTown;
        }
        System.out.println("Trip ends at  " + list.getLast());
    }


//    public static void testIterator(LinkedList<String> list){
//
//         var iterator = list.iterator();
//        while (iterator.hasNext()) {
//           // System.out.println(iterator.next());
//            if(iterator.next().equals("Sydney")){
//                iterator.remove();
//            }
//        }
//            System.out.println(list);
//    }


    // ListIterator has more methods than remove()  like  add() and set() methods
    public static void testIterator(LinkedList<String> list){

        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}



package arrays.lpa.linked_list;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%-6s (%d) km", name, distance);
    }
}


public class LinkedListChallenge {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1295);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Brisbane", 917));

        placesToVisit.addFirst(new Place("Sydney", 0));

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);

        boolean quitLoop = false;
        boolean forward = true;
        printMenu();

        while (!quitLoop) {
            if(!iterator.hasPrevious()){
                System.out.println("Originating :  " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final :  " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value :  ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to move forward");
                    if(!forward){             // Reversing Direction
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();  // Adjust Position forward
                        }
                    }

                    if(iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    break;

                case "B":
                    System.out.println("User wants to move backward");
                    if(forward){             // Reversing Direction
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();  // Adjust Position forward
                        }
                    }

                    if(iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;

                case "M":
                    printMenu();
                    break;

                case "L":
                    System.out.println(placesToVisit);
                    break;

                default:
                    quitLoop = true;
                    break;

            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate:  " + place);
            return;
        }
        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate:  " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace  : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
         list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions:
                  (F)orward
                  (B)ackward
                  (L)ist 
                  (A)dd
                  (R)emove 
                  (D)istance 
                  (S)how    
                  (M)enu  
                  (Q)uit""");
    }
}

package arrays.lpa.linked_list.challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ItineraryApp {
    private final LinkedList<Place> placesToVisit = new LinkedList<>();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ItineraryApp app = new ItineraryApp();
        app.initializeItinerary();
        app.start();
    }

    private void initializeItinerary() {
        addPlace(new Place("Sydney", 0));
        addPlace(new Place("Melbourne", 877));
        addPlace(new Place("Brisbane", 917));
        addPlace(new Place("Adelaide", 1374));
        addPlace(new Place("Alice Springs", 2771));
        addPlace(new Place("Perth", 3923));
        addPlace(new Place("Darwin", 3972));
    }

    private void start() {
        ListIterator<Place> iterator = placesToVisit.listIterator();
        boolean goingForward = true;
        boolean quit = false;

        printWelcome();
        printMenu();

        while (!quit) {
            System.out.print("\nEnter action: ");
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "f", "forward" -> moveForward(iterator);
                case "b", "backward" -> moveBackward(iterator);
                case "l", "list" -> printItinerary();
                case "a", "add" -> addNewPlace();
                case "r", "remove" -> removeCity();
                case "d", "distance" -> calculateDistanceBetweenCities();
                case "s", "show" -> showDistanceFromSydney();
                case "m", "menu" -> printMenu();
                case "q", "quit" -> quit = true;
                default -> System.out.println("Invalid input. Try again.");
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    private void moveForward(ListIterator<Place> iterator) {
        if (iterator.hasNext()) {
            System.out.println("Now visiting: " + iterator.next());
        } else {
            System.out.println("Reached the end of the itinerary");
        }
    }

    private void moveBackward(ListIterator<Place> iterator) {
        if (iterator.hasPrevious()) {
            System.out.println("Now visiting: " + iterator.previous());
        } else {
            System.out.println("Reached the start of the itinerary");
        }
    }

    private void addNewPlace() {
        System.out.print("Enter city name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter distance from Sydney (miles): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        int distance = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        Place newPlace = new Place(name, distance);
        addPlace(newPlace);
    }

    private void addPlace(Place newPlace) {
        // Check for duplicates by name (case-insensitive)
        for (Place place : placesToVisit) {
            if (place.name().equalsIgnoreCase(newPlace.name())) {
                System.out.println("\n⚠️ City already exists in itinerary!");
                System.out.println("Duplicate found: " + place);
                System.out.println("Please try again with a different city name.");
                return;
            }
        }

        // Insert in correct position based on distance
        int index = 0;
        for (Place place : placesToVisit) {
            if (newPlace.distance() < place.distance()) {
                break;
            }
            index++;
        }
        placesToVisit.add(index, newPlace);
        System.out.println("\n✅ Successfully added: " + newPlace);
    }

    private void removeCity() {
        if (placesToVisit.isEmpty()) {
            System.out.println("Itinerary is empty - no cities to remove");
            return;
        }

        System.out.println("Current cities:");
        printItinerary();
        
        System.out.print("\nEnter city name to remove: ");
        String cityName = scanner.nextLine().trim();
        
        Place foundCity = null;
        for (Place place : placesToVisit) {
            if (place.name().equalsIgnoreCase(cityName)) {
                foundCity = place;
                break;
            }
        }

        if (foundCity != null) {
            placesToVisit.remove(foundCity);
            System.out.println("\n🗑️ Successfully removed: " + foundCity.name());
        } else {
            System.out.println("\nCity '" + cityName + "' not found in itinerary");
        }
    }

    private void calculateDistanceBetweenCities() {
        if (placesToVisit.size() < 2) {
            System.out.println("Need at least 2 cities to calculate distance");
            return;
        }

        System.out.println("Available cities:");
        printItinerary();

        System.out.print("\nEnter first city name: ");
        String city1 = scanner.nextLine().trim();
        System.out.print("Enter second city name: ");
        String city2 = scanner.nextLine().trim();

        Place place1 = findPlace(city1);
        Place place2 = findPlace(city2);

        if (place1 == null || place2 == null) {
            System.out.println("Error: One or both cities not found");
            return;
        }

        int distance = Math.abs(place1.distance() - place2.distance());
        System.out.printf("\n📏 Distance between %s and %s: %d miles\n", 
                         place1.name(), place2.name(), distance);
    }

    private void showDistanceFromSydney() {
        System.out.print("Enter city name: ");
        String city = scanner.nextLine().trim();
        Place place = findPlace(city);

        if (place != null) {
            System.out.println("\n" + place);
        } else {
            System.out.println("\nCity '" + city + "' not found in itinerary");
        }
    }

    private Place findPlace(String cityName) {
        for (Place place : placesToVisit) {
            if (place.name().equalsIgnoreCase(cityName)) {
                return place;
            }
        }
        return null;
    }

    private void printItinerary() {
        System.out.println("\nAUSTRALIAN CITIES BY DISTANCE FROM SYDNEY");
        System.out.println("=========================================");
        System.out.printf("%-15s %s\n", "City", "Distance");
        System.out.println("-----------------------------------------");
        
        placesToVisit.forEach(System.out::println);
        
        System.out.println("=========================================");
        System.out.println("Total cities: " + placesToVisit.size());
    }

    private void printWelcome() {
        System.out.println("\n🌏 Welcome to the Australian Cities Itinerary Manager 🌏");
        System.out.println("Navigate, add, remove cities, and calculate distances");
    }

    private void printMenu() {
        System.out.println("\nAvailable actions:");
        System.out.println("(F)orward    - Move to next city");
        System.out.println("(B)ackward   - Move to previous city");
        System.out.println("(L)ist       - Show full itinerary");
        System.out.println("(A)dd        - Add new city to itinerary");
        System.out.println("(R)emove     - Remove city from itinerary");
        System.out.println("(D)istance   - Calculate distance between two cities");
        System.out.println("(S)how       - Show city's distance from Sydney");
        System.out.println("(M)enu       - Show this menu");
        System.out.println("(Q)uit       - Exit the program");
    }
}
package arrays.lpa.linked_list.challenge;

public record Place(String name, int distance) implements Comparable<Place> {
    @Override
    public int compareTo(Place other) {
        return Integer.compare(this.distance, other.distance);
    }

    @Override
    public String toString() {
        return String.format("%-15s %d miles from Sydney", name, distance);
    }
}
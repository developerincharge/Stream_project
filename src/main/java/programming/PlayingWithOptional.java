package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana", "mango","kiwi");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        Optional<String> optional = fruits.stream()
                .filter(predicate).findFirst();
                 optional.isPresent();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> fruit = Optional.of("apple");
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(true);



    }
}

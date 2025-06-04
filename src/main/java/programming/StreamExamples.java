package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Stream<Integer> numberStream = numbers.stream();
        numberStream.forEach(System.out::println);


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        Stream<String> stringStream = map.values().stream();
        stringStream.forEach(System.out::println);
     // {Java=100, Python=80, C++=90, JavaScript=70}
        Map<String, Integer> courses = Map.of("Java", 100, "Python",80, "C++", 90, "JavaScript", 70);
        Stream<String> courseStream = courses.keySet().stream();
        courseStream.forEach(System.out::println);
      //  {Java, Python, C++, JavaScript}
        Stream<Integer> valueStream = courses.values().stream();
        valueStream.forEach(System.out::println);
      //  {100, 80, 90, 70}
        Stream<Map.Entry<String, Integer>> entryStream = courses.entrySet().stream();
        entryStream.forEach(System.out::println);
       // {Java=100, Python=80, C++=90, JavaScript=70}

        // {"Apple", "Banana", "Mango", "Kiwi"}

        Stream<String> stream = Stream.of("Apple", "Banana", "Mango", "Kiwi");
        stream.forEach(System.out::println);


        int[] numbers1 = {10, 20, 30, 40, 50};
        IntStream intStream = Arrays.stream(numbers1);
        intStream.forEach(System.out::println);


        Stream.Builder<String> builder = Stream.builder();
        builder.add("Java");
        builder.add("Python");
        builder.add("C++");
        builder.add("JavaScript");
        Stream<String> stream1 = builder.build();
        stream1.forEach(System.out::println);


        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        randomNumbers.forEach(System.out::println);

        Stream.generate(() -> "Java").limit(5).forEach(System.out::println);

        Stream.iterate(0, n -> n + 1).limit(5).forEach(System.out::println);
        Stream.iterate(0, n -> n + 2).limit(5).forEach(System.out::println);
        Stream.iterate(0, n -> n + 3).limit(5).forEach(System.out::println);
        Stream.iterate(0, n -> n + 4).limit(5).forEach(System.out::println);

        Stream.iterate(0, n -> n + 5).limit(5).forEach(System.out::println);


      Stream<String> fileStream = Files.lines(Paths.get("file.txt"));
      fileStream.forEach(System.out::println);

   // output: 1 2 3 4
      IntStream.range(1, 5).forEach(System.out::println);
    // output: 1 2 3 4 5
      IntStream.rangeClosed(1, 5).forEach(System.out::println);
    }


}

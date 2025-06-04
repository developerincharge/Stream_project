package programming;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printAllCourses(courses);
        System.out.println("#############");
        printCourseWithSpring(courses);
        System.out.println("##############");
        printCourseWithAtLeastFourLetters(courses);
        System.out.println("################");
        printLengthOfEachCourse(courses);
        System.out.println("#################");
        printEachCourseToUpperCase(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printCourseWithSpring(List<String> courses) {
        courses.stream()
                //.filter(predicate -> predicate.contains("Spring"))
                .filter(course -> course.startsWith("S"))
                //.filter(predicate -> predicate.startsWith("S"))
                .forEach(System.out::println);
    }

    private static void printCourseWithAtLeastFourLetters(List<String> courses) {
        courses.stream()
               // .filter(predicate -> predicate.length() > 4)
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printLengthOfEachCourse(List<String> courses) {
        courses.stream()
                // .filter(predicate -> predicate.length() > 4)
                .map(course -> course +" ->  "+  course.length())
                .forEach(System.out::println);
    }

    private static void printEachCourseToUpperCase(List<String> courses) {
        courses.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }



}

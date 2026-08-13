package tcsprepreation;

import java.util.Arrays;
import java.util.List;

public class FindingName {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Divyanshu", "Amit", "Rahul", "Ankit");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}

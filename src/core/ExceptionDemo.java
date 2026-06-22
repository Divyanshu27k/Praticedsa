package core;

import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(23,45,(int)45.5,76,(int)8.7);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set); // removes duplicates

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("A", 2);

        System.out.println(map.size()); // 1
        System.out.println(map.get("A")); // 2


        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Always executed");
        }
    }
}

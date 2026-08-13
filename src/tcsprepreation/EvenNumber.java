package tcsprepreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//by using like lambada experation
public class EvenNumber {
    public static void main(String[] args) {
//        List<Integer> numbers= Arrays.asList(10, 15, 20, 25, 30, 35);
//        numbers.stream()
//                .filter(n->n%2==0)
//                .forEach(System.out::println);
        List<Integer> numbers= Arrays.asList(14,4,5,6,9,8,7,2,3,12);
        numbers.stream().filter(n->n%3==0).forEach(System.out::println);
    }
}

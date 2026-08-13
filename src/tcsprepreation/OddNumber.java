package tcsprepreation;

import java.util.Arrays;
import java.util.List;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(3,6,4,5,68,12,64,9,18,27);
        num.stream().filter(n->n%3==0).forEach(System.out::println);
    }
}

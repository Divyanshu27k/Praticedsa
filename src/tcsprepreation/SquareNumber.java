package tcsprepreation;

import java.util.Arrays;
import java.util.List;

public class SquareNumber {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(2,3,4,5,6,7,8,9,0);
        num.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
    }
}

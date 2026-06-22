package collection;

import java.util.HashSet;
import java.util.Set;
public class SetExample {
    public static void main(String [] args){

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(23);
        System.out.println(set);
    }
}

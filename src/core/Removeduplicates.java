package core;

import java.util.*;

public class Removeduplicates {
    public  static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4,3,4,5,6);
        Set<Integer> set= new HashSet<>(list);
        System.out.println(set);
    }
}

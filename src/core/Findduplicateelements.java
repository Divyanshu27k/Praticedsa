package core;

import java.util.HashSet;
import java.util.Set;

public class Findduplicateelements {
    public static void main(String[] args){
        // Find duplicate elements
        int[] arr = {1,2,3,2,4,1,3,5,7,6,4,3,2,1};

        Set<Integer> seen = new HashSet<>();
        for(int i : arr){
            if(!seen.add(i)){
                System.out.println("Duplicate: " + i);
            }
        }

    }
}

package tcsprepreation;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,4,5,5,4};
        Set<Integer>set=new HashSet<>();
        for (int num : arr){
            if(!set.add(num)){
                System.out.println("Duplicalte " + num);

            }
        }
    }
}

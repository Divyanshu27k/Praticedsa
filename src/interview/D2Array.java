package interview;

import java.util.HashSet;
import java.util.Set;

public class D2Array {
    public static void main(String[] args) {

        int [] arr={2,4,6,8,4,2,3,4};

        Set<Integer>see=new HashSet<>();
        Set<Integer>dsee=new HashSet<>();

        for(int num: arr){
            if (!see.add(num)){
                dsee.add(num);
            }
        }
        System.out.println(dsee);
    }
}

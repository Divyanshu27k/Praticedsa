package core;

import java.util.Arrays;
import java.util.List;

public class SortListwithoutusingCollectionssort {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5, 2, 9, 1);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);

    }

}

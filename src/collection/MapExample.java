package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String [] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map);

    }
}

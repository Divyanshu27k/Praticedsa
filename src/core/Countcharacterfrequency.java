package core;

import java.util.HashMap;
import java.util.Map;

public class Countcharacterfrequency {
    public static void main (String[] args){
        // Count character frequency
        String s = "divyanshusingh";
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

    }
}

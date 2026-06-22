package core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class NonRepeatingcharacter {
    public static void main(String[] args){
        String s= "adadjfvkdfdjfasdbcd";
        Map<Character,Integer> map= new LinkedHashMap<>();

        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
                break;

            }

        }
    }
}

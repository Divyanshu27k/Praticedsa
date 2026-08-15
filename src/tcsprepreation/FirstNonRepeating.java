package tcsprepreation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str="swiss";
        Map<Character,Integer> entry=new LinkedHashMap<>();
         for(char ch : str.toCharArray()){
             entry.put(ch,entry.getOrDefault(entry,0)+1);
         }
         for (Map.Entry<Character, Integer>entr : entry.entrySet()){
             if (entr.getValue()==1){
                 System.out.println(entr.getKey());
                 break;
             }
         }
    }
}

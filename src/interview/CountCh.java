package interview;

import java.util.HashMap;
import java.util.Map;

public class CountCh {
    public static void main(String[] args) {
        String srt="DivyanshuKumar";
        Map<String ,Integer> countCharacter= new HashMap<>();
        for(char ch:srt.toCharArray()){
            String key=String.valueOf(ch);
            countCharacter.put(key,countCharacter.getOrDefault(key,0)+1);
        }
        System.out.println(countCharacter);
    }
}

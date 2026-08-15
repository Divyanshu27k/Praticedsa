package tcsprepreation;

import java.util.Locale;

public class VowelsQuestion {
    public static void main(String[] args) {
        String str="shaiena priya";
        int consonents=0;
        int vowels=0;
        str=str.toLowerCase();
        for (char ch : str.toCharArray()){
            if(ch >='a' && ch<='z'){
                if("aeiou".indexOf(ch)!=-1){
                    vowels++;
                }else {
                    consonents++;
                }
            }
        }
        System.out.println("vowels " + vowels);
        System.out.println("consonents " + consonents);
    }
}

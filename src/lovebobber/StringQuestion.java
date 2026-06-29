package lovebobber;

import java.util.Scanner;

public class StringQuestion {

    //print each character of the string
    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getlengthofString(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;

    }

    static int getVowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }
        }
        return count;
    }

    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;

    }

    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        //compare
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = original.charAt(i);
            if (ch1 != ch2) {
                //np match
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
//        String name1="Divyanshu";
//        String name2=new String("Kumar");
//        System.out.println("first name: "+name1+ " "+ " last name: "+name2);
//        System.out.println(name1.length());
//        System.out.println(name1.charAt(3));
//        System.out.println(name2.charAt(4));

//        String name ="dk";
//        name="Divyanshu";
//        System.out.println(name);
        //differnce btn ==, .equal() and .equaligonrecase()
//        String name1 = "divyanshu";
//        String name2 = "DIVYANSHU";
//        if(name1 == name2){
//            System.out.println("Both are same Value");
//        }else {
//            System.out.println("Both are not same");
//        }
//        if(name1.equals(name2)){
//            System.out.println("Both are same Value");
//        }else {
//            System.out.println("Both are not same");
//        }
//        if(name1.equalsIgnoreCase(name2)){
//            System.out.println("Both are same Value");
//        }else {
//            System.out.println("Both are not same");
//        }
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Provide the string content: ");
//        String str= sc.nextLine();
//        System.out.println("value: " +str);
//        System.out.println("Provide the string content: ");
//        String str2= sc.next();
//        System.out.println("value: " +str2);

//        String str = "Divyanshu";
//        System.out.println(str.length());
//        System.out.println(str.charAt(4));
//        String name ="DIVYANSHU";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));

        //.empty(), .blank()
//        String str=" ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//      //  System.out.println(str.isBlank());
//        String name=" Divyanshu ";
//        System.out.println(name.length());
//        name.trim();
//        System.out.println(name.length());

        //uppercase or lowercase
//        String name =" divyanshu";
//        System.out.println(name.toUpperCase());
//        String str=" DIVYANSHU";
//        System.out.println(str.toLowerCase());

        //substring ,contains
//        String str="My name is Divyanshu";
//        System.out.println(str.substring(3,7));
//        System.out.println(str.contains("kumar"));

        //.valueOf(any type)
//        int num =5123;
//        String str=String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str+1);

        //.startwith(), .endsWith(String suffix)
//        String name ="Divyanshu is Singh";
//        System.out.println(name.startsWith("Divyanshu"));
//        System.out.println(name.endsWith("Singh"));

        //.toCharArr()
//        String name="Divyanshu";
//        char[] crr=name.toCharArray();
//        for (char ch: crr){
//            System.out.println("value of char: " + ch);
//        }

        //split()
//        String input="My,name,is,Divyanshu";
//        String[] words=input.split(",");
//        for (String str : words){
//            System.out.println(str);
//        }

        //replace(charoldchar, char)
//        String name="Divyawshu";
//        name=name.replace('w','n');
//        System.out.println(name);

        //print each character of the string
//        String str="Divyanshu";
//        printString(str);


        //count length of String without length()
//        String str ="Divyanshu";
//        System.out.println(getlengthofString(str));

        //count vowels in s string
//        String str ="divyanshu";
//        System.out.println(getlengthofString((str)));

        //Reverse a string
//        String str="divyanshu";
//        System.out.println(reverseString(str));

        //Check String is a palindrome or not
        String str = "Noon";
        System.out.println(isPalindrome(str));

        //some more question coming soon

    }

}

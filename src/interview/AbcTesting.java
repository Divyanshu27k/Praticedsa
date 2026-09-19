package interview;

import java.sql.SQLOutput;
import java.util.*;

public class AbcTesting {
    public static void main(String[] args) {
        //Reverse a String
//        String str ="Divyanshu";
//
//        String reversed=new StringBuilder(str).reverse().toString();
//        System.out.println(reversed);

        //Find Duplicate Elements in Array
//        int arr[]={1, 2, 3, 2, 4, 1, 5};
//        Set<Integer>seen=new HashSet<>();
//        Set<Integer>duplicates=new HashSet<>();
//        for (int num :arr){
//            if (!seen.add(num)){
//                duplicates.add(num);
//            }
//        }
//        System.out.println(duplicates);

        //Remove Duplicate Elements in Array
//        int arr[]={1, 2, 3, 2, 4, 1, 5};
//        Set<Integer>set=new LinkedHashSet<>();
//        for(int num: arr){
//            set.add(num);
//        }
//        System.out.println(set);

        //Find Frequency of Characters
//        String str="divyanshu";
//        Map<Character,Integer> map= new HashMap<>();
//        for (char ch:str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        System.out.println(map);

        //Find Maximum and Minimum
//        int arr[]={10, 5, 20, 8, 15};
//        int max=arr[0];
//        int min=arr[0];
//
//        for (int num:arr){
//            if (num> max){
//                max=num;
//            }
//            if (num<min){
//                min=num;
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

        //Find SecondLargest Element
//        int arr[]={10, 5, 20, 8, 15};
//        int largest=Integer.MIN_VALUE;
//        int secondLargest =Integer.MIN_VALUE;
//        for (int num : arr){
//            if (num >largest){
//                secondLargest=largest;
//                largest=num;
//            } else if (num>secondLargest && num!=largest) {
//                secondLargest=num;
//            }
//        }
//        System.out.println(largest);
//        System.out.println(secondLargest);

        //Count Vowels in a String
        String str="divyanshu";
        int count=0;
        for (char ch: str.toLowerCase().toCharArray()){
            if (ch =='a'|ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}

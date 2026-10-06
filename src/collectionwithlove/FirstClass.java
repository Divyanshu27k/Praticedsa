package collectionwithlove;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FirstClass {

    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>();
        list1.add(302);
        list1.add(320);
        list1.add(312);
        list1.add(323);
        list1.add(322);

        System.out.println(list1.get(3));
        System.out.println("before set"+list1);
        list1.set(1,333);
        System.out.println("after set"+list1);

        //toarray
       Object [] arr= list1.toArray();
       for (Object obj: arr){
           System.out.println(obj);
       }
        System.out.println(list1.contains(323));

        System.out.println("printing" + list1);
        Collections.sort(list1);
        System.out.println("ascnding order" + list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("deciending order" + list1);

      //  ArrayList<Integer> newlist= (ArrayList<Integer>)list1.clone();

    }

}

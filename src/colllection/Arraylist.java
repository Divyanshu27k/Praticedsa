package colllection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {

//        ArrayList<Integer>list =new ArrayList<>();
//        list.add(12);
//        list.add(83);
//        list.add(13);
//        list.add(23);
//        list.add(12);
//        list.add(83);
//        list.add(13);
//        list.add(23);
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");


//Traversing list through Iterator
        Iterator itr=list.iterator();//getting the Iterator
        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
//        List<Integer> list=new ArrayList<>();
//        Collection<Integer> col=new ArrayList<>();

    }
}

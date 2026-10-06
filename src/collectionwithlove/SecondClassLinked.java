package collectionwithlove;

import java.util.Collections;
import java.util.LinkedList;

public class SecondClassLinked {
    public static void main(String[] args) {

        LinkedList<Integer> list=  new LinkedList<>();
        list.add(12);
        list.add(9);
        list.add(42);
        list.add(89);
        list.add(23);
        list.add(67);
        list.add(34);
        System.out.println(list.lastIndexOf(67));
        Collections.sort(list);
        System.out.println("ascending order:" + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("descending order:" + list);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);

        LinkedList<Integer>lo=new LinkedList<>();
        lo.add(12);
        System.out.println(lo);
        lo.addFirst(56);
        System.out.println(lo);
        lo.addLast(109);
        System.out.println(lo);
        System.out.println(lo.getFirst());
        System.out.println("before : " + lo);
        System.out.println(lo.peek());
        System.out.println(lo);
        System.out.println("after : " + lo.poll());
        System.out.println(lo);



    }
}

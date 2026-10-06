package collectionwithlove;

import java.util.LinkedList;
import java.util.Queue;

public class FouthQueue {
    public static void main(String[] args) {

        Queue<Integer>qu= new LinkedList<>();
        qu.add(12);
        qu.add(43);
        qu.add(20);
        qu.add(30);
        qu.add(35);
        qu.add(67);
        qu.add(87);
        qu.add(40);
        qu.offer(39);
        System.out.println("removing : " +qu.poll());
        System.out.println(qu);

    }
}

package collectionwithlove;

import java.util.HashSet;
import java.util.Set;

public class FivethHashSet {
    public static void main(String[] args) {
        Set<Integer>st= new HashSet<>();
        Set<Integer>st1=new HashSet<>();
        st.add(2);
        st1.add(2);
        st.add(3);
        st.add(10);
        st1.add(10);
        st1.add(78);
        st.add(32);
        System.out.println(st);
        st.retainAll(st1);
        System.out.println(st);
        System.out.println(st1);
        System.out.println(st1.containsAll(st));

        HashSet<Empolyee>emp=new HashSet<>();

        Empolyee emp1=new Empolyee("divyanshu",27);
        Empolyee emp2=new Empolyee("divyanshu",27);
        Empolyee emp3= new Empolyee("divyanshu",27);
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);

        System.out.println(emp);
    }
}

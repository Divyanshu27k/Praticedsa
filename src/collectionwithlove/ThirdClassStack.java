package collectionwithlove;

import java.util.Collections;
import java.util.Stack;

public class ThirdClassStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.add(12);
        st.add(21);
        st.add(34);
        st.add(9);
        st.add(1);
        st.add(56);
        System.out.println(st);
        Collections.sort(st);
        System.out.println(st);
        Collections.sort(st,Collections.reverseOrder());
        System.out.println(st);

        st.push(9);
        st.pop();
        System.out.println(st);
        System.out.println(st.search(12));
        System.out.println(st.empty());

    }
}

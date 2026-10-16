package java8pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // MyClass mcl=new MyClass();
//        Runnable runnable=()->{
//          for(int i=1;i<=10;i++){
//              System.out.println("hello" +i );
//          }
//        };
//        Thread childThread=new Thread(runnable);
//        childThread.run();
        Student s1=new Student(211,"divyanshu");
        Student s2=new Student(23,"kumar");
        Student s3=new Student(453,"Singh");
        List<Student>st=new ArrayList<Student>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        Collections.sort(st ,(a,b)-> a.id -b.id);
        System.out.println(st);
    }
}

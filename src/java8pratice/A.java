package java8pratice;

public interface A {
    default void sayHello(){
        System.out.println("hello A");
    }
}

package java8pratice;

public interface B {
    default void sayHello(){
        System.out.println("Hello B");
    }
}

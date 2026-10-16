package java8pratice;

public class MyMainClass implements  A,B{
    public static void main(String[] args) {
        MyMainClass mc=new MyMainClass();
        mc.sayHello();

    }
    @Override
    public void sayHello() {
        B.super.sayHello();
    }

}

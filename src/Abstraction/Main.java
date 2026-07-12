package Abstraction;

abstract class Bird{
    abstract void fly();

    abstract  void eat();

}
class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("sparrow fly");

    }

    @Override
    void eat() {
        System.out.println("sparrow eating");
    }
}



public class Main {
    public static void main(String[] args) {
        Bird bd =new Sparrow();
        bd.eat();
        bd.fly();
    }
}

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
class Parrot extends Bird {

    @Override
    void fly() {
        System.out.println("Parrot fly");

    }

    @Override
    void eat() {
        System.out.println("Parrot eating");
    }
}


public class Main {
    public static void doBirds(Bird b){
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        doBirds(new Sparrow());
        doBirds(new Parrot());
    }


//    public static void main(String[] args) {
//        Bird bd =new Sparrow();
//        bd.eat();
//        bd.fly();
//        bd= new Parrot();
//        bd.eat();
//        bd.fly();
//    }

}

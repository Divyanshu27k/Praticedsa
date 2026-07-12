//package Abstraction;
//
//public interface BIrd {
//    void fly();
//
//    void eat();
//
//}
//class STparrow implements BIrd {
//
//
//    @Override
//    public void fly() {
//        System.out.println("Sparrow is fying");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Sparrow is eat");
//
//    }
//}
//class TParrot implements BIrd {
//
//
//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void eat() {
//
//    }
//}
//
//
//public class Main {
//    public static void doBirds(Bird b) {
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//        b.fly();
//        b.eat();
//
//    }
//
//    public static void main(String[] args) {
//        doBirds(new Sparrow());
//        doBirds(new Parrot());
//    }
//}
//
////    public static void main(String[] args) {
////        Bird bd =new Sparrow();
////        bd.eat();
////        bd.fly();
////        bd= new Parrot();
////        bd.eat();
////        bd.fly();
////    }
//

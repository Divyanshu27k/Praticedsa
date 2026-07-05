package Polymorpshim;

public class CalculatorMain {

    public static void main(String[] args) {
//        Calculator c=new Calculator();
//        System.out.println(c.add(2,4));
//        System.out.println(c.add(2,4,6));
//        System.out.println(c.add(2,4.05,098.7));

        Circle c=new Circle();
        dodraw(c);
        c.draw();

        React re=new React();
        re.draw();

        Shape s=new Shape();
        dodraw(s);

        //Circle c=new Circle();


    }

    public static void dodraw(Shape s){
      s.draw();

        Circle c=new Circle();
        c.persnal();

    }

}

package multhreading;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                "Main: " + Thread.currentThread().getName()
        );

        MyThread t1 = new MyThread();

        t1.start();
    }
}

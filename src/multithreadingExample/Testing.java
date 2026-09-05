package multithreadingExample;

public class Testing {
    public static void main(String[] args) {

        Word wd=new Word();
        //wd.start();
        Thread t1=new Thread(wd);
        t1.start();
        for(int i=0;i<10000;i++) {
            System.out.println("hello");
        }
        }
}

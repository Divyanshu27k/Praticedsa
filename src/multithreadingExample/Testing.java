package multithreadingExample;

public class Testing {
    public static void main(String[] args) {

        Word wd=new Word();//new
        wd.start();//runnable
//        Thread t1=new Thread(wd);
//        t1.start();//runnable
        for(int i=0;i<10000;i++) {
            System.out.println("hello");
        }
        }
}

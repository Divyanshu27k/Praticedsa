package multithreadingExample;

public class Test {
    public static void main(String[] args) {
        Counter counter=new Counter();
        MyThreadSynch t1=new MyThreadSynch(counter);
        MyThreadSynch t2=new MyThreadSynch(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}

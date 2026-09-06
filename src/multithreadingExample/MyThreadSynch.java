package multithreadingExample;

public class MyThreadSynch extends Thread {
    private Counter counter;
    public MyThreadSynch(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.increment();
        }

    }

}

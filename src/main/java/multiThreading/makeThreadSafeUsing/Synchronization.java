package multiThreading.makeThreadSafeUsing;

class Counter{
    int count = 0;

    public synchronized void increment(){
       count++;
    }
}


public class Synchronization {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread t1 = new Thread( () -> {
            for(int i = 1; i<=1000 ; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread( ()-> {
            for(int i = 1; i<=1000 ; i++){
                counter.increment();
            }
        });
        t1.start();
        t2.start();

        // if without join we will print then we will get 0 , because print is not waiting for thread to complete.
        // if we want to want print statement to start after thread runs , we have to use "join".
        t1.join();
        t2.join();

        /*
           if you do not put synchronize in the increment block it will give random number where as
           the increment should be 2000 as 2 thread is running 1 - 1000.
            Q. why is happing ?
            A . Suppose both thread see 100 and updating at the same time it becomes 101. So it became 101 instead of 102.
        */

        System.out.println("Final Count : "+ counter.count);
    }
}

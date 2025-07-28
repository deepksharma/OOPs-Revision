package multiThreading.makeThreadSafeUsing;

import java.util.concurrent.atomic.AtomicInteger;

class Counter1{
   // int count =0;
    AtomicInteger count = new AtomicInteger();

    public void increment(){
        count.incrementAndGet();
    }
}

public class Atomic {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter1 = new Counter1();
        Thread t1 = new Thread( ()-> {
            for(int i=0 ; i<1000 ; i++){
                counter1.increment();
            }
        });
        Thread t2 = new Thread( ()-> {
            for(int i=0 ;i<1000 ; i++){
                counter1.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count using AtomicInteger : "+ counter1.count.get() );
    }
}

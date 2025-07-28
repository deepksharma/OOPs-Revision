package multiThreading.makeThreadSafeUsing;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter2 {
    int count = 0;
    Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // thread acquires lock
        try {
            count++;
        } finally {
            lock.unlock(); // thread releases lock (must be in finally!)
        }
    }
}
public class UsingReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter = new Counter2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count using ReentrantLock: " + counter.count);
    }
}

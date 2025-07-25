package multiThreading;

class MyThread implements Runnable{
    public void run(){
        // task for thread
        for(int i=0 ; i<11 ; i++){
            System.out.println(" Value of i : "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class CreatingThreadMethod1 {
    public static void main(String[] args) {

        // create obj of MyThread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);

        // obj of another thread
        MyAnotherThread t2 = new MyAnotherThread();

        thr.start();
        t2.start();

    }

}

package multiThreading.selfPrac;

class MyRunnabe1 implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<=5 ; i++){
            System.out.println("thread 1 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for(int i =0 ; i<= 5 ; i++){
            System.out.println("thread 2 : "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class PracticeImplementing {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnabe1());
        Thread t2 = new Thread(new MyRunnable2());

        System.out.println("Before start - isAlive : "+ t1.isAlive());
        t1.start();
        System.out.println("After start - isAlive : "+ t1.isAlive());
      //  t1.join();   joins() -> till t1 executes completely then only t2 will start
        t2.start();
    }

}

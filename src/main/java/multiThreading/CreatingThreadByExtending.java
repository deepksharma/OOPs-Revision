package multiThreading;
class MyAnotherThread extends Thread{
    public void run(){
        // task for thread
        for(int i=10; i>=1; i--){
            System.out.println("another thread = "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class CreatingThreadByExtending {
    public static void main(String[] args) {

        // made obj of MyAnotherThread in CreatingThreadMethod1
    }
}

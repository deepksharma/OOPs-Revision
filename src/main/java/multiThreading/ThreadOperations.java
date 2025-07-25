package multiThreading;

class UserThread extends Thread{
    public void run(){
        //task for thread
        System.out.println("this is user defined thread. ");
    }
}

public class ThreadOperations {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("program started...");
        int x = 50 + 50;
        System.out.println("the sum is : "+x);
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current running thread is -> "+tname);
        t.setName(" Main made by Deepak ");
        System.out.println("Change name of main -> "+t.getName());

        Thread.sleep(3000);

        System.out.println("get Id of thread -> "+t.getId());

        System.out.println("program ended...");

        // going to start user defined thread.
        UserThread thread = new UserThread();
        thread.start();
    }
}

package multiThreading.selfPrac;

class MyThread extends Thread{
    public void run(){
        for(int i =0 ; i<= 10 ; i++){
            System.out.println("value of i : "+ i);
        }
    }
}

public class PracticeExtending {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.run();  // This does not start a new thread.It just calls the run() method like a normal method — on the main thread
        thread.start(); // This creates a new thread and runs run() on that new thread.So again, values were printed, this time by the new thread.
        thread.start(); // ❌ You can only start a thread once.Because once a thread finishes, it cannot be restarted.

           //✅ Solution: If you want to start again, you must create a new object.
//               MyThread thread2 = new MyThread();
//               thread2.start(); // New object, new thread

    }
}

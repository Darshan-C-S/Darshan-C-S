package Darshan.class6;
class ThreadPriority extends  Thread
{
    @Override
    public void run() {
        System.out.println("Current name is :"+Thread.currentThread().getName());
        System.out.println("Current priority is :"+Thread.currentThread().getPriority());
    }
}
public class demo3 {
    public static void main(String[] args) {
        ThreadPriority t1  = new ThreadPriority();
        ThreadPriority t2  = new ThreadPriority();
        ThreadPriority t3  = new ThreadPriority();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();


    }
}

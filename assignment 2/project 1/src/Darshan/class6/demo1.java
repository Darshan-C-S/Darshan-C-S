package Darshan.class6;
class thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("first thread is run");
    }

}
class thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("runnable thread ");
    }
}

public class demo1 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 th2 = new thread2();
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();



    }
}

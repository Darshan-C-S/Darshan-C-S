package Darshan.class5;
class multith2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running");

    }
}
public class demo10 {
    public static void main(String[] args) {
        multith2 m = new multith2();
        Thread t  = new Thread(m);
       t.start();

    }
}

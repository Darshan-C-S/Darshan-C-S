package Darshan.class5;
class multith extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running ");
    }
}
public class demo9 {
    public static void main(String[] args) {
        multith m = new multith();
        m.start();

    }
}

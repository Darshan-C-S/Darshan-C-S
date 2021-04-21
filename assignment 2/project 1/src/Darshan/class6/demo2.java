package Darshan.class6;
class threadNameDemo extends Thread{
    @Override
    public void run() {
        System.out.println("thread is running ");
    }
}
public class demo2 {
    public static void main(String[] args) {
        threadNameDemo t1 = new threadNameDemo();
        threadNameDemo t2  = new threadNameDemo();
        System.out.println("Name 1 :"+ t1.getName());
        System.out.println("Name 2 :"+ t2.getName());
        t1.setName("Name1");
        t2.setName("Name2");
        System.out.println("Name 1 : "+t1.getName());
        System.out.println("Name 2 :" + t2.getName());

    }
}

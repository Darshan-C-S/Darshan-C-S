package Darshan.class4;
interface I1{
    void test1();
}
interface I2 extends I1{
    void test2();
}
interface  I3 extends I2{
    void test3();
}

class Print1 implements I3 {
    @Override
    public void test1() {
        System.out.println("impliment 1 is running");
    }

    @Override
    public void test2() {
        System.out.println("impliment 2 is running");
    }

    @Override
    public void test3() {
        System.out.println("impliment 3 is running ");

    }
}
public class Demo2 {
    public static void main(String[] args) {
        Print1 p =new Print1();
        p.test1();
        p.test2();
        p.test3();

    }
}

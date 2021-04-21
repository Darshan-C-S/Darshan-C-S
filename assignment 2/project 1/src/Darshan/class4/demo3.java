package Darshan.class4;
interface Ip1{
    void PP1();
}
interface Ip2{
    void PP2();
}
class PrintAll implements Ip1,Ip2{
    @Override
    public void PP1() {
        System.out.println("print PP1");

    }

    @Override
    public void PP2() {
        System.out.println("print pp2");
    }
}
public class demo3 {
    public static void main(String[] args) {

        PrintAll p = new PrintAll();
        p.PP1();
        p.PP2();

    }
}

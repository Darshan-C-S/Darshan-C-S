package Darshan.class3;

abstract class AbstractClassDemo{
    public void addNumber(int num1, int num2){
        System.out.println("Sum : "+ (num1+ num2));
    }

    public void subNumber(int num1, int num2){
        System.out.println("Sub : "+ (num1- num2));
    }

    public abstract void mulNumber(int num1, int num2);
    public abstract void divNumber(int num1, int num2);

}

class ChildDemo extends AbstractClassDemo{

    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: "+ (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: "+ (num1 / num2));
    }
}
public class abstracter {
    public static void main(String[] args) {
        ChildDemo c = new ChildDemo();
        c.addNumber(2,3);
        c.subNumber(5,7);
        c.divNumber(10,2);
        c.mulNumber(2,10);

    }
}

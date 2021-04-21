package Darshan.class4;

interface IEmployee{
    void print();
}

class emp implements IEmployee{
    @Override
    public void print() {
        System.out.println("Employee is yo");
    }
}

public class Demo11 {
    public static void main(String[] args) {
        emp e = new emp();
        e.print();

    }
}

package Darshan.class3;

class cal{
    public void add (int n ,int m){
        System.out.println(n+m);
    }
    public static void multiply (int n ,int m){
        System.out.println(n*m);
    }
    public void sub (int n , int m){
        System.out.println(n-m);
    }
}

public class calculate {
    public static void main(String[] args) {
        cal c = new cal();
        c.add(2,4);
        c.multiply(3,5);
        c.sub(8,2);
    }

}

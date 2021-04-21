package Darshan.class3;

public class overloading1 {
    public static void main(String[] args) {
        String m = "Hello world";
        m.indexOf('o');
        m.indexOf('o',5);
        System.out.println(m.indexOf('o'));
        System.out.println(m.indexOf('o',5));
        System.out.println(m.indexOf("ll"));
    }
}

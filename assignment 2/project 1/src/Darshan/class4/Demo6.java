package Darshan.class4;

public class Demo6 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 1;

        try {
            c= a/b;

        }
        //catch (ArithmeticException ex){
          //  System.out.println("provide no greater than 0");
        //}
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("result :"+ c);
    }
}

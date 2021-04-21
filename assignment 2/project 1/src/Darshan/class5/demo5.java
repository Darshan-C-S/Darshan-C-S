package Darshan.class5;

public class demo5 {
    public static void main(String[] args) {
        try {
            print1();
        }catch (StackOverflowError e){

        }

    }
    public static void print1(){
        print2();

    }
    public static void print2(){
        print1();
    }
}

package Darshan.class5;

public class demo3 {
    public static void main(String[] args) {
        int a [] = new int[3];
        a[0]= 1;
        a[1]= 2;
        a[2]= 3;
        try{
            System.out.println(a[100]);
        }
        catch(ArrayIndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}

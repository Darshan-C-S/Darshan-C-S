package Darshan;
import  java .util.*;

public class revercearray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[] = new int[size];
        for (int i=0 ; i<a.length ; i++){

            a[i] = sc.nextInt();
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);

        }

    }
}

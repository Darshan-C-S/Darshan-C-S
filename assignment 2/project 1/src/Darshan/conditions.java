package Darshan;
import java .util.*;

public class conditions {


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =  sc.nextInt();
        String no = sc.next();
        switch (n){
            case 1 :{
                System.out.println("its 1");
                break;
            }
            case 2 : {
                System.out.println("its 2");
                break;
            }
            default: {
                System.out.println("some other no");
            }

        }
        switch (no){
            case "one" :{
                System.out.println(1);
                break;
            }
            case "two" : {
                System.out.println(2);
                break;
            }
            default: {
                System.out.println("some other ");
            }

        }


    }
}

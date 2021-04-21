package Darshan;
import java .util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int b[] = new int[s];
        for (int i=0 ; i<b.length ; i++){

            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int l =  b[s-1] ;
        int  sm = b[0] ;
        int  ssm = b[1];
        int ldif = l-sm;
        int sdif = ssm - sm;
        System.out.println(l);
        System.out.println(sm);
        System.out.println(ldif);
        System.out.println(sdif);



    }
}

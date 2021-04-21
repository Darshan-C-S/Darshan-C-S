package Darshan.class4;
class Ife extends Exception{
    private  int amount;
    public Ife(){
        System.out.println("insufficient amount");
    }
    public Ife(String message){
        System.out.println(message);
    }
}
class  Account {
 private int balence ;
 private int accno;
 public Account (int accno){
     this.accno = accno;

 }
 public void Deposit(int amount){
     balence+= amount;
     System.out.println("the amount debited is "+ amount);
    }
    public void Withdrow (int amount){
     if (amount<=balence){
         balence-=amount;
         System.out.println("the amount debitd is "+amount);
     }
     else {
         try {
             throw new Ife();
         }
         catch (Ife e){
             e.printStackTrace();
         }
     }


    }
    public int Getaccno(){
     return accno;
    }
    public int getBalence(){
     return balence;
    }
}
public class Demo8 {
    public static void main(String[] args) {
        Account a = new Account(56894);
        System.out.println(a.Getaccno());
        a.Deposit(5000);
        a.Withdrow(2000);
        a.Deposit(1000);
        a.Withdrow(2500);
        a.getBalence();

    }
}

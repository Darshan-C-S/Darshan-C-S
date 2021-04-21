package Darshan.class6;
class bank {
    int balence = 10000;
    synchronized public  void  Withdrow (int amount) {
        System.out.println("Withdrow is processing .....");
        if (balence < amount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balence -= amount;
            System.out.println("withdrow completed");
        }
    }
    synchronized public void  deposit (int amount){
        System.out.println("deposit is in process....");
        balence+=amount;
        System.out.println("the amount is deposited");
    }
}
class Dt extends Thread{
    bank b ;
    Dt(bank b ){
        this.b = b;

    }

    @Override
    public void run() {
        b.deposit(4000);
    }
}
class Wt extends Thread{
    bank b ;
    Wt (bank b ){
        this.b = b;

    }

    @Override
    public void run() {
        b.Withdrow(1000);
    }
}
public class demoThreadCom {
    public static void main(String[] args) {
        bank b = new bank();
        Dt d = new Dt(b);
        Wt w = new Wt(b);
        d.start();
        w.start();

    }
}

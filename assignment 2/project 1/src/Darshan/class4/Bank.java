package Darshan.class4;


interface IBankAccount{
    boolean deposit(double amount);
    boolean withdraw(double amount);
    void getBalance();
}

class SavingAccount implements IBankAccount{

    private double _balance;
    private double _perDayLimit;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        System.out.println("Deposit amount: "+ amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(_balance < amount){
            System.out.println("Insufficient fund!");
            return false;
        }
        // per day cash limit is 5000
        else if(_perDayLimit + amount > 5000){
            System.out.println("Withdraw attempt failed");
            return false;
        }
        else{
            _balance -= amount;
            _perDayLimit += amount;
            System.out.println("Successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving account balance: "+ _balance);
    }
}

class CurrentAccount implements IBankAccount {

    private double _balance;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        System.out.println("Deposit amount: " + amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (_balance < amount) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            _balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Current account balance: " + _balance);
    }

}







public class Bank {
    public static void main(String[] args) {
        IBankAccount savingAccount = new SavingAccount();
        IBankAccount currentAccount = new CurrentAccount();

        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.getBalance();

        System.out.println("------------------");

        currentAccount.deposit(5000);
        currentAccount.withdraw(6000);
        currentAccount.withdraw(2000);
        currentAccount.getBalance();

    }
}

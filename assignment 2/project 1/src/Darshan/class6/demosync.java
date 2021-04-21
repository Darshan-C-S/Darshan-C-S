package Darshan.class6;
class Table{
    synchronized public  void PrintTable (int no){
        for(int i = 0 ; i<10 ;i++){
            System.out.println(no + "x"+ i + "="+ (no * i) );
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class MyThread1 extends Thread{
    Table table;
    MyThread1(Table table){
        this.table = table;
    }

    @Override
    public void run() {
        table.PrintTable(5);
    }
}
class  MyThread2 extends Thread{
    Table table;
    MyThread2(Table table){
        this .table = table;
    }

    @Override
    public void run() {
        table.PrintTable(100);
    }
}

public class demosync {
    public static void main(String[] args) {
        Table tableObject = new Table();
        MyThread1 t1 = new MyThread1(tableObject);
        MyThread2 t2 = new MyThread2(tableObject);
        t1.start();
        t2.start();

    }
}

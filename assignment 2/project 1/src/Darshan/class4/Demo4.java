package Darshan.class4;
interface GetEmployeename{
    void Empname();
    default void CompanyName(){
        System.out.println("Ness");
    }
}
class PrintEmp implements GetEmployeename{
    @Override
    public void Empname() {
        System.out.println("Darshan C S");
    }
}
public class Demo4 {
    public static void main(String[] args) {
        PrintEmp p = new PrintEmp();
        p.Empname();
        p.CompanyName();

    }
}

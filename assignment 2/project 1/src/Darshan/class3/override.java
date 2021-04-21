package Darshan.class3;
class empliyeee{
    public String ln;
    public  String fn;
     public void getFullname(){
         System.out.println(fn + " "+ln);
     }
}
class fte extends empliyeee{
    @Override
    public void getFullname() {

        System.out.println(fn + " "+ln +"-fulltime");
    }
}
class pte extends empliyeee{
    @Override
    public void getFullname() {
        System.out.println(fn+ " "+ln+"-parttime");
    }
}
public class override {
    public static void main(String[] args) {
        fte f = new fte();
        pte p = new pte();

        f.fn = "Bill";
        f.ln = "hanks";

        p.fn = "mark";
        p.ln = "smith";
        f.getFullname();
        p.getFullname();

    }
}

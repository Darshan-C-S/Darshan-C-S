package Darshan.class5;
class empl{
    public void display(){
        System.out.println("display.....");
    }
}

public class demo4 {
    public static void main(String[] args) {
        String str1 = "Adam";
        System.out.println(str1.length());
        String str2 = null;
        try {
            System.out.println(str2.length());
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        empl e = new empl();
        e.display();
        empl e1 = null;
        e1.display();

    }
}

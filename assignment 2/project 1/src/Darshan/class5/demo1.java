package Darshan.class5;

public class demo1 {
    public static void main(String[] args) {

        try {
            dosomething();
        }catch (Exception e){
            e.printStackTrace();

        }
    }

    private static void dosomething() throws Exception {
     ///  try {
           dosomethingelse();
       }
     //  catch (Exception e){
        //   System.out.println("dosomething");
     // }
   // }

    private static void dosomethingelse() throws Exception {
        dosomethingsomethingelse();
    }

    private static void dosomethingsomethingelse() throws Exception {
        throw new Exception();
    }
}

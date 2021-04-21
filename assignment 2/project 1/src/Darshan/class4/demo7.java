package Darshan.class4;
class TestException extends ArithmeticException{

}

public class demo7 {
    public static void main(String[] args) throws TestException {
       // ArithmeticException ex = new ArithmeticException();
        //throw ex;

      throw new ArithmeticException();

    }
}

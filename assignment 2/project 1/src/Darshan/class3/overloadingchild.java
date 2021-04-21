package Darshan.class3;
class p{
    public void hello(){
        System.out.println("hello");
    }

}
class c extends p{
    public void hello(int n){

        System.out.println(n);
    }
}

public class overloadingchild {
    public static void main(String[] args) {
        c C = new c();
        C.hello(3);
        C.hello();


    }
}

package Darshan.class3;

class Test3{
    int a, b,c,d;

    public Test3(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Test3(Test3 obj){
        this.a = obj.a;
        this.b = obj.b;
        this.c = obj.c;
        this.d = obj.d;
    }

}



public class demo2 {
    public static void main(String[] args) {


        Test3 test3Obj = new Test3(10,20,30,40);
        Test3 test3Obj2 = new Test3(test3Obj);



    }
}


package Darshan.class3;

 class test {
    static int i;
    static {
        i = 28;
        System.out.println("hello");
    }
}
class  teststatic {
    public static void main(String[] args) {
        System.out.println(test.i);

    }
}
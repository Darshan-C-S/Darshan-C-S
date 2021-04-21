package Darshan.list;
import javax.swing.text.html.HTMLDocument;
import java .util.*;

public class arraylist {

    public  int  id ;
    public String name ;
    public int age ;

    public arraylist(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("Tesla");
        car.add("Bently");
        car.add("Bugati");
        car.add("ferari");
        System.out.println(car);
        for(String name : car ){
            System.out.println(name);
        }
        for (int i=0;i<car.size();i++){
            System.out.println(car.get(i));
        }
       car.add("Rols Roys");
        car.add("Hummer");
        System.out.println(car);
ArrayList<arraylist> array = new ArrayList<>();
arraylist arr1 = new arraylist(1,"Darshan",22);
arraylist arr2 = new arraylist(2,"Mohit",22);
arraylist arr3 = new arraylist(3 , "seema",22);
array.add(arr1);
array.add(arr2);
array.add(arr3);

        for (arraylist arr : array ){
            System.out.println("id = "+arr.id+" Name = "+arr.name+" age = "+arr.age );
        }

    }
}

package Darshan.class4;

import jdk.nashorn.internal.runtime.ECMAException;

class Student{
    private int id;
    private String name;
    private int marks = 80;

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {

        if (id<0){
            throw new Exception("Wrong id");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isEmpty()){
            throw new Exception("Fill the name");
        }
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Demo5  {
    public static void main(String[] args) throws Exception {
        Student s = new Student();

        s.setId(20);
        s.setName("billi");
        s.setMarks(89);
        System.out.println(s.getMarks() + s.getName()+s.getId());


    }
}

package Darshan.class3;
class Book{
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println("Book: Title="+ title+", Author="+ author+", Price="+ price);
    }

}

public class demo1 {
    public static void main(String[] args) {
        Book  obj  = new Book();
        obj.setTitle("harry");
        obj.setAuthor("harry");
        obj.setPrice(300);

        Book  obj2  = new Book();
        obj2.setTitle("arry");
        obj2.setAuthor("arry");
        obj2.setPrice(200);
        obj.print();
        obj2.print();

    }

}

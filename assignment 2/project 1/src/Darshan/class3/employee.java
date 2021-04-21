package Darshan.class3;

 class employee {
    public  int id;
    public  String Fname;
    public String Lname;
    public int pno;

     public void getfullname() {
         System.out.println(Fname + " " + Lname);
     }}
     class fulltimeemp extends employee{
         public int anualsal;

     }
     class parttimeemp extends employee{

          public int hourlysal;

     }
   class main {
       public static void main(String[] args) {
           fulltimeemp fte  =new fulltimeemp();
           parttimeemp pte = new parttimeemp();
           fte.Fname = "Mike";
           fte.Lname = "Tyson";
           pte.Fname = "Floyed";
           pte.Lname = "Mayvether";
           fte.anualsal = 3000000;
           fte.getfullname();
           pte.getfullname();
           System.out.println(fte.anualsal);

       }
   }

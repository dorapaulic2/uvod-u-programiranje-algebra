public class Main {
    public static void main(String... args) {
     int novac =0;
     int dan=1;
     while (dan <=7) {
         if (dan == 7) {
             novac = novac + 20;

         }
         else {
             novac = novac + 10;
         }
         System.out.println("Nakon " + dan + " dana " + " imam " + novac + " EUR");
         dan++;

     }
    }
}

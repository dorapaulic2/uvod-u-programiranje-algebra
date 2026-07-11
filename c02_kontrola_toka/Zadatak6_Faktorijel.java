public class Zadatak6_Faktorijel {
    public static void main(String[] args) {
        int broj = 5;
        long faktorijel = 1;
        for (int i = 1; i <= broj; i++) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel broja " + broj + " je: " + faktorijel);
    }
}

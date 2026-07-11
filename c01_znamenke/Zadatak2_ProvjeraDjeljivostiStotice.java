public class Zadatak2_ProvjeraDjeljivostiStotice {
    public static void main(String... args) {
        int udaljenost = 3591;
        int privremeni = udaljenost / 100;
        int stotica = privremeni % 10;

        if (stotica % 5 == 0) {
            System.out.println("Znamenka je djeljiva s 5");
        } else {
            System.out.println("Znamenka nije djeljiva s 5");
        }
    }
}

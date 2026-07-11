public class Zadatak6_DeseticeDjeljivost {
    public static void main(String... args) {
        int udaljenost = 3591;
        int privremeni = udaljenost / 10;
        int desetica = privremeni % 10;

        if (desetica % 3 == 0) {
            System.out.println("Znamenka je djeljiva s 3 i iznosi: " + (desetica / 3));
        } else {
            System.out.println("Znamenka nije djeljiva s 3");
        }
    }
}

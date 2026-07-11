public class Zadatak4_ZavrsniZnamenkaIznadPet {
    public static void main(String... args) {
        int kodDokumenta = 538629;
        int privremeni = kodDokumenta / 1000;
        int tisucica = privremeni % 10;

        if (tisucica > 5) {
            System.out.println("Znamenka " + tisucica + " je veca od 5!");
        } else {
            System.out.println("Znamenka " + tisucica + " nije veca od 5!");
        }
    }
}

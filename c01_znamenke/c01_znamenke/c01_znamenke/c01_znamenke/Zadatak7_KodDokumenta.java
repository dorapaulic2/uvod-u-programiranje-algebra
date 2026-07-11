public class Zadatak7_KodDokumenta {
    public static void main(String... args) {
        int kodDokumenta = 538629;
        int brojZnamenki = (int) Math.log10(kodDokumenta) + 1;
        int alat = (int) Math.pow(10, brojZnamenki - 1);

        int prvaZnamenka = kodDokumenta / alat;
        int privremeni = kodDokumenta / 10;
        int dvoznamBroj = privremeni % 100;

        int razlikaBrojeva = dvoznamBroj - prvaZnamenka;

        if (razlikaBrojeva > 50 && razlikaBrojeva % 2 == 0) {
            System.out.println("Kod je odobren!");
        } else {
            System.out.println("Kod je odbijen!");
        }
    }
}

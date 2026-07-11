public class Zadatak5_ZbrojPrveIZadnje {
    public static void main(String... args) {
        int matrikula = 48269;
        int brojZnamenki = (int) Math.log10(matrikula) + 1;
        int alat = (int) Math.pow(10, brojZnamenki - 1);

        int prvaZnamenka = matrikula / alat;
        int zadnjaZnamenka = matrikula % 10;
        int zbrojZnamenki = prvaZnamenka + zadnjaZnamenka;

        System.out.println("Zbroj znamenki iznosi = " + zbrojZnamenki);

        if (zbrojZnamenki > 10) {
            System.out.println("Zbroj je dvoznamenkasti");
        } else {
            System.out.println("Zbroj je jednoznamenkasti");
        }
    }
}

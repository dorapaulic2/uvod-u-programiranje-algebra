public class Zadatak1_ZbrojPrveIDvijeZadnje {
    public static void main(String... args) {
        int matrikula = 48269;
        int brojZnamenki = (int) Math.log10(matrikula) + 1;
        int alat = (int) Math.pow(10, brojZnamenki - 1);

        int prvaZnamenka = matrikula / alat;
        int zadnjeDvije = matrikula % 100;
        int zbrojZnamenki = prvaZnamenka + zadnjeDvije;

        System.out.println("Zbroj prve i zadnje dvije iznosi = " + zbrojZnamenki);
    }
}

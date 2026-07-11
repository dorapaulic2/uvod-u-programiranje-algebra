public class Zadatak7_IzolacijaSredine {
    public static void main(String... args) {
        int artiklID = 12648;
        int brojZnamenki = (int) Math.log10(artiklID) + 1;
        int alat = (int) Math.pow(10, brojZnamenki - 1);

        int bezPrve = artiklID % alat;
        int bezZadnjeDvije = bezPrve / 100;

        System.out.println("Nastali broj iznosi " + bezZadnjeDvije);
    }
}

public class Zadatak3_MnozenjeSredine {
    public static void main(String... args) {
        int artiklID = 12648;
        int brojZnamenki = (int) Math.log10(artiklID) + 1;
        int alat = (int) Math.pow(10, brojZnamenki - 1);

        int bezPrve = artiklID % alat;
        int sredina = bezPrve / 10;

        int prvaSrednja = sredina / 10;
        int drugaSrednja = sredina % 10;
        int umnozak = prvaSrednja * drugaSrednja;

        System.out.println("Umnozak srednjih znamenki iznosi " + umnozak);
    }
}

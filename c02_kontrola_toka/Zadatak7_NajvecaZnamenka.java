public class Zadatak7_NajvecaZnamenka {
    public static void main(String[] args) {
        int broj = 48269;
        int najveca = 0;
        int privremeni = Math.abs(broj);
        while (privremeni > 0) {
            int znamenka = privremeni % 10;
            if (znamenka > najveca) {
                najveca = znamenka;
            }
            privremeni /= 10;
        }
        System.out.println("Najveća znamenka u broju je: " + najveca);
    }
}

public class Zadatak3_ArmstrongoviBrojevi {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int privremeni = i;
            int zbroj = 0;
            while (privremeni > 0) {
                int znamenka = privremeni % 10;
                zbroj += znamenka * znamenka * znamenka;
                privremeni /= 10;
            }
            if (zbroj == i) {
                System.out.println(i + " je Armstrongov broj.");
            }
        }
    }
}

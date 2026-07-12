public class Main {
    public static void main(String... args) {
        int stanjeSkladista = 100;
        int brojNarudzbe = 1;

        while (brojNarudzbe <= 20) {

            if ( stanjeSkladista <=0 ){
                System.out.println("Skladište je prazno, prekidamo rad!");
            break;
            }
            if (brojNarudzbe == 5 || brojNarudzbe == 10){
                System.out.println("Greška u narudžbi br " + brojNarudzbe + ", preskačemo");
                brojNarudzbe++;
                continue;
            }
            stanjeSkladista = stanjeSkladista -10;
            System.out.println("Narudžba " + brojNarudzbe + " izvršena. Stanje " + stanjeSkladista);
            brojNarudzbe++;
         }
    }
}

public class Main {
    public static void main (String...args){

       Scanner skener = new Scanner(System.in);
       System.out.println("Upišite lozinku");
       String lozinka = skener.nextLine();

       if (lozinka.length() < 8){
           System.out.println("Lozinka je prekratka");
       }
       int velikoSlovo=0;
       int brojZnamenki=0;

       for (int i =0; i < lozinka.length(); i++){

           char b = lozinka.charAt(i);

           if ( Character.isUpperCase(b)){
               velikoSlovo++;

           }
           else if (Character.isDigit(b)){
               brojZnamenki++;
           }
              }
        System.out.println("Broj velikih slova je " + velikoSlovo);
        System.out.println("Broj znamenki je " + brojZnamenki);


       if (velikoSlovo >=2 && brojZnamenki >=2 ){
           System.out.println("Lozinka je sigurna");
       }
       else {
           System.out.println("Lozinka nije sigurna ");
       }
    }
}

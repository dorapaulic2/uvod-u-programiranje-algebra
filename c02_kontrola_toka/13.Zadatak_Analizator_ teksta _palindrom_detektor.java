import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        Scanner skener = new Scanner(System.in);
        System.out.println("Upišite riječ");

        String rijec = skener.nextLine();

        int znakovi = 0;

        for (int i = 0; i < rijec.length(); i++) {

            char b = rijec.charAt(i);

            if (!Character.isLetter(b)) {
                znakovi++;
            }
        }
        if (znakovi == 0) {
            System.out.println("Riječ je čista");
        } else {
            System.out.println("Riječ sadrži posebne znakove");
        }

        for (int i = rijec.length() - 1; i >= 0; i--) {
            System.out.print(rijec.charAt(i));
        }

    }
}

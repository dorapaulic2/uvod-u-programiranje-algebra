public class Zadatak5_SwitchOcjene {
    public static void main(String[] args) {
        int ocjena = 4;
        switch (ocjena) {
            case 1: System.out.println("Nedovoljan"); break;
            case 2: System.out.println("Dovoljan"); break;
            case 3: System.out.println("Dobar"); break;
            case 4: System.out.println("Vrlo dobar"); break;
            case 5: System.out.println("Odličan"); break;
            default: System.out.println("Neispravna ocjena!");
        }
    }
}

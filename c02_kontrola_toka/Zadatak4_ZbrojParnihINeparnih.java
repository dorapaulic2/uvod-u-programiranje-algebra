public class Zadatak4_ZbrojParnihINeparnih {
    public static void main(String[] args) {
        int zbrojParnih = 0;
        int zbrojNeparnih = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                zbrojParnih += i;
            } else {
                zbrojNeparnih += i;
            }
        }
        System.out.println("Zbroj parnih: " + zbrojParnih);
        System.out.println("Zbroj neparnih: " + zbrojNeparnih);
    }
}

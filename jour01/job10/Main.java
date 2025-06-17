package jour01.job10;

public class Main {
    public static void main(String[] args) {
        int somme = 1;
        for (int i = 8; i >= 1; i--) {
            somme *= i;
        }
        System.out.println("La factorielle de 8 est : " + somme);
    }
}

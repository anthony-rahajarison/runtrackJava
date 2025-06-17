package jour01.job07;

public class Main {
    public static void main(String[] args) {
        int somme = 0;
        for (int i = 1; i <= 100; i++) {
            somme += i;
        }
        System.out.println("La somme des nombres de 1 à 100 est : " + somme);
    }
}

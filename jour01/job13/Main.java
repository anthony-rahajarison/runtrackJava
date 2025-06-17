package jour01.job13;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrer un nombre n positif inférieur ou égal à 9 : ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0 || n > 9) {
            System.out.println("Erreur : le nombre doit être compris entre 0 et 9.");
            return;
        }

        System.out.println("La table de multiplication de " + n + " est :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

package jour01.job11;

public class Main {
    public static void main(String[] args) {
        double somme = 1;
        // On demande un nombre entier positif
        System.out.println("De quel nombre voulez-vous calculer la factorielle ?");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = n; i >= 1; i--) {
            somme *= i;
        }
        System.out.println("La factorielle de " + n + " est : " + somme);
    }
}
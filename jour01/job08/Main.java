package jour01.job08;

public class Main {
    public static void main(String[] args) {
        // On demande n à l'utilisateur
        System.out.println("Entrer un nombre n : ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int somme = 0;
        scanner.close();
        for (int i = 0; i < n; i++) {
            somme += n*n*n;
        }
        System.out.println("La somme des cubes de 1 à " + n + " est : " + somme);
    }
}

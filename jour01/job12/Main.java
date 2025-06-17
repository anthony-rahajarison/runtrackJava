package jour01.job12;

public class Main {
    public static void main(String[] args) {
        // On demande un nombre entier positif
        System.out.println("Entrer un nombre n positif : ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Les nombres pairs de 0 à " + n + " sont :");

        for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}

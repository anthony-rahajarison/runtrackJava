package jour01.job14;

public class Main {
    public static void main(String[] args) {
        // On demande un nombre entier positif
        System.out.println("Entrer un nombre n positif : ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        //On inverse le nombre n
        int inverse = 0;
        while (n != 0) {
            inverse = inverse * 10 + n % 10;
            n /= 10;
        }
        System.out.println("L'inverse est : " + inverse);
    }
}

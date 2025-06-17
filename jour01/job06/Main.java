package jour01.job06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somme = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Entrer un nombre : ");
            double nombre = scanner.nextDouble();
            somme += nombre;
        }
        scanner.close();

        // Calcul de la moyenne
        double moyenne = somme / 5.0;
        System.out.println("La moyenne est : " + moyenne);
    }
}

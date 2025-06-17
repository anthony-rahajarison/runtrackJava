package jour01.job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tab[] = new int[3];
        
        Scanner scanner = new Scanner(System.in); // Create scanner once
        for (int i = 0; i < 3; i++) {
            System.out.println("Entrer un nombre : ");
            int nombre = scanner.nextInt();
            tab[i] = nombre;
        }
        scanner.close();

        // Affichage du plus haut nombre
        int max = tab[0];
        for (int i = 1; i < 3; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        System.out.println("Le plus haut nombre est : " + max);
    }
}

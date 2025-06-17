package jour01.job04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrer un nombre :");
        try (Scanner scanner = new Scanner(System.in)) {
            int nombre = scanner.nextInt();
            System.out.println("Le carré de ce nombre est : " + nombre*nombre);
        }
    }
}

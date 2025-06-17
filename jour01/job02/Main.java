package jour01.job02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quel est votre nom ?");
        try (Scanner scanner = new Scanner(System.in)) {
            String nom = scanner.nextLine();
            System.out.println("bonjour " + nom);
        }
    }
}
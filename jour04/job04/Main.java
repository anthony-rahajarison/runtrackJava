package jour04.job04;

public class Main {
    public static void main(String[] args) {
        // On demande à l'utilisateur de saisir un nombre
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez un nombre pour le compteur : ");
        long count = scanner.nextLong();
        scanner.close();

        // Création du thread Compteur
        Compteur compteur = new Compteur(count);

        // Démarrage du thread
        compteur.start();

        // On commence à mesurer le temps
        long startTime = System.currentTimeMillis();
        System.out.println("On commence le comptage...");

        // On attend que le thread se termine
        try {
            compteur.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // On arrête la mesure du temps
        long endTime = System.currentTimeMillis();

        // Affichage du temps écoulé
        System.out.println("Temps écoulé : " + (endTime - startTime) + " ms");
    }
}

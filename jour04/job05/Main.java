package jour04.job05;

public class Main {
    public static void main(String[] args) {
        // On demande à l'utilisateur de saisir un nombre
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez un nombre pour le compteur : ");
        long count = scanner.nextLong();
        scanner.close();

        // Création des thread Compteur
        Compteur compteur = new Compteur(count, true);
        Compteur compteur2 = new Compteur(count, false);

        // Démarrage du thread
        compteur.start();
        compteur2.start();

        // On commence à mesurer le temps
        long startTime = System.currentTimeMillis();
        System.out.println("On commence le comptage...");

        // On attend que le thread se termine
        try {
            compteur.join();
            compteur2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // On arrête la mesure du temps
        long endTime = System.currentTimeMillis();

        // Affichage des résultats
        long result = compteur.getIncr() + (compteur2.getIncr() - compteur.getIncr());
        System.out.println("Résultat du comptage : " + result);

        // Affichage du temps écoulé
        System.out.println("Temps écoulé : " + (endTime - startTime) + " ms");
    }
}

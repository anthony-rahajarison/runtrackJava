package jour04.job03;

public class Main {
    public static void main(String[] args) {
        // On demande à l'utilisateur de saisir la longueur de la chaîne
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne aléatoire : ");
        long length = scanner.nextLong();
        scanner.close();

        // Création des threads : le premier n'append pas, le second append
        StringGenerator myThread = new StringGenerator(length, false); // première moitié, écrase le fichier
        StringGenerator myThread2 = new StringGenerator(length, true); // seconde moitié, ajoute à la suite
        
        // Démarrage des threads
        myThread.start();
        myThread2.start();

        // On commence à mesurer le temps
        long startTime = System.currentTimeMillis();
        
        // On attend que le thread se termine
        try {
            myThread.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // On arrête la mesure du temps
        long endTime = System.currentTimeMillis();

        // Affichage du temps écoulé
        System.out.println("Temps écoulé : " + (endTime - startTime) + " ms");
    }
}


// Pour les strings plus courts, le temps d'execution est légèrement plus rapide pour le thread qui n'append pas
// Pour les strings beaucoup plus longs, le temps d'execution est plus rapide pour les double threads qui appendent
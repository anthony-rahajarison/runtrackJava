package jour04.job02;

public class Main {
    public static void main(String[] args) {
        // On demandez à l'utilisateur de saisir la longueur de la chaîne
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne aléatoire : ");
        int length = scanner.nextInt();
        scanner.close();

        // Création d'un thread
        MyThread myThread = new MyThread(length);
        
        // Démarrage du thread
        myThread.start();

        // On commence à mesurer le temps
        long startTime = System.currentTimeMillis();

        while (myThread.isAlive()) {
            // Attendre que le thread se termine
            try {
                myThread.join(100); // Attendre 100 ms pour éviter de bloquer indéfiniment
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // On arrête la mesure du temps
        long endTime = System.currentTimeMillis();

        // Affichage du temps écoulé
        long elapsedTime = endTime - startTime;
        System.out.println("Le thread a mis " + elapsedTime + " millisecondes pour s'exécuter.");
    }
}

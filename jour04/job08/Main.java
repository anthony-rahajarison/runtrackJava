package jour04.job08;

public class Main {
    public static void main(String[] args) {
        // Création des threads pour la somme
        SommeMillions somme1 = new SommeMillions(1, 2000000);
        SommeMillions somme2 = new SommeMillions(2000001, 4000000);
        SommeMillions somme3 = new SommeMillions(4000001, 6000000);
        SommeMillions somme4 = new SommeMillions(6000001, 8000000);
        SommeMillions somme5 = new SommeMillions(8000001, 10000000);

        // On commence à mesurer le temps
        long startTime = System.currentTimeMillis();
        System.out.println("Calcul de la somme en cours...");
        
        // Démarrage des threads
        somme1.start();
        somme2.start();
        somme3.start();
        somme4.start();
        somme5.start();
        
        // On attend que les threads se terminent
        try {
            somme1.join();
            somme2.join();
            somme3.join();
            somme4.join();
            somme5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // On arrête la mesure du temps
        long endTime = System.currentTimeMillis();
        
        // Affichage du temps écoulé
        System.out.println("Temps écoulé pour le calcul de la somme : " + (endTime - startTime) + " ms");
        
        // Affichage du résultat
        long totalSomme = somme1.getSomme() + somme2.getSomme() + somme3.getSomme() + somme4.getSomme() + somme5.getSomme();
        System.out.println("La somme des nombres de 1 à 10000000 est : " + totalSomme);
    }
}

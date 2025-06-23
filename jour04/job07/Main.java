package jour04.job07;

public class Main {
    public static void main(String[] args) {
        // On demande à l'utilisateur de saisir un nombre
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez la longueur du tableau : ");
        int count = scanner.nextInt();
        

        // Création du tableau
        long[] tab = new long[count];

        // On demande à l'utilisateur de saisir les éléments du tableau
        for (int i = 0; i < count; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tab[i] = scanner.nextLong();
        }
        
        scanner.close();

        // Création de la somme
        Somme somme = new Somme(tab, true);
        Somme somme2 = new Somme(tab, false);
        somme.start();
        somme2.start();

        // On commence à mesurer le temps
        long startTime = System.currentTimeMillis();
        System.out.println("Calcul de la somme en cours...");

        // On attend que le thread se termine
        try {
            somme.join();
            somme2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // On arrête la mesure du temps
        long endTime = System.currentTimeMillis();

        // Affichage du temps écoulé
        System.out.println("Temps écoulé pour le calcul de la somme : " + (endTime - startTime) + " ms");

        // Affichage du résultat
        long totalSomme = somme.getSomme() + somme2.getSomme();
        System.out.println("La somme des éléments du tableau est : " + totalSomme);
    }
}

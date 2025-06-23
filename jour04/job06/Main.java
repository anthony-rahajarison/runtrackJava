package jour04.job06;

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
        Somme somme = new Somme(tab);
        somme.start();

        // On commence à mesurer le temps
        long startTime = System.currentTimeMillis();
        System.out.println("Calcul de la somme en cours...");

        // On attend que le thread se termine
        try {
            somme.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // On arrête la mesure du temps
        long endTime = System.currentTimeMillis();

        // Affichage du temps écoulé
        System.out.println("Temps écoulé pour le calcul de la somme : " + (endTime - startTime) + " ms");

        // Affichage du résultat
        System.out.println("La somme des éléments du tableau est : " + somme.getSomme());
    }
}

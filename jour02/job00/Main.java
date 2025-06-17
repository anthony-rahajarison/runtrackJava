package jour02.job00;

public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne("Dupont", "Jean", "11/05/2000", "Paris", "10 rue des fleurs", "0612345678");

        System.out.println("Nom: " + personne.nom);
        System.out.println("Prénom: " + personne.prenom);

        System.out.println("Date de naissance: " + personne.dateNaissance);
        System.out.println("Lieu de naissance: " + personne.lieuNaissance);

        System.out.println("Adresse: " + personne.getAdresse());
        System.out.println("Téléphone: " + personne.getTelephone());
    }
}
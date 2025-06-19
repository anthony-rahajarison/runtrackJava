package jour03.job04;

import java.util.Scanner;
import java.util.Vector;

abstract class Personne {
    protected int ident;
    protected String nomsocial;
    protected String adresse;

    protected Personne(int ident, String nomsocial, String adresse) {
        this.ident = ident;
        this.nomsocial = nomsocial;
        this.adresse = adresse;
    }

    // Getters
    protected int getIdent() {
        return ident;
    }

    protected String getNomsocial() {
        return nomsocial;
    }

    protected String getAdresse() {
        return adresse;
    }

    // Setters
    protected void setIdent(int ident) {
        this.ident = ident;
    }
    
    protected void setNomsocial(String nomsocial) {
        this.nomsocial = nomsocial;
    }

    protected void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Affichage
    public void affiche() {
        System.out.println("Ident: " + ident);
        System.out.println("Nom social: " + nomsocial);
        System.out.println("Adresse: " + adresse);
    }
}

class Client extends Personne {
    private double chiffreAffaire;

    public Client(int ident, String nomsocial, String adresse, double chiffreAffaire) {
        super(ident, nomsocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Chiffre d'affaire: " + chiffreAffaire);
    }

    @Override
    public String toString() {
        return "Client{" +
                "ident = " + ident +
                ", nomsocial = '" + nomsocial + '\'' +
                ", adresse = '" + adresse + '\'' +
                ", chiffreAffaire = " + chiffreAffaire +
                '}';
    }
}

class Article {
    private int reference;
    private String designation;
    private double prixUnitaire;
    private int quantiteStock;

    public Article(int reference, String designation, double prixUnitaire, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.quantiteStock = quantiteStock;
    }

    public Article(Article a) {
        this.reference = a.reference;
        this.designation = a.designation;
        this.prixUnitaire = a.prixUnitaire;
        this.quantiteStock = a.quantiteStock;
    }

    // Getters
    public int getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    void affiche() {
        System.out.println("Référence: " + reference);
        System.out.println("Désignation: " + designation);
        System.out.println("Prix unitaire: " + prixUnitaire);
        System.out.println("Quantité en stock: " + quantiteStock);
    }
}

class Commande {
    private int numeroCommand;
    private String dateCommande;
    private Client client;

    public Commande(int numeroCommand, String dateCommande, Client client) {
        this.numeroCommand = numeroCommand;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    // Getters
    public int getNumeroCommand() {
        return numeroCommand;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "numeroCommand = " + numeroCommand +
                ", dateCommande = '" + dateCommande + '\'' +
                ", client = " + client +
                '}';
    }
}

class Ligne {
    private Commande commande;
    private Article article;
    private int quantiteCommande;

    public Ligne(Commande commande, Article article, int quantiteCommande) {
        this.commande = commande;
        this.article = article;
        this.quantiteCommande = quantiteCommande;
    }

    // Getters
    public Commande getCommande() {
        return commande;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }
}

class Commerciale {
    Vector<Article> articles;
    Vector<Client> clients;
    Vector<Commande> commandes;
    Vector<Ligne> lignes;

    public Commerciale() {
        articles = new Vector<>();
        clients = new Vector<>();
        commandes = new Vector<>();
        lignes = new Vector<>();
    }

    void passerCommande(Commande c) {
        commandes.add(c);
    }

    void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    void ajouterArticle(Article a) {
        articles.add(a);
    }

    void supprimerArticle(Article a) {
        articles.remove(a);
    }

    void ajouterClient(Client c) {
        clients.add(c);
    }

    void supprimerClient(Client c) {
        clients.remove(c);
    }

    static void main(String[] args) {
        Commerciale gestionCommerciale = new Commerciale();

        System.out.println("------Gestion Commerciale------");
        System.out.println("1) Ajouter un article");
        System.out.println("2) Supprimer un article");
        System.out.println("3) Ajouter un client");
        System.out.println("4) Supprimer un client");
        System.out.println("5) Passer une commande");
        System.out.println("6) Annuler une commande");
        System.out.println("7) Afficher les commandes");
        System.out.println("0) Quitter");

        // Implémentation de la logique pour gérer les choix de l'utilisateur

        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.print("Entrez votre choix: ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choix) {
                case 1: // Ajouter un article
                    System.out.print("Entrez la référence de l'article: ");
                    int ref = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez la désignation de l'article: ");
                    String designation = scanner.nextLine();
                    System.out.print("Entrez le prix unitaire de l'article: ");
                    double prix = scanner.nextDouble();
                    System.out.print("Entrez la quantité en stock de l'article: ");
                    int quantite = scanner.nextInt();
                    gestionCommerciale.ajouterArticle(new Article(ref, designation, prix, quantite));
                    break;
                    
                case 2: // Supprimer un article
                    System.out.print("Entrez la référence de l'article à supprimer: ");
                    for (Article article : gestionCommerciale.articles) {
                        if (article.getReference() == scanner.nextInt()) {
                            gestionCommerciale.supprimerArticle(article);
                            System.out.println("Article supprimé.");
                            break;
                        }
                    }
                    break;

                case 3: // Ajouter un client
                    System.out.print("Entrez l'ID du client: ");
                    int idClient = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez le nom du client: ");
                    String nomClient = scanner.nextLine();
                    System.out.print("Entrez l'adresse du client: ");
                    String adresseClient = scanner.nextLine();
                    System.out.print("Entrez le chiffre d'affaires du client: ");
                    double chiffreAffaire = scanner.nextDouble();
                    gestionCommerciale.ajouterClient(new Client(idClient, nomClient, adresseClient, chiffreAffaire));
                    break;

                case 4: // Supprimer un client
                    System.out.println("Entrez l'ID du client à supprimer: ");
                    for (Client client : gestionCommerciale.clients) {
                        if (client.getIdent() == scanner.nextInt()) {
                            gestionCommerciale.supprimerClient(client);
                            System.out.println("Client supprimé.");
                            break;
                        }
                    }
                    break;

                case 5: // Passer une commande
                    System.out.print("Entrez le numéro de la commande: ");
                    int numeroCommande = scanner.nextInt();
                    scanner.nextLine(); // Consomme la nouvelle ligne
                    System.out.print("Entrez la date de la commande: ");
                    String dateCommande = scanner.nextLine();
                    System.out.print("Entrez l'ID du client pour la commande: ");
                    int idClientCommande = scanner.nextInt();
                    Client c = null;
                    for (Client client : gestionCommerciale.clients) {
                        if (client.getIdent() == idClientCommande) {
                            c = client;
                            break;
                        }
                    }
                    if (c != null) {
                        gestionCommerciale.passerCommande(new Commande(numeroCommande, dateCommande, c));
                    } else {
                        System.out.println("Client non trouvé.");
                    }
                    break;

                case 6:
                    System.out.print("Entrez le numéro de la commande à annuler: ");
                    int numeroAnnulation = scanner.nextInt();
                    for (Commande commande : gestionCommerciale.commandes) {
                        if (commande.getNumeroCommand() == numeroAnnulation) {
                            gestionCommerciale.annulerCommande(commande);
                            System.out.println("Commande annulée.");
                            break;
                        }
                    }
                    break;
                case 7: // Afficher les commandes
                    for (Commande commande : gestionCommerciale.commandes) {
                        System.out.println(commande);
                    }
                    break;
                case 0:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 0);
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Commerciale.main(args);
    }
}
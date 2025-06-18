package jour02.job04;

public class Vehicule {
    protected String marque;
    protected int anneeAchat;
    protected double prixAchat;
    protected double prixCourant;

    public Vehicule(String marque, int anneeAchat, double prixAchat) {
        this.marque = marque;
        this.anneeAchat = anneeAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat; // Initialisation du prix courant au prix d'achat
    }

    public void affiche() {
        System.out.println("Marque: " + marque);
        System.out.println("Année d'achat: " + anneeAchat);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix courant: " + prixCourant);
    }

    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - anneeAchat;
        for (int i = 0; i < age; i++) {
            prixCourant -= prixCourant * 0.01;
        }
    }
}

class Voiture extends Vehicule {
    private double cylindree;
    private int nbPortes;
    private double puissance;
    private double kilometrage;

    public Voiture(String marque, int anneeAchat, double prixAchat, int nbPortes, double cylindree, double puissance, double kilometrage) {
        super(marque, anneeAchat, prixAchat);
        this.nbPortes = nbPortes;
        this.cylindree = cylindree;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée: " + cylindree);
        System.out.println("Nombre de portes: " + nbPortes);
        System.out.println("Puissance: " + puissance);
        System.out.println("Kilométrage: " + kilometrage);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - anneeAchat;
        for (int i = 0; i < age; i++) {
            prixCourant -= prixCourant * 0.02;
        }

        // Dépréciation supplémentaire basée sur le kilométrage
        prixCourant -= prixAchat * (kilometrage / 10000) * 0.05;

        // Dépréciation supplémentaire basée sur la marque
        if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
            prixCourant -= prixAchat * 0.1; // 10% de dépréciation pour les marques Renault et Fiat
        } else if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
            prixCourant -= prixAchat * 0.2; // 20% de dépréciation pour les marques Ferrari et Porsche
        }

        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }
}

class Avion extends Vehicule {
    private String moteur;
    private double nbHeuresVol;

    public Avion(String marque, int anneeAchat, double prixAchat, String moteur, double nbHeuresVol) {
        super(marque, anneeAchat, prixAchat);
        this.moteur = moteur;
        this.nbHeuresVol = nbHeuresVol;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Moteur: " + moteur);
        System.out.println("Nombre d'heures de vol: " + nbHeuresVol);
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        if (this.moteur == "HELICES") {
            // 10% de dépréciation par tranche de 100 heures de vol
            prixCourant = prixAchat - (prixAchat * 10 / 100) * (nbHeuresVol / 100);
        } else if (this.moteur == "REACTION") {
            // 10% de dépréciation par tranche de 1000 heures de vol
            prixCourant = prixAchat - (prixAchat * 10 / 100) * (nbHeuresVol / 1000);
        }

        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }
}
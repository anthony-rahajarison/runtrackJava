package jour02.job00;

public class Personne {
    // Attributs publics
    public String nom;
    public String prenom;

    // Attributs protégés
    protected String dateNaissance;
    protected String lieuNaissance;

    // Attributs privés
    private String adresse;
    private String telephone;

    // Constructeur
    public Personne(String nom, String prenom, String dateNaissance, String lieuNaissance, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // Getters et setters pour les attributs privés
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
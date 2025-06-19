package jour03.job02;

class Main {
    public static void main(String[] args) {
        Carte[] cartes = {
            new Terrain("Plaines", 'v'),
            new Creature("Elfe", 2, 3, 2),
            new Sortilege("Choc", 1, "Inflige 2 points de dégâts à une créature ou un joueur"),
            new Creature("Golem", 4, 5, 6),
            new Terrain("Montagne", 'r'),
            new Sortilege("Soin", 2, "Restaure 3 points de vie à une créature ou un joueur"),
            new Creature("Vampire", 3, 4, 4),
            new Terrain("Île", 'b'),
            new Sortilege("Tempête", 5, "Inflige 6 points de dégâts à toutes les créatures"),
            new Creature("Géant", 6, 8, 7)
        };
        Jeu jeu = new Jeu(cartes);
        jeu.afficherCartes();

        jeu.jouerCarte(0);

        jeu.afficherCartes();
    }
}

class Carte {
    String nom;
    int cout;
    String typeCarte;

    Carte(String nom, int cout, String typeCarte) {
        this.nom = nom;
        this.cout = cout;
        this.typeCarte = typeCarte;
    }

    void afficher() {
        System.out.println("Carte : " + nom + "\n Type : " + typeCarte + "\n Coût : " + cout);
    }
}

class Terrain extends Carte {
    char couleur;

    Terrain(String nom, char couleur) {
        super(nom, 0, "Terrain");
        this.couleur = couleur;
    }

    @Override
    void afficher() {
        super.afficher();
        System.out.println(" Couleur : " + couleur);
    }
}

class Creature extends Carte {
    int degats;
    int pv;

    Creature(String nom, int cout, int degats, int pv) {
        super(nom, cout, "Créature");
        this.degats = degats;
        this.pv = pv;
    }

    @Override
    void afficher() {
        super.afficher();
        System.out.println(" Dégâts : " + degats);
        System.out.println(" Points de vie : " + pv);
    }
}

class Sortilege extends Carte {
    String description;

    Sortilege(String nom, int cout, String description) {
        super(nom, cout, "Sortilège");
        this.description = description;
    }

    @Override
    void afficher() {
        super.afficher();
        System.out.println(" Description : " + description);
    }
}

class Jeu {
    Carte[] cartes;

    Jeu(Carte[] cartes) {
        this.cartes = cartes;
    }

    void afficherCartes() {
        System.out.println("Cartes disponibles :");
        for (Carte carte : cartes) {
            if (carte == null) continue; // Ignore les cartes jouées
            carte.afficher();
            System.out.println();
        }
    }

    void piocheCarte() {
        if (cartes.length > 0) {
            Carte cartePiochee = cartes[0];
            System.out.println("Vous avez pioché :");
            cartePiochee.afficher();
            System.out.println();
        } else {
            System.out.println("Aucune carte à piocher.");
        }
    }

    void jouerCarte(int index) {
        if (index >= 0 && index < cartes.length) {
            System.out.println("Vous avez joué :");
            cartes[index].afficher();
            cartes[index] = null;
            System.out.println();
        } else {
            System.out.println("Index de carte invalide.");
        }
    }
}
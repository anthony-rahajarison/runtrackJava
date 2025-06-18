package jour02.job03;

class Figure {
    protected double x;
    protected double y;

    public void affiche() {
        System.out.println("Centre de la figure (" + x + ", " + y + ")");
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Figure {
    protected double largeur;
    protected double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}

class Cercle extends Figure {
    protected double rayon;

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche () {
        System.out.println("Cercle de centre (" + x + ", " + y + ") et de rayon " + rayon);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public boolean estInterieur(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance <= rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}

class RectangleColore extends Rectangle {
    protected int couleur;

    public RectangleColore(double largeur, double longueur, int couleur) {
        super(largeur, longueur);
        this.couleur = couleur;
    }
}
package jour03.job01;

class ToStringEq
{
    public static void main(String[] args)
    {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2 :");
        // le type de rect1 est RectangleColore
        // l'objet contenu dans rect1 est de type RectangleColore
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect1);
        System.out.println();


        System.out.println("Test 3 :");


        // le type de rect2 est Rectangle
        // l'objet contenu dans rect2 est de type RectangleColore
        Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2, new String("rouge"));
        System.out.println(rect2);


        System.out.println(rect1.equals(rect2));   // 1.
        System.out.println(rect2.equals(rect1));   // 2.
        System.out.println(rect1.equals(null));    // 3.
        System.out.println(rect.equals(rect1));   // 4.
        System.out.println(rect1.equals(rect));    // 5.
    }
}

class Rectangle {
    double largeur;
    double hauteur;

    Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle :\n largeur = " + largeur + "\n hauteur = " + hauteur + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Vérifie si les deux références pointent vers le même objet
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // Vérifie si l'objet est null ou de classe différente
        }


        Rectangle objRectangle = (Rectangle) obj; // On sait que l'objet est de type Rectangle

        if (this.largeur != objRectangle.largeur || this.hauteur != objRectangle.hauteur) {
            return false; // Compare les attributs largeur et hauteur
        }
        return true;
    }
}

class RectangleColore extends Rectangle {
    String couleur;

    RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "RectangleColore :\n largeur = " + largeur + "\n hauteur = " + hauteur + "\n couleur = " + couleur + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false; // Vérifie d'abord l'égalité avec la classe Rectangle
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // Vérifie si l'objet est null ou de classe différente
        }

        RectangleColore objRectangleColore = (RectangleColore) obj; // On sait que l'objet est de type RectangleColore

        if (!this.couleur.equals(objRectangleColore.couleur)) {
            return false; // Compare l'attribut couleur
        }
        return true;
    }
}


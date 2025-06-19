package jour02.job04;

public class Main {
    public static void main(String[] args) {
        Vehicule v = new Vehicule("Toyota", 2015, 20000);
        v.calculePrix(2025);
        v.affiche();

        System.out.println();

        Voiture voiture = new Voiture("Honda", 2018, 25000, 4, 2.0, 150, 30000);
        voiture.calculePrix(2025);
        voiture.affiche();
    }
}
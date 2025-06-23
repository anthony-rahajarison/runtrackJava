package jour04.job04;

public class Compteur extends Thread {
    private long count;
    private long incr;

    public Compteur(long count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (incr < count) {
            incr++;
        }

        System.out.println("Compteur terminé. Valeur finale : " + incr);
    }
}

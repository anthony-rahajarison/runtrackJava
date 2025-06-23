package jour04.job05;

public class Compteur extends Thread {
    private long count;
    private long incr = 0;
    private boolean firstHalf;

    public Compteur(long count, boolean firstHalf) {
        this.count = count;
        this.firstHalf = firstHalf;

        if (firstHalf) {
            this.incr = 0;
        } else {
            this.incr = count / 2;
        }
    }

    @Override
    public void run() {
        if (firstHalf) {
            System.out.println("Compteur 1 démarré. Valeur initiale : " + incr);
            for (long i = 0; i < count / 2; i++) {
                incr++;
            }
        } else {
            System.out.println("Compteur 2 démarré. Valeur initiale : " + incr);
            for (long i = 0; i < count / 2; i++) {
                incr++;
            }
        }
        System.out.println();
    }

    public long getIncr() {
        return incr;
    }
}

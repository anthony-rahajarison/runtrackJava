package jour04.job06;

public class Somme extends Thread {
    private long somme = 0;
    private long[] tab;

    Somme(long[] tab) {
        this.tab = tab;
    }

    public long getSomme() {
        return somme;
    }

    @Override
    public void run() {
        for (long value : tab) {
            this.somme += value;
        }
    }
}

package jour04.job07;

public class Somme extends Thread {
    private long somme = 0;
    private long[] tab;

    Somme(long[] tab, boolean firstHalf) {
        if (firstHalf) {
            this.tab = new long[tab.length / 2];
            System.arraycopy(tab, 0, this.tab, 0, tab.length / 2);
        } else {
            this.tab = new long[tab.length - tab.length / 2];
            System.arraycopy(tab, tab.length / 2, this.tab, 0, tab.length - tab.length / 2);
        }
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

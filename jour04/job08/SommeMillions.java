package jour04.job08;

public class SommeMillions extends Thread {
    private long somme = 0;
    private long start;
    private long end;

    SommeMillions(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public long getSomme() {
        return somme;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            somme += i;
        }
    }
}

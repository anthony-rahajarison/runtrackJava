package jour01.job03;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        System.out.println("T[0] = " + tab[0]);
        System.out.println("T[1] = " + tab[1]);
        System.out.println("T[5] = " + tab[5]);
        System.out.println("T[9] = " + tab[9]);
        try {
            System.out.println("T[10] = " + tab[10]); // Il s'agit d'une erreur, car l'index 10 est hors limites
        } finally {}
    }
}
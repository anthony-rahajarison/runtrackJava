package jour02.job01;

class Toto {
    int toto = 0;
    Toto() {
        toto = toto + 1;
    }
    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto : " + toto); // Cette ligne va causer une erreur de compilation car toto est une variable non statique (attribut d'instance)
    }
}
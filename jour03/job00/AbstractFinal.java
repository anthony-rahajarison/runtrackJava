package jour03.job00;

public class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        tab[0] = new A(); // A est une classe abstraite, donc on ne peut pas instancier A directement
        tab[1] = new B();
        tab[2] = new C();
        tab[1].b = 2; // On ne peut pas accéder à 'b' car 'B' n'est pas final
        ((C)tab[2]).c = 3;
    }
}

abstract class A {
    int a;
}

class B extends A {
    int b;
}

class C extends B {
    final double c = 1;
}

abstract class D extends A {
    double d;
    int operation(int a) {
        return (a * 2);
    }
    abstract int calcul(int b) { // C'est une méthode abstraite d'une classe abstraite, elle ne peut pas avoir de corps
    };
}
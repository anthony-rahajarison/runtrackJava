package jour02.job05;

class A {
    public A() { }
}

class B extends A {
    public B() {
        super();
    }
}

class C extends B {
    public C() {
        super();
    }
}

class D extends A {
    protected int d = 1;

    public D(int x) {
        super();
        d = x;
    }

    public D() {
    }
}

class E extends D {
    public E() {
        super();
    }
}

class F extends D {
    public F() {
        super();
    }
}

class ABCDEF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b;
        // b = a; // A n'est pas une sous-classe de B, donc il y a une erreur
        a = (A) b;
        a = null;
        // null = a; Erreur, on ne peut pas assigner à null
        a = d;
        // b = d; // Erreur, D n'est pas une sous-classe de B
        a = e;
        d = e;

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D();
        as[6] = new B();

        rechercher(as);
        additionner(as);
    }

    private static void rechercher(A[] as) {
        int n = 0;
        for (A obj : as) {
            if (obj instanceof B) {
                n++;
            }
        }
        System.out.println("Il y a " + n + " instances de la classe B");
    }

    private static void additionner(A[] as) {
        int somme = 0;
        for (A obj : as) {
            if (obj instanceof D) {
                D objD = (D) obj;
                somme += objD.d;
            }
        }
        System.out.println("Somme des variables d : " + somme);
    }
}
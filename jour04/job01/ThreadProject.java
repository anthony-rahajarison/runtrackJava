package jour04.job01;

public class ThreadProject {
    public static void main(String[] args) {
        // Création d'un thread
        Thread myThread = new Thread(new MyThread());
        
        // Démarrage du thread
        myThread.start();
    }
}
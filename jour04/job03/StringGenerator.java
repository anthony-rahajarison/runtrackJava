package jour04.job03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class StringGenerator extends Thread {
    private long length;
    private String randomString;
    private boolean append;

    public StringGenerator(long length, boolean append) {
        this.length = length;
        this.append = append;
    }

    @Override
    public void run() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length / 2; i++) {
            int index = ThreadLocalRandom.current().nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        randomString = sb.toString();

        // Synchronisation sur la classe pour éviter les conflits d'accès au fichier
        synchronized (StringGenerator.class) {
            try (FileWriter writer = new FileWriter("jour04/job03/output.txt", append)) {
                writer.write(randomString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
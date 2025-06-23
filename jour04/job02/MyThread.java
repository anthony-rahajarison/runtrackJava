package jour04.job02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class MyThread extends Thread {
    String randomString;
    int length;
    public MyThread(int length) {
        this.length = length;
    }

    public void run() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int idx = ThreadLocalRandom.current().nextInt(chars.length());
            sb.append(chars.charAt(idx));
        }
        randomString = sb.toString();

        try (FileWriter writer = new FileWriter("jour04/job02/output.txt")) {
            writer.write(randomString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

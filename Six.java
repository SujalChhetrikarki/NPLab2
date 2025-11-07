import java.io.*;
import java.net.*;

public class Six {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com/image.png");
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        FileOutputStream out = new FileOutputStream("downloaded_image.png");

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }

        in.close();
        out.close();
        System.out.println("File downloaded successfully!");
    }
}

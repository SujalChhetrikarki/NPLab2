import java.net.*;

public class Two {
    public static void main(String[] args) {
        String[] protocols = {"http", "https", "ftp", "file", "jar", "mailto", "telnet"};

        for (String protocol : protocols) {
            try {
                URL url = new URL(protocol + "://example.com");
                url.openConnection();
                System.out.println(protocol + " is supported.");
            } catch (Exception e) {
                System.out.println(protocol + " is NOT supported.");
            }
        }
    }
}

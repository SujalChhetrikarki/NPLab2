import java.net.*;

public class one {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.Facebook.com:8080/folder/page.html?name=Sujal#section1");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("File: " + url.getFile());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref (Anchor): " + url.getRef());
    }
}

import java.net.*;

public class Five {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("https://user:password@www.example.com:8080/folder/page.html?name=John#top");

        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("User Info: " + uri.getUserInfo());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Port: " + uri.getPort());
        System.out.println("Path: " + uri.getPath());
        System.out.println("Query: " + uri.getQuery());
        System.out.println("Fragment: " + uri.getFragment());
    }
}

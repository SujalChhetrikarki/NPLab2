import java.net.*;

public class Four {
    public static void main(String[] args) throws Exception {
        URI base = new URI("https://www.example.com/folder/");
        URI relative = new URI("page.html");
        URI resolved = base.resolve(relative);

        System.out.println("Base URI: " + base);
        System.out.println("Relative URI: " + relative);
        System.out.println("Resolved URI: " + resolved);
    }
}

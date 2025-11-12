import java.io.UnsupportedEncodingException;
import java.net.*;

public class Seven {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String query = "name=Sujal Doe&city=Kathmandu";
        String encoded = URLEncoder.encode(query, "UTF-8");
        String decoded = URLDecoder.decode(encoded, "UTF-8");

        System.out.println("Original: " + query);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}

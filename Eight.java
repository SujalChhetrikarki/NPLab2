import java.io.*;
import java.net.*;

public class Eight {
    public static void main(String[] args) throws Exception {
        String baseURL = "https://www.example.com/search";
        String query = "q=java+programming";
        URL url = new URL(baseURL + "?" + query);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        connection.disconnect();
    }
}

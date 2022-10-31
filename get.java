import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;


class get {
    public static void main(String[] args)throws IOException, InterruptedException{
        
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://stock-and-options-trading-data-provider.p.rapidapi.com/options/aapl"))
            .header("X-RapidAPI-Proxy-Secret", "a755b180-f5a9-11e9-9f69-7bf51e845926")
            .header("X-RapidAPI-Key", "3ea29cdb0dmsheb3c3e5bb38b7acp1523f0jsn8ce44ede4069")
            .header("X-RapidAPI-Host", "stock-and-options-trading-data-provider.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    }
}
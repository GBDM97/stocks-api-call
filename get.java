import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;


class get {
    public static void main(String[] args)throws IOException, InterruptedException{
        
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&apikey=A8S6DY62W9QUB7TW"))
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    }
}
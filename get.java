import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.util.Scanner;


class get {
    public static void main(String[] args)throws IOException, InterruptedException{
        System.out.println("Enter Stock Ticker:");
        Scanner ticker = new Scanner(System.in);
        String u1 = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=";
        String u2 = ticker.next();
        String u3 = "&interval=5min&apikey=A8S6DY62W9QUB7TW";
        String u = u1+u2+u3;
        ticker.close();

            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(u))
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    }
}
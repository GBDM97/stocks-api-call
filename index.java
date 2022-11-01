import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.*;



public class index {
    public static void main(String[] args)throws IOException, InterruptedException {
        Gson gson = new Gson();
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
    String respons = response.body().toString();
    System.out.println(respons.getClass());
    StockInfo respon = gson.fromJson(respons, StockInfo.class);
    StockInfo resp = respon.getM();
    String res = resp.getL();
    System.out.println(res.toString());
    }
}
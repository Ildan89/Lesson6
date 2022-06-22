
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://community-open-weather-map.p.rapidapi.com/forecast/daily?q=St. Petersburg,ru&units=metric")
                .get()
                .addHeader("X-RapidAPI-Key", "40b8389352mshe64494e01b1d37ap1608e3jsn4fed997f5e67")
                .addHeader("X-RapidAPI-Host", "community-open-weather-map.p.rapidapi.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        }
        catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }

}

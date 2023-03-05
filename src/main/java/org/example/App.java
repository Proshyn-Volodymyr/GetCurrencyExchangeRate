package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    private static final String API_URL = "https://api.monobank.ua/bank/currency";

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(API_URL))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String jsonResponse = response.body();
        Gson gson = new GsonBuilder().create();
        CurrencyRate[] currencyRates = gson.fromJson(jsonResponse, CurrencyRate[].class);
        for (CurrencyRate currencyRate : currencyRates
        ) {
            System.out.println(currencyRate);
        }

    }
}

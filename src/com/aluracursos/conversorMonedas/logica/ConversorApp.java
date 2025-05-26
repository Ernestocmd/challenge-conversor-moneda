package com.aluracursos.conversorMonedas.logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.aluracursos.conversorMonedas.models.ExchangeApiResponse;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConversorApp {
    private static final Logger LOGGER = Logger.getLogger(ConversorApp.class.getName());
    public void iniciar()
    {
        try {
            String url = "https://v6.exchangerate-api.com/v6/d29a04dbe7b2bf11c76ce19d/latest/USD";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            ExchangeApiResponse exchangeData = gson.fromJson(response.body(), ExchangeApiResponse.class);

            Map<String, Double> tasas = exchangeData.getConversion_rates();
            ConversorMoneda conversor = new ConversorMoneda(tasas);
            conversor.iniciar();

        } catch (Exception e){
            System.out.println("Error al consultar a la API");
            LOGGER.log(Level.SEVERE, "Error al consumir la API", e);
        }
    }
}



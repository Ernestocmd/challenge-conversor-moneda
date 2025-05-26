package com.aluracursos.conversorMonedas.models;

import java.util.Map;

public class ExchangeApiResponse {
    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversion_rates(){
        return conversion_rates;
    }
}

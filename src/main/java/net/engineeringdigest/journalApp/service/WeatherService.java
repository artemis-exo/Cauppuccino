package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static  final String apikey="4d8156f40d99c31f2a2109a5d71cf65d";

    private static final String API="http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(String city){

    String finalAPI=API.replace("CITY",city).replace("API_KEY",apikey);

    ResponseEntity<WeatherResponse>response=restTemplate.exchange(finalAPI, HttpMethod.POST,null, WeatherResponse.class);
    WeatherResponse body=response.getBody();
    return body;
    }
}



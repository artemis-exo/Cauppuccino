package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

// The only public class in the file, matching the filename.
// I moved the fields from "Root" into here.
@Getter
@Setter
public class WeatherResponse {
    public Current current;

    @Getter
    @Setter
    public class Current {
       @JsonProperty("observation_time")
        public String observationtTime;
        public int temperature;

       @JsonProperty("weather_descriptions")
        public ArrayList<String> weatherDescriptions;
       
        @JsonProperty("wind_speed")
        public int windSpeed;
        @JsonProperty("wind_degree")
        public int windDegree;
        public int pressure;
        public int precip;
        public int humidity;

        public int feelslike;

    }

}
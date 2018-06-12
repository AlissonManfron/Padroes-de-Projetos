package weather.com.br.test;

import weather.com.br.domain.CurrentConditionsDisplay;
import weather.com.br.domain.HeatIndexDiplay;
import weather.com.br.domain.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80f, 62f, 28.4f);
        weatherData.setMeasurements(83f, 54f, 34.4f);
        weatherData.setMeasurements(85f, 49f, 37.4f);

    }
}

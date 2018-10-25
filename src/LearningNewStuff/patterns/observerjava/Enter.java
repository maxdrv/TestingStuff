package LearningNewStuff.patterns.observerjava;



public class Enter {
    public static void main(String[] args) {

        //WeatherDate weatherDate = new WeatherDate();
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDate);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherDate);

        weatherData.setMeasurements(80,65,30.3f);
        weatherData.setMeasurements(10,35,32.3f);
        weatherData.setMeasurements(20,36,36.3f);
    }
}

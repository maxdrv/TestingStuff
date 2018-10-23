package LearningNewStuff.patterns.observer;

public class Enter {
    public static void main(String[] args) {

        WeatherDate weatherDate = new WeatherDate();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDate);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDate);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDate);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherDate);

        weatherDate.setMeasurements(80,65,30.3f);
        weatherDate.setMeasurements(10,35,32.3f);
        weatherDate.setMeasurements(20,36,36.3f);
    }
}

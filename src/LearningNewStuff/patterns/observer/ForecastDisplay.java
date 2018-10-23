package LearningNewStuff.patterns.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    @Override
    public void display() {

    }

    @Override
    public void update(float temperature, float humidity, float presure) {

    }

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

}

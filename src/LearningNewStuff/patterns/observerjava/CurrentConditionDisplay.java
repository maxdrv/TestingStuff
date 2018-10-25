package LearningNewStuff.patterns.observerjava;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {  // реализуем интерфейс observer из пакета java.utils
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {                 // объект элемента текущего состояния добавяется в качестве наблюдателя
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.format("Current conditions temperature: %.2f F degrees and humidity: %.2f humidity\n", temperature, humidity);
    }

    @Override
    public void update(Observable o, Object arg) {              // обновленный update() получает Observable и arg необязательны данные
        if (o instanceof WeatherData) {                         // проверяем что субъект является WeatherData
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();    // затем импользуем его get методы для получения его влажности и температуры
            this.humidity = weatherData.getHumidity();
            display();                                          // выводим на экран
        }
    }
}

package LearningNewStuff.patterns.observerjava;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {       // делаем наш класс наследником Observable
    private float humidity;                         // Супреркласс берет на себя все управление наблюдателями, поэтому удаляем код регистрации, добавления и оповещения
    private float temperature;
    private float pressure;

    public WeatherData() { }                        // Структура для хранения наблюдателей теперь не нужна

    public void measurementsChanged() {
        setChanged();                               // вызов setChanged() перед оповещением наблюдателей
        notifyObservers();                          // в notifyObservers теперь не передается объект, теперь используется МОДЕЛЬ ЗАПРОСА ДАННЫХ
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // гетеры будут использоваться наблюдателями что бы получить состояние объекта WeatherData
    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}

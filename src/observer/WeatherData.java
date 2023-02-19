package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    // registerObserver(), removeObserver(), notifyObservers()는 주제마다 중복이라 Subject로 올려도 될 듯
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(); // 인자를 넣으면 Push 방식, 안 넣으면 Pull 방식
        }
    }

    void measurementsChanged() {
        notifyObservers();
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // Pull 방식
    float getTemperature() {
        return this.temperature;
    }

    float getHumidity() {
        return this.humidity;
    }

    float getPressure() {
        return this.pressure;
    }

}

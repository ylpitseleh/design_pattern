package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
//         Push 방식
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();

//         Pull 방식
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

}

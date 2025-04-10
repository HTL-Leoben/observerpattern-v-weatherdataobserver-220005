import javafx.scene.Parent;

public interface WeatherDataObserver {

    void updateWeatherVisualization(WeatherData weatherData);

    Parent getRoot(); // get root Methode implementiert
}

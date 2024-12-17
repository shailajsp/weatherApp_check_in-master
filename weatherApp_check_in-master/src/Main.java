import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, WeatherFileNotFoundException {
        WeatherReader reader = new WeatherReader();
        reader.processWeatherFile("C:\\Users\\eddie\\IdeaProjects\\WeatherAppLab\\weather.txt");

    }
}
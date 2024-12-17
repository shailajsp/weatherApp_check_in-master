import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WeatherReader {

    public void checkFileExists(File file) throws WeatherFileNotFoundException {
            String location = "C:\\Users\\eddie\\IdeaProjects\\WeatherAppLab\\weather.txt";
            File files = new File(location);

            if(files.exists()) {
                System.out.println("File exists");


            }else{
                throw new WeatherFileNotFoundException("File is missing");
            }
    }


    public void readFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        String data = "";
        while(input.hasNextLine()){
            data = input.nextLine();
            System.out.println(data);

        }

    }
    public void processWeatherFile(String filePath) throws WeatherFileNotFoundException, FileNotFoundException {
        File file = new File(filePath);
        checkFileExists(file);
        readFile(file);
    }


}

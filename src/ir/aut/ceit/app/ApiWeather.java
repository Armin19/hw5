package ir.aut.ceit.app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApiWeather {

    private static String Url_OpenWeatherMap_Weather_London_UK = "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=67d374f0e8bf3ad5bedfec723cea34cb";

    StringBuilder stringBuilder = new StringBuilder("http://samples.openweathermap.org/data/2.5/weather?q=cityName,country&appid=67d374f0e8bf3ad5bedfec723cea34cb");

    /**
     * The method sets the string that gets as input to stringBuilder.
     *
     * @param input
     */
    public void setStringBuilder(String input) {
        this.stringBuilder = stringBuilder;
    }

    public static void main(String[] args) {
        String result = "";
        try {
            URL urlWeather = new URL(URL_OpenWeatherMap_London_UK);
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlWeather.openConnection();
            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 8192);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                String WeatherResult = ParseResult(result);
                System.out.println(WeatherResult);
            } else {
                System.out.println("Error in httpURLConnection.getResponseCode()");
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Java_OpenWeathermap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Java_OpenWeathermap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(Java_OpenWeathermap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

}


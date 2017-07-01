package ir.aut.ceit.app;

import ir.aut.ceit.app.java.net.JSONArray;
import ir.aut.ceit.app.java.net.JSONObject;
import netscape.javascript.JSException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    String myKey = "67d374f0e8bf3ad5bedfec723cea34cb\n";
    private static final String URL_OpenWeatherMap_London_UK = "http://api.openweathermap.org/data/2.5/weather?q=London,uk";

    public static void main(String[] args) throws IOException {
        ApiWeather apiWeather = new ApiWeather();
        JSONObject jsonObject = new JSONObject();
        apiWeather.setStringBuilder(URL_OpenWeatherMap_London_UK);


        Scanner scanner = new Scanner(System.in);
        String city = scanner.next();
        String id = scanner.next();
    }

}


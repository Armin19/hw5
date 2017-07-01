package ir.aut.ceit.app.java.net;


public class JSONObject {

    public static void main(String[] args) {
        /**The method sets the results that gets from the website openweathermap.
         *
         */
        private static String ParseResult (String json) throws JSONException {
            String ParsedResult = "";
            JSONObject jsonObject = new JSONObject(json);
            ParsedResult += "Number of object =" + jsonObject.length() + "\n\n";
            //"coord"
            JSONObject JSONObjectCoord = jsonObject.getJSONObject("coord");
            Double resultLon = JSONObjectCoord.getDouble("lon");
            Double resultLat = JSONObjectCoord.getDouble("lat");

            //"sys"
            JSONObject JSONObjectSys = jsonObject.getJSONObject("sys");
            String resultCountry = JSONObjectSys.getString("country");
            int resultSunrise = JSONObjectSys.getInt("sunrise");
            int resultSunset = JSONObjectSys.getInt("sunset");

            //"weather"
            String resultWeather;
            JSONArray JSONArrayWeather = jsonObject.getJSONArray("weather");
            if (JSONArrayWeather.length() > 0) {
                JSONObject JSONObjectWeather = JSONArrayWeather.getJSONObject(0);
                int resultId = JSONObjectWeather.getInt("id");
                String resultMain = JSONObjectWeather.getString("main");
                String resultIcon = JSONObjectWeather.getString("icon");
                String resultDescription = JSONObjectWeather.getString("description");
                resultWeather = "weather\tid: " + resultId + "\tmain: " + resultMain + "\tdescription: " + resultDescription + "\ticon: " + resultIcon;

            } else {
                resultWeather = "weather empty";

            }//"base"
            String resultBase = jsonObject.getString("base");

            //"main"
            JSONObject JSONObjectMain = jsonObject.getJSONObject("main");
            Double resultTemp = JSONObjectMain.getDouble("temp");
            Double resultPressure = JSONObjectMain.getDouble("pressure");
            Double resultHumidity = JSONObjectMain.getDouble("humidity");
            Double resultTempMin = JSONObjectMain.getDouble("tempMin");
            Double resultTempMax = JSONObjectMain.getDouble("tempMax");

            //"wind"
            JSONObject JSONObjectWind = jsonObject.getJSONObject("wind");
            Double resultSpeed = JSONObjectWind.getDouble("speed");
            Double resultDeg = JSONObjectWind.getDouble("deg");
            String resultWind = "wind\tspeed: " + resultSpeed + "\tdeg : " + resultDeg;

            //"clouds"
            JSONObject JSONObjectClouds = jsonObject.getJSONObject("clouds");
            int resultAll = JSONObjectClouds.getInt("all");

            //"dt"
            int resultDt = jsonObject.getInt("dt");

            //"id"
            int resultId = jsonObject.getInt("id");

            //"name"
            String resultName = jsonObject.getString("name");

            //"cod"
            int resultCod = jsonObject.getInt("cod");
            return
                    "coord\tlon: " + resultLon + "\tlat: " + resultLat + "\n" + "sys\tcountry: " + resultCountry + "\tsunrise: " + resultSunrise + "\tsunset: " + resultSunset + "\n" + resultWeather + "\n" +
                            "base: " + resultBase + "\n" + "main\ttemp: " + resultTemp + "\thumidity: " + resultHumidity + "\tpressure: " + resultPressure + "\ttemp_min: " + resultTempMin +
                            "\ttemp_max: " + resultTempMax + "\n" + resultWind + "\n" + "clouds\tall: " + resultAll + "\n" + "dt: " + resultDt + "\n" + "id: " + resultId + "\n" + "name: " + resultName + "\n" + "cod: " + resultCod + "\n" + "\n";

        }
    }
}
}

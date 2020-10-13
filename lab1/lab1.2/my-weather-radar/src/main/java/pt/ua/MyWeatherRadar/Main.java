package pt.ua.MyWeatherRadar;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import pt.ua.MyWeatherRadar.IpmaCityForecast;
import pt.ua.MyWeatherRadar.IpmaService;

import java.util.logging.Logger;

public class Main {

    private static final int CITY_ID_AVEIRO = 1010500;

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                logger.info("max temp for today: " + forecast.getData().listIterator().next().getTMax());
            } else logger.info("No results!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

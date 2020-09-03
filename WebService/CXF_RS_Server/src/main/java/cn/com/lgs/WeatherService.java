package cn.com.lgs;

import javax.jws.WebService;

@WebService
public interface WeatherService {
    public String queryWeather(String cityName);
}

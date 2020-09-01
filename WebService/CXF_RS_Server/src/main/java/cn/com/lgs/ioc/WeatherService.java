package cn.com.lgs.ioc;

import javax.jws.WebService;

@WebService
public interface WeatherService {
    public String queryWeather(String cityName);
}

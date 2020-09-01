package cn.com.lgs.ioc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public class WeatherServiceImpl implements WeatherService {

    @Override
    /**/
    @GET
    /*用在方法上 代表当前服务方法的访问路径*/
    @Path("/queryWeather/{aa}/")
    public String queryWeather(@PathParam(value = "aa") String cityName) {
        return cityName+"是晴天";
    }
}

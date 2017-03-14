package com.ssdj.retrofit2.api;

import com.ssdj.retrofit2.bean.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/21 15:12
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */

public interface WeatherApi
{
    /**
     * 请求地址：http://v.juhe.cn/weather/index
     * 请求参数：cityname=%E6%B7%B1%E5%9C%B3&dtype=json&format=1&key=f58cdfa2ac0c748e96f5610ae8937da4
     * 请求方式：GET
     */
    @GET("weather/index")
    Call<Weather> getWeather(@Query("cityname") String cityname, @Query("dtype") String dtype, @Query("format") int format, @Query("key") String key);
}

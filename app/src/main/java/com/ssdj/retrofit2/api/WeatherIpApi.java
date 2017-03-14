package com.ssdj.retrofit2.api;

import com.ssdj.retrofit2.bean.Weather;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/21 16:24
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */

public interface WeatherIpApi
{
    /***
     * 请求地址：http://v.juhe.cn/weather/ip
     * 请求参数：ip=58.215.185.154&dtype=json&format=1&key=f58cdfa2ac0c748e96f5610ae8937da4
     * 请求方式：POST
     */
    //以表单的形式提交
    @FormUrlEncoded
    @POST("weather/ip")
    Call<Weather> getWeatherForIp(@Field("ip") String ip,
                                  @Field("dtype") String dtype,
                                  @Field("format") int format,
                                  @Field("key") String key);


}

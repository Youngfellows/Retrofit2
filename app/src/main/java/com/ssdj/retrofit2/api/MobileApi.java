package com.ssdj.retrofit2.api;

import com.ssdj.retrofit2.bean.MobileAddress;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/21 14:10
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */

public interface MobileApi
{
    /**
     * 请求地址：http://apis.juhe.cn/mobile/get
     * 请求参数：phone=15998683821&dtype=json&key=c4286bd606120064a31718ae427bb170
     * 请求方式：GET
     */

    @GET("mobile/get")
    Call<MobileAddress> getMobileAddress(@Query("phone") String phone, @Query("key") String key, @Query("dtype") String dtype);
}

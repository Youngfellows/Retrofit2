package com.ssdj.retrofit2.utils;

import com.ssdj.retrofit2.BuildConfig;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.TimeUnit;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/23 0:12
 * @des 属于基本的使用，实际开发还远远不够，因此对其补充，主要在Retrofit配置和接口参数。
 * @des 博客地址: http://wuxiaolong.me/2016/06/18/retrofits/
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class AppClient
{
    public static Retrofit retrofit = null;

    public static Retrofit retrofit()
    {
        if (retrofit == null)
        {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            /**
             *设置缓存，无网络时，也能显示数据
             */
            //            File cacheFile = new File(DemoApplication.getContext().getExternalCacheDir(), "WuXiaolongCache");
            //            Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);
            //            Interceptor cacheInterceptor = new Interceptor()
            //            {
            //                @Override
            //                public Response intercept(Chain chain) throws IOException
            //                {
            //                    Request request = chain.request();
            //                    if (!AppUtils.networkIsAvailable(DemoApplication.getContext()))
            //                    {
            //                        request = request.newBuilder()
            //                                .cacheControl(CacheControl.FORCE_CACHE)
            //                                .build();
            //                    }
            //                    Response response = chain.proceed(request);
            //                    if (AppUtils.networkIsAvailable(DemoApplication.getContext()))
            //                    {
            //                        int maxAge = 0;
            //                        // 有网络时 设置缓存超时时间0个小时
            //                        response.newBuilder()
            //                                .header("Cache-Control", "public, max-age=" + maxAge)
            //                                .removeHeader("WuXiaolong")// 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
            //                                .build();
            //                    } else
            //                    {
            //                        // 无网络时，设置超时为4周
            //                        int maxStale = 60 * 60 * 24 * 28;
            //                        response.newBuilder()
            //                                .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
            //                                .removeHeader("nyn")
            //                                .build();
            //                    }
            //                    return response;
            //                }
            //            };
            //            builder.cache(cache).addInterceptor(cacheInterceptor);

            /**
             *  公共参数，可能接口有某些参数是公共的，不可能一个个接口都去加吧
             */
            Interceptor addQueryParameterInterceptor = new Interceptor()
            {
                @Override
                public Response intercept(Chain chain) throws IOException
                {
                    Request originalRequest = chain.request();
                    Request request;
                    String method = originalRequest.method();
                    Headers headers = originalRequest.headers();
                    HttpUrl modifiedUrl = originalRequest.url().newBuilder()
                            // Provide your custom parameter here
                            .addQueryParameter("platform", "android")
                            .addQueryParameter("version", "1.0.0")
                            .build();
                    request = originalRequest.newBuilder().url(modifiedUrl).build();
                    return chain.proceed(request);
                }
            };
            //公共参数
            builder.addInterceptor(addQueryParameterInterceptor);


            /**
             * 设置头，有的接口可能对请求头要设置
             */
            Interceptor headerInterceptor = new Interceptor()
            {
                @Override
                public Response intercept(Chain chain) throws IOException
                {
                    Request originalRequest = chain.request();
                    Request.Builder requestBuilder = originalRequest.newBuilder()
                            .header("AppType", "TPOS")
                            .header("Content-Type", "application/json")
                            .header("Accept", "application/json")
                            .method(originalRequest.method(), originalRequest.body());
                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            };
            //设置头
            builder.addInterceptor(headerInterceptor);

            /**
             * Log信息拦截器，代码略
             */
            if (BuildConfig.DEBUG)
            {
                // Log信息拦截器
                HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                //设置 Debug Log 模式
                builder.addInterceptor(loggingInterceptor);
            }


            /**
             * 设置cookie，服务端可能需要保持请求是同一个cookie，主要看各自需求
             */
            CookieManager cookieManager = new CookieManager();
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
            builder.cookieJar(new JavaNetCookieJar(cookieManager));

            /**
             * 设置超时和重连，希望超时时能重连
             */
            //设置超时
            builder.connectTimeout(15, TimeUnit.SECONDS);
            builder.readTimeout(20, TimeUnit.SECONDS);
            builder.writeTimeout(20, TimeUnit.SECONDS);
            //错误重连
            builder.retryOnConnectionFailure(true);

            //以上设置结束，才能build(),不然设置白搭
            //最后将这些配置设置给retrofit：
            OkHttpClient okHttpClient = builder.build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiStores.API_SERVER_URL)
                    //设置 Json 转换器
                    .addConverterFactory(GsonConverterFactory.create())
                    //RxJava 适配器
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}
package com.ssdj.retrofit2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.socks.library.KLog;
import com.ssdj.retrofit2.api.GithubApi;
import com.ssdj.retrofit2.api.GithubRxApi;
import com.ssdj.retrofit2.api.MobileApi;
import com.ssdj.retrofit2.api.WeatherApi;
import com.ssdj.retrofit2.api.WeatherIpApi;
import com.ssdj.retrofit2.api.ZhuanLanApi;
import com.ssdj.retrofit2.bean.Contributor;
import com.ssdj.retrofit2.bean.GitUserInfo;
import com.ssdj.retrofit2.bean.MobileAddress;
import com.ssdj.retrofit2.bean.Weather;
import com.ssdj.retrofit2.bean.author.Author;
import com.ssdj.retrofit2.bean.author.Creator;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_mobile_address = findView(R.id.btn_mobile_address);
        Button btn_weather = findView(R.id.btn_weather);
        Button btn_ip_weather = findView(R.id.btn_ip_weather);
        Button btn_github_user = findView(R.id.btn_github_user);
        Button btn_github_user_rxjava = findView(R.id.btn_github_user_rxjava);
        Button btn_github_jsonarray = findView(R.id.btn_github_jsonarray);
        Button btn_zhihu_author = findView(R.id.btn_zhihu_author);

        btn_mobile_address.setOnClickListener(this);
        btn_weather.setOnClickListener(this);
        btn_ip_weather.setOnClickListener(this);
        btn_github_user.setOnClickListener(this);
        btn_github_user_rxjava.setOnClickListener(this);
        btn_github_jsonarray.setOnClickListener(this);
        btn_zhihu_author.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_mobile_address:
                getMobileAddress();//获取手机 号码归属地(GET请求)
                break;

            case R.id.btn_weather:
                getWeather();//查询天气预报(GET请求)
                break;
            case R.id.btn_ip_weather:
                getIpWeather();//查询IP天气预报(POST请求)
                break;
            case R.id.btn_github_user:
                getGithubUser();//查询Github用户信息
                break;
            case R.id.btn_github_user_rxjava:
                getGithubUserRx();//查询Github用户信息(Retrofit + RxJava)
                break;
            case R.id.btn_github_jsonarray:
                getContributors();//获取json数组
                break;
            case R.id.btn_zhihu_author:
                getZhiHuAuthor();//获取知乎专栏的作者信息
                break;
            default:
                break;
        }
    }

    private void getZhiHuAuthor()
    {
        /**
         * 查看知乎专栏的某个作者信息
         * https://zhuanlan.zhihu.com/api/columns/qinchao
         */
        //新建log拦截器
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger()
        {
            @Override
            public void log(String message)
            {
                //打印retrofit日志
                KLog.i("OkHttpClient", message);
            }
        });
        loggingInterceptor.setLevel(level);

        //定制OkHttp
        OkHttpClient client = new OkHttpClient
                .Builder()
                .addInterceptor(loggingInterceptor)//OkHttp进行添加拦截器loggingInterceptor
                .build();

        String baseUrl = "https://zhuanlan.zhihu.com/";
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build();

        String author = "qinchao";
        ZhuanLanApi api = retrofit.create(ZhuanLanApi.class);
        Call<Author> call = api.getZhuanLanAuthor(author);

        call.enqueue(new Callback<Author>()
        {
            @Override
            public void onResponse(Call<Author> call, Response<Author> response)
            {
                Author author = response.body();
                Creator creator = author.getCreator();
                String msg = creator.getBio() + creator.getDescription();
                KLog.i("TAG", msg);

                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Author> call, Throwable t)
            {
                KLog.i("TAG", t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getContributors()
    {
        /**
         * 比如你要请求这么一个api：
         * https://api.github.com/repos/{owner}/{repo}/contributo
         * https://api.github.com/repos/square/retrofit/contributors
         * https://api.github.com/repos/square/retrofit/contributors
         */
        //新建log拦截器
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger()
        {
            @Override
            public void log(String message)
            {
                //打印retrofit日志
                KLog.i("OkHttpClient", message);
            }
        });
        loggingInterceptor.setLevel(level);

        //定制OkHttp
        OkHttpClient client = new OkHttpClient
                .Builder()
                .addInterceptor(loggingInterceptor)//OkHttp进行添加拦截器loggingInterceptor
                .build();

        //使用Gson解析返回的json数据
        String baseUrl = "https://api.github.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                //.addConverterFactory(StringConverterFactory.create())//自定义解析器
                .client(client)//使用自定义log日志拦截
                .build();

        String owner = "square";
        String repo = "retrofit";
        GithubApi api = retrofit.create(GithubApi.class);

        /**
         * 1、解析Json数组
         */
        Call<List<Contributor>> call = api.getContributors(owner, repo);

        call.enqueue(new Callback<List<Contributor>>()
        {
            @Override
            public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response)
            {
                List<Contributor> contributors = response.body();
                String mst = "大小: " + contributors.size() + "\n" + "头像地址: " + contributors.get(0).getAvatarUrl();
                Log.e("TAG", mst);
                Toast.makeText(MainActivity.this, mst, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Contributor>> call, Throwable t)
            {
                Log.e("TAG", t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * 2、自定义解析器，解析成字符串
         */
        //        Call<String> call = api.getContributors(owner, repo);
        //        call.enqueue(new Callback<String>()
        //        {
        //            @Override
        //            public void onResponse(Call<String> call, Response<String> response)
        //            {
        //                Log.e("TAG", response.body() + "");
        //                Toast.makeText(MainActivity.this, response.body(), Toast.LENGTH_SHORT).show();
        //            }
        //
        //            @Override
        //            public void onFailure(Call<String> call, Throwable t)
        //            {
        //                Log.e("TAG", t.getMessage() + "");
        //                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
        //            }
        //        });

    }

    private void getGithubUserRx()
    {
        /***
         * https://api.github.com/users/lenve/repos
         * request.addHeader("Accept", "text/json");
         * <p>
         * https://api.github.com/users/lenve
         * request.addHeader("Accept", "text/json");
         * <p>
         * https://api.github.com/repos/lenve/contextMenu/commits
         * https://api.github.com/repos/lenve/contextMenu/commits
         * request.addHeader("Accept", "text/json");
         */
        String baseUrl = "https://api.github.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        GithubRxApi rxApi = retrofit.create(GithubRxApi.class);
        String user = "lenve";
        Observable<GitUserInfo> observable = rxApi.getUser(user);

        observable
                //事件产生的线程(IO线程)
                // 指定 subscribe() 发生在 IO 线程
                .subscribeOn(Schedulers.io())
                //事件消费的线程，AndroidSchedulers.mainThread()，它指定的操作将在 Android 主线程运行。
                // 指定 Subscriber 的回调发生在主线程
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GitUserInfo>()
                {
                    @Override
                    public void onCompleted()
                    {
                        Log.d("TAG", "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable throwable)
                    {
                        Log.d("TAG", "onError: ");
                        Toast.makeText(MainActivity.this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(GitUserInfo gitUserInfo)
                    {
                        Log.d("TAG", "onNext: ");
                        String msg = gitUserInfo.getName() + " " + gitUserInfo.getAvatar_url();
                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });

    }

    private void getGithubUser()
    {
        /***
         * https://api.github.com/users/lenve/repos
         * request.addHeader("Accept", "text/json");
         * <p>
         * https://api.github.com/users/lenve
         * request.addHeader("Accept", "text/json");
         * <p>
         * https://api.github.com/repos/lenve/contextMenu/commits
         * https://api.github.com/repos/lenve/contextMenu/commits
         * request.addHeader("Accept", "text/json");
         */

        //报错: 解析不出来Json数组
        String baseUrl = "https://api.github.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GithubApi api = retrofit.create(GithubApi.class);
        String user = "lenve";
        Call<GitUserInfo> call = api.getGitUserInfo(user);

        call.enqueue(new Callback<GitUserInfo>()
        {
            @Override
            public void onResponse(Call<GitUserInfo> call, Response<GitUserInfo> response)
            {
                GitUserInfo gitUserInfo = response.body();
                String msg = gitUserInfo.getName() + " " + gitUserInfo.getAvatar_url();
                Log.e("TAG", msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<GitUserInfo> call, Throwable t)
            {
                Log.e("TAG", t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getIpWeather()
    {
        /****
         * 请求地址：http://v.juhe.cn/weather/ip
         * 请求参数：ip=58.215.185.154&dtype=json&format=1&key=f58cdfa2ac0c748e96f5610ae8937da4
         * 请求方式POST
         */
        String baseUrl = "http://v.juhe.cn/";
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build();


        String ip = "58.215.185.154";
        String dtype = "json";
        int format = 1;
        String key = "f58cdfa2ac0c748e96f5610ae8937da4";

        WeatherIpApi api = retrofit.create(WeatherIpApi.class);
        Call<Weather> call = api.getWeatherForIp(ip, dtype, format, key);

        call.enqueue(new Callback<Weather>()
        {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response)
            {
                Weather weather = response.body();
                Weather.ResultEntity.TodayEntity today = weather.getResult().getToday();
                String msg = today.getDate_y() + " " + today.getCity() + " " + today.getTemperature() + " " + today.getWeather() + today.getDressing_advice();
                Log.e("TAG", msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t)
            {
                Log.e("TAG", t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void getWeather()
    {
        /**
         * 请求地址：http://v.juhe.cn/weather/index
         * 请求参数：cityname=%E6%B7%B1%E5%9C%B3&dtype=json&format=1&key=f58cdfa2ac0c748e96f5610ae8937da4
         * 请求方式：GET
         */

        String baseUrl = "http://v.juhe.cn/";
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build();

        WeatherApi api = retrofit.create(WeatherApi.class);
        String cityname = "深圳";
        String dtype = "json";
        int format = 1;
        String key = "f58cdfa2ac0c748e96f5610ae8937da4";
        Call<Weather> call = api.getWeather(cityname, dtype, format, key);

        call.enqueue(new Callback<Weather>()
        {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response)
            {
                Weather weather = response.body();
                Weather.ResultEntity.TodayEntity today = weather.getResult().getToday();
                String msg = today.getDate_y() + " " + today.getCity() + " " + today.getTemperature() + " " + today.getWeather() + today.getDressing_advice();
                Log.e("TAG", msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t)
            {
                Log.e("TAG", t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getMobileAddress()
    {
        /**
         * 请求地址：http://apis.juhe.cn/mobile/get
         * 请求参数：phone=15998683821&dtype=json&key=c4286bd606120064a31718ae427bb170
         * 请求方式：GET
         */

        String baseUrl = "http://apis.juhe.cn/";
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build();

        MobileApi api = retrofit.create(MobileApi.class);
        String phone = "15998683821";
        String key = "c4286bd606120064a31718ae427bb170";
        String dtype = "json";
        Call<MobileAddress> call = api.getMobileAddress(phone, key, dtype);

        call.enqueue(new Callback<MobileAddress>()
        {
            @Override
            public void onResponse(Call<MobileAddress> call, Response<MobileAddress> response)
            {
                MobileAddress mobileAddress = response.body();
                String msg = mobileAddress.getResult().getProvince() + " " + mobileAddress.getResult().getCompany();
                Log.e("TAG", msg);
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<MobileAddress> call, Throwable t)
            {
                Log.e("TAG", t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public <T extends View> T findView(int id)
    {
        return (T) findViewById(id);
    }


}

package com.ssdj.retrofit2.bean;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/21 15:17
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class Weather
{

    /**
     * result : {"future":{"day_20170221":{"date":"20170221","weather_id":{"fa":"01","fb":"07"},"week":"星期二","temperature":"18℃~22℃","weather":"多云转小雨","wind":"微风"},"day_20170222":{"date":"20170222","weather_id":{"fa":"02","fb":"02"},"week":"星期三","temperature":"18℃~23℃","weather":"阴","wind":"微风"},"day_20170223":{"date":"20170223","weather_id":{"fa":"07","fb":"07"},"week":"星期四","temperature":"14℃~20℃","weather":"小雨","wind":"东北风3-4 级"},"day_20170224":{"date":"20170224","weather_id":{"fa":"07","fb":"07"},"week":"星期五","temperature":"11℃~16℃","weather":"小雨","wind":"东北风3-4 级"},"day_20170225":{"date":"20170225","weather_id":{"fa":"07","fb":"07"},"week":"星期六","temperature":"12℃~15℃","weather":"小雨","wind":"微风"},"day_20170226":{"date":"20170226","weather_id":{"fa":"07","fb":"07"},"week":"星期日","temperature":"14℃~20℃","weather":"小雨","wind":"东北风3-4 级"},"day_20170227":{"date":"20170227","weather_id":{"fa":"07","fb":"07"},"week":"星期一","temperature":"11℃~16℃","weather":"小雨","wind":"东北风3-4 级"}},"today":{"weather_id":{"fa":"01","fb":"07"},"week":"星期二","city":"深圳","dressing_index":"较舒适","travel_index":"较不宜","wash_index":"不宜","comfort_index":"","exercise_index":"较不宜","dressing_advice":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","drying_index":"","uv_index":"最弱","temperature":"18℃~22℃","weather":"多云转小雨","date_y":"2017年02月21日","wind":"微风"},"sk":{"temp":"21","humidity":"72%","wind_direction":"东风","time":"15:14","wind_strength":"2级"}}
     * reason : successed!
     * error_code : 0
     * resultcode : 200
     */
    private ResultEntity result;
    private String reason;
    private int error_code;
    private String resultcode;

    public void setResult(ResultEntity result)
    {
        this.result = result;
    }

    public void setReason(String reason)
    {
        this.reason = reason;
    }

    public void setError_code(int error_code)
    {
        this.error_code = error_code;
    }

    public void setResultcode(String resultcode)
    {
        this.resultcode = resultcode;
    }

    public ResultEntity getResult()
    {
        return result;
    }

    public String getReason()
    {
        return reason;
    }

    public int getError_code()
    {
        return error_code;
    }

    public String getResultcode()
    {
        return resultcode;
    }

    public static class ResultEntity
    {
        /**
         * future : {"day_20170221":{"date":"20170221","weather_id":{"fa":"01","fb":"07"},"week":"星期二","temperature":"18℃~22℃","weather":"多云转小雨","wind":"微风"},"day_20170222":{"date":"20170222","weather_id":{"fa":"02","fb":"02"},"week":"星期三","temperature":"18℃~23℃","weather":"阴","wind":"微风"},"day_20170223":{"date":"20170223","weather_id":{"fa":"07","fb":"07"},"week":"星期四","temperature":"14℃~20℃","weather":"小雨","wind":"东北风3-4 级"},"day_20170224":{"date":"20170224","weather_id":{"fa":"07","fb":"07"},"week":"星期五","temperature":"11℃~16℃","weather":"小雨","wind":"东北风3-4 级"},"day_20170225":{"date":"20170225","weather_id":{"fa":"07","fb":"07"},"week":"星期六","temperature":"12℃~15℃","weather":"小雨","wind":"微风"},"day_20170226":{"date":"20170226","weather_id":{"fa":"07","fb":"07"},"week":"星期日","temperature":"14℃~20℃","weather":"小雨","wind":"东北风3-4 级"},"day_20170227":{"date":"20170227","weather_id":{"fa":"07","fb":"07"},"week":"星期一","temperature":"11℃~16℃","weather":"小雨","wind":"东北风3-4 级"}}
         * today : {"weather_id":{"fa":"01","fb":"07"},"week":"星期二","city":"深圳","dressing_index":"较舒适","travel_index":"较不宜","wash_index":"不宜","comfort_index":"","exercise_index":"较不宜","dressing_advice":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。","drying_index":"","uv_index":"最弱","temperature":"18℃~22℃","weather":"多云转小雨","date_y":"2017年02月21日","wind":"微风"}
         * sk : {"temp":"21","humidity":"72%","wind_direction":"东风","time":"15:14","wind_strength":"2级"}
         */
        private FutureEntity future;
        private TodayEntity today;
        private SkEntity sk;

        public void setFuture(FutureEntity future)
        {
            this.future = future;
        }

        public void setToday(TodayEntity today)
        {
            this.today = today;
        }

        public void setSk(SkEntity sk)
        {
            this.sk = sk;
        }

        public FutureEntity getFuture()
        {
            return future;
        }

        public TodayEntity getToday()
        {
            return today;
        }

        public SkEntity getSk()
        {
            return sk;
        }

        public static class FutureEntity
        {
            /**
             * day_20170221 : {"date":"20170221","weather_id":{"fa":"01","fb":"07"},"week":"星期二","temperature":"18℃~22℃","weather":"多云转小雨","wind":"微风"}
             * day_20170222 : {"date":"20170222","weather_id":{"fa":"02","fb":"02"},"week":"星期三","temperature":"18℃~23℃","weather":"阴","wind":"微风"}
             * day_20170223 : {"date":"20170223","weather_id":{"fa":"07","fb":"07"},"week":"星期四","temperature":"14℃~20℃","weather":"小雨","wind":"东北风3-4 级"}
             * day_20170224 : {"date":"20170224","weather_id":{"fa":"07","fb":"07"},"week":"星期五","temperature":"11℃~16℃","weather":"小雨","wind":"东北风3-4 级"}
             * day_20170225 : {"date":"20170225","weather_id":{"fa":"07","fb":"07"},"week":"星期六","temperature":"12℃~15℃","weather":"小雨","wind":"微风"}
             * day_20170226 : {"date":"20170226","weather_id":{"fa":"07","fb":"07"},"week":"星期日","temperature":"14℃~20℃","weather":"小雨","wind":"东北风3-4 级"}
             * day_20170227 : {"date":"20170227","weather_id":{"fa":"07","fb":"07"},"week":"星期一","temperature":"11℃~16℃","weather":"小雨","wind":"东北风3-4 级"}
             */
            private Day20170221Entity day_20170221;
            private Day20170222Entity day_20170222;
            private Day20170223Entity day_20170223;
            private Day20170224Entity day_20170224;
            private Day20170225Entity day_20170225;
            private Day20170226Entity day_20170226;
            private Day20170227Entity day_20170227;

            public void setDay_20170221(Day20170221Entity day_20170221)
            {
                this.day_20170221 = day_20170221;
            }

            public void setDay_20170222(Day20170222Entity day_20170222)
            {
                this.day_20170222 = day_20170222;
            }

            public void setDay_20170223(Day20170223Entity day_20170223)
            {
                this.day_20170223 = day_20170223;
            }

            public void setDay_20170224(Day20170224Entity day_20170224)
            {
                this.day_20170224 = day_20170224;
            }

            public void setDay_20170225(Day20170225Entity day_20170225)
            {
                this.day_20170225 = day_20170225;
            }

            public void setDay_20170226(Day20170226Entity day_20170226)
            {
                this.day_20170226 = day_20170226;
            }

            public void setDay_20170227(Day20170227Entity day_20170227)
            {
                this.day_20170227 = day_20170227;
            }

            public Day20170221Entity getDay_20170221()
            {
                return day_20170221;
            }

            public Day20170222Entity getDay_20170222()
            {
                return day_20170222;
            }

            public Day20170223Entity getDay_20170223()
            {
                return day_20170223;
            }

            public Day20170224Entity getDay_20170224()
            {
                return day_20170224;
            }

            public Day20170225Entity getDay_20170225()
            {
                return day_20170225;
            }

            public Day20170226Entity getDay_20170226()
            {
                return day_20170226;
            }

            public Day20170227Entity getDay_20170227()
            {
                return day_20170227;
            }

            public static class Day20170221Entity
            {
                /**
                 * date : 20170221
                 * weather_id : {"fa":"01","fb":"07"}
                 * week : 星期二
                 * temperature : 18℃~22℃
                 * weather : 多云转小雨
                 * wind : 微风
                 */
                private String date;
                private WeatherIdEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date)
                {
                    this.date = date;
                }

                public void setWeather_id(WeatherIdEntity weather_id)
                {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week)
                {
                    this.week = week;
                }

                public void setTemperature(String temperature)
                {
                    this.temperature = temperature;
                }

                public void setWeather(String weather)
                {
                    this.weather = weather;
                }

                public void setWind(String wind)
                {
                    this.wind = wind;
                }

                public String getDate()
                {
                    return date;
                }

                public WeatherIdEntity getWeather_id()
                {
                    return weather_id;
                }

                public String getWeek()
                {
                    return week;
                }

                public String getTemperature()
                {
                    return temperature;
                }

                public String getWeather()
                {
                    return weather;
                }

                public String getWind()
                {
                    return wind;
                }

                public static class WeatherIdEntity
                {
                    /**
                     * fa : 01
                     * fb : 07
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa)
                    {
                        this.fa = fa;
                    }

                    public void setFb(String fb)
                    {
                        this.fb = fb;
                    }

                    public String getFa()
                    {
                        return fa;
                    }

                    public String getFb()
                    {
                        return fb;
                    }
                }
            }

            public static class Day20170222Entity
            {
                /**
                 * date : 20170222
                 * weather_id : {"fa":"02","fb":"02"}
                 * week : 星期三
                 * temperature : 18℃~23℃
                 * weather : 阴
                 * wind : 微风
                 */
                private String date;
                private WeatherIdEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date)
                {
                    this.date = date;
                }

                public void setWeather_id(WeatherIdEntity weather_id)
                {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week)
                {
                    this.week = week;
                }

                public void setTemperature(String temperature)
                {
                    this.temperature = temperature;
                }

                public void setWeather(String weather)
                {
                    this.weather = weather;
                }

                public void setWind(String wind)
                {
                    this.wind = wind;
                }

                public String getDate()
                {
                    return date;
                }

                public WeatherIdEntity getWeather_id()
                {
                    return weather_id;
                }

                public String getWeek()
                {
                    return week;
                }

                public String getTemperature()
                {
                    return temperature;
                }

                public String getWeather()
                {
                    return weather;
                }

                public String getWind()
                {
                    return wind;
                }

                public static class WeatherIdEntity
                {
                    /**
                     * fa : 02
                     * fb : 02
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa)
                    {
                        this.fa = fa;
                    }

                    public void setFb(String fb)
                    {
                        this.fb = fb;
                    }

                    public String getFa()
                    {
                        return fa;
                    }

                    public String getFb()
                    {
                        return fb;
                    }
                }
            }

            public static class Day20170223Entity
            {
                /**
                 * date : 20170223
                 * weather_id : {"fa":"07","fb":"07"}
                 * week : 星期四
                 * temperature : 14℃~20℃
                 * weather : 小雨
                 * wind : 东北风3-4 级
                 */
                private String date;
                private WeatherIdEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date)
                {
                    this.date = date;
                }

                public void setWeather_id(WeatherIdEntity weather_id)
                {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week)
                {
                    this.week = week;
                }

                public void setTemperature(String temperature)
                {
                    this.temperature = temperature;
                }

                public void setWeather(String weather)
                {
                    this.weather = weather;
                }

                public void setWind(String wind)
                {
                    this.wind = wind;
                }

                public String getDate()
                {
                    return date;
                }

                public WeatherIdEntity getWeather_id()
                {
                    return weather_id;
                }

                public String getWeek()
                {
                    return week;
                }

                public String getTemperature()
                {
                    return temperature;
                }

                public String getWeather()
                {
                    return weather;
                }

                public String getWind()
                {
                    return wind;
                }

                public static class WeatherIdEntity
                {
                    /**
                     * fa : 07
                     * fb : 07
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa)
                    {
                        this.fa = fa;
                    }

                    public void setFb(String fb)
                    {
                        this.fb = fb;
                    }

                    public String getFa()
                    {
                        return fa;
                    }

                    public String getFb()
                    {
                        return fb;
                    }
                }
            }

            public static class Day20170224Entity
            {
                /**
                 * date : 20170224
                 * weather_id : {"fa":"07","fb":"07"}
                 * week : 星期五
                 * temperature : 11℃~16℃
                 * weather : 小雨
                 * wind : 东北风3-4 级
                 */
                private String date;
                private WeatherIdEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date)
                {
                    this.date = date;
                }

                public void setWeather_id(WeatherIdEntity weather_id)
                {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week)
                {
                    this.week = week;
                }

                public void setTemperature(String temperature)
                {
                    this.temperature = temperature;
                }

                public void setWeather(String weather)
                {
                    this.weather = weather;
                }

                public void setWind(String wind)
                {
                    this.wind = wind;
                }

                public String getDate()
                {
                    return date;
                }

                public WeatherIdEntity getWeather_id()
                {
                    return weather_id;
                }

                public String getWeek()
                {
                    return week;
                }

                public String getTemperature()
                {
                    return temperature;
                }

                public String getWeather()
                {
                    return weather;
                }

                public String getWind()
                {
                    return wind;
                }

                public static class WeatherIdEntity
                {
                    /**
                     * fa : 07
                     * fb : 07
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa)
                    {
                        this.fa = fa;
                    }

                    public void setFb(String fb)
                    {
                        this.fb = fb;
                    }

                    public String getFa()
                    {
                        return fa;
                    }

                    public String getFb()
                    {
                        return fb;
                    }
                }
            }

            public static class Day20170225Entity
            {
                /**
                 * date : 20170225
                 * weather_id : {"fa":"07","fb":"07"}
                 * week : 星期六
                 * temperature : 12℃~15℃
                 * weather : 小雨
                 * wind : 微风
                 */
                private String date;
                private WeatherIdEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date)
                {
                    this.date = date;
                }

                public void setWeather_id(WeatherIdEntity weather_id)
                {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week)
                {
                    this.week = week;
                }

                public void setTemperature(String temperature)
                {
                    this.temperature = temperature;
                }

                public void setWeather(String weather)
                {
                    this.weather = weather;
                }

                public void setWind(String wind)
                {
                    this.wind = wind;
                }

                public String getDate()
                {
                    return date;
                }

                public WeatherIdEntity getWeather_id()
                {
                    return weather_id;
                }

                public String getWeek()
                {
                    return week;
                }

                public String getTemperature()
                {
                    return temperature;
                }

                public String getWeather()
                {
                    return weather;
                }

                public String getWind()
                {
                    return wind;
                }

                public static class WeatherIdEntity
                {
                    /**
                     * fa : 07
                     * fb : 07
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa)
                    {
                        this.fa = fa;
                    }

                    public void setFb(String fb)
                    {
                        this.fb = fb;
                    }

                    public String getFa()
                    {
                        return fa;
                    }

                    public String getFb()
                    {
                        return fb;
                    }
                }
            }

            public static class Day20170226Entity
            {
                /**
                 * date : 20170226
                 * weather_id : {"fa":"07","fb":"07"}
                 * week : 星期日
                 * temperature : 14℃~20℃
                 * weather : 小雨
                 * wind : 东北风3-4 级
                 */
                private String date;
                private WeatherIdEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date)
                {
                    this.date = date;
                }

                public void setWeather_id(WeatherIdEntity weather_id)
                {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week)
                {
                    this.week = week;
                }

                public void setTemperature(String temperature)
                {
                    this.temperature = temperature;
                }

                public void setWeather(String weather)
                {
                    this.weather = weather;
                }

                public void setWind(String wind)
                {
                    this.wind = wind;
                }

                public String getDate()
                {
                    return date;
                }

                public WeatherIdEntity getWeather_id()
                {
                    return weather_id;
                }

                public String getWeek()
                {
                    return week;
                }

                public String getTemperature()
                {
                    return temperature;
                }

                public String getWeather()
                {
                    return weather;
                }

                public String getWind()
                {
                    return wind;
                }

                public static class WeatherIdEntity
                {
                    /**
                     * fa : 07
                     * fb : 07
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa)
                    {
                        this.fa = fa;
                    }

                    public void setFb(String fb)
                    {
                        this.fb = fb;
                    }

                    public String getFa()
                    {
                        return fa;
                    }

                    public String getFb()
                    {
                        return fb;
                    }
                }
            }

            public static class Day20170227Entity
            {
                /**
                 * date : 20170227
                 * weather_id : {"fa":"07","fb":"07"}
                 * week : 星期一
                 * temperature : 11℃~16℃
                 * weather : 小雨
                 * wind : 东北风3-4 级
                 */
                private String date;
                private WeatherIdEntity weather_id;
                private String week;
                private String temperature;
                private String weather;
                private String wind;

                public void setDate(String date)
                {
                    this.date = date;
                }

                public void setWeather_id(WeatherIdEntity weather_id)
                {
                    this.weather_id = weather_id;
                }

                public void setWeek(String week)
                {
                    this.week = week;
                }

                public void setTemperature(String temperature)
                {
                    this.temperature = temperature;
                }

                public void setWeather(String weather)
                {
                    this.weather = weather;
                }

                public void setWind(String wind)
                {
                    this.wind = wind;
                }

                public String getDate()
                {
                    return date;
                }

                public WeatherIdEntity getWeather_id()
                {
                    return weather_id;
                }

                public String getWeek()
                {
                    return week;
                }

                public String getTemperature()
                {
                    return temperature;
                }

                public String getWeather()
                {
                    return weather;
                }

                public String getWind()
                {
                    return wind;
                }

                public static class WeatherIdEntity
                {
                    /**
                     * fa : 07
                     * fb : 07
                     */
                    private String fa;
                    private String fb;

                    public void setFa(String fa)
                    {
                        this.fa = fa;
                    }

                    public void setFb(String fb)
                    {
                        this.fb = fb;
                    }

                    public String getFa()
                    {
                        return fa;
                    }

                    public String getFb()
                    {
                        return fb;
                    }
                }
            }
        }

        public static class TodayEntity
        {
            /**
             * weather_id : {"fa":"01","fb":"07"}
             * week : 星期二
             * city : 深圳
             * dressing_index : 较舒适
             * travel_index : 较不宜
             * wash_index : 不宜
             * comfort_index :
             * exercise_index : 较不宜
             * dressing_advice : 建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。
             * drying_index :
             * uv_index : 最弱
             * temperature : 18℃~22℃
             * weather : 多云转小雨
             * date_y : 2017年02月21日
             * wind : 微风
             */
            private WeatherIdEntity weather_id;
            private String week;
            private String city;
            private String dressing_index;
            private String travel_index;
            private String wash_index;
            private String comfort_index;
            private String exercise_index;
            private String dressing_advice;
            private String drying_index;
            private String uv_index;
            private String temperature;
            private String weather;
            private String date_y;
            private String wind;

            public void setWeather_id(WeatherIdEntity weather_id)
            {
                this.weather_id = weather_id;
            }

            public void setWeek(String week)
            {
                this.week = week;
            }

            public void setCity(String city)
            {
                this.city = city;
            }

            public void setDressing_index(String dressing_index)
            {
                this.dressing_index = dressing_index;
            }

            public void setTravel_index(String travel_index)
            {
                this.travel_index = travel_index;
            }

            public void setWash_index(String wash_index)
            {
                this.wash_index = wash_index;
            }

            public void setComfort_index(String comfort_index)
            {
                this.comfort_index = comfort_index;
            }

            public void setExercise_index(String exercise_index)
            {
                this.exercise_index = exercise_index;
            }

            public void setDressing_advice(String dressing_advice)
            {
                this.dressing_advice = dressing_advice;
            }

            public void setDrying_index(String drying_index)
            {
                this.drying_index = drying_index;
            }

            public void setUv_index(String uv_index)
            {
                this.uv_index = uv_index;
            }

            public void setTemperature(String temperature)
            {
                this.temperature = temperature;
            }

            public void setWeather(String weather)
            {
                this.weather = weather;
            }

            public void setDate_y(String date_y)
            {
                this.date_y = date_y;
            }

            public void setWind(String wind)
            {
                this.wind = wind;
            }

            public WeatherIdEntity getWeather_id()
            {
                return weather_id;
            }

            public String getWeek()
            {
                return week;
            }

            public String getCity()
            {
                return city;
            }

            public String getDressing_index()
            {
                return dressing_index;
            }

            public String getTravel_index()
            {
                return travel_index;
            }

            public String getWash_index()
            {
                return wash_index;
            }

            public String getComfort_index()
            {
                return comfort_index;
            }

            public String getExercise_index()
            {
                return exercise_index;
            }

            public String getDressing_advice()
            {
                return dressing_advice;
            }

            public String getDrying_index()
            {
                return drying_index;
            }

            public String getUv_index()
            {
                return uv_index;
            }

            public String getTemperature()
            {
                return temperature;
            }

            public String getWeather()
            {
                return weather;
            }

            public String getDate_y()
            {
                return date_y;
            }

            public String getWind()
            {
                return wind;
            }

            public static class WeatherIdEntity
            {
                /**
                 * fa : 01
                 * fb : 07
                 */
                private String fa;
                private String fb;

                public void setFa(String fa)
                {
                    this.fa = fa;
                }

                public void setFb(String fb)
                {
                    this.fb = fb;
                }

                public String getFa()
                {
                    return fa;
                }

                public String getFb()
                {
                    return fb;
                }
            }
        }

        public static class SkEntity
        {
            /**
             * temp : 21
             * humidity : 72%
             * wind_direction : 东风
             * time : 15:14
             * wind_strength : 2级
             */
            private String temp;
            private String humidity;
            private String wind_direction;
            private String time;
            private String wind_strength;

            public void setTemp(String temp)
            {
                this.temp = temp;
            }

            public void setHumidity(String humidity)
            {
                this.humidity = humidity;
            }

            public void setWind_direction(String wind_direction)
            {
                this.wind_direction = wind_direction;
            }

            public void setTime(String time)
            {
                this.time = time;
            }

            public void setWind_strength(String wind_strength)
            {
                this.wind_strength = wind_strength;
            }

            public String getTemp()
            {
                return temp;
            }

            public String getHumidity()
            {
                return humidity;
            }

            public String getWind_direction()
            {
                return wind_direction;
            }

            public String getTime()
            {
                return time;
            }

            public String getWind_strength()
            {
                return wind_strength;
            }
        }
    }
}

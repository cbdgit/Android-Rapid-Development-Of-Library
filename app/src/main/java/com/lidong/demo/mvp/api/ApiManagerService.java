package com.lidong.demo.mvp.api;


import com.lidong.demo.mvp.bean.WeatherData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @className：ApiManagerService
 * Created by lidong on 2016/3/2.
 */
public interface ApiManagerService {
//http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=ad1d20bebafe0668502c8eea5ddd0333
    /**
     * 获取数据
     * @param cityname
     * @param key
     * @return
     */
    @GET("/weather/index")
    Observable<WeatherData> getWeatherData(@Query("format") String format,@Query("cityname") String cityname,@Query("key") String key);

}

package com.example.nanke.retrofit;

import com.example.nanke.retrofit.JavaBean.Joke;
import com.example.nanke.retrofit.JavaBean.JokeImg;
import com.example.nanke.retrofit.JavaBean.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zt on 2017/3/5.
 */

public interface Api {
    /**
     *
     * @param type
     * @param key
     * @return
     */

    @GET("index")
    Call<News> getNews(@Query("type") String type, @Query("key") String key);
    /**
     *
     *  http://api.laifudao.com/open/xiaohua.json
     */
    @GET("xiaohua.json")
    Call<List<Joke>>getJoke();
    /**
     * http://api.laifudao.com/open/tupian.json
     */
    @GET("tupian.json")
    Call<JokeImg>getJokeImg();
}

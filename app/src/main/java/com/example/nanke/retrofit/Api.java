package com.example.nanke.retrofit;

import java.util.List;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by zt on 2017/3/5.
 */

public interface Api {
    @GET("index")
    Call<News> getNews(@Query("type") String type,@Query("key") String key);

    @GET("")
    Call<Response>getImage();
}

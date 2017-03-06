package com.example.nanke.retrofit.HttpOperator;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.example.nanke.retrofit.Api;
import com.example.nanke.retrofit.JavaBean.Joke;
import com.example.nanke.retrofit.JavaBean.JokeImg;
import com.example.nanke.retrofit.JavaBean.News;

import java.util.ArrayList;
import java.util.List;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zt on 2017/3/6.
 */

public class HttpUtils {
    private Handler handler;
    List<Joke> joke=new ArrayList<>();

    public HttpUtils(Handler handler){
        System.out.println("调用构造函数");
        this.handler=handler;
    }
    private  Api getApi(String baseUrl){
        Api api;
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api=retrofit.create(Api.class);
        System.out.println("调用获取api");
        return api;
    }

    /**
     *
     * @return
     */
    public  void getNews(){
        Api api= getApi("http://v.juhe.cn/toutiao/");

        api.getNews("keji","9752e09bf52c1aa547cb65dd2227e6f7").enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                System.out.println("测试返回的数据："+response.body().getResult().getData().get(0).getTitle());
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                Log.d("MAin","出错:"+t.toString());
            }
        });
    }





    public  List<Joke> getJoke(){
        Api api= getApi("http://api.laifudao.com/open/");

        api.getJoke().enqueue(new Callback<List<Joke>>() {
            @Override
            public void onResponse(Call<List<Joke>> call, Response<List<Joke>> response) {
                joke= response.body();
                System.out.println("测试能否返回数据:"+joke.size());
                Message message=new Message();
                message.obj=response.body();
                handler.sendMessage(message);
            }

            @Override
            public void onFailure(Call<List<Joke>> call, Throwable t) {
                System.out.println("获取数据失败:"+t.toString());
            }
        });
        return joke;
    }





    public  void getJokeImg(){
        Api api= getApi("http://api.laifudao.com/open/");
        api.getJokeImg().enqueue(new Callback<JokeImg>() {
            @Override
            public void onResponse(Call<JokeImg> call, Response<JokeImg> response) {

            }

            @Override
            public void onFailure(Call<JokeImg> call, Throwable t) {

            }
        });
    }

}

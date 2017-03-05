package com.example.nanke.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private Api api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btn);

        final Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/toutiao/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        api=retrofit.create(Api.class);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * retrofit的此方法运行在主线程中
                 */
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
        });
    }

}

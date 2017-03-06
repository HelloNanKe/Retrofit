package com.example.nanke.retrofit;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nanke.retrofit.HttpOperator.HttpUtils;
import com.example.nanke.retrofit.JavaBean.Joke;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Joke> jokes=new ArrayList<>();
    private Handler handler=new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            jokes= (List<Joke>) msg.obj;
            System.out.println("获取到的返回数据："+jokes.size());
        }
    };
    HttpUtils httpUtils=new HttpUtils(handler);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokes=httpUtils.getJoke();

    }

}

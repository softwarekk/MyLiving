package com.kk.myliving.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.kk.myliving.bean.Advertisement;
import com.kk.myliving.utils.OkGetJson;

public class AdvertisementActivity extends Activity {

    private ImageView ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_advertisement);
        initview();
        initdata();


    }

    private void initview() {

        ad = (ImageView) findViewById(R.id.advertisement);
    }

    private void initdata() {
        String mJson=new OkGetJson().getJson("http://api.fenbei.com/user_News.ss?pt=0&c=16&d=2&u=qkZ6dkz4w02F3LrUyEBksPwJQKQ2Jo0ekxAq9FHb5Ro%3D ");
        Gson gson=new Gson();
        Advertisement as=gson.fromJson(mJson,Advertisement.class);
        Advertisement.DataBean db=as.getData();
        Log.d("dd",db.getBootImg().toString());
        Glide.with(AdvertisementActivity.this).load(db.getBootImg().toString())
                .into(ad);


    }
}

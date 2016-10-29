package com.kk.myliving.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import com.kk.myliving.utils.JudgeNet;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        judge();

    }
    public  void judge(){
        Boolean isOnNet=new JudgeNet().isNetworkAvailable(MainActivity.this);
        Boolean isthird=new JudgeNet().is3rd(MainActivity.this);
        Boolean iswife=new JudgeNet().isWifi(MainActivity.this);

        if(isOnNet==true){
            if(isthird==true){
                Toast.makeText(MainActivity.this,"当前是移动网络状态，提好裤子",Toast.LENGTH_SHORT);
            }
            if(iswife==true){
                Toast.makeText(MainActivity.this,"wife在线，帅哥美女随便瞅",Toast.LENGTH_SHORT);

            }
            Intent jump=new Intent(MainActivity.this,AdvertisementActivity.class);
            startActivity(jump);
        }else{
            Toast.makeText(MainActivity.this,"没有网络宝宝很无力啊",Toast.LENGTH_SHORT);
            finish();
        }
    }

}

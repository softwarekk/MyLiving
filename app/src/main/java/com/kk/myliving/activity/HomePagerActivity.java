package com.kk.myliving.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.kk.myliving.fragment.FragmentDynamic;
import com.kk.myliving.fragment.FragmentHomeP;
import com.kk.myliving.fragment.FragmentMessage;
import com.kk.myliving.fragment.FragmentUser;
import com.zhy.autolayout.AutoLayoutActivity;

public class HomePagerActivity extends AutoLayoutActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_home_pager);
        initview();
        initfragment();
    }

    private void initfragment() {
        FrameLayout fl = (FrameLayout) findViewById(R.id.home_fl);

        Fragment fhp=new FragmentHomeP();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.home_fl, fhp).commit();

    }

    public  void  initview(){

        RadioButton home=(RadioButton) findViewById(R.id.rb_home);
        RadioButton dynamic=(RadioButton)   findViewById(R.id.rb_dynamic);
        ImageView start_finish=(ImageView) findViewById(R.id.rb_home_start_living);
        RadioButton message=(RadioButton)findViewById(R.id.rb_message);
        RadioButton mine=(RadioButton)findViewById(R.id.rb_user);
        home.setOnClickListener(this);
        dynamic.setOnClickListener(this);
        start_finish.setOnClickListener(this);
        message.setOnClickListener(this);
        mine.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
        case R.id.rb_home:
            FrameLayout fl = (FrameLayout) findViewById(R.id.home_fl);

            Fragment fhp=new FragmentHomeP();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_fl, fhp).commit();
        break;
        case R.id.rb_dynamic:
            Fragment forum = new FragmentDynamic();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_fl, forum).commit();


            break;
        case R.id.rb_home_start_living:
        break;
        case R.id.rb_user:
            Fragment user = new FragmentUser();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.home_fl, user).commit();


            break;
            case R.id.rb_message:
                Fragment message = new FragmentMessage();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.home_fl, message).commit();


                break;

        default:
        break;
        }
    }
}

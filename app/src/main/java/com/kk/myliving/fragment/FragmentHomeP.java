package com.kk.myliving.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kk.myliving.activity.R;

/**
 * Created by Administrator on 2016/10/28.
 */

public class FragmentHomeP extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  v=View.inflate(getActivity(), R.layout.fragmenthomepager,null);

        return v;
    }
}

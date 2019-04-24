package com.example.xiebin.mymdapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.xiebin.mymdapp.LoginActivity;
import com.example.xiebin.mymdapp.R;
import com.example.xiebin.mymdapp.base.BaseFragment;
import com.example.xiebin.mymdapp.net.BaseJsonRes;
import com.example.xiebin.mymdapp.net.NetClient;
import com.juns.health.net.loopj.android.http.JsonHttpResponseHandler;

/**
 * Created by xiebin on 2019/4/19.
 */

public class HomeFragment extends BaseFragment implements View.OnClickListener {

    @Override
    public int setContent() {
        return R.layout.fragment_home;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showLoading();
        showContentView();
        setData();
//        NetClient netClient = new NetClient(this.getActivity());
//        netClient.get("https://www.fs.com/index.php?handler=index&request_action=top_categories_new&version=2.2.2&modules=phone&lang=en&currency=USD&app_country=US",null, new BaseJsonRes() {
//
//            @Override
//            public void onMySuccess(String data) {
//                showContentView();
//                Log.e("xiebin",data);
//                setData();
//            }
//
//            @Override
//            public void onMyFailure() {
//                showError();
//            }
//        });
    }

    private void setData() {
        Button btLogin = myContentView.findViewById(R.id.bt_home_login);
        btLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.getActivity(), LoginActivity.class);
        startActivity(intent);
    }
}

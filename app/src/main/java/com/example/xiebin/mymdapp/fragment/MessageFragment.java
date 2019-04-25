package com.example.xiebin.mymdapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.xiebin.mymdapp.R;
import com.example.xiebin.mymdapp.base.BaseFragment;

/**
 * Created by xiebin on 2019/4/19.
 */

public class MessageFragment extends BaseFragment {

    @Override
    public int setContent() {
        return R.layout.fragment_message;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showLoading();
        showContentView();
        Button share = getView(R.id.fab_about_share);
        //  https://www.jianshu.com/p/942eaf3dd036  android 自带分享功能
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "我自己做的APP  https://github.com/xiebinJava  ");
                intent.setType("text/plain/image");
                startActivity(Intent.createChooser(intent, getString(R.string.share_with)));
            }
        });
    }
}

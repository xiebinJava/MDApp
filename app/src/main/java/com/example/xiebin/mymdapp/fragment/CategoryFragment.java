package com.example.xiebin.mymdapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.xiebin.mymdapp.ProductDetailActivity;
import com.example.xiebin.mymdapp.R;
import com.example.xiebin.mymdapp.base.BaseFragment;

/**
 * Created by xiebin on 2019/4/19.
 */

public class CategoryFragment extends BaseFragment {

    @Override
    public int setContent() {
        return R.layout.fragment_categories;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showLoading();
        showContentView();
        Button bt = getView(R.id.bt_product_detail);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryFragment.this.getActivity(), ProductDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}

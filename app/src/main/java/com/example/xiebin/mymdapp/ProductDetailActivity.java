package com.example.xiebin.mymdapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.example.xiebin.mymdapp.base.BaseActivity;
import com.example.xiebin.mymdapp.bean.HomeBean;
import com.example.xiebin.mymdapp.net.BaseJsonRes;
import com.example.xiebin.mymdapp.net.NetClient;
import com.example.xiebin.mymdapp.widget.BannerGlideImageLoader;
import com.example.xiebin.mymdapp.widget.toollbar.BadgeActionProvider;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiebin on 2019/4/24.
 */

public class ProductDetailActivity extends BaseActivity {
    private Banner banner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        banner = findViewById(R.id.banner_product);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
    }

    private void init() {
        NetClient netClient = new NetClient(this);
        netClient.get("https://www.fs.com/index.php?handler=index&request_action=top_categories_new&version=2.2.2&modules=phone&lang=en&currency=USD&app_country=US", null, new BaseJsonRes() {

                    @Override
                    public void onMySuccess(String data) {
                        Gson gson = new Gson();
                        HomeBean homeBean = gson.fromJson(data, HomeBean.class);
                        List<HomeBean.BannerBean> bannerList = homeBean.getBanner();
                        List<String> bannerUrl = new ArrayList<>();
                        for (HomeBean.BannerBean url : bannerList) {
                            bannerUrl.add(url.getImage());
                        }

                        banner.isAutoPlay(true);
                        banner.setViewPagerIsScroll(true);
                        banner.setDelayTime(5000);
                        banner.setImages(bannerUrl);
                        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
                        //设置指示器位置（当banner模式中有指示器时）
                        banner.setIndicatorGravity(BannerConfig.CENTER);
                        banner.setImageLoader(new BannerGlideImageLoader());
//                        banner.setOnBannerListener(new OnBannerListener() {
//                            @Override
//                            public void OnBannerClick(int position) {
//                                onHomeItemClickListeners.onBannerClickListener(position);
//                            }
//                        });
                        banner.start();
                    }

                    @Override
                    public void onMyFailure() {
                    }
        });

    }

    //activity类中的方法
    //添加点击返回箭头事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login_menu, menu);
        return true;
    }
}

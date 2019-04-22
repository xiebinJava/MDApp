package com.example.xiebin.mymdapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.xiebin.mymdapp.base.BaseActivity;
import com.example.xiebin.mymdapp.widget.toollbar.BadgeActionProvider;

/**
 * Created by xiebin on 2019/4/19.
 */

public class LoginActivity extends BaseActivity implements BadgeActionProvider.OnMenuViewClickListener {

    private BadgeActionProvider mActionProvider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //设置抽屉DrawerLayout


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
        MenuItem menuItem = menu.findItem(R.id.menu_cart);
        mActionProvider = (BadgeActionProvider) MenuItemCompat.getActionProvider(menuItem);
        mActionProvider.setOnClickListener(0, this);// 设置点击监听。
        return true;
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        mActionProvider.setBadge(99);
    }


    @Override
    public void onMyMenuClick(int what) {
        Toast.makeText(this,"aaaaaaaaaaaaa",Toast.LENGTH_SHORT).show();
    }
}

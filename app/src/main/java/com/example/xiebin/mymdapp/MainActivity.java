package com.example.xiebin.mymdapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.xiebin.mymdapp.adapter.ViewPagerAdapter;
import com.example.xiebin.mymdapp.base.BaseActivity;
import com.example.xiebin.mymdapp.fragment.AccountFragment;
import com.example.xiebin.mymdapp.fragment.CategoryFragment;
import com.example.xiebin.mymdapp.fragment.HomeFragment;
import com.example.xiebin.mymdapp.fragment.MessageFragment;
import com.example.xiebin.mymdapp.util.BottomNavigationViewHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mBottomNavigationBar;
    private MenuItem menuItem;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager mViewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mBottomNavigationBar = findViewById(R.id.bottomNavigationView);
        mViewPage = findViewById(R.id.vp_main);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationBar);
        setSupportActionBar(toolbar);
        setViewPager(mViewPage);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setViewPager(final ViewPager mViewPage) {
        mViewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    mBottomNavigationBar.getMenu().getItem(0).setChecked(false);
                }
                menuItem = mBottomNavigationBar.getMenu().getItem(position);
                menuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPage.setAdapter(viewPagerAdapter);
        List<Fragment> list = new ArrayList<>();
        HomeFragment homeFragment = new HomeFragment();
        CategoryFragment categoryFragment = new CategoryFragment();
        MessageFragment messageFragment = new MessageFragment();
        AccountFragment accountFragment = new AccountFragment();
        list.add(homeFragment);
        list.add(categoryFragment);
        list.add(messageFragment);
        list.add(accountFragment);
        viewPagerAdapter.setList(list);
        mBottomNavigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    // on favorites clicked
                    mViewPage.setCurrentItem(0,false);
                    return true;
                }else if (item.getItemId() == R.id.categories){
                    mViewPage.setCurrentItem(1,false);
                    return true;
                }else if (item.getItemId() == R.id.message){
                    mViewPage.setCurrentItem(2,false);
                    return true;
                }else if (item.getItemId() == R.id.account){
                    mViewPage.setCurrentItem(3,false);
                    return true;
                }
                return false;
            }
        });
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

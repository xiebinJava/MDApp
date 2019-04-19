package com.example.xiebin.mymdapp.base;


import android.graphics.PorterDuff;
import android.support.v4.app.Fragment;

/**
 * Created by xiebin on 2019/4/19.
 */



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xiebin.mymdapp.R;


/**
 *
 * @author 谢斌
 * @date 2016/10/7
 */

public abstract class BaseFragment extends Fragment {


    /**
     * 布局
     */
    protected View myContentView;
    /**
     * 加载中
     */
    private LinearLayout mLlProgressBar;
    /**
     * 加载失败
     */
    private LinearLayout mRefresh;
    /**
     * 加载动画
     */
    private ContentLoadingProgressBar progressView;
    /**
     * 加载错误的字
     */
    private TextView errorText;
    /**
     * 加载错误的图片
     */
//    private ImageView errorImage;


    public BaseFragment() {
        super();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout ll = (LinearLayout) inflater.inflate(R.layout.fragment_base, null);
        myContentView = View.inflate(getActivity().getApplicationContext(), setContent(), null);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        myContentView.setLayoutParams(params);
        RelativeLayout mContainer = (RelativeLayout) ll.findViewById(R.id.container_fragment);
        errorText = (TextView)ll.findViewById(R.id.error_text);
        mContainer.addView(myContentView);
        return ll;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLlProgressBar = getView(R.id.ll_progress_bar);
        progressView = getView(R.id.progress);
        mRefresh = getView(R.id.ll_error_refresh);
        progressView.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(this.getActivity(),R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);



//        // 点击加载失败布局
//        errorImage.setOnClickListener(new PerfectClickListener() {
//            @Override
//            protected void onNoDoubleClick(View v) {
//                showLoading();
//                onViewRefresh();
//            }
//        });
        myContentView.setVisibility(View.GONE);

    }

    protected <T extends View> T getView(int id) {
        return (T) getView().findViewById(id);
    }

    /**
     * 布局
     */
    public abstract int setContent();

    /**
     * 加载失败后点击后的操作
     */
    protected void onViewRefresh() {

    }

    /**
     * 显示加载中状态
     */
    protected void showLoading() {
        if (mLlProgressBar.getVisibility() != View.VISIBLE) {
            mLlProgressBar.setVisibility(View.VISIBLE);
        }
        // 开始动画
        if (!progressView.isIndeterminate()) {
            progressView.show();
        }
        if (myContentView.getVisibility() != View.GONE) {
            myContentView.setVisibility(View.GONE);
        }
        if (mRefresh.getVisibility() != View.GONE) {
            mRefresh.setVisibility(View.GONE);
        }
    }

    public void setErrorText(String errorTexts){
        errorText.setText(errorTexts);
    }


    /**
     * 加载完成的状态
     */
    protected void showContentView() {
        if (mLlProgressBar.getVisibility() != View.GONE) {
            mLlProgressBar.setVisibility(View.GONE);
        }
        // 停止动画
        if (progressView.isIndeterminate()) {
            progressView.show();
        }
        if (mRefresh.getVisibility() != View.GONE) {
            mRefresh.setVisibility(View.GONE);
        }
        if (myContentView.getVisibility() != View.VISIBLE) {
            myContentView.setVisibility(View.VISIBLE);
        }
    }

    /**
     * 加载失败点击重新加载的状态
     */
    protected void showError() {
        if (mLlProgressBar.getVisibility() != View.GONE) {
            mLlProgressBar.setVisibility(View.GONE);
        }
        // 停止动画
        if (progressView.isIndeterminate()) {
            progressView.hide();
        }
        if (mRefresh.getVisibility() != View.VISIBLE) {
            mRefresh.setVisibility(View.VISIBLE);
        }
        if (myContentView.getVisibility() != View.GONE) {
            myContentView.setVisibility(View.GONE);
        }
    }


}


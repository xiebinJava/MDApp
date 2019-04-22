package com.example.xiebin.mymdapp.widget.toollbar;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v4.view.ActionProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.xiebin.mymdapp.R;
import com.example.xiebin.mymdapp.widget.badgeView.BGABadgeView;

/**
 * Created by xiebin on 2019/4/22.
 */

public class BadgeActionProvider extends ActionProvider {

    private ImageView mIvIcon;
    private BGABadgeView mTvBadge;

    // 用来记录是哪个View的点击，这样外部可以用一个Listener接受多个menu的点击。
    private int clickWhat;
    private OnMenuViewClickListener onClickListener;

    public BadgeActionProvider(Context context) {
        super(context);
    }

    @Override
    public View onCreateActionView() {
        int size = getContext().getResources().getDimensionPixelSize(
                android.support.design.R.dimen.abc_action_bar_default_height_material);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(size, size);
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.menu_badge_provider, null, false);

        view.setLayoutParams(layoutParams);
        mIvIcon = (ImageView) view.findViewById(R.id.iv_icon);
        mTvBadge = (BGABadgeView) view.findViewById(R.id.bv_cart);
        mTvBadge.getBadgeViewHelper().setBadgePaddingDp(4);
//        mTvBadge.getBadgeViewHelper().setBadgeBgColorInt(getResources().getColor(R.color.col_d63030));
        mTvBadge.showCirclePointBadge();
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onMyMenuClick(clickWhat);
            }
        });
        return view;
    }


    // 外部设置监听。
    public void setOnClickListener(int what, OnMenuViewClickListener onClickListener) {
        this.clickWhat = what;
        this.onClickListener = onClickListener;
    }

    public interface OnMenuViewClickListener {
        void onMyMenuClick(int what);
    }

    // 设置图标。
    public void setIcon(@DrawableRes int icon) {
        mIvIcon.setImageResource(icon);
    }

    // 设置显示的数字。
    public void setBadge(int i) {
        mTvBadge.showTextBadge(Integer.toString(i));
    }

}

package com.example.xiebin.mymdapp.widget;

import android.content.Context;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.util.Util;
import com.example.xiebin.mymdapp.R;
import com.youth.banner.loader.ImageLoader;



import static com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888;

/**
 * Created by xiebin on 2018/8/3.
 */

public class BannerGlideImageLoader extends ImageLoader {


    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
         注意：
         1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
         2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
         传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
         切记不要胡乱强转！
         */
        //Glide 加载图片简单用法
//        if (Util.isOnMainThread()) {
        Glide.with(context)
                .load(TextUtils.isEmpty( path.toString()) ? R.drawable.fs_banner_bg :  path.toString().replace(" ", "%20"))
                .asBitmap().format(PREFER_ARGB_8888)
                .placeholder(R.drawable.fs_banner_bg)
                .error(R.drawable.fs_banner_bg)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter()
                .centerCrop()
                .dontTransform()
                .into(imageView);
//        }

//        //Picasso 加载图片简单用法
//        Picasso.with(context).load(path).into(imageView);

        //用fresco加载图片简单用法，记得要写下面的createImageView方法
//        Uri uri = Uri.parse((String) path);
//        imageView.setImageURI(uri);
    }

//    //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
//    @Override
//    public ImageView createImageView(Context context) {
//        //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
//        SimpleDraweeView simpleDraweeView=new SimpleDraweeView(context);
//        return simpleDraweeView;
//    }
}

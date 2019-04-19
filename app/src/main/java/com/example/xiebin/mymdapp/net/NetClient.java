package com.example.xiebin.mymdapp.net;

import android.content.Context;
import android.widget.Toast;

import com.example.xiebin.mymdapp.util.NetUtil;
import com.juns.health.net.loopj.android.http.AsyncHttpClient;
import com.juns.health.net.loopj.android.http.JsonHttpResponseHandler;
import com.juns.health.net.loopj.android.http.RequestParams;


public class NetClient {
    private static Context context;
    // http 请求
    private AsyncHttpClient client;
    // 超时时间
    private int TIMEOUT = 20000;

    public NetClient(Context context) {
        NetClient.context = context;
        client = new AsyncHttpClient();
        client.setTimeout(TIMEOUT);
    }


    /**
     * get方式请求调用方法 返回格式均为json对象 返回为json
     *
     * @param url    请求URL
     * @param params 请求参数 可以为空
     * @param res    必须实现此类 处理成功失败等 回调
     */
    public void get(String url, RequestParams params,
                    final JsonHttpResponseHandler res) {
        if (!NetUtil.checkNetWork(context)) {
            Toast.makeText(context,"error 1",Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            if (params != null) {
                // 带请求参数 获取json对象
                client.get(url, params, res);
            }
            else {
                // 不请求参数 获取json对象
                client.get(url, res);
            }
        } catch (Exception e) {
            // TODO
            e.printStackTrace();
        }
    }

    /**
     * json post方式请求调用方法 返回为json
     *
     * @param url    请求地址
     * @param params 请求参数 可以为空
     * @param res    必须实现此类 处理成功失败等 回调
     */
    public void post(String url, RequestParams params,
                     final JsonHttpResponseHandler res) {
        System.out.println("请求URL：" + url);
        if (!NetUtil.checkNetWork(context)) {
            Toast.makeText(context,"error",Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            if (params != null) {
                client.post(url, params, res);
            } else {
                client.post(url, res);
            }
        } catch (Exception e) {
            // TODO
            e.printStackTrace();
        }
    }
}

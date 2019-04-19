package com.example.xiebin.mymdapp.net;

import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import com.juns.health.net.loopj.android.http.JsonHttpResponseHandler;

public abstract class BaseJsonRes extends JsonHttpResponseHandler {

	@Override
	public void onSuccess(JSONObject response) {
		try {
			String result = response.getString("result");
			// System.out.println("返回的值" + response);
			if (result == null) {
				Log.e("xiebin","error");
			} else if (result.equals("success")) {
				String str_data = response.getString("data");
				onMySuccess(str_data);
			} else {
				String str = response.getString("msg");
				Log.e("xiebin","error"+str);
				onMyFailure();
			}
		} catch (JSONException e) {
			e.printStackTrace();
			onMyFailure();
		}
	}

	public abstract void onMySuccess(String data);

	public abstract void onMyFailure();
}

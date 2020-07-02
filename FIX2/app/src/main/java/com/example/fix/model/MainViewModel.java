package com.example.fix.model;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import com.example.fix.R;
import com.example.fix.entity.Masakan;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;


public class MainViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Masakan>> listDatas = new MutableLiveData<>();

    String url = "http://192.168.43.107/resep/tampilsemua.php/";

    public void setURL(String remote_url){
        this.url = remote_url;
    }
    public LiveData<ArrayList<Masakan>> getDatas() {
        return listDatas;
    }

    public void setDatas(final Context context) {
        AsyncHttpClient client = new AsyncHttpClient();
        final ArrayList<Masakan> listItems = new ArrayList<>();

        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    String result = new String(responseBody);
                    JSONObject responseObject = new JSONObject(result);
                    Log.d("INFO JSON",responseObject.toString());
                    JSONArray list = responseObject.getJSONArray("records");
                     Log.d("INFO 2",list.toString());

                    for (int i = 0; i < list.length(); i++) {
                        JSONObject recData = list.getJSONObject(i);
                        Log.d("INFO 2 2",recData.toString());
                        Masakan rc = new Masakan(recData);
                        //Log.d("INFO",film_item.getName());
                        listItems.add(rc);
                    }
                    listDatas.postValue(listItems);
                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());
                }
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }
        });
    }

}

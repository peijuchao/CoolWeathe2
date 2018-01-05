package util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 裴哥 on 2018/1/4.
 */

public class HttpUtil {

    public  static  void sendOkHttpReqest(String address, okhttp3.Callback callback){
        OkHttpClient client =new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
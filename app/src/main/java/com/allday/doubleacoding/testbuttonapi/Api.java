package com.allday.doubleacoding.testbuttonapi;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class Api {

    private static String mBaseUrl = "http://8ba99e66.ngrok.io";

    public static ApiInterface getApiInterface() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .build();
        return retrofit.create(ApiInterface.class);
    }

    public interface ApiInterface {
        @FormUrlEncoded
        @POST("outlets/run_command")
        Call<ResponseBody> updateUser(@Field("command") String command);

    }
}

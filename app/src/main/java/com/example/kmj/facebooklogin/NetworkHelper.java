package com.example.kmj.facebooklogin;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkHelper {
    final static String url="http://soylatte.kr";
    final static int port=3000;

    private static Retrofit retrofit;
    public static NetworkInterface getInstance(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(url + ":" + port)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(NetworkInterface.class);
    }
}
